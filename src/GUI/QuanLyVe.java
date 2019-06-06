/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.VeBUS;
import DTO.VeDTO;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zed
 */
public class QuanLyVe extends javax.swing.JFrame {

    ArrayList<VeDTO> dsVe;
    public QuanLyVe() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        buttonTimKiem = new javax.swing.JButton();
        textTimKiemVe = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();
        cbGiaVe = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVe = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Vé");
        setPreferredSize(new java.awt.Dimension(875, 630));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(194, 54, 22));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Vé");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(714, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 860, 70);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Danh Sách Vé");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 180, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 120, 60, 20);

        buttonTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonTimKiem.setText("Tìm");
        buttonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimKiemActionPerformed(evt);
            }
        });

        textTimKiemVe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        buttonAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonAdd.setText("Thêm");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonDelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonDelete.setText("Xóa");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonUpdate.setText("Sửa");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonRefresh.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonRefresh.setText("Refresh");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        cbGiaVe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbGiaVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "40000 - 50000", "50000 - 60000", "60000- 70000", "80000- 90000", " " }));

        tableVe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tableVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ));
        jScrollPane1.setViewportView(tableVe);
        if (tableVe.getColumnModel().getColumnCount() > 0) {
            tableVe.getColumnModel().getColumn(0).setResizable(false);
            tableVe.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Giá Vé");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Vé, loại vé");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(buttonAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRefresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTimKiemVe)
                            .addComponent(cbGiaVe, 0, 148, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTimKiem)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGiaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTimKiemVe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimKiem)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(buttonDelete)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonRefresh))
                .addGap(68, 68, 68))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 850, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        QuanLyVe_ThemVe add = new QuanLyVe_ThemVe();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        this.loadData();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
       int row = tableVe.getSelectedRow();
        if(row == -1)
        {
        JOptionPane.showMessageDialog(null, "Chưa chọn dòng!");
        }
        else
        {
        String maVe = tableVe.getValueAt(row, 0).toString(); // lấy mã vé của dòng hiện tại 
        Object []options = {"Đồng Ý", "Hủy"};
        int n = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn xóa dữ liệu không ?", "Xóa", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(n == 0){
         VeBUS vb = new VeBUS();
           if(vb.deleteVe(maVe)){
               JOptionPane.showMessageDialog(null, "Xóa loại vé thành công!");
                this.loadData();
           }
           else
               JOptionPane.showMessageDialog(null, "Xóa loại vé thất bại!");
            }

        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        int row = tableVe.getSelectedRow();
        if(row == -1)
        {
        JOptionPane.showMessageDialog(null, "Chưa chọn dòng!");
        }
        else
        {
            //vé lưu giá trị của vé ở dòng hiện tại
        VeDTO vt = new VeDTO();
        vt.setMaVe(tableVe.getValueAt(row, 0).toString());
        vt.setGiaVe(tableVe.getValueAt(row, 1).toString());
        vt.setSoLuong(tableVe.getValueAt(row, 2).toString());
        vt.setMaLV(tableVe.getValueAt(row, 3).toString());
        QuanLyVe_CapNhatVe update = new QuanLyVe_CapNhatVe();
        update.setVisible(true);
        update.setLocationRelativeTo(null);
        //load vé vừa lưu giá trị lên bảng cập nhật
        update.loadData(vt);
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimKiemActionPerformed
        
        // gán khoản tiền trong combobox dựa trên vị trí
        int viTri = cbGiaVe.getSelectedIndex();
        String key = null;
        String key2 = null;
        switch(viTri)
        {
                case 0: 
                    key = "40000";
                    key2 = "50000";
                    break;
                case 1:
                    key = "50000";
                    key2 = "60000";
                    break;
                case 2: 
                    key = "60000";
                    key2 = "70000";
                    break;
                case 3: 
                    key = "80000";
                    key2 = "90000";
                    break;
 
        }
        //Láy giá trị được nhập trong ô tìm kiếm
        String key0 = textTimKiemVe.getText();
        if(key0.length()==0) 
        {
            this.loadTimKiemDataWithoutText(key, key2);//trường hợp khách hàng không nhập dữ liệu vào ô tìm kiếm
            
        }
        else
        {
             this.loadTimKiemData(key0, key, key2);//trường hợp khách hàng nhập dữ liệu
        }

        
    }//GEN-LAST:event_buttonTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyVe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonTimKiem;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> cbGiaVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableVe;
    private javax.swing.JTextField textTimKiemVe;
    // End of variables declaration//GEN-END:variables

 //load toàn bộ dữ liệu từ database   
 private void loadData()
{
     tableVe.removeAll();
     DefaultTableModel model = (DefaultTableModel)tableVe.getModel();
     String []colsName = {"Mã Vé", " Giá Vé", "Số Lượng", "Mã Loại Vé"};
     model.setColumnIdentifiers(colsName);
     model.setRowCount(0);
     tableVe.setModel(model);
     dsVe = new VeBUS().getdsVe();
     for(VeDTO vt: dsVe)
     {
         String row[];
         row = new String[4];
         row[0] = vt.getMaVe();
         row[1] = vt.getGiaVe();
         row[2] = vt.getSoLuong();
         row[3] = vt.getMaLV();
         model.addRow(row);
     
     }
     

}
 //Load dữ liệu theo từ khóa và số tiền tìm kiếm
private void loadTimKiemData(String key0, String key, String key2)
{
     tableVe.removeAll();
     DefaultTableModel model = (DefaultTableModel)tableVe.getModel();
     String []colsName = {"Mã Vé", " Giá Vé", "Số Lượng", "Mã Loại Vé"};
     model.setColumnIdentifiers(colsName);
     model.setRowCount(0);
     tableVe.setModel(model);
     dsVe = new VeBUS().getdsTimKiemVe(key0, key, key2);
     for(VeDTO vt: dsVe)
     {
         String row[];
         row = new String[4];
         row[0] = vt.getMaVe();
         row[1] = vt.getGiaVe();
         row[2] = vt.getSoLuong();
         row[3] = vt.getMaLV();
         model.addRow(row);
     
     }
     

}
//Giống loadTimKiemData ở trên nhưng ở đây người dùng không nhập text
private void loadTimKiemDataWithoutText(String key, String key2)
{
     tableVe.removeAll();
     DefaultTableModel model = (DefaultTableModel)tableVe.getModel();
     String []colsName = {"Mã Vé", " Giá Vé", "Số Lượng", "Mã Loại Vé"};
     model.setColumnIdentifiers(colsName);
     model.setRowCount(0);
     tableVe.setModel(model);
     dsVe = new VeBUS().getdsTimKiemVeWithoutText(key, key2);
     for(VeDTO vt: dsVe)
     {
         String row[];
         row = new String[4];
         row[0] = vt.getMaVe();
         row[1] = vt.getGiaVe();
         row[2] = vt.getSoLuong();
         row[3] = vt.getMaLV();
         model.addRow(row);
     
     }
     

}


}