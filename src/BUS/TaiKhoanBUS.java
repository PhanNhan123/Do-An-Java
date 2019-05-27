/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import java.util.ArrayList;
import DAO.TaiKhoanDAO;
import DTO.TaiKhoanDTO;

/**
 *
 * @author Dell
 */
public class TaiKhoanBUS {
    public static ArrayList<TaiKhoanDTO> getDanhSachTaiKhoan() {
        return TaiKhoanDAO.TaiKhoanALL();
    }
}
