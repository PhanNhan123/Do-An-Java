
package DAO;
import DTO.KhachHangDTO; 
import java.sql.PreparedStatement;
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.ArrayList; 
public class KhachHangDAO {
        public static ArrayList<KhachHangDTO> KhachHangALL()
    {
        ArrayList<KhachHangDTO>dsKhachHang = new ArrayList<KhachHangDTO>(); 
         
        try 
        {
            String sql = "select * from KhachHang"; 
            DataAccessHelper helper = new DataAccessHelper();
            helper.open();
            
            ResultSet rs = helper.excuteQuery(sql); 
            
            while(rs.next())
            {
                KhachHangDTO khachHang=new KhachHangDTO();
                khachHang.setMaKH(rs.getString("MaKH"));
                khachHang.setGioiTinh(rs.getString("GioiTinh"));
                khachHang.setTenKH(rs.getString("TenKH"));
                khachHang.setDiaChi(rs.getString("DiaChi"));
                khachHang.setSDT(rs.getString("SDT"));
                dsKhachHang.add(khachHang);
            }
            helper.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }     
        return dsKhachHang; 
    }
        public boolean addKhachHangDAO(KhachHangDTO kh)
        {
            
            String sql="insert into KhachHang(MaKH,GioiTinh,TenKH,DiaChi,SDT) values(?,?,?,?,?)";
            DataAccessHelper helper=new DataAccessHelper();
   
            try {
                helper.open();
                PreparedStatement ps= helper.conn.prepareStatement(sql);
                
                ps.setString(1, kh.getMaKH());
                ps.setString(2, kh.getGioiTinh());
                ps.setString(3, kh.getTenKH());
                ps.setString(4, kh.getDiaChi());
                ps.setString(5, kh.getSDT());
                
               ps.execute();
               helper.close();
        
               return true;
            } catch (SQLException e) {
            }
            return false;
        }
      public boolean deleteKhachHang(String a){
      String sql = "delete from khachhang where MaKH = '"+a+"'"; 
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
      public static ArrayList<KhachHangDTO> SearchKhachHang(String a)
    {
        ArrayList<KhachHangDTO>dsKhachHang = new ArrayList<KhachHangDTO>(); 
         
        try 
        {
            String sql = " select * from KhachHang where MaKH like'%"+a+"%' or GioiTinh like '"+a+"%'or TenKH like '%"+a+"%'or DiaChi like '%"+a+"%'or SDT like '%"+a+"%'"; 
            DataAccessHelper helper = new DataAccessHelper();
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            
            while(rs.next())
            {
                KhachHangDTO khachHang=new KhachHangDTO();
                khachHang.setMaKH(rs.getString("MaKH"));
                khachHang.setGioiTinh(rs.getString("GioiTinh"));
                khachHang.setTenKH(rs.getString("TenKH"));
                khachHang.setDiaChi(rs.getString("DiaChi"));
                khachHang.setSDT(rs.getString("SDT"));
                dsKhachHang.add(khachHang);
            }
            helper.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }     
        return dsKhachHang; 
    }
 public boolean updateKhachHang(KhachHangDTO a){
      String sql = "update khachhang set GioiTinh='"+a.getGioiTinh()+"', TenKH='"+a.getTenKH()+"',DiaChi='"+a.getDiaChi()+"',SDT='"+a.getSDT()+"' where MaKH ='"+a.getMaKH()+"'"; 
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
 
