/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Dell
 */
public class PhongChieuDTO {
    private String MaPhong;
    private String TenPhong;
    private String KichThuoc;
    private String SoLuongGhe;
    private String MayChieu;
    private String AmThanh;
    
     public void setMaPhong(String MaPhong)
    {
        this.MaPhong=MaPhong;
    }
    public String getMaPhong()
    {
           return this.MaPhong;     
    }
     public void setTenPhong(String TenPhong)
    {
        this.TenPhong=TenPhong;
    }
    public String getTenPhong()
    {
           return this.TenPhong;     
    }
     public void setKichThuoc(String KichThuoc)
    {
        this.KichThuoc=KichThuoc;
    }
    public String getKichThuoc()
    {
           return this.KichThuoc;     
    }
     public void setSoLuongGhe(String SoluongGhe)
    {
        this.SoLuongGhe=SoluongGhe;
    }
    public String getSoLuongGhe()
    {
           return this.SoLuongGhe;     
    }
     public void setMayChieu(String MayChieu)
    {
        this.MayChieu=MayChieu;
                
    }
    public String getMayChieu()
    {
           return this.MayChieu;     
    }
     public void setAmThanh(String AmThanh)
    {
        this.AmThanh=AmThanh;
    }
    public String getAmThanh()
    {
           return this.AmThanh;     
    }
}
