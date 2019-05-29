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
    public static ArrayList<KhachHangDTO> getDanhSachKhachHang()
    {
        return KhachHangDAO.KhachHangALL();
    }
    
    public void addKhachHangBUS(KhachHangDTO kh)
    {
        KhachHangDAO khd=new KhachHangDAO();
        khd.addKhachHangDAO(kh);

    }
    public boolean KTTrong(KhachHangDTO kh)
    {
        if(kh.getMaKH().length()==0||kh.getGioiTinh().length()==0||kh.getDiaChi().length()==0||kh.getSDT().length()==0||kh.getTenKH().length()==0)
            return true;
        return false;
    }


}