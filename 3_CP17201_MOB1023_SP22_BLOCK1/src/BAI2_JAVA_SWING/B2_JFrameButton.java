/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_JAVA_SWING;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Dungna89
 */
public class B2_JFrameButton extends javax.swing.JFrame {

  /**
   * Creates new form B2_JFrameButton
   */
  public B2_JFrameButton() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
   * code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lbl_Name = new javax.swing.JLabel();
    btn_Red = new javax.swing.JButton();
    btn_BamVaoDay = new javax.swing.JButton();
    btn_Green = new javax.swing.JButton();
    btn_Black = new javax.swing.JButton();
    btn_Ny = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lbl_Name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    lbl_Name.setText("Hiển thị");

    btn_Red.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Red.setText("RED");
    btn_Red.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_RedActionPerformed(evt);
      }
    });

    btn_BamVaoDay.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_BamVaoDay.setText("Bấm vào đây nhé");
    btn_BamVaoDay.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_BamVaoDayActionPerformed(evt);
      }
    });

    btn_Green.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Green.setText("GREEN");

    btn_Black.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Black.setText("BLACK");

    btn_Ny.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    btn_Ny.setText("Em hãy bấm vào đây");
    btn_Ny.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_NyActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(189, 189, 189)
            .addComponent(lbl_Name))
          .addGroup(layout.createSequentialGroup()
            .addGap(159, 159, 159)
            .addComponent(btn_Ny)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btn_Black)
          .addComponent(btn_Green)
          .addComponent(btn_Red))
        .addGap(86, 86, 86))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(113, 113, 113)
          .addComponent(btn_BamVaoDay)
          .addContainerGap(494, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(96, 96, 96)
            .addComponent(lbl_Name))
          .addGroup(layout.createSequentialGroup()
            .addGap(118, 118, 118)
            .addComponent(btn_Red)))
        .addGap(31, 31, 31)
        .addComponent(btn_Green)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(btn_Black))
          .addGroup(layout.createSequentialGroup()
            .addGap(57, 57, 57)
            .addComponent(btn_Ny)))
        .addContainerGap(213, Short.MAX_VALUE))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(168, 168, 168)
          .addComponent(btn_BamVaoDay)
          .addContainerGap(357, Short.MAX_VALUE)))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_BamVaoDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BamVaoDayActionPerformed
    System.out.println("Đã bấm vào đây nè");
    lbl_Name.setText("Chúc mừng Dũng học lại nhé!");
    JOptionPane.showMessageDialog(this, "Chào các bạn FPOLY");
  }//GEN-LAST:event_btn_BamVaoDayActionPerformed

  private void btn_RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RedActionPerformed
    this.getContentPane().setBackground(Color.red);
  }//GEN-LAST:event_btn_RedActionPerformed

  private void btn_NyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NyActionPerformed
    int dapAn1;
    while (true) {
      dapAn1 = JOptionPane.showConfirmDialog(this, "Em có muốn làm người yêu anh không?", "Hỏi người yêu", JOptionPane.YES_NO_OPTION);
      if (dapAn1 == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Ok thế thì mình về nhà nhé");
        break;
      } else {
         JOptionPane.showMessageDialog(this, "Em chọn thế chưa đúng rồi");
      }
    }


  }//GEN-LAST:event_btn_NyActionPerformed

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
      java.util.logging.Logger.getLogger(B2_JFrameButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(B2_JFrameButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(B2_JFrameButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(B2_JFrameButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new B2_JFrameButton().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_BamVaoDay;
  private javax.swing.JButton btn_Black;
  private javax.swing.JButton btn_Green;
  private javax.swing.JButton btn_Ny;
  private javax.swing.JButton btn_Red;
  private javax.swing.JLabel lbl_Name;
  // End of variables declaration//GEN-END:variables
}