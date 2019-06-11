/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.PhongChieuDAO;
import DTO.PhongChieuDTO;
import java.sql.SQLException;
import java.util.ArrayList;
public class PhongChieuBUS {
    public ArrayList<PhongChieuDTO> getDanhSachPhongChieu()
    {   
        return PhongChieuDAO.PhongChieuALL();
    }
    
    public boolean addPhongChieuBUS(PhongChieuDTO pc)
    {
        PhongChieuDAO pcd=new PhongChieuDAO();
        if(pcd.addPhongChieuDAO(pc))
            return true;
        return false;

    }
    public boolean KTTrong(PhongChieuDTO pc)
    {
        if(pc.getMaPhong().length()==0||pc.getTenPhong().length()==0||pc.getKichThuoc().length()==0||pc.getSoLuongGhe().length()==0||pc.getMayChieu().length()==0||pc.getAmThanh().length()==0)
            return true;
        return false;
    }
    public boolean KTTrung(PhongChieuDTO pc)
    {
        ArrayList <PhongChieuDTO> dspc= new ArrayList<>();
        dspc=this.getDanhSachPhongChieu();
        for(PhongChieuDTO pct :dspc)
        {
            if(pct.getMaPhong().equals(pc.getMaPhong()))
                return true;
        }
        return false;
    }
    public boolean deletePhongChieuBUS(String a) throws SQLException{
    
    PhongChieuDAO pcd = new PhongChieuDAO();
    if(pcd.deletePhongChieu(a))
        return true;
    return false;
    }
    public boolean updatePhongChieuBUS(PhongChieuDTO a){
    
    PhongChieuDAO pcd = new PhongChieuDAO();
    if(pcd.updatePhongChieu(a))
        return true;
    return false;}
    
    
     public ArrayList<PhongChieuDTO> getSearch(String a)
    {   
        return PhongChieuDAO.SearchPhongChieu(a);
    }
}

