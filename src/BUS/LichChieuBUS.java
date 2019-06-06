/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DAO.LichChieuDAO;
import DTO.LichChieuDTO;
import java.util.ArrayList;
/**
 *
 * @author Zed
 */
public class LichChieuBUS {
    //Lấy toàn bộ dữ liệu trong bản lịch chiếu
    public ArrayList<LichChieuDTO> getDanhSachLichChieu(){
        return LichChieuDAO.LichChieuALL();
    
    }
    //Lầy danh sách tìm lịch chiếu theo ngày và buổi chiếu
    public ArrayList<LichChieuDTO> searchDanhSachLichChieu(String ngayChieu, String buoiChieu){
        return LichChieuDAO.loadLichChieuByDateAndTime(ngayChieu, buoiChieu);
    
    }
 
    public boolean addLichChieu(LichChieuDTO lct)
    {
          LichChieuDAO lcd = new LichChieuDAO();
          if(lcd.addLichChieu(lct) == true)
          return true;
          else
          return false;
          
    }
    
    public boolean kiemtraTrong(LichChieuDTO lct)
    {
       if(lct.getNgayChieu().length()== 0 || lct.getBuoiChieu().length() == 0 || lct.getMaLV().length() == 0|| lct.getMaPhim().length() == 0|| lct.getMaPhong().length() == 0)
           return true;
       else
           return false;
                  
    }
    public boolean kiemtraDoDai(LichChieuDTO lct)
    {
       if(lct.getBuoiChieu().length() >= 6 || lct.getMaLV().length() >=6 || lct.getMaPhim().length() >=6 || lct.getMaPhong().length()>=6)
           return true;
       return false;
    
    }
    public boolean kiemtraTrung(LichChieuDTO lct)
    {
         ArrayList<LichChieuDTO> dslc = new ArrayList<>();
         dslc = this.getDanhSachLichChieu();
         for(LichChieuDTO lct0 :dslc)
         {
            if(lct0.getNgayChieu().equals(lct.getNgayChieu()) && lct0.getBuoiChieu().equals(lct.getBuoiChieu()) && lct0.getMaPhong().equals(lct.getMaPhong()))
         return true;
         }
    return false;
    }
   
    public boolean UpdateData(LichChieuDTO lct)
    {
       LichChieuDAO lcd = new LichChieuDAO();
       if(lcd.updateLichChieu(lct))
           return true;
       return false;
    
    }
    public boolean DeleteData(LichChieuDTO lct)
    {
      LichChieuDAO lcd = new LichChieuDAO();
      if(lcd.deleteLichChieu(lct))
           return true;
      return false;

    }
}

