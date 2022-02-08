/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN;

import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dungna89
 */
public class MainGUI extends javax.swing.JFrame {

  DefaultComboBoxModel _DefaultComboBoxModel;
  DefaultTableModel _DefaultTableModel;
  ISinhVienService _iSinhVienService;
  Utilities _utilities;

  public MainGUI() {
    initComponents();
    _iSinhVienService = new SinhVienService();
    _utilities = new Utilities();
    cbcGioiTinh();
    groupNganh();
    txt_Id.setEnabled(false);//làm mờ không cho can thiệp vào control
    txt_msv.setEnabled(false);
    getNewID();
    btn_sua.setEnabled(false);
    btn_xoa.setEnabled(false);
  }

  void getNewID() {
    txt_Id.setText(String.valueOf(_iSinhVienService.getMaxID()));//Sẽ lấy khóa mới nhất dựa theo số lượng phần tử trong danh sách
  }

  SinhVien getDataFromControl() {
    //    Nếu code cách này khó quá thì có thể code kiểu gán từng thuộc tính cho đối tượng
    /*
      SinhVien sv1 = new SinhVien();
      sv1.setMsv(txt_msv.getText());
      ......
      return sv1;
     */
    return new SinhVien(txt_msv.getText(), (rdb_Mob.isSelected() ? "MOB" : rdb_udpm.isSelected() ? "UDPM" : "WEB"), cbc_sex.getSelectedItem().toString().equals("Nam") ? 1 : cbc_sex.getSelectedItem().toString().equals("Nữ") ? 0 : 2, Integer.parseInt(txt_Id.getText()), txt_ten.getText(), txt_sdt.getText());
  }

  private void loadTable(List<SinhVien> lstData) {
    _DefaultTableModel = (DefaultTableModel) tbl_sinhvien.getModel();
    _DefaultTableModel.setRowCount(0);
    int stt = 1;
    for (SinhVien x : lstData) {
      _DefaultTableModel.addRow(new Object[]{stt++, x.getId(), x.getTen(), x.getSdt(), x.getMsv(), x.getNganhHoc(), x.getGioiTinh() == 1 ? "Nam" : x.getGioiTinh() == 0 ? "Nữ" : "Không xác định"});
    }
    getNewID();
  }

  private void groupNganh() {
    ButtonGroup btg = new ButtonGroup();
    btg.add(rdb_Mob);
    btg.add(rdb_udpm);
    btg.add(rdb_web);
    rdb_web.setSelected(true);
  }

