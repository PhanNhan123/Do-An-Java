/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import java.util.Date;
/**
 *
 * @author HP
 */
public class VeBanDTO {
    private String MaVe;
    private String MaPhim;
    private String MaPhong;
    private String MaKH;
    private String  NgayBan;
    private String TongGiaVe;
    private String SoLuong; 
    public String getSoLuong()
    {
        return SoLuong; 
    }       
    public void setSoLuong(String SoLuong)
    {
        this.SoLuong = SoLuong;
    }
      
    public String getTongGiaVe()
    {
        return TongGiaVe; 
    }
    public void setTongGiaVe(String GiaVe)
    {
        this.TongGiaVe=GiaVe; 
    }
    public String getNgayBan()
    {
        return NgayBan; 
    }
    public void setNgayBan(String NgayBan)
    {
        this.NgayBan= NgayBan; 
    }
    public String getMaVe()
    {
        return MaVe;
    }
    public void setMaVe(String MaVe)
    {
        this.MaVe = MaVe;
    }
    public String getMaPhim()
    {
        return MaPhim;
    }
    public void setMaPhim(String MaPhim)
    {
        this.MaPhim = MaPhim;
    }
    public String getMaPhong()
    {
        return MaPhong;
    }
    public void setMaPhong(String MaPhong)
    {
        this.MaPhong = MaPhong;
    }

    public String getMaKH()
    {
        return MaKH;
    }
    public void setMaKH(String MaKH)
    {
        this.MaKH = MaKH;
    }
}
