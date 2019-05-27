
package DAO;
import DTO.NhanVienDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 

public class NhanVienDAO {
    public static ArrayList<NhanVienDTO>NhanVienALL()
    {
        ArrayList<NhanVienDTO>dsNhanVien = new ArrayList<NhanVienDTO>(); 
        String sql = " select * from NhanVien"; 
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
        
         
        return dsNhanVien; 
    }
}
