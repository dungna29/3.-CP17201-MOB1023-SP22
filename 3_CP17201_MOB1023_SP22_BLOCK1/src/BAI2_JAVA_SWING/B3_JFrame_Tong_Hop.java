/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_JAVA_SWING;

import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dungna89
 */
public class B3_JFrame_Tong_Hop extends javax.swing.JFrame {

  //Biến toàn cục khai báo trên đầu
  Vector _vtcHeader;
  Vector _vtcData;

  public B3_JFrame_Tong_Hop() {
    initComponents();
    cbcNamSinh();
    radioButtonNamNu();
    cbcGioiTinh();
    _vtcHeader = new Vector();
    _vtcData = new Vector();
    loadHeader();
  }

  private void loadHeader() {
    _vtcHeader.add("Tên");
    _vtcHeader.add("Năm sinh");
    _vtcHeader.add("Tuổi");
    _vtcHeader.add("Giới tính");
    tbl_Crush.setModel(new DefaultTableModel(_vtcHeader, 0));
  }

  private void cbcGioiTinh() {
    DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
    dcbm.addElement("Nam");
    dcbm.addElement("Nữ");
    dcbm.addElement("Không xác định");
    cbc_NamNu.setModel(dcbm);
  }

  private void radioButtonNamNu() {
    ButtonGroup bg = new ButtonGroup();
    bg.add(rdb_Nu);
    bg.add(rdb_Nam);
    rdb_Nu.setSelected(true);
  }

  private void cbcNamSinh() {
    cbc_NamSinh.setModel(new DefaultComboBoxModel(getYearsOfBirth()));
    //cbc_NamSinh.setSelectedIndex(100); Lấy giá trị mặc định khi hiển thị theo index
    cbc_NamSinh.setSelectedItem("2002");
  }

  private String[] getYearsOfBirth() {
    String[] arrNS = new String[2022 - 1900];
    int temp = 1900;
    for (int i = 0; i < arrNS.length; i++) {
      arrNS[i] = String.valueOf(temp);
      temp++;
    }
    return arrNS;
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
   * code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btn_add = new javax.swing.JButton();
    txt_TenCrush = new javax.swing.JTextField();
    cbc_NamSinh = new javax.swing.JComboBox<>();
    rdb_Nam = new javax.swing.JRadioButton();
    rdb_Nu = new javax.swing.JRadioButton();
    cbc_NamNu = new javax.swing.JComboBox<>();
    lbl_ShowTen = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_Crush = new javax.swing.JTable();
    txt_TenL = new javax.swing.JTextField();
    txt_Ns = new javax.swing.JTextField();
    txt_Tuoi = new javax.swing.JTextField();
    txt_GioiTinh = new javax.swing.JTextField();
    btn_Logout = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setText("Tên CRUSH:");

    btn_add.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_add.setText("Add");
    btn_add.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_addActionPerformed(evt);
      }
    });

    txt_TenCrush.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    cbc_NamSinh.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    cbc_NamSinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    rdb_Nam.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_Nam.setText("NAM");

    rdb_Nu.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    rdb_Nu.setText("NỮ");

    cbc_NamNu.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    cbc_NamNu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    lbl_ShowTen.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    lbl_ShowTen.setText("Tên");

    tbl_Crush.setModel(new javax.swing.table.DefaultTableModel(
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
    tbl_Crush.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_CrushMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tbl_Crush);

    txt_TenL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    txt_Ns.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    txt_Tuoi.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    txt_GioiTinh.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

    btn_Logout.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Logout.setText("Logout");
    btn_Logout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_LogoutActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lbl_ShowTen)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btn_Logout)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txt_TenL, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txt_Ns, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txt_Tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txt_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
              .addGroup(layout.createSequentialGroup()
                .addComponent(txt_TenCrush, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbc_NamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_Nam)
                .addGap(10, 10, 10)
                .addComponent(rdb_Nu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbc_NamNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(181, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(37, 37, 37)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(btn_add)
          .addComponent(txt_TenCrush, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cbc_NamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(rdb_Nam)
          .addComponent(rdb_Nu)
          .addComponent(cbc_NamNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lbl_ShowTen)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(51, 51, 51)
            .addComponent(txt_TenL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txt_Ns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(txt_Tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(txt_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(btn_Logout)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(87, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
    //Check khoảng trắng, empty và ký tự trắng
    if (txt_TenCrush.getText().isBlank() || txt_TenCrush.getText().isEmpty()) {
      JOptionPane.showMessageDialog(this, "Không đc nhập khoảng trắng và để trống");
      txt_TenCrush.setText("");//Reset cái người dùng nhập sai
      return;
    }
    Vector data1 = new Vector();
    data1.add(txt_TenCrush.getText());
    data1.add(cbc_NamSinh.getSelectedItem());
    data1.add(2022-Integer.parseInt(cbc_NamSinh.getSelectedItem().toString()));
    data1.add(rdb_Nam.isSelected()?"Nam":"Nữ");
    _vtcData.add(data1);
     tbl_Crush.setModel(new DefaultTableModel(_vtcData, _vtcHeader));
  }//GEN-LAST:event_btn_addActionPerformed

  private void tbl_CrushMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CrushMouseClicked
      int index = tbl_Crush.getSelectedRow();
      System.out.println("Bấm vào dòng: " + index);
      Vector vc =(Vector)_vtcData.get(index);
      txt_TenL.setText(String.valueOf(vc.get(0)));
      txt_Ns.setText(String.valueOf(vc.get(1)));
  }//GEN-LAST:event_tbl_CrushMouseClicked

  private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
    new B4_Login().setVisible(true);//Hiển thị form cần lên
    this.dispose();//Ẩn form hiện tại
  }//GEN-LAST:event_btn_LogoutActionPerformed

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
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new B3_JFrame_Tong_Hop().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_Logout;
  private javax.swing.JButton btn_add;
  private javax.swing.JComboBox<String> cbc_NamNu;
  private javax.swing.JComboBox<String> cbc_NamSinh;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbl_ShowTen;
  private javax.swing.JRadioButton rdb_Nam;
  private javax.swing.JRadioButton rdb_Nu;
  private javax.swing.JTable tbl_Crush;
  private javax.swing.JTextField txt_GioiTinh;
  private javax.swing.JTextField txt_Ns;
  private javax.swing.JTextField txt_TenCrush;
  private javax.swing.JTextField txt_TenL;
  private javax.swing.JTextField txt_Tuoi;
  // End of variables declaration//GEN-END:variables
}
