
package DAO;
import DTO.LichChieuDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList; 
        
       
public class LichChieuDAO {
     public static ArrayList<LichChieuDTO>LichChieuALL()
    {
        ArrayList<LichChieuDTO>dsLichChieu = new ArrayList<LichChieuDTO>(); 
        String sql = " select * from LichChieu"; 
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
        
         
        return dsLichChieu; 
    }
    
}
