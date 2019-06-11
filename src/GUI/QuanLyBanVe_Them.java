/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.VeBanBUS;
import DTO.VeBanDTO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author phannhan
 */
public class QuanLyBanVe_Them extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyBanVe_Them
     */
    public QuanLyBanVe_Them() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        chooser.setCalendar(Calendar.getInstance());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelThemveban = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelNgayban = new javax.swing.JLabel();
        labelMaphim = new javax.swing.JLabel();
        labelMaphong = new javax.swing.JLabel();
        labelMave = new javax.swing.JLabel();
        labelMakh = new javax.swing.JLabel();
        labelGiave = new javax.swing.JLabel();
        textMaPhim = new javax.swing.JTextField();
        textMaPhong = new javax.swing.JTextField();
        textMaVe = new javax.swing.JTextField();
        textMaKH = new javax.swing.JTextField();
        textGiaVe = new javax.swing.JTextField();
        labelThemttm = new javax.swing.JLabel();
        buttonThem = new javax.swing.JButton();
        buttonHuy = new javax.swing.JButton();
        labelSoLuong = new javax.swing.JLabel();
        textSoLuong = new javax.swing.JTextField();
        chooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 54, 22));

        labelThemveban.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelThemveban.setText("Thêm vé bán");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelThemveban, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelThemveban, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        labelNgayban.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelNgayban.setText("Ngày bán");

        labelMaphim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMaphim.setText("Mã phim");

        labelMaphong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMaphong.setText("Mã phòng");

        labelMave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMave.setText("Mã vé");

        labelMakh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMakh.setText("Mã khách hàng");

        labelGiave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelGiave.setText("Tổng giá vé");

        textMaPhim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textMaPhong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textMaVe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textMaKH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textGiaVe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        labelThemttm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelThemttm.setText("Xác nhận thêm thông tin mới ");

        buttonThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonThem.setText("Thêm");
        buttonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemActionPerformed(evt);
            }
        });

        buttonHuy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonHuy.setText("Huỷ");
        buttonHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHuyActionPerformed(evt);
            }
        });

        labelSoLuong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelSoLuong.setText("Số lượng");

        textSoLuong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        chooser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelThemttm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonHuy)))
                .addGap(275, 275, 275))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelNgayban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMaphim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMaphong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMakh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelGiave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelSoLuong))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMaPhim)
                    .addComponent(textMaPhong)
                    .addComponent(textMaVe)
                    .addComponent(textMaKH)
                    .addComponent(textGiaVe)
                    .addComponent(textSoLuong)
                    .addComponent(chooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNgayban, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaphim)
                    .addComponent(textMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaphong)
                    .addComponent(textMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMave)
                    .addComponent(textMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMakh)
                    .addComponent(textMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGiave)
                    .addComponent(textGiaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoLuong)
                    .addComponent(textSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(labelThemttm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonThem)
                    .addComponent(buttonHuy))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemActionPerformed
        if(this.addVeBan()==1)//Xu ly su kien Them
            this.dispose();
    }//GEN-LAST:event_buttonThemActionPerformed

    private void buttonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonHuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyBanVe_Them.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyBanVe_Them.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyBanVe_Them.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyBanVe_Them.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyBanVe_Them().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHuy;
    private javax.swing.JButton buttonThem;
    private com.toedter.calendar.JDateChooser chooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelGiave;
    private javax.swing.JLabel labelMakh;
    private javax.swing.JLabel labelMaphim;
    private javax.swing.JLabel labelMaphong;
    private javax.swing.JLabel labelMave;
    private javax.swing.JLabel labelNgayban;
    private javax.swing.JLabel labelSoLuong;
    private javax.swing.JLabel labelThemttm;
    private javax.swing.JLabel labelThemveban;
    private javax.swing.JTextField textGiaVe;
    private javax.swing.JTextField textMaKH;
    private javax.swing.JTextField textMaPhim;
    private javax.swing.JTextField textMaPhong;
    private javax.swing.JTextField textMaVe;
    private javax.swing.JTextField textSoLuong;
    // End of variables declaration//GEN-END:variables

    public int addVeBan()
    {
//        
        VeBanBUS vbb=new VeBanBUS();
        VeBanDTO vb=new VeBanDTO();//Tao 1 ve ban moi va gan cac gia tri vao no
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd");
         String date = sdf.format(chooser.getDate());
          vb.setNgayBan(date);
        vb.setMaPhim(textMaPhim.getText());
        vb.setMaPhong(textMaPhong.getText());
        vb.setMaVe(textMaVe.getText());
        vb.setMaKH(textMaKH.getText());
        vb.setTongGiaVe(textGiaVe.getText());
        vb.setSoLuong(textSoLuong.getText()); 
        if(vbb.KTTrong(vb)==true){
            JOptionPane.showMessageDialog(null, "Không được để trống các trường dữ liệu");
            return 0;
        }

           if(vbb.KTTrung(vb))
            {
                JOptionPane.showMessageDialog(null, "Thêm thất bại! Nhập trùng khóa chính");
                return 0;
            }
        
        if(vbb.addVeBanBUS(vb))
        {
            JOptionPane.showMessageDialog(null, "Thêm vé bán thành công");
            return 1;
        }
        JOptionPane.showMessageDialog(null, "Thêm vé bán thất bại");
        return 0;
        
    }
    
    
    
    

}
