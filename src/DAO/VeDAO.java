
package DAO;
import DTO.VeDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
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
