/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_JAVA_SWING;

/**
 *
 * @author Dungna89
 */
public class B4_Login extends javax.swing.JFrame {

  /**
   * Creates new form B4_Login
   */
  public B4_Login() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
   * code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    lbl_thongbao2 = new javax.swing.JLabel();
    lbl_thongbao3 = new javax.swing.JLabel();
    lbl_thongbao4 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txt_user = new javax.swing.JTextField();
    txt_pass = new javax.swing.JTextField();
    lbl_thongbao = new javax.swing.JLabel();
    btn_login = new javax.swing.JButton();
    lbl_thongbao1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setText("Login");

    lbl_thongbao2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    lbl_thongbao2.setText("Ký tự phải từ 4 trở lên");

    lbl_thongbao3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    lbl_thongbao3.setText("Không được phép nhập số vào phần user - nếu người dùng nhập số thì thông báo rõ bạn vừa nhập số vui lòng nhập chữ");

    lbl_thongbao4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    lbl_thongbao4.setText("Nếu người dùng nhập pass không có ký tự thì phải thông báo mật khẩu phải có ký tự ");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel2.setText("Login FPOLY");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel3.setText("User Id:");

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel4.setText("Pass:");

    txt_user.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    txt_user.setText("admin");

    txt_pass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    txt_pass.setText("admin@123");

    lbl_thongbao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    lbl_thongbao.setText("Thông báo");

    btn_login.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_login.setText("Login");
    btn_login.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_loginActionPerformed(evt);
      }
    });

    lbl_thongbao1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    lbl_thongbao1.setText("Thông báo lỗi rõ ràng:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2)
          .addComponent(lbl_thongbao2)
          .addComponent(lbl_thongbao3)
          .addComponent(lbl_thongbao4)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
              .addComponent(jLabel3)
              .addGap(18, 18, 18)
              .addComponent(txt_user))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lbl_thongbao1)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(lbl_thongbao)))
                .addGap(156, 156, 156)
                .addComponent(btn_login))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(63, 63, 63)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel1)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jLabel1))
          .addGroup(layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4)
              .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btn_login)
              .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_thongbao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_thongbao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_thongbao2)
                .addGap(6, 6, 6)
                .addComponent(lbl_thongbao3)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbl_thongbao4)))
        .addContainerGap(25, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

  }//GEN-LAST:event_btn_loginActionPerformed

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
      java.util.logging.Logger.getLogger(B4_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(B4_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(B4_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(B4_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new B4_Login().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_login;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel lbl_thongbao;
  private javax.swing.JLabel lbl_thongbao1;
  private javax.swing.JLabel lbl_thongbao2;
  private javax.swing.JLabel lbl_thongbao3;
  private javax.swing.JLabel lbl_thongbao4;
  private javax.swing.JTextField txt_pass;
  private javax.swing.JTextField txt_user;
  // End of variables declaration//GEN-END:variables
}
