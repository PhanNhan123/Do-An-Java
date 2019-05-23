/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package GUI;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.*;
///**
// *
// * @author Dell
// */
//public class Home {
//    JFrame frame=new JFrame();
//   public void CreateAndShow()
//   {
//       frame.setSize(1280,720);
//       frame.setTitle("Quản Lý Rạp Phim Ettol");
//       JPanel panel1=new JPanel();
//       JLabel label1 = new JLabel("Trang chủ");
//       panel1.add(label1);
//       JButton buttonLogin=new JButton("Đăng Nhập");
//       buttonLogin.addActionListener(new ClickAcTion());
//       panel1.add(buttonLogin);
//       frame.add(panel1);
//       frame.setLocationRelativeTo(null);//set vị trí xuất hiện frame là giữa màn hình
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       frame.setVisible(true);
//   }
//
//    private static class ClickAcTion implements ActionListener {
//
//        public ClickAcTion() { JFrame login=new JFrame("Thông tin đăng nhập");
//        JPanel pan1=new JPanel();
//        JPanel pan2= new JPanel();
//        JLabel la1=new JLabel("User");
//        JLabel la2= new JLabel("Password");
//        JTextField textuser=new JTextField();
//        JTextField textpassword= new JTextField();
//        pan1.add(la1);
//        pan1.add(textuser);
//        pan2.add(la2);
//        pan2.add(textpassword);
//        login.add(pan1);
//        login.add(pan2);
//        login.setVisible(true);
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet.");
//            //To change body of generated methods, choose Tools | Templates.
//           
//            
//        }
//    }
//}
