
package DAO;
import DTO.PhimDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
public class PhimDAO {
      public static ArrayList<PhimDTO>PhimALL()
    {
        ArrayList<PhimDTO>dsPhim = new ArrayList<PhimDTO>(); 
        String sql = " select * from Phim"; 
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
        
         
        return dsPhim; 
    }
}
