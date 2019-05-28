
package DAO;
import DTO.KhachHangDTO; 
import java.sql.PreparedStatement;
import util.DataAccessHelper; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
public class KhachHangDAO {
        public static ArrayList<KhachHangDTO> KhachHangALL()
    {
        ArrayList<KhachHangDTO>dsKhachHang = new ArrayList<KhachHangDTO>(); 
        String sql = " select * from KhachHang"; 
        DataAccessHelper helper = new DataAccessHelper(); 
        try 
        {
            helper.open();
            ResultSet rs = helper.excuteQuery(sql); 
            KhachHangDTO khachHang=new KhachHangDTO();
            while(rs.next())
            {
                khachHang =null;
                khachHang.setMaKH(rs.getString("MaKH"));
                khachHang.setGioiTinh(rs.getString("GioiTinh"));
                khachHang.setTenKH(rs.getString("TenKH"));
                khachHang.setDiaChi(rs.getString("DiaChi"));
                khachHang.setSDT(rs.getString("SDT"));
                dsKhachHang.add(khachHang);
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
        public boolean addKhachHangDAO(KhachHangDTO kh)
        {
            
            String sql="inser into KhachHang(MaKH,GioiTinh,TenKH,DiaChi,SDT) values(?,?,?,?,?)";
            
            DataAccessHelper helper=new DataAccessHelper();
            
            try {
                PreparedStatement ps= helper.conn.prepareStatement(sql);
                ps.setString(1, kh.getMaKH());
                ps.setString(2, kh.getGioiTinh());
                ps.setString(3, kh.getTenKH());
                ps.setString(4, kh.getDiaChi());
                ps.setString(5, kh.getSDT());
                return ps.executeUpdate()>0;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
 
}
