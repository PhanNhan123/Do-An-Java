/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.PhongChieuBUS;
import DTO.PhongChieuDTO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author phannhan
 */
public class QuanLyPhongchieu_SuaPhongChieu extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyPhongchieu_SuaPhongChieu
     */
    public QuanLyPhongchieu_SuaPhongChieu() {
        initComponents();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    public QuanLyPhongchieu_SuaPhongChieu(PhongChieuDTO a)
    {
        initComponents();
        this.textMaPhong.setText(a.getMaPhong());
        this.textTenPhong.setText(a.getTenPhong());
        this.textKichThuoc.setText(a.getKichThuoc());
        this.textSoLuongGhe.setText(a.getSoLuongGhe());
        this.textMayChieu.setText(a.getMayChieu());
        this.textAmThanh.setText(a.getAmThanh());
         this.textMaPhong.setEditable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCapnhatphongchieu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCapnhatthongtinphongchieu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelMaphong = new javax.swing.JLabel();
        labelTenphong = new javax.swing.JLabel();
        labelKichthuoc = new javax.swing.JLabel();
        labelSoluongghe = new javax.swing.JLabel();
        labelMaychieu = new javax.swing.JLabel();
        labelAmthanh = new javax.swing.JLabel();
        textMaPhong = new javax.swing.JTextField();
        textTenPhong = new javax.swing.JTextField();
        textKichThuoc = new javax.swing.JTextField();
        textSoLuongGhe = new javax.swing.JTextField();
        textMayChieu = new javax.swing.JTextField();
        textAmThanh = new javax.swing.JTextField();
        buttonCapnhat = new javax.swing.JButton();
        buttonHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 54, 22));

        labelCapnhatphongchieu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelCapnhatphongchieu.setText("Cập nhật phòng chiếu ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelCapnhatphongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(labelCapnhatphongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        labelCapnhatthongtinphongchieu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelCapnhatthongtinphongchieu.setText("Cập nhật thông tin phòng chiếu ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(labelCapnhatthongtinphongchieu)
                .addGap(200, 200, 200))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCapnhatthongtinphongchieu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        labelMaphong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMaphong.setText("Mã phòng");

        labelTenphong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelTenphong.setText("Tên phòng");

        labelKichthuoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelKichthuoc.setText("Kích thước ");

        labelSoluongghe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelSoluongghe.setText("Số lượng ghế");

        labelMaychieu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMaychieu.setText("Máy chiếu");

        labelAmthanh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelAmthanh.setText("Âm thanh");

        textMaPhong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textTenPhong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textKichThuoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textSoLuongGhe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textMayChieu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textAmThanh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        buttonCapnhat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonCapnhat.setText("Cập nhật ");
        buttonCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCapnhatActionPerformed(evt);
            }
        });

        buttonHuy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonHuy.setText("Huỷ");
        buttonHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTenphong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMaphong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelKichthuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSoluongghe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMaychieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAmthanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textMaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(textTenPhong)
                            .addComponent(textKichThuoc)
                            .addComponent(textSoLuongGhe)
                            .addComponent(textMayChieu)
                            .addComponent(textAmThanh)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(buttonCapnhat)
                        .addGap(46, 46, 46)
                        .addComponent(buttonHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaphong)
                    .addComponent(textMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenphong)
                    .addComponent(textTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKichthuoc)
                    .addComponent(textKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoluongghe)
                    .addComponent(textSoLuongGhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMaychieu)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(textMayChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAmthanh)
                    .addComponent(textAmThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCapnhat)
                    .addComponent(buttonHuy)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCapnhatActionPerformed
         if(this.updatePhongChieu()==1)
            this.dispose();
    }//GEN-LAST:event_buttonCapnhatActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyPhongchieu_SuaPhongChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhongchieu_SuaPhongChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhongchieu_SuaPhongChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhongchieu_SuaPhongChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyPhongchieu_SuaPhongChieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCapnhat;
    private javax.swing.JButton buttonHuy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelAmthanh;
    private javax.swing.JLabel labelCapnhatphongchieu;
    private javax.swing.JLabel labelCapnhatthongtinphongchieu;
    private javax.swing.JLabel labelKichthuoc;
    private javax.swing.JLabel labelMaphong;
    private javax.swing.JLabel labelMaychieu;
    private javax.swing.JLabel labelSoluongghe;
    private javax.swing.JLabel labelTenphong;
    private javax.swing.JTextField textAmThanh;
    private javax.swing.JTextField textKichThuoc;
    private javax.swing.JTextField textMaPhong;
    private javax.swing.JTextField textMayChieu;
    private javax.swing.JTextField textSoLuongGhe;
    private javax.swing.JTextField textTenPhong;
    // End of variables declaration//GEN-END:variables
private int updatePhongChieu() {
        PhongChieuBUS pcb=new PhongChieuBUS();
       PhongChieuDTO pc=new PhongChieuDTO();//Tao 1 phong chieu moi va gan cac gia tri vao no
        pc.setMaPhong(textMaPhong.getText());
        pc.setTenPhong(textTenPhong.getText());
        pc.setKichThuoc(textKichThuoc.getText());
        pc.setSoLuongGhe(textSoLuongGhe.getText());
        pc.setMayChieu(textMayChieu.getText());
        pc.setAmThanh(textAmThanh.getText());
        if(pcb.KTTrong(pc)){
            JOptionPane.showMessageDialog(null, "Không được để trống ");
            return 0;
        }

        
        if(pcb.updatePhongChieuBUS(pc))
        {
            JOptionPane.showMessageDialog(null, "Cập nhật phòng chiếu  thành công");
            
            return 1;
        }
        JOptionPane.showMessageDialog(null, "Cập nhật phòng chiếu thất bại");
        return 0;
    }

}
