
package BUS;
import DTO.PhimDTO; 
import DAO.PhimDAO; 
import java.util.ArrayList;
public class PhimBUS 
{
    public ArrayList<PhimDTO> getDanhSachPhim()
    {
        return PhimDAO.PhimALL();
    }
    
    public boolean addPhimBUS(PhimDTO phim)
    {
        PhimDAO phimd = new PhimDAO();
        if(phimd.addPhimDAO(phim))
            return true; 
        return false; 
    }
    public boolean KTTrong(PhimDTO phim)
    {
        if(phim.getMaPhim().length()==0||phim.getThoiGian().length()==0||phim.getTenPhim().length()==0||phim.getDaoDien().length()==0||phim.getNamSX().length()==0||phim.getNuocSX().length()==0||phim.getMaLP().length()==0)
        return true;
        return false;
    }
    public boolean KTTrung(PhimDTO phim)
    {
        ArrayList <PhimDTO> dsPhim= new ArrayList<>();
        dsPhim=this.getDanhSachPhim();
        for(PhimDTO phimt :dsPhim)//Kiem tra phim moi co trùng với các phim cũ không 
        {
            if(phimt.getMaPhim().equals(phim.getMaPhim()))
                return true;
        }
        return false;
    }
    public boolean deletePhimBUS(String a){
    
    PhimDAO khd = new PhimDAO();
    if(khd.deletePhim(a))
        return true;
    return false;
    }

    public boolean updatePhimBUS(PhimDTO a){
    
    PhimDAO khd = new PhimDAO();
    if(khd.updatePhim(a))
        return true;
    return false;}
    
    
     public ArrayList<PhimDTO> getSearch(String a)
    {   
        return PhimDAO.SearchPhim(a);
    }
    
    
    
    
    
    
}
