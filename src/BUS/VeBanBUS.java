
package BUS;

import DAO.VeBanDAO;
import DTO.ThongKe;
import DTO.VeBanDTO;
import java.util.ArrayList;


public class VeBanBUS {
    public ArrayList<VeBanDTO> getDanhSachVeBan()
    {
        return VeBanDAO.VeBanALL();
    }
    
    public boolean addVeBanBUS(VeBanDTO vb)
    {
        VeBanDAO vbd = new VeBanDAO();
        if(vbd.addVeBanDAO(vb))
            return true; 
        return false; 
    }
    public boolean KTTrong(VeBanDTO vb)
    {
        if(vb.getNgayBan().length()==0||vb.getMaPhim().length()==0||vb.getMaPhong().length()==0||vb.getMaVe().length()==0||vb.getMaKH().length()==0||vb.getTongGiaVe().length()==0)
        return true;
        return false;
    }
    public boolean KTTrung(VeBanDTO vb)
    {
        ArrayList <VeBanDTO> dsvb= new ArrayList<>();
        dsvb=this.getDanhSachVeBan();
        for(VeBanDTO vbt :dsvb)//Kiem tra ve  moi co trùng với các phim cũ không 
        {
            if(vbt.getMaPhim().equals(vb.getMaPhim())&&vbt.getMaPhong().equals(vb.getMaPhong())&&vbt.getMaKH().equals(vb.getMaKH())&&vbt.getMaVe().equals(vb.getMaVe()))
                return true;
        }
        return false;
    }
    public boolean deleteVeBanBUS(String a){
    
    VeBanDAO vbd = new VeBanDAO();
    if(vbd.deleteVeBan(a))
        return true;
    return false;
    }

    public boolean updateVeBanBUS(VeBanDTO a){
    
    VeBanDAO vbd = new VeBanDAO();
    if(vbd.updateVeBan(a))
        return true;
    return false;}
    
    
     public ArrayList<VeBanDTO> getSearch(String a)
    {   
        return VeBanDAO.SearchVeBan(a);
    }


    public ArrayList<ThongKe> getThongKe(String dateFrom, String dateTo) {
                 return VeBanDAO.ThongKe(dateFrom, dateTo);
    }
    
    
    
}
