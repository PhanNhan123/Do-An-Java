
package DAO;
import DTO.KhachHangDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
public class KhachHangDAO {
        public static ArrayList<KhachHangDTO>KhachHangALL()
    {
        ArrayList<KhachHangDTO>dsKhachHang = new ArrayList<KhachHangDTO>(); 
        String sql = " select * from KhachHang"; 
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
        
         
        return dsKhachHang; 
    }
}
