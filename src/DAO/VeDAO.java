
package DAO;
import DTO.VeDTO; 
import java.sql.PreparedStatement;
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.ArrayList; 
public class VeDAO {
       public static ArrayList<VeDTO>VeALL()
    {
        ArrayList<VeDTO>dsVe = new ArrayList<VeDTO>(); 
        String sql = " select * from Ve"; 
        DataAccessHelper helper = new DataAccessHelper(); 
        try 
        {
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                VeDTO vt = new VeDTO();
                vt.setMaVe(rs.getString("MaVe"));
                vt.setGiaVe(rs.getString("GiaVe"));
                vt.setMaLV(rs.getString("MaLV"));
                vt.setSoLuong(rs.getString("SoLuong"));
                dsVe.add(vt);
            }
        }catch (SQLException ex)
        {
            helper.displayError(ex);
        }finally 
           {
               helper.close(); 
            }
        
         
        return dsVe; 
     
}
       public boolean addVe(VeDTO vt)
     {
         String sql= "INSERT INTO qlrp.ve (MaVe, GiaVe, SoLuong, MaLV) VALUES (?, ?, ?, ?)";
         DataAccessHelper helper = new DataAccessHelper();
         try {
             
             helper.open();
             PreparedStatement pst = helper.conn.prepareStatement(sql);
             pst.setString(1, vt.getMaVe());
             pst.setString(2, vt.getGiaVe());
             pst.setString(3, vt.getSoLuong());
             pst.setString(4, vt.getMaLV());
 
             
             pst.execute();
             helper.close();
             
             return true;
             
         } catch (Exception e) {
         }
         return false;
     
    
     }
        public boolean updateVe(VeDTO vt)
     {
                
         String sql= "UPDATE `qlrp`.`ve` SET `GiaVe` = '"+vt.getGiaVe()+"', `SoLuong` = '"+vt.getSoLuong()+"', `MaLV` = '"+vt.getMaLV()+"' WHERE (`MaVe` = '"+vt.getMaVe()+"')";
             DataAccessHelper helper=new DataAccessHelper();
             try {
                 helper.open();
                 Statement st=helper.conn.createStatement();
                 st.executeUpdate(sql);
                 helper.close();
                 return true;
                        
         } catch (Exception e) {
             
         }
            return false;
     
     
     }
        
        
    public boolean deleteVe(String maVe)
    {
        String sql = "DELETE FROM `qlrp`.`ve` WHERE (`MaVe` = '"+maVe+"')";
          DataAccessHelper helper = new DataAccessHelper();
          try {
             helper.open();
             Statement st = helper.conn.createStatement();
             st.executeUpdate(sql);
             helper.close();
             return true;
        } catch (Exception e) {
        }
         return false;
    }
//Lấy danh sách nếu khách hàng chọn cả giá và nhập từ khóa
public static ArrayList<VeDTO>searchVeALL(String key0, String key, String key2 )
    {
        ArrayList<VeDTO>dsVe = new ArrayList<VeDTO>(); 
        String sql = " select * from Ve where (MaVe LIKE '"+key0+"%' or MaLV LIKE '"+key0+"%') and (GiaVe between '"+key+"' and '"+key2+"')";
        DataAccessHelper helper = new DataAccessHelper(); 
        try 
        {
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                VeDTO vt = new VeDTO();
                vt.setMaVe(rs.getString("MaVe"));
                vt.setGiaVe(rs.getString("GiaVe"));
                vt.setMaLV(rs.getString("MaLV"));
                vt.setSoLuong(rs.getString("SoLuong"));
                dsVe.add(vt);
            }
        }catch (SQLException ex)
        {
            helper.displayError(ex);
        }finally 
           {
               helper.close(); 
            }
        
         
        return dsVe; 
     
}

//Lấy danh sách nếu khách hàng chỉ chọn giá mà không nhập gì
public static ArrayList<VeDTO>searchVeALL(String key, String key2 )
    {
        ArrayList<VeDTO>dsVe = new ArrayList<VeDTO>(); 
        String sql = " select * from Ve where (GiaVe between '"+key+"' and '"+key2+"')";
        DataAccessHelper helper = new DataAccessHelper(); 
        try 
        {
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                VeDTO vt = new VeDTO();
                vt.setMaVe(rs.getString("MaVe"));
                vt.setGiaVe(rs.getString("GiaVe"));
                vt.setMaLV(rs.getString("MaLV"));
                vt.setSoLuong(rs.getString("SoLuong"));
                dsVe.add(vt);
            }
        }catch (SQLException ex)
        {
            helper.displayError(ex);
        }finally 
           {
               helper.close(); 
            }
        
         
        return dsVe; 
     
}
}