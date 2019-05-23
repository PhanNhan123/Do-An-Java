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
    private String maVe;
    private String maPhim;
    private String maPhong;
    private String tenPhim;
    private String maKH;
    private Date ngayBan;
    public String getMaVe()
    {
        return maVe;
    }
    public void setMaVe()
    {
        this.maVe = maVe;
    }
    public String getMaPhim()
    {
        return maPhim;
    }
    public void setMaPhim()
    {
        this.maPhim = maPhim;
    }
    public String getMaPhong()
    {
        return maPhong;
    }
    public void setMaPhong()
    {
        this.maPhong = maPhong;
    }
    public String getTenPhim()
    {
        return tenPhim;
    }
    public void setTenPhim()
    {
        this.tenPhim = tenPhim;
    }
    public String getMaKH()
    {
        return maKH;
    }
    public void setMaKH()
    {
        this.maKH = maKH;
    }
}
