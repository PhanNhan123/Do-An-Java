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
public class ThongKe {
    private String MaPhim;
    private String TenPhim;
    private String Tong_SoLuong;
    private String DoanhThu;
    
public void setMaPhim(String a)
{
    MaPhim=a;
}
public String getMaPhim()
{
    return MaPhim;
}
public void setTenPhim(String a)
{
    TenPhim=a;
}
public String getTenPhim()
{
    return TenPhim;
}
public void setTong(String a)
{
    Tong_SoLuong=a;
}
public String getTong()
{
    return Tong_SoLuong;
}
public void setDoanhThu(String a)
{
    DoanhThu=a;
}
public String getDoanhThu()
{
    return DoanhThu;
}
}
