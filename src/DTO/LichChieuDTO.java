/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Dell
 */
public class LichChieuDTO {
    private Date NgayChieu;
    private int BuoiChieu;
    private String MaPhim;
    private String MaPhong;
    private String MaLV;
    
     public void setNgayChieu(Date NgayChieu)
    {
        this.NgayChieu=NgayChieu;
    }
    public Date getNgayChieu()
    {
           return this.NgayChieu ;     
    }
     public void setBuoiChieu(int BuoiChieu)
    {
        this.BuoiChieu=BuoiChieu;
    }
    public int getBuoiChieu()
    {
           return this.BuoiChieu;     
    }
     public void setMaPhim(String MaPhim)
    {
        this.MaPhim=MaPhim;
                
    }
    public String getMaPhim()
    {
           return this.MaPhim ;     
    }
     public void setMaPhong(String MaPhong)
    {
        this.MaPhong=MaPhong;
    }
    public String getMaPhong()
    {
           return this.MaPhong;     
    }
     public void setMaLV(String MaLP)
    {
        this.MaLV=MaLP;
    }
    public String getMaLV()
    {
           return this.MaLV;     
    }
}
