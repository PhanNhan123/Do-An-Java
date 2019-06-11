
package DAO;
import DTO.PhimDTO;
import java.sql.PreparedStatement;
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.ArrayList; 
public class PhimDAO 
{
    public static ArrayList<PhimDTO>PhimALL()
        {
            ArrayList<PhimDTO>dsPhim = new ArrayList<PhimDTO>(); 
            try
            {
            String sql = " select * from Phim"; 
            DataAccessHelper helper = new DataAccessHelper();
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
                {
                PhimDTO phim= new PhimDTO();
                phim.setMaPhim(rs.getString("MaPhim"));
                phim.setThoiGian(rs.getString("ThoiGian")); 
                phim.setTenPhim(rs.getString("TenPhim"));
                phim.setDaoDien(rs.getString("DaoDien")); 
                phim.setDienVien(rs.getString("DienVien"));
                phim.setNamSX(rs.getString("NamSX")); 
                phim.setNuocSX(rs.getString("NuocSX"));
                phim.setMaLP(rs.getString("MaLP")); 
                dsPhim.add(phim);
                }
                helper.close(); 
            }catch (Exception e)
            {
            System.out.println(e.getMessage());
            }
            return dsPhim;
       }
      public boolean addPhimDAO(PhimDTO phim)
      {
        String sql="insert into Phim(MaPhim,ThoiGian,TenPhim,DaoDien,DienVien,NamSX,NuocSX,MaLP) values(?,?,?,?,?,?,?,?)";
        DataAccessHelper helper=new DataAccessHelper();
        try {
            helper.open();
            PreparedStatement ps= helper.conn.prepareStatement(sql);
            ps.setString(1, phim.getMaPhim());
            ps.setString(2, phim.getThoiGian());
            ps.setString(3, phim.getTenPhim());
            ps.setString(4, phim.getDaoDien());
            ps.setString(5, phim.getDienVien());
            ps.setString(6, phim.getNamSX());
            ps.setString(7, phim.getNuocSX()); 
            ps.setString(8, phim.getMaLP());
            ps.execute();
            helper.close();
            return true;
            } catch (SQLException e) 
            {
            }
            return false;
      }
      public boolean deletePhim(String a)
      {
        String sql = "delete from Phim where MaPhim = '"+a+"'"; 
        DataAccessHelper helper = new DataAccessHelper();
        try
        {
            helper.open();
            Statement st=helper.conn.createStatement();
            st.executeUpdate(sql);
            helper.close();
            return true;
        }
        catch(SQLException e)
        {
        }
        return false;
      }
            
 public static ArrayList<PhimDTO> SearchPhim(String a)
    {
      ArrayList<PhimDTO>dsPhim = new ArrayList<PhimDTO>(); 
      try 
        {
            String sql = " select * from Phim where MaPhim LIKE'"+a+"%'"; 
            DataAccessHelper helper = new DataAccessHelper();
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                PhimDTO phim=new PhimDTO();
                phim.setMaPhim(rs.getString("MaPhim"));
                phim.setThoiGian(rs.getString("ThoiGian")); 
                phim.setTenPhim(rs.getString("TenPhim"));
                phim.setDaoDien(rs.getString("DaoDien")); 
                phim.setNamSX(rs.getString("NamSX"));
                phim.setNuocSX(rs.getString("NuocSX"));
                phim.setMaLP(rs.getString("MaLP")); 
                dsPhim.add(phim);
            }
            helper.close();
        }catch (Exception e)
            {
            System.out.println(e.getMessage());
            }
            return dsPhim; 
    }
 public boolean updatePhim(PhimDTO a)
    {
      String sql = "update Phim set ThoiGian='"+a.getThoiGian()+"', TenPhim='"+a.getTenPhim()+"',DaoDien='"+a.getDaoDien()+"',NamSX='"+a.getNamSX()+"',NuocSX='"+a.getNuocSX()+"',MaLP='"+a.getMaLP()+"' where MaPhim ='"+a.getMaPhim()+"'"; 
      DataAccessHelper helper = new DataAccessHelper();
      
      try
      {
        helper.open();
        Statement st=helper.conn.createStatement();
        st.executeUpdate(sql);
        helper.close();
        return true;
      }
      catch(SQLException e)
      {
      }
      return false;
     }
}

