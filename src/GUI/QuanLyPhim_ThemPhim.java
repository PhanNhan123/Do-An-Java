
package GUI;
import BUS.PhimBUS; 
import DTO.PhimDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.JOptionPane; 
public class QuanLyPhim_ThemPhim extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyPhim_ThemPhim
     */
    public QuanLyPhim_ThemPhim() {
        initComponents();
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        choose.setCalendar(Calendar.getInstance());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelThemPhim = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelMaphim = new javax.swing.JLabel();
        textMaPhim = new javax.swing.JTextField();
        labelThoigian = new javax.swing.JLabel();
        labelGhichu = new javax.swing.JLabel();
        labelDaodien = new javax.swing.JLabel();
        labelDienvien = new javax.swing.JLabel();
        labelNamSX = new javax.swing.JLabel();
        labelNuocSX = new javax.swing.JLabel();
        labelMaloaiphim = new javax.swing.JLabel();
        textTenPhim = new javax.swing.JTextField();
        textDaoDien = new javax.swing.JTextField();
        textDienVien = new javax.swing.JTextField();
        textNamSX = new javax.swing.JTextField();
        textNuocSX = new javax.swing.JTextField();
        textMaLP = new javax.swing.JTextField();
        choose = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        labelXacnhanthemphong = new javax.swing.JLabel();
        buttonThem = new javax.swing.JButton();
        buttonHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 54, 22));

        labelThemPhim.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelThemPhim.setText("Thêm Phim ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelThemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelThemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        labelMaphim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMaphim.setText("Mã Phim");

        textMaPhim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        labelThoigian.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelThoigian.setText("Thời gian");

        labelGhichu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelGhichu.setText("Tên phim");

        labelDaodien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelDaodien.setText("Đạo diễn");

        labelDienvien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelDienvien.setText("Diễn viên ");

        labelNamSX.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelNamSX.setText("Năm sản xuất ");

        labelNuocSX.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelNuocSX.setText("Nước sản xuất");

        labelMaloaiphim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelMaloaiphim.setText("Mã loại phim");

        textTenPhim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textTenPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTenPhimActionPerformed(evt);
            }
        });

        textDaoDien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textDienVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textNamSX.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textNamSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamSXActionPerformed(evt);
            }
        });

        textNuocSX.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        textMaLP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        choose.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMaphim, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelThoigian)
                    .addComponent(labelGhichu)
                    .addComponent(labelDaodien)
                    .addComponent(labelDienvien)
                    .addComponent(labelNamSX)
                    .addComponent(labelNuocSX)
                    .addComponent(labelMaloaiphim))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textMaPhim, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(textDaoDien)
                    .addComponent(textTenPhim)
                    .addComponent(textDienVien)
                    .addComponent(textNamSX)
                    .addComponent(textNuocSX)
                    .addComponent(textMaLP)
                    .addComponent(choose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaphim)
                    .addComponent(textMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelThoigian)
                    .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGhichu)
                            .addComponent(textTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDaodien))
                    .addComponent(textDaoDien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDienvien)
                    .addComponent(textDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamSX)
                    .addComponent(textNamSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNuocSX)
                    .addComponent(textNuocSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaloaiphim)
                    .addComponent(textMaLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        labelXacnhanthemphong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelXacnhanthemphong.setText("Xác nhận thêm phim mới ");

        buttonThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonThem.setText("Thêm ");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonThem)
                        .addGap(34, 34, 34)
                        .addComponent(buttonHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelXacnhanthemphong, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelXacnhanthemphong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textTenPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTenPhimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTenPhimActionPerformed

    private void textNamSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNamSXActionPerformed

    private void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemActionPerformed
        this.addPhim();
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
            java.util.logging.Logger.getLogger(QuanLyPhim_ThemPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhim_ThemPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhim_ThemPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhim_ThemPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyPhim_ThemPhim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHuy;
    private javax.swing.JButton buttonThem;
    private com.toedter.calendar.JDateChooser choose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelDaodien;
    private javax.swing.JLabel labelDienvien;
    private javax.swing.JLabel labelGhichu;
    private javax.swing.JLabel labelMaloaiphim;
    private javax.swing.JLabel labelMaphim;
    private javax.swing.JLabel labelNamSX;
    private javax.swing.JLabel labelNuocSX;
    private javax.swing.JLabel labelThemPhim;
    private javax.swing.JLabel labelThoigian;
    private javax.swing.JLabel labelXacnhanthemphong;
    private javax.swing.JTextField textDaoDien;
    private javax.swing.JTextField textDienVien;
    private javax.swing.JTextField textMaLP;
    private javax.swing.JTextField textMaPhim;
    private javax.swing.JTextField textNamSX;
    private javax.swing.JTextField textNuocSX;
    private javax.swing.JTextField textTenPhim;
    // End of variables declaration//GEN-END:variables
public void addPhim()
{
    PhimBUS phimb = new PhimBUS(); 
    PhimDTO phim = new PhimDTO(); 
    phim.setMaPhim(textMaPhim.getText());
    SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd");
    String date = sdf.format(choose.getDate());
    phim.setThoiGian(date);
    phim.setTenPhim(textTenPhim.getText());
    phim.setDaoDien(textDaoDien.getText());
    phim.setDienVien(textDienVien.getText());
    phim.setNamSX(textNamSX.getText());
    phim.setNuocSX(textNuocSX.getText());
    phim.setMaLP(textMaLP.getText()); 
    if(phimb.KTTrong(phim)==true)
    {
            JOptionPane.showMessageDialog(null, "Không được để trống các trường dữ liệu");
            
        }
//        for(PhimDTO phimt :dsphim)//Kiem tra phim moi co trùng với các phim cũ không
     
           
        if(phimb.KTTrung(phim))
            {
                JOptionPane.showMessageDialog(null, "Thêm thất bại! Nhập trùng MaPhim khóa chính");
               
            } 
        
        else
            if(phimb.addPhimBUS(phim))
        {
            JOptionPane.showMessageDialog(null, "Thêm phim thành công");

        }
    else
        JOptionPane.showMessageDialog(null, "Thêm phim thất bại");
       
        
    }
}