  private void cbcGioiTinh() {
    _DefaultComboBoxModel = new DefaultComboBoxModel();
    _DefaultComboBoxModel.addElement("Nam");
    _DefaultComboBoxModel.addElement("Nữ");
    _DefaultComboBoxModel.addElement("Không xác định");
    cbc_sex.setModel(_DefaultComboBoxModel);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_sinhvien = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    txt_Id = new javax.swing.JTextField();
    rdb_Mob = new javax.swing.JRadioButton();
    cbc_sex = new javax.swing.JComboBox<>();
    btn_xoa = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txt_ten = new javax.swing.JTextField();
    txt_sdt = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txt_msv = new javax.swing.JTextField();
    rdb_udpm = new javax.swing.JRadioButton();
    rdb_web = new javax.swing.JRadioButton();
    btn_fakeData = new javax.swing.JButton();
    btn_sua = new javax.swing.JButton();
    btn_them = new javax.swing.JButton();
    txt_timkiem = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    btn_Clear = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    tbl_sinhvien.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null}
      },
      new String [] {
        "STT", "ID", "TÊN", "SĐT", "MSV", "NGÀNH HỌC", "SEX"
      }
    ));
    tbl_sinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_sinhvienMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tbl_sinhvien);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setText("ID:");

    txt_Id.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    rdb_Mob.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_Mob.setText("MOB");

    cbc_sex.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    cbc_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    btn_xoa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_xoa.setText("Xóa");
    btn_xoa.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_xoaActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel2.setText("Quản lý sinh viên FPOLY SP22");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel3.setText("Tên: ");

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel4.setText("Sđt:");

    txt_ten.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    txt_ten.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txt_tenCaretUpdate(evt);
      }
    });
    txt_ten.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseExited(java.awt.event.MouseEvent evt) {
        txt_tenMouseExited(evt);
      }
    });

    txt_sdt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel5.setText("lbl");

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel6.setText("Ngành:");

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel7.setText("Sex:");

    txt_msv.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    rdb_udpm.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_udpm.setText("UDPM");

    rdb_web.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_web.setText("WEB");

    btn_fakeData.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_fakeData.setText("Fake Data");
    btn_fakeData.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_fakeDataActionPerformed(evt);
      }
    });

    btn_sua.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_sua.setText("Sửa");
    btn_sua.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_suaActionPerformed(evt);
      }
    });

    btn_them.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_them.setText("Thêm");
    btn_them.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_themActionPerformed(evt);
      }
    });

    txt_timkiem.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    txt_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txt_timkiemCaretUpdate(evt);
      }
    });

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel8.setText("Msv:");

    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel9.setText("btn");

    jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel10.setText("txt");

    jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel11.setText("rdb");

    jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel12.setText("cbc");

    btn_Clear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Clear.setText("Clear");
    btn_Clear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_ClearActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(81, 81, 81)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btn_Clear)
            .addGap(70, 70, 70)
            .addComponent(jLabel2))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel3)
                  .addComponent(jLabel1)
                  .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_sdt)
                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(layout.createSequentialGroup()
                .addComponent(btn_fakeData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_them)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btn_sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoa)
                .addGap(271, 271, 271))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel6)
                  .addComponent(jLabel7)
                  .addComponent(jLabel8))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cbc_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(txt_msv, javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(rdb_Mob)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdb_udpm)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(rdb_web))))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel10)
              .addComponent(jLabel5)
              .addComponent(jLabel11)
              .addComponent(jLabel9)
              .addComponent(jLabel12))
            .addGap(14, 14, 14)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addGap(36, 36, 36))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(btn_Clear)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txt_msv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6)
          .addComponent(rdb_Mob)
          .addComponent(rdb_udpm)
          .addComponent(rdb_web))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel7)
          .addComponent(cbc_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_fakeData)
          .addComponent(btn_them)
          .addComponent(btn_sua)
          .addComponent(btn_xoa))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(11, 11, 11)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(51, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel9)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel10)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel11)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel12)
        .addGap(152, 152, 152))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_fakeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fakeDataActionPerformed
    _iSinhVienService.fake5SV();
    loadTable(_iSinhVienService.getlstSinhVien());
    btn_fakeData.setEnabled(false);
  }//GEN-LAST:event_btn_fakeDataActionPerformed

  private void txt_tenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_tenCaretUpdate
    if (txt_ten.getText().isBlank()) {
      txt_msv.setText("");
      return;
    }
    txt_msv.setText(_utilities.getMa(txt_ten.getText(), Integer.parseInt(txt_Id.getText()), 0));

  }//GEN-LAST:event_txt_tenCaretUpdate

  private void txt_tenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tenMouseExited
    if (txt_ten.getText().isBlank()) {
      txt_msv.setText("");
      return;
    }
    txt_ten.setText(_utilities.vietHoaFullname(txt_ten.getText()));//Tự động viết hoa lại ô người dùng nhập
  }//GEN-LAST:event_txt_tenMouseExited

  private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
    JOptionPane.showMessageDialog(this, _iSinhVienService.add(getDataFromControl()));
    loadTable(_iSinhVienService.getlstSinhVien());
  }//GEN-LAST:event_btn_themActionPerformed

  private void txt_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timkiemCaretUpdate
    if (txt_timkiem.getText().isBlank()) {
      loadTable(_iSinhVienService.getlstSinhVien());
      return;
    }
    loadTable(_iSinhVienService.find(txt_timkiem.getText()));
  }//GEN-LAST:event_txt_timkiemCaretUpdate

  private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
    JOptionPane.showMessageDialog(this, _iSinhVienService.delete(Integer.parseInt(txt_Id.getText())));
    loadTable(_iSinhVienService.getlstSinhVien());
  }//GEN-LAST:event_btn_xoaActionPerformed

  private void tbl_sinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sinhvienMouseClicked
    int index = tbl_sinhvien.getSelectedRow();
    SinhVien st = _iSinhVienService.getlstSinhVien().get(index);
    txt_Id.setText(String.valueOf(st.getId()));
    txt_ten.setText(st.getTen());
    txt_sdt.setText(st.getSdt());
    rdb_Mob.setSelected(st.getNganhHoc().equals("MOB") ? true : false);
    rdb_udpm.setSelected(st.getNganhHoc().equals("UDPM") ? true : false);
    rdb_web.setSelected(st.getNganhHoc().equals("WEB") ? true : false);
    cbc_sex.setSelectedItem(st.getGioiTinh() == 1 ? "Nam" : st.getGioiTinh() == 0 ? "Nữ" : "Không xác định");
    //Khi click vào table có nghĩa người dùng muốn sửa thì sẽ ẩn cái nút thêm đi
    btn_them.setEnabled(false);
     btn_sua.setEnabled(true);
    btn_xoa.setEnabled(true);
  }//GEN-LAST:event_tbl_sinhvienMouseClicked

  private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
    JOptionPane.showMessageDialog(this, _iSinhVienService.edit(getDataFromControl()));
    loadTable(_iSinhVienService.getlstSinhVien());
  }//GEN-LAST:event_btn_suaActionPerformed

  private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
    getNewID();
    btn_them.setEnabled(true);
    txt_ten.setText("");
    txt_sdt.setText("");
    txt_msv.setText("");
    rdb_Mob.setSelected(true);
    cbc_sex.setSelectedIndex(0);
    btn_sua.setEnabled(false);
    btn_xoa.setEnabled(false);
  }//GEN-LAST:event_btn_ClearActionPerformed

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
      java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainGUI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_Clear;
  private javax.swing.JButton btn_fakeData;
  private javax.swing.JButton btn_sua;
  private javax.swing.JButton btn_them;
  private javax.swing.JButton btn_xoa;
  private javax.swing.JComboBox<String> cbc_sex;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JRadioButton rdb_Mob;
  private javax.swing.JRadioButton rdb_udpm;
  private javax.swing.JRadioButton rdb_web;
  private javax.swing.JTable tbl_sinhvien;
  private javax.swing.JTextField txt_Id;
  private javax.swing.JTextField txt_msv;
  private javax.swing.JTextField txt_sdt;
  private javax.swing.JTextField txt_ten;
  private javax.swing.JTextField txt_timkiem;
  // End of variables declaration//GEN-END:variables
}
