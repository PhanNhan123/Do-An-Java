/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.VeDAO;
import DTO.VeDTO;
import java.util.ArrayList;

/**
 *
 * @author Zed
 */
public class VeBUS {
    //Lấy danh sách các dòng trong database
    public ArrayList<VeDTO> getdsVe()
    {
        return VeDAO.VeALL();
    }
    //Lấy danh sách các dòng bằng số tiền mà không nhập từ khóa tìm kiếm
    public ArrayList<VeDTO> getdsTimKiemVeWithoutText(String key, String key2)
    {
        return VeDAO.searchVeALL(key, key2);
    }
    //Lấy danh sách các dòng sau khi tìm kiếm bằng từ khóa và số tiền
    public ArrayList<VeDTO> getdsTimKiemVe(String key0, String key, String key2)
    {
        return VeDAO.searchVeALL(key0, key, key2);
    }
    //add vé mới vào database
    public boolean addVe(VeDTO vt)
    {
    
        VeDAO vd = new VeDAO();
        if(vd.addVe(vt))
            return true;
        return false;
    
    }
    //cập nhật vé mới
    public boolean updateVe(VeDTO vt)
    {
    
        VeDAO vd = new VeDAO();
        if(vd.updateVe(vt))
            return true;
        return false;
    
    }
    //Kiểm tra trùng khóa chính
    public boolean kiemtraTrung(String maVe)
    {
        ArrayList<VeDTO> dsVe;
        dsVe = VeDAO.VeALL();
        for(VeDTO vt0: dsVe)
        {
            if(vt0.getMaVe().equals(maVe))
                return true;
        }
        return false;
    }
    //Kiểm tra các trường có bỏ trống không
    public boolean kiemtraTrong(VeDTO vt)
    {
        if(vt.getMaVe().length()== 0 || vt.getGiaVe().length()== 0 || vt.getSoLuong().length() == 0 || vt.getMaLV().length()== 0)
            return true;
        return false;
    
    }
    //xóa vé
    public boolean deleteVe(String maVe)
    {
        VeDAO vd = new VeDAO();
        if(vd.deleteVe(maVe))
            return true;
        return false;
    
    }
 
    
    
}
