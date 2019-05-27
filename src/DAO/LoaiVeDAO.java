
package DAO;
import DTO.LoaiVeDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
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
