
package DAO;
import DTO.PhongChieuDTO; 
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.sql.PreparedStatement;
import java.sql.Statement;
public class PhongChieuDAO {
       public static ArrayList<PhongChieuDTO>PhongChieuALL()
    {
        ArrayList<PhongChieuDTO>dsPhongChieu = new ArrayList<PhongChieuDTO>(); 
        try 
        {
            String sql = " select * from PhongChieu"; 
            DataAccessHelper helper = new DataAccessHelper(); 
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            while(rs.next())
            {
                PhongChieuDTO phongchieu= new PhongChieuDTO(); 
                phongchieu.setMaPhong(rs.getString("MaPhong")); 
                phongchieu.setTenPhong(rs.getString("TenPhong")); 
                phongchieu.setKichThuoc(rs.getString("KichThuoc")); 
                phongchieu.setSoLuongGhe(rs.getString("SoLuongGhe"));
                phongchieu.setMayChieu(rs.getString("MayChieu"));
                phongchieu.setAmThanh(rs.getString("AmThanh")); 
                dsPhongChieu.add(phongchieu);
                
            }
           helper.close(); 
           }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }    
        return dsPhongChieu; 
    }
        public boolean addPhongChieuDAO(PhongChieuDTO phongchieu)
        {
            
            String sql="insert into PhongChieu(MaPhong,TenPhong,KichThuoc,SoLuongGhe,MayChieu,AmThanh) values(?,?,?,?,?,?)";
            DataAccessHelper helper=new DataAccessHelper();
   
            try {
                helper.open();
                PreparedStatement ps= helper.conn.prepareStatement(sql);
                
                ps.setString(1,phongchieu.getMaPhong());
                ps.setString(2,phongchieu.getTenPhong());
                ps.setString (3,phongchieu.getKichThuoc());
                ps.setString(4,phongchieu.getSoLuongGhe());
                ps.setString(5,phongchieu.getMayChieu());
                ps.setString( 6,phongchieu.getAmThanh());  
               ps.execute();
               helper.close();
        
               
               return true;
            } catch (SQLException e) {
            }
            return false;
        }
        public boolean deletePhongChieu(String a) throws SQLException
        {
            String sql = " delete from phongchieu where MaPhong = '" +a+ "'";
            DataAccessHelper helper = new DataAccessHelper(); 
            try 
            {
                helper.open();
                Statement st = helper.conn.createStatement(); 
                st.executeUpdate(sql);
                helper.close(); 
                return true; 
            }catch(SQLException e ) 
                    {
                        
                    }
            return false; 
                            
        }
         public static ArrayList<PhongChieuDTO> SearchPhongChieu(String a)
    {
        ArrayList<PhongChieuDTO>dsPhongChieu = new ArrayList<PhongChieuDTO>(); 
         
        try 
        {
            String sql = " select * from PhongChieu where MaPhong='"+a+"'"; 
            DataAccessHelper helper = new DataAccessHelper();
            helper.open();
            
            ResultSet rs = helper.excuteQuery(sql); 
            
            while(rs.next())
            {
                PhongChieuDTO phongchieu=new PhongChieuDTO();
                phongchieu.setMaPhong(rs.getString("MaPhong"));
                phongchieu.setTenPhong(rs.getString("TenPhong"));
                phongchieu.setKichThuoc(rs.getString("TenKichThuoc"));
                phongchieu.setSoLuongGhe(rs.getString("SoLuongGhe"));
                phongchieu.setMayChieu(rs.getString("MayChieu"));
                phongchieu.setAmThanh(rs.getString("AmThanh"));
                dsPhongChieu.add(phongchieu);
            }
            helper.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }     
        return dsPhongChieu; 
    }
 public boolean updatePhongChieu(PhongChieuDTO a){
      String sql = "update phongchieu set TenPhong='"+a.getTenPhong()+"', KichThuoc='"+a.getKichThuoc()+"',SoLuongGhe='"+a.getSoLuongGhe()+"',MayChieu='"+a.getMayChieu()+"',AmThanh='"+a.getAmThanh()+"' where MaPhong ='"+a.getMaPhong()+"'"; 
      DataAccessHelper helper = new DataAccessHelper();
      
      try
      {
      helper.open();
      Statement st=helper.conn.createStatement();
      st.executeUpdate(sql);
      helper.close();
      return true;
      }
      catch(SQLException e)
      {
              
      }
            return false;
      }

}