/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class NhanVienBUS {
    public ArrayList<NhanVienDTO> getDanhSachNhanVien()
    {   
        return NhanVienDAO.NhanVienALL();
    }
    
    public boolean addNhanVienBUS(NhanVienDTO nv)
    {
        NhanVienDAO nvd=new NhanVienDAO();
        if(nvd.addNhanVienDAO(nv))
            return true;
        return false;

    }
    public boolean KTTrong(NhanVienDTO kh)
    {
        if(kh.getMaNV().length()==0||kh.getDiaChi().length()==0||kh.getCMND().length()==0||kh.getTenNV().length()==0||kh.getMaTK().length()==0)
            return true;
        return false;
    }
    public boolean KTTrung(NhanVienDTO kh)
    {
        ArrayList <NhanVienDTO> dskh= new ArrayList<>();
        dskh=this.getDanhSachNhanVien();
        for(NhanVienDTO kht :dskh)
        {
            if(kht.getMaNV().equals(kh.getMaNV()))
                return true;
        }
        return false;
    }
    public boolean deleteNhanVienBUS(String a){
    
    NhanVienDAO khd = new NhanVienDAO();
    if(khd.deleteNhanVien(a))
        return true;
    return false;
    }
    public boolean updateNhanVienBUS(NhanVienDTO a){
    
    NhanVienDAO khd = new NhanVienDAO();
    if(khd.updateNhanVien(a))
        return true;
    return false;}
    
    
     public ArrayList<NhanVienDTO> getSearch(String a)
    {   
        return NhanVienDAO.SearchNhanVien(a);
    }
}
