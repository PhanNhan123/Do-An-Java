

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyrapphim;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GUI.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
/**
 *
 * @author Dell
 */
public class QuanLyRapPhim {
    
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        new DangNhap().setVisible(true);
    }
    
}
