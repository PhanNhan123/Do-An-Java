
package DAO;
import DTO.LichChieuDTO; 
import java.sql.PreparedStatement;
import util.DataAccessHelper; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList; 
import java.text.SimpleDateFormat;
        
       
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
             
                LichChieuDTO lct = new LichChieuDTO();
                lct.setBuoiChieu(rs.getString("BuoiChieu"));
                lct.setMaLV(rs.getString("MaLV"));
                lct.setMaPhong(rs.getString("MaPhong"));
                lct.setNgayChieu(rs.getString("NgayChieu"));
                lct.setMaPhim(rs.getString("MaPhim"));
                dsLichChieu.add(lct);
              
                
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
    
     public boolean addLichChieu(LichChieuDTO lct)
     {
         String sql="insert into lichchieu(NgayChieu, BuoiChieu, MaPhong, MaPhim, MaLV) values(?,?,?,?,?)";
         DataAccessHelper helper = new DataAccessHelper();
         try {
             
             helper.open();
             PreparedStatement pst = helper.conn.prepareStatement(sql);
             pst.setString(1, lct.getNgayChieu());
             pst.setString(2, lct.getBuoiChieu());
             pst.setString(4, lct.getMaPhim());
             pst.setString(3, lct.getMaPhong());
             pst.setString(5, lct.getMaLV());
             
             pst.execute();
             helper.close();
             
             return true;
             
         } catch (Exception e) {
         }
         return false;
     
    
     }
     public boolean updateLichChieu(LichChieuDTO lct)
     {
                
         String sql="update lichchieu set MaLV='"+lct.getMaLV()+"',MaPhong='"+lct.getMaPhong()+"'where (BuoiChieu='"+lct.getBuoiChieu()+"' and MaPhong='"+lct.getMaPhong()+"' and NgayChieu='"+lct.getNgayChieu()+"')";
             DataAccessHelper helper=new DataAccessHelper();
             try {
                 helper.open();
                 Statement st=helper.conn.createStatement();
                 st.executeUpdate(sql);
                 helper.close();
                 return true;
                        
         } catch (Exception e) {
             
         }
            return false;
     
     
     }
     

    public boolean deleteLichChieu(LichChieuDTO lct)
    {
        String sql = "delete from lichchieu where (NgayChieu='"+lct.getNgayChieu()+"' and BuoiChieu='"+lct.getBuoiChieu()+"' and MaPhong='"+lct.getMaPhong()+"')";
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
    //Trả về những lịch chiếu theo ngày chiếu và buổi chiếu
    public static ArrayList<LichChieuDTO>loadLichChieuByDateAndTime(String ngayChieu, String buoiChieu)
    {
        ArrayList<LichChieuDTO>dsLichChieu = new ArrayList<LichChieuDTO>(); 
        String sql = " select * from LichChieu where (NgayChieu = '"+ngayChieu+"' and BuoiChieu ='"+buoiChieu+"')";
        
        DataAccessHelper helper = new DataAccessHelper(); 
        try 
        {
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
             
                LichChieuDTO lct = new LichChieuDTO();
                lct.setBuoiChieu(rs.getString("BuoiChieu"));
                lct.setMaLV(rs.getString("MaLV"));
                lct.setMaPhong(rs.getString("MaPhong"));
                lct.setNgayChieu(rs.getString("NgayChieu"));
                lct.setMaPhim(rs.getString("MaPhim"));
                dsLichChieu.add(lct);
              
                
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
     



