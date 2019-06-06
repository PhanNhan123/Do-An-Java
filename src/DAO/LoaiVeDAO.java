
package DAO;
import DTO.LoaiVeDTO; 
import java.sql.PreparedStatement;
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.ArrayList; 
public class LoaiVeDAO {
      public static ArrayList<LoaiVeDTO>LoaiVeALL()
    {
        ArrayList<LoaiVeDTO>dsLoaiVe = new ArrayList<LoaiVeDTO>(); 
        String sql = " select * from LoaiVe"; 
        DataAccessHelper helper = new DataAccessHelper(); 
        try 
        {
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                LoaiVeDTO lvt = new LoaiVeDTO();
                lvt.setMaLV(rs.getString(1));
                lvt.setTenLV(rs.getString(2));
                
                dsLoaiVe.add(lvt);
            }
        }catch (SQLException ex)
        {
            helper.displayError(ex);
        }finally 
           {
               helper.close(); 
            }
        
         
        return dsLoaiVe; 
    }
      
      
      public boolean addLoaiVe(LoaiVeDTO lvt)
      {
          String sql = "INSERT INTO qlrp.loaive(MaLV, TenLV) VALUES (?, ?)";
          DataAccessHelper helper = new DataAccessHelper();
          
          try {
              helper.open();
              PreparedStatement pst = helper.conn.prepareStatement(sql);
              pst.setString(1, lvt.getMaLV());
              pst.setString(2, lvt.getTenLV());
              pst.execute();
              helper.close();
              return true;
          } catch (Exception e) {
          }
          return false;

      }
      
      public boolean deleteLoaiVe(String maLV)
      {
          String sql = "DELETE FROM qlrp.loaive WHERE (MaLV = '"+maLV+"')";
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
       public boolean updateLoaiVe(String tenLV, String maLV)
      {
          
          String sql= "UPDATE qlrp.loaive SET TenLV = '"+tenLV+"' WHERE (MaLV = '"+maLV+"')";
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
       public static ArrayList<LoaiVeDTO>searchLoaiVe(String key)
    {
        ArrayList<LoaiVeDTO>dsLoaiVe = new ArrayList<LoaiVeDTO>(); 
        String sql = " select * from LoaiVe where (MaLV LIKE '"+key+"%' or TenLV LIKE '"+key+"%')"; 
        DataAccessHelper helper = new DataAccessHelper(); 
        try 
        {
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                LoaiVeDTO lvt = new LoaiVeDTO();
                lvt.setMaLV(rs.getString(1));
                lvt.setTenLV(rs.getString(2));
                
                dsLoaiVe.add(lvt);
            }
        }catch (SQLException ex)
        {
            helper.displayError(ex);
        }finally 
           {
               helper.close(); 
            }
        
         
        return dsLoaiVe; 
    }
      
}
