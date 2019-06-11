
package GUI;
import BUS.VeBanBUS;
import javax.swing.JFrame;
import DTO.VeBanDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phannhan
 */
public class QuanLyBanVe extends javax.swing.JFrame {
 
    private ArrayList<VeBanDTO> dsvb;
    public static String MaVe;
    public static DefaultTableModel model =new DefaultTableModel();
    
    public QuanLyBanVe() {
        initComponents();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.loadData(dsvb = new VeBanBUS().getDanhSachVeBan());
    
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelQLBV = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelDSVDB = new javax.swing.JLabel();
        textTim = new javax.swing.JTextField();
        buttonTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        buttonThem = new javax.swing.JButton();
        buttonXoa = new javax.swing.JButton();
        buttonSua = new javax.swing.JButton();
        buttonLammoi = new javax.swing.JButton();
        buttonThoat = new javax.swing.JButton();
        buttonThongKe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 54, 22));

        labelQLBV.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelQLBV.setText("Quản Lý Bán Vé ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(labelQLBV, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelQLBV, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        labelDSVDB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelDSVDB.setText("Danh Sách Vé Đã Bán ");

        textTim.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTimActionPerformed(evt);
            }
        });

        buttonTim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonTim.setText("Tìm");
        buttonTim.setToolTipText("");
        buttonTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimActionPerformed(evt);
            }
        });

        table1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table1);

        buttonThem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonThem.setText("Thêm");
        buttonThem.setToolTipText("");
        buttonThem.setActionCommand("Thêm ");
        buttonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemActionPerformed(evt);
            }
        });

        buttonXoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonXoa.setText("Xoá ");
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

        buttonLammoi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonLammoi.setText("Làm mới");
        buttonLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLammoiActionPerformed(evt);
            }
        });

        buttonThoat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonThoat.setText("Thoát");
        buttonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThoatActionPerformed(evt);
            }
        });

        buttonThongKe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonThongKe.setText("Thống kê");
        buttonThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelDSVDB, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textTim, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonTim)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(buttonThem)
                .addGap(30, 30, 30)
                .addComponent(buttonXoa)
                .addGap(40, 40, 40)
                .addComponent(buttonSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(buttonLammoi)
                .addGap(28, 28, 28)
                .addComponent(buttonThongKe)
                .addGap(31, 31, 31)
                .addComponent(buttonThoat)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonTim))
                    .addComponent(labelDSVDB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonThem)
                    .addComponent(buttonXoa)
                    .addComponent(buttonSua)
                    .addComponent(buttonLammoi)
                    .addComponent(buttonThoat)
                    .addComponent(buttonThongKe))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTimActionPerformed

    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed
       if(table1.getSelectedRow()<0)
           JOptionPane.showMessageDialog(null,"Hãy chọn dòng muốn xóa");
          else{
            Object []options={"Đồng ý","Thoát"};
            int n=JOptionPane.showOptionDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu không ? ","Xóa", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if(n==0)//Option yes
            {int a =table1.getSelectedRow();
             String MaPhim=table1.getValueAt(a, 0).toString();
            if(new VeBanBUS().deleteVeBanBUS(MaPhim))
                {JOptionPane.showMessageDialog(null, "Xóa  thành công");
                 loadData(dsvb = new VeBanBUS().getDanhSachVeBan());
                 }
            else 
                 JOptionPane.showConfirmDialog(null, "Xóa thất bại");
          }}
    }//GEN-LAST:event_buttonXoaActionPerformed

    private void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemActionPerformed
           QuanLyBanVe_Them frame =new QuanLyBanVe_Them();
        frame.setVisible(true);
        frame.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_buttonThemActionPerformed

    private void buttonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaActionPerformed
         if(table1.getSelectedRow()<0)
           JOptionPane.showMessageDialog(null,"Hãy chọn dòng muốn sửa");
       else {int a =table1.getSelectedRow();
        VeBanDTO vbt=new VeBanDTO();
        vbt.setNgayBan( table1.getValueAt(a, 0).toString());
        vbt.setMaPhim(table1.getValueAt(a, 1).toString());
        vbt.setMaPhong(table1.getValueAt(a, 2).toString());
        vbt.setMaVe(table1.getValueAt(a, 3).toString());
        
        vbt.setMaKH(table1.getValueAt(a, 4).toString());
        vbt.setTongGiaVe(table1.getValueAt(a,5).toString());
        vbt.setSoLuong(table1.getValueAt(a, 6).toString());
        QuanLyBanVe_Sua sua=new QuanLyBanVe_Sua(vbt);
        
        
        }
    }//GEN-LAST:event_buttonSuaActionPerformed

    private void buttonLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLammoiActionPerformed
         this.loadData(new VeBanBUS().getDanhSachVeBan());
        
    }//GEN-LAST:event_buttonLammoiActionPerformed

    private void buttonTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimActionPerformed
        DefaultTableModel table =(DefaultTableModel) table1.getModel();
        
        ArrayList<VeBanDTO> ls=new VeBanBUS().getSearch(textTim.getText());
        loadData(ls);
    }//GEN-LAST:event_buttonTimActionPerformed

    private void buttonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonThoatActionPerformed

    private void buttonThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThongKeActionPerformed
        new ThongKe();
        
    }//GEN-LAST:event_buttonThongKeActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLammoi;
    private javax.swing.JButton buttonSua;
    private javax.swing.JButton buttonThem;
    private javax.swing.JButton buttonThoat;
    private javax.swing.JButton buttonThongKe;
    private javax.swing.JButton buttonTim;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDSVDB;
    private javax.swing.JLabel labelQLBV;
    private javax.swing.JTable table1;
    private javax.swing.JTextField textTim;
    // End of variables declaration//GEN-END:variables

private void loadData(ArrayList<VeBanDTO> ds ) {
       table1.removeAll();
       String []colsName = {"Ngày Bán","Mã Phim","Mã Phòng","Mã Vé","Mã khách hàng","Tổng","Số lượng"};
       model.setColumnIdentifiers(colsName);
       model.setRowCount(0);
       table1.setModel(model);
      
        for(VeBanDTO vbt :ds)
        {
           
            String row[];
            row = new String[7];
            row[0] = vbt.getNgayBan();
            row[1] = vbt.getMaPhim();
            row[2] = vbt.getMaPhong();
            row[3] = vbt.getMaVe();
            row[4] = vbt.getMaKH();
            row[5] = vbt.getTongGiaVe();
            row[6] = vbt.getSoLuong(); 
           
            model.addRow(row);   
            
        }

}}
