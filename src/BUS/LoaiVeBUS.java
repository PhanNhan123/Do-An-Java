/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiVeDAO;
import DTO.LoaiVeDTO;
import java.util.ArrayList;

/**
 *
 * @author Zed
 */
public class LoaiVeBUS {
    //load toàn bộ danh sách
    public ArrayList<LoaiVeDTO>getdsLoaiVe(){
        
    return LoaiVeDAO.LoaiVeALL();
    
    }
    //load những loại vé cần tìm
    public ArrayList<LoaiVeDTO>getdsTimKiemLoaiVe(String key)
    {
    return LoaiVeDAO.searchLoaiVe(key);
    }
    
    //add Loai ve mới
    public boolean addLoaiVe(LoaiVeDTO lvt)
    {
        LoaiVeDAO lvd = new LoaiVeDAO();
        if(lvd.addLoaiVe(lvt))
            return true;
        return false;
    }
    //Xóa vé
    public boolean deleteLoaiVe(String maLV)
    {
        LoaiVeDAO lvd = new LoaiVeDAO();
        if(lvd.deleteLoaiVe(maLV))
            return true;
        return false;
    }
    public boolean updateLoaiVe(String maLV, String tenLV)
    {
        LoaiVeDAO lvd = new LoaiVeDAO();
        if(lvd.updateLoaiVe(tenLV, maLV))
            return true;
        return false;
    
    }
    //Kiểm tra trùng khóa chính
    public boolean kiemtraTrung(LoaiVeDTO lvt)
    {
         ArrayList<LoaiVeDTO> dslv;
         dslv = LoaiVeDAO.LoaiVeALL();
         for(LoaiVeDTO lvt0: dslv)
         {
         if(lvt0.getMaLV().equals(lvt.getMaLV()))
             return true;
         }

         return false;
   
    }
    //Kiểm tra các ô có bỏ trống hay không 
    public boolean kiemtraTrong(LoaiVeDTO lvt)
    {
         if(lvt.getMaLV().length()== 0 || lvt.getTenLV().length()== 0)
             return true;
         return false;

    }
    //Kiểm tra ô trong bảng update có bị bỏ trống không
     public boolean kiemtraupdateTrong(String tenLV)
    {
         if(tenLV.length()== 0)
             return true;
         return false;

    }
    
    
    
}
