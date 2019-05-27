/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.VeBanDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
public class VeBanDAO {
       public static ArrayList<VeBanDTO>VeBanALL()
    {
        ArrayList<VeBanDTO>dsVeBan = new ArrayList<VeBanDTO>(); 
        String sql = " select * from VeBan"; 
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
        
         
        return dsVeBan ; 
    }
}
