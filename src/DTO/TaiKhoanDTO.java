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
public class TaiKhoanDTO {
    private String MaTK;
    private String LoaiTK;
    private String TenTK;
    private String MatKhau;
    
     public void setMaTK(String MaTK)
    {
        this.MaTK=MaTK;
    }
    public String getMaTK()
    {
           return this.MaTK;     
    }
     public void setLoaiTK(String LoaiTK)
    {
        this.LoaiTK=LoaiTK;
    }
    public String getLoaiTK()
    {
           return this.LoaiTK;     
    }
     public void setTenTK(String TenTK)
    {
        this.TenTK=TenTK;
    }
    public String getTenTK()
    {
           return this.TenTK;     
    }
     public void setMatKhau(String MatKhau)
    {
        this.MatKhau=MatKhau;
    }
    public String getMatKhau()
    {
           return this.MatKhau;     
    }
}
