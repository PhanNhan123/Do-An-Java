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
public class LoaiPhimDTO {
    private String maLP;
    private String TenLP;
    
    public String getMaLP ()
    {
        return maLP;
    }
    public void setMaLP(String maLP)
    {
        this.maLP=maLP;
    }
    public String getTenLP()
    {
        return this.TenLP;
    }
    public void setTenLP(String TenLP)
    {
        this.TenLP=TenLP;
    }
    
}
