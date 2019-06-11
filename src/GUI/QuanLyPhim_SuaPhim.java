/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.PhimBUS;
import DTO.PhimDTO;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author phannhan
 */
public class QuanLyPhim_SuaPhim extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyPhim_SuaPhim
     */
    public QuanLyPhim_SuaPhim() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }
 
    public QuanLyPhim_SuaPhim(PhimDTO a) {
        initComponents();
        this.textMaPhim.setText(a.getMaPhim());
        this.chooser.setCalendar(Calendar.getInstance());
        this.textTenPhim.setText(a.getTenPhim());
        this.textDaoDien.setText(a.getDaoDien());
        this.textDienVien.setText(a.getDienVien());
        this.textNamSX.setText(a.getNamSX());
        this.textNuocSX.setText(a.getNuocSX());
        this.textMaLP.setText(a.getMaLP());;
        this.textMaPhim.setEditable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCapnhatphim = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lableCapnhatphim = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelMaphim = new javax.swing.JLabel();
        labelThoigian = new javax.swing.JLabel();
        labelTenPhim = new javax.swing.JLabel();
        labelĐaodien = new javax.swing.JLabel();
        labelDienvien = new javax.swing.JLabel();
        labelNamSX = new javax.swing.JLabel();
        labelNươcSX = new javax.swing.JLabel();
        labelMaLP = new javax.swing.JLabel();
        textMaPhim = new javax.swing.JTextField();
        textTenPhim = new javax.swing.JTextField();
        textDaoDien = new javax.swing.JTextField();
        textDienVien = new javax.swing.JTextField();
        textNamSX = new javax.swing.JTextField();
        textNuocSX = new javax.swing.JTextField();
        textMaLP = new javax.swing.JTextField();
        chooser = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        labelXacnhancapnhat = new javax.swing.JLabel();
        buttonCapnhat = new javax.swing.JButton();
        buttonHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 54, 22));

        labelCapnhatphim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelCapnhatphim.setText("Cập nhật phim ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labelCapnhatphim, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCapnhatphim, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        lableCapnhatphim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lableCapnhatphim.setText("Cập nhật thông tin phim ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lableCapnhatphim, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lableCapnhatphim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelMaphim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMaphim.setText("Mã Phim");

        labelThoigian.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelThoigian.setText("Thời gian");

        labelTenPhim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelTenPhim.setText("Ghichú");

        labelĐaodien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelĐaodien.setText("Đạo diễn ");

        labelDienvien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelDienvien.setText("Diễn viên ");

        labelNamSX.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelNamSX.setText("Năm sản xuất ");

        labelNươcSX.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelNươcSX.setText("Nước sản xuất ");

        labelMaLP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMaLP.setText("Mã loại phim ");

        textMaPhim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textTenPhim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textTenPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTenPhimActionPerformed(evt);
            }
        });

        textDaoDien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textDaoDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDaoDienActionPerformed(evt);
            }
        });

        textDienVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textNamSX.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textNuocSX.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textMaLP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        chooser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMaphim)
                    .addComponent(labelThoigian)
                    .addComponent(labelTenPhim)
                    .addComponent(labelĐaodien)
                    .addComponent(labelDienvien)
                    .addComponent(labelNamSX)
                    .addComponent(labelNươcSX)
                    .addComponent(labelMaLP))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textMaPhim)
                    .addComponent(textTenPhim)
                    .addComponent(textDaoDien)
                    .addComponent(textDienVien)
                    .addComponent(textNamSX)
                    .addComponent(textNuocSX)
                    .addComponent(textMaLP, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(chooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaphim)
                    .addComponent(textMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelThoigian)
                    .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenPhim)
                    .addComponent(textTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelĐaodien)
                    .addComponent(textDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDienvien)
                    .addComponent(textDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamSX)
                    .addComponent(textNamSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNươcSX)
                    .addComponent(textNuocSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaLP)
                    .addComponent(textMaLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        labelXacnhancapnhat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelXacnhancapnhat.setText("Xác nhận cập nhật phim ");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(buttonCapnhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelXacnhancapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelXacnhancapnhat)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCapnhat)
                    .addComponent(buttonHuy))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textTenPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTenPhimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTenPhimActionPerformed

    private void textDaoDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDaoDienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDaoDienActionPerformed

    private void buttonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonHuyActionPerformed

    private void buttonCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCapnhatActionPerformed
        if(this.updatePhim()==1)
            this.dispose();
        
    }//GEN-LAST:event_buttonCapnhatActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyPhim_SuaPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhim_SuaPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhim_SuaPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhim_SuaPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyPhim_SuaPhim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCapnhat;
    private javax.swing.JButton buttonHuy;
    private com.toedter.calendar.JDateChooser chooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCapnhatphim;
    private javax.swing.JLabel labelDienvien;
    private javax.swing.JLabel labelMaLP;
    private javax.swing.JLabel labelMaphim;
    private javax.swing.JLabel labelNamSX;
    private javax.swing.JLabel labelNươcSX;
    private javax.swing.JLabel labelTenPhim;
    private javax.swing.JLabel labelThoigian;
    private javax.swing.JLabel labelXacnhancapnhat;
    private javax.swing.JLabel labelĐaodien;
    private javax.swing.JLabel lableCapnhatphim;
    private javax.swing.JTextField textDaoDien;
    private javax.swing.JTextField textDienVien;
    private javax.swing.JTextField textMaLP;
    private javax.swing.JTextField textMaPhim;
    private javax.swing.JTextField textNamSX;
    private javax.swing.JTextField textNuocSX;
    private javax.swing.JTextField textTenPhim;
    // End of variables declaration//GEN-END:variables
        public int updatePhim() {
        PhimBUS phimb=new PhimBUS();
       PhimDTO phim=new PhimDTO();//Tao 1 phim moi va gan cac gia tri vao no
        phim.setMaPhim(textMaPhim.getText());
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd");
        String date = sdf.format(chooser.getDate());
        phim.setThoiGian(date);
        phim.setTenPhim(textTenPhim.getText());
        phim.setDaoDien(textDaoDien.getText());
        phim.setDienVien(textDienVien.getText());
        phim.setNamSX(textNamSX.getText());
        phim.setNuocSX(textNuocSX.getText()); 
        phim.setMaLP(textMaLP.getText()); 
        if(phimb.KTTrong(phim)){
            JOptionPane.showMessageDialog(null, "Không được để trống ");
            return 0;
        }

        
        if(phimb.updatePhimBUS(phim))
        {
            JOptionPane.showMessageDialog(null, "Cập nhật phim thành công");
            
            return 1;
        }
        JOptionPane.showMessageDialog(null, "Cập nhật phim thất bại");
        return 0;
    }

   
}

