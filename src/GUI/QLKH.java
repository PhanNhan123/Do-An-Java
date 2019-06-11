/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.KhachHangDTO;
import BUS.KhachHangBUS;
import GUI.QLKH_Them;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame; 
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Dell
 */
public class QLKH extends javax.swing.JFrame {
    private ArrayList<KhachHangDTO> dskh;
    public static String maKH;
    public static DefaultTableModel model =new DefaultTableModel();
    

    public QLKH() {
        
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        loadData(dskh = new KhachHangBUS().getDanhSachKhachHang());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textTimKiemQLKH = new javax.swing.JTextField();
        buttonTimQLKH = new javax.swing.JButton();
        buttonThem = new javax.swing.JButton();
        buttonXoa = new javax.swing.JButton();
        buttonSua = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        buttonThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý khách hàng");

        jPanel2.setBackground(new java.awt.Color(194, 54, 22));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Khách Hàng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Danh sách khách hàng");

        textTimKiemQLKH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        buttonTimQLKH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonTimQLKH.setText("Tìm");
        buttonTimQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimQLKHActionPerformed(evt);
            }
        });

        buttonThem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonThem.setText("Thêm");
        buttonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemActionPerformed(evt);
            }
        });

        buttonXoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonXoa.setText("Xóa");
        buttonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaActionPerformed(evt);
            }
        });

        buttonSua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonSua.setText("Sửa");
        buttonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaActionPerformed(evt);
            }
        });

        table1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table1);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonThoat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonThoat.setText("Thoát");
        buttonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(buttonThem)
                .addGap(39, 39, 39)
                .addComponent(buttonXoa)
                .addGap(50, 50, 50)
                .addComponent(buttonSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(buttonThoat)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                        .addComponent(textTimKiemQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(buttonTimQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textTimKiemQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonTimQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonSua)
                        .addComponent(buttonXoa)
                        .addComponent(buttonThem))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonThoat)
                        .addComponent(jButton1)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTimQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimQLKHActionPerformed
      DefaultTableModel table =(DefaultTableModel) table1.getModel();
        ArrayList<KhachHangDTO> ls=new KhachHangBUS().getSearch(textTimKiemQLKH.getText());
        loadData(ls);
    }//GEN-LAST:event_buttonTimQLKHActionPerformed
    
    private void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemActionPerformed
        QLKH_Them frame =new QLKH_Them();
        frame.setVisible(true);
        frame.setLocationRelativeTo(this);
        loadData(dskh = new KhachHangBUS().getDanhSachKhachHang());
    }//GEN-LAST:event_buttonThemActionPerformed

    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed

        if(table1.getSelectedRow()<0)
           JOptionPane.showMessageDialog(null,"Hãy chọn dòng muốn xóa");
          else{
            Object []options={"Đồng ý","Thoát"};
            int n=JOptionPane.showOptionDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu không ? ","Xóa", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if(n==0)//Option yes
            {
                int a =table1.getSelectedRow();
                String makh=table1.getValueAt(a, 0).toString();
                if(new KhachHangBUS().deleteKhachHangBUS(makh))
                {JOptionPane.showMessageDialog(null, "Xóa khách hàng thành công");
                 loadData(dskh = new KhachHangBUS().getDanhSachKhachHang());
                 }
            else 
                 JOptionPane.showConfirmDialog(null, "Xóa thất bại");
          }}
    }//GEN-LAST:event_buttonXoaActionPerformed

    private void buttonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaActionPerformed
       if(table1.getSelectedRow()<0)
           JOptionPane.showMessageDialog(null,"Hãy chọn dòng muốn sửa");
       else {int a =table1.getSelectedRow();
        KhachHangDTO kht=new KhachHangDTO();
        kht.setMaKH( table1.getValueAt(a, 0).toString());
        kht.setGioiTinh(table1.getValueAt(a, 1).toString());
        kht.setTenKH(table1.getValueAt(a, 2).toString());
        kht.setDiaChi(table1.getValueAt(a, 3).toString());
        kht.setSDT( table1.getValueAt(a, 4).toString());
        QLKH_Sua sua=new QLKH_Sua(kht);
        }
    }//GEN-LAST:event_buttonSuaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData(dskh = new KhachHangBUS().getDanhSachKhachHang());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonThoatActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSua;
    private javax.swing.JButton buttonThem;
    private javax.swing.JButton buttonThoat;
    private javax.swing.JButton buttonTimQLKH;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    private javax.swing.JTextField textTimKiemQLKH;
    // End of variables declaration//GEN-END:variables

   

    private void loadData(ArrayList<KhachHangDTO> dskh){//Load toan bo du lieu vao table
       table1.removeAll();
       String []colsName = {"Mã Khách Hàng","Giới tính","Họ tên","Địa chỉ","Số điện thoại"};
       model.setColumnIdentifiers(colsName);
       model.setRowCount(0);
        for(KhachHangDTO kht :dskh)
        {
            String row[];
            row = new String[5];
            row[0] = kht.getMaKH();
            row[1] = kht.getGioiTinh();
            row[2] = kht.getTenKH();
            row[3] = kht.getDiaChi();
            row[4] = kht.getSDT();
            model.addRow(row);   
        }
        table1.setModel(model); 
    }

}
