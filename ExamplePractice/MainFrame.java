package zebal;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    
    private ImagePanel imgPanel;
    private int prevX, prevY;
    
    public MainFrame() {
        
        initComponents();
        
        setTitle("�̹��� �׸��� ����");
        imgPanel = new ImagePanel("images/�丣�þȽ�����.jpg");
        imgPanel.setBounds(0, 0, 400, 350);
        getContentPane().add(imgPanel);
        
        imgPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println("MousePressed");
                prevX = e.getX();
                prevY = e.getY();
            }
        });

        imgPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                imgPanel.move(e.getX()-prevX, e.getY()-prevY);
                prevX = e.getX();
                prevY = e.getY();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSmaller = new javax.swing.JButton();
        jButtonLarger = new javax.swing.JButton();
        jButtonRotLeft = new javax.swing.JButton();
        jButtonRotRight = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSmaller.setText("SCALE-");
        jButtonSmaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmallerActionPerformed(evt);
            }
        });

        jButtonLarger.setText("SCALE+");
        jButtonLarger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLargerActionPerformed(evt);
            }
        });

        jButtonRotLeft.setText("ROT(L)");
        jButtonRotLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotLeftActionPerformed(evt);
            }
        });

        jButtonRotRight.setText("ROT(R)");
        jButtonRotRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRotRightActionPerformed(evt);
            }
        });

        jButtonSave.setText("SAVE");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 405, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonRotRight)
                    .addComponent(jButtonRotLeft)
                    .addComponent(jButtonLarger)
                    .addComponent(jButtonSmaller)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonLarger, jButtonRotLeft, jButtonRotRight, jButtonSave, jButtonSmaller});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSmaller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLarger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRotLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRotRight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSave)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSmallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmallerActionPerformed
        imgPanel.decreaseScale();
    }//GEN-LAST:event_jButtonSmallerActionPerformed

    private void jButtonLargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLargerActionPerformed
        imgPanel.increaseScale();
    }//GEN-LAST:event_jButtonLargerActionPerformed

    private void jButtonRotLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotLeftActionPerformed
        imgPanel.rotate(imgPanel.LEFT);
    }//GEN-LAST:event_jButtonRotLeftActionPerformed

    private void jButtonRotRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRotRightActionPerformed
        imgPanel.rotate(imgPanel.RIGHT);
    }//GEN-LAST:event_jButtonRotRightActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        try {
            imgPanel.save();
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLarger;
    private javax.swing.JButton jButtonRotLeft;
    private javax.swing.JButton jButtonRotRight;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSmaller;
    // End of variables declaration//GEN-END:variables
}