
package DAO;
import DTO.LoaiPhimDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
public class LoaiPhimDAO {
    public static ArrayList<LoaiPhimDTO>LoaiPhimALL()
    {
        ArrayList<LoaiPhimDTO>dsLoaiPhim = new ArrayList<LoaiPhimDTO>(); 
        String sql = " select * from LoaiPhim "; 
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
        
         
        return dsLoaiPhim; 
    }
}
