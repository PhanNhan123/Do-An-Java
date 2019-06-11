
package DAO;
import DTO.ThongKe;
import DTO.VeBanDTO; 
import java.sql.PreparedStatement;
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.ArrayList; 
public class VeBanDAO {
       public static ArrayList<VeBanDTO>VeBanALL()
    {
        ArrayList<VeBanDTO>dsvb = new ArrayList<VeBanDTO>(); 
        
        try 
        {
            String sql = " select * from VeBan ";
            DataAccessHelper helper = new DataAccessHelper(); 
        
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                VeBanDTO vb= new VeBanDTO();
                vb.setNgayBan(rs.getString("NgayBan"));
                vb.setMaPhim(rs.getString("MaPhim")); 
                vb.setMaPhong(rs.getString("MaPhong"));
                vb.setMaVe(rs.getString("MaVe")); 
                vb.setMaKH(rs.getString("MaKH")); 
                vb.setTongGiaVe(rs.getString("TongGiaVe"));
                vb.setSoLuong(rs.getString("SoLuong")); 
                dsvb.add(vb);
                
            }
            helper.close();
        }catch (Exception e)
        {
           System.out.println(e.getMessage());
        
        }
         
        return dsvb ; 
        }
       
        public boolean addVeBanDAO(VeBanDTO vb)
        {
        String sql="insert into VeBan(NgayBan,MaPhim,MaPhong,MaVe,MaKH,TongGiaVe,SoLuong) values(?,?,?,?,?,?,?)";
        DataAccessHelper helper=new DataAccessHelper();
        try {
            helper.open();
            PreparedStatement ps= helper.conn.prepareStatement(sql);
            ps.setString(1, vb.getNgayBan());
            ps.setString(2, vb.getMaPhim());
            ps.setString(3, vb.getMaPhong());
            ps.setString(4, vb.getMaVe());
            ps.setString(5, vb.getMaKH());
            ps.setString(6, vb.getTongGiaVe());
            ps.setString(7, vb.getSoLuong()); 
            ps.execute();
            helper.close();
            return true;
            } catch (SQLException e) 
            {
            }
            return false;
      }
      public boolean deleteVeBan(String a)
      {
        String sql = "delete from VeBan where MaPhim = '"+a+"' and MaPhong = '"+a+"' and MaVe= '"+a+"' and MaKH='"+a+"'"; 
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
            
 public static ArrayList<VeBanDTO> SearchVeBan(String a)
    {
      ArrayList<VeBanDTO>dsvb = new ArrayList<VeBanDTO>(); 
      try 
        {
            String sql = " select * from VeBan where MaPhim LIKE'"+a+"%'"; 
            DataAccessHelper helper = new DataAccessHelper();
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                VeBanDTO vb =new VeBanDTO();
                vb.setNgayBan(rs.getString("NgayBan"));
                vb.setMaPhim(rs.getString("MaPhim")); 
                vb.setMaPhong(rs.getString("MaPhong"));
                vb.setMaVe(rs.getString("MaVe")); 
                vb.setMaKH(rs.getString("MaKH"));
                vb.setTongGiaVe(rs.getString("TongGiaVe"));
                vb.setSoLuong(rs.getString("SoLuong")); 
                
                dsvb.add(vb);
            }
            helper.close();
        }catch (Exception e)
            {
            System.out.println(e.getMessage());
            }
            return dsvb; 
    }
 public boolean updateVeBan(VeBanDTO a)
    {
      String sql = "update VeBan set NgayBan='"+a.getNgayBan()+"',TongGiaVe='"+a.getTongGiaVe()+"',SoLuong='"+a.getSoLuong()+"' where MaPhim ='"+a.getMaPhim()+"'and MaPhim='"+a.getMaPhim()+"'and MaPhong='"+a.getMaPhong()+"'and MaVe='"+a.getMaVe()+"' and MaKH='"+a.getMaKH()+"'"; 
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
 
 
 
 
    public static ArrayList<ThongKe> ThongKe(String From, String To)
    {
      ArrayList<ThongKe> ds = new ArrayList<>(); 
      try 
        {
            String sql = " select phim.MaPhim,phim.TenPhim,(veban.SoLuong) as Tong_SoLuong,Sum(veban.TongGiaVe) as DoanhThu "
                    + "from Phim,veban "
                    + "where phim.MaPhim=veban.MaPhim and NgayBan >= '"+From+"' and NgayBan <='"+To+"'"
                    + "group by phim.MaPhim,phim.TenPhim";
            DataAccessHelper helper = new DataAccessHelper();
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                ThongKe vb =new ThongKe();
                vb.setMaPhim(rs.getString("MaPhim"));
                vb.setTenPhim(rs.getString("TenPhim")); 
                vb.setTong(rs.getString("Tong_SoLuong"));
                vb.setDoanhThu(rs.getString("DoanhThu")); 
                ds.add(vb);
            }
            helper.close();
        }catch (Exception e)
            {
            System.out.println(e.getMessage());
            }
            return ds; 
    }
        
    }
