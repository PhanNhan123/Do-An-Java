
package DAO;
import DTO.PhongChieuDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
public class PhongChieuDAO {
       public static ArrayList<PhongChieuDTO>PhongChieuALL()
    {
        ArrayList<PhongChieuDTO>dsPhongChieu = new ArrayList<PhongChieuDTO>(); 
        String sql = " select * from PhongChieu"; 
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
        
         
        return dsPhongChieu; 
    }
}
