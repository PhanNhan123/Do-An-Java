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
public class PhimDTO {
    private String MaPhim;
    private String ThoiGian;
    private String TenPhim;
    private String DaoDien;
    private String DienVien;
    private String NamSX;
    private String NuocSX;
    private String MaLP;
    
    public void setMaPhim(String MaPhim)
    {
        this.MaPhim=MaPhim;
    }
    public String getMaPhim()
    {
         return this.MaPhim;
    }
     public void setThoiGian(String ThoiGian)
    {
        this.ThoiGian=ThoiGian;
    }
    public String getThoiGian()
    {
           return this.ThoiGian;     
    }
     public void setTenPhim(String TenPhim)
    {
        this.TenPhim=TenPhim;
    }
    public String getTenPhim()
    {
           return this.TenPhim;     
    }   
     public void setDaoDien(String DaoDien)
    {
        this.DaoDien=DaoDien;
        
    }
    public String getDaoDien()
    {
           return this.DaoDien;     
    }
     public void setDienVien(String DienVien)
    {
        this.DienVien=DienVien;
    }
    public String getDienVien()
    {
           return this.DienVien;     
    }
     public void setNamSX( String  NamSX)
    {
        this.NamSX= NamSX;
    }
    public  String getNamSX()
    {
           return this.NamSX;
    }
     public void setNuocSX( String NuocSX)
    {
        this.NuocSX=NuocSX;
                
    }
    public String getNuocSX()
    {
           return this.NuocSX;     
    }
     public void setMaLP(String MaLP)
    {
        this.MaLP=MaLP;
               
    }
    public String getMaLP()
    {
           return this.MaLP;     
    }
}
