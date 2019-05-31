/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DAO.KhachHangDAO;
import DTO.KhachHangDTO;


import java.util.ArrayList;


/**
 *
 * @author Dell
 */
public class KhachHangBUS {
    public ArrayList<KhachHangDTO> getDanhSachKhachHang()
    {   
        return KhachHangDAO.KhachHangALL();
    }
    
    public boolean addKhachHangBUS(KhachHangDTO kh)
    {
        KhachHangDAO khd=new KhachHangDAO();
        if(khd.addKhachHangDAO(kh))
            return true;
        return false;

    }
    public boolean KTTrong(KhachHangDTO kh)
    {
        if(kh.getMaKH().length()==0||kh.getGioiTinh().length()==0||kh.getDiaChi().length()==0||kh.getSDT().length()==0||kh.getTenKH().length()==0)
            return true;
        return false;
    }
    public boolean KTTrung(KhachHangDTO kh)
    {
        ArrayList <KhachHangDTO> dskh= new ArrayList<>();
        dskh=this.getDanhSachKhachHang();
        for(KhachHangDTO kht :dskh)//Kiem tra khach hang moi co trùng với các khach hàng cũ k 
        {
            if(kht.getMaKH().equals(kh.getMaKH()))
                return true;
        }
        return false;
    }
    public boolean deleteKhachHangBUS(String a){
    
    KhachHangDAO khd = new KhachHangDAO();
    if(khd.deleteKhachHang(a))
        return true;
    return false;
    }
}