package quanlyrapphim;
import GUI.DangNhap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package quanlyrapphim;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//import GUI.QuanLyVe;
//import GUI.Home;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import javax.swing.*;
///**
// *
// * @author Dell
// */
//public class QuanLyRapPhim {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) throws SQLException {
//        // TODO code application logic here
////        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=QLRP;user=sa;password=sa";
////Connection conn = DriverManager.getConnection(dbURL);
////if (conn != null) {
//// System.out.println("Connected");
////}       
//         QuanLyVe QLV=new QuanLyVe();
//        QLV.CreateAndShow();
//        //Home home=new Home();
//        //home.CreateAndShow();
//    }
//    
//}

public class QuanLyRapPhim {
    public static void main(String[] args) {
        new DangNhap();
    }
}