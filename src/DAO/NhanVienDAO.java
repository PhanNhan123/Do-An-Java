
package DAO;
import DTO.NhanVienDTO; 
import java.sql.PreparedStatement;
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.ArrayList; 

public class NhanVienDAO {
   public static ArrayList<NhanVienDTO> NhanVienALL()
    {
        ArrayList<NhanVienDTO>dsNhanVien = new ArrayList<NhanVienDTO>(); 
         
        try 
        {
            String sql = " select * from NhanVien"; 
            DataAccessHelper helper = new DataAccessHelper();
            helper.open();
            
            ResultSet rs = helper.excuteQuery(sql); 
            
            while(rs.next())
            {
                NhanVienDTO NhanVien=new NhanVienDTO();
                NhanVien.setMaNV(rs.getString("MaNV"));
                NhanVien.setTenNV(rs.getString("TenNV"));
                NhanVien.setGioiTinh(rs.getString("GioiTinh"));
                NhanVien.setCMND(rs.getString("CMND"));
                NhanVien.setDiaChi(rs.getString("DiaChi"));
                NhanVien.setMaTK(rs.getString("MaTK"));
                dsNhanVien.add(NhanVien);
            }
            helper.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }     
        return dsNhanVien; 
    }
        public boolean addNhanVienDAO(NhanVienDTO kh)
        {
            
            String sql="insert into NhanVien(MaNV,TenNV,GioiTinh,CMND,DiaChi,MaTK) values(?,?,?,?,?,?)";
            DataAccessHelper helper=new DataAccessHelper();
   
            try {
                helper.open();
                PreparedStatement ps= helper.conn.prepareStatement(sql);
                
                ps.setString(1, kh.getMaNV());
                ps.setString(2, kh.getTenNV());
                ps.setString(3, kh.getGioiTinh());
                ps.setString(4, kh.getCMND());
                ps.setString(5, kh.getDiaChi());
               ps.setString(6,kh.getMaTK());
               ps.execute();
               helper.close();
        
               return true;
            } catch (SQLException e) {
            }
            return false;
        }
      public boolean deleteNhanVien(String a){
      String sql = "delete from NhanVien where MaNV = '"+a+"'"; 
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
      public static ArrayList<NhanVienDTO> SearchNhanVien(String a)
    {
        ArrayList<NhanVienDTO>dsNhanVien = new ArrayList<NhanVienDTO>(); 
         
        try 
        {
            String sql = " select * from NhanVien where MaNV='%"+a+"%' or GioiTinh like '"+a+"%' or TenNV like '%"+a+"%' or CMND like '%"+a+"%' or DiaChi like '%"+a+"%' or MaTK like '"+a+"%'"; 
            DataAccessHelper helper = new DataAccessHelper();
            helper.open();
            
            ResultSet rs = helper.excuteQuery(sql); 
            
            while(rs.next())
            {
                NhanVienDTO NhanVien=new NhanVienDTO();
                NhanVien.setMaNV(rs.getString("MaNV"));
                NhanVien.setTenNV(rs.getString("TenNV"));
                NhanVien.setGioiTinh(rs.getString("GioiTinh"));
                NhanVien.setCMND(rs.getString("CMND"));
                NhanVien.setDiaChi(rs.getString("DiaChi"));
                NhanVien.setMaTK(rs.getString("MaTK"));
                dsNhanVien.add(NhanVien);
            }
            helper.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }     
        return dsNhanVien; 
    }
 public boolean updateNhanVien(NhanVienDTO a){
      String sql = "update NhanVien set GioiTinh='"+a.getGioiTinh()+"', TenNV='"+a.getTenNV()+"',DiaChi='"+a.getDiaChi()+"',CMND='"+a.getCMND()+"',MaTK='"+a.getMaTK()+"' where MaNV ='"+a.getMaNV()+"'"; 
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
