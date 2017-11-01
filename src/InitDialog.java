
import java.awt.Image;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miguel
 */
public class InitDialog extends javax.swing.JDialog {

    /**
     * Creates new form AboutDialog
     */

    public InitDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle(" S N A K E     by Miguel ");
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("src/imagenes/serpiente.png");
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jButtonEasy = new javax.swing.JButton();
        jButtonHard = new javax.swing.JButton();
        jButtonMedium = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(400, 440));
        setPreferredSize(new java.awt.Dimension(400, 420));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 210, 400, 10);

        jButtonEasy.setBackground(new java.awt.Color(153, 153, 153));
        jButtonEasy.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButtonEasy.setForeground(new java.awt.Color(51, 51, 51));
        jButtonEasy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/green.png"))); // NOI18N
        jButtonEasy.setText(" EASY"); // NOI18N
        jButtonEasy.setAlignmentY(0.0F);
        jButtonEasy.setMaximumSize(new java.awt.Dimension(60, 30));
        jButtonEasy.setMinimumSize(new java.awt.Dimension(60, 30));
        jButtonEasy.setPreferredSize(new java.awt.Dimension(60, 30));
        jButtonEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEasyActionPerformed(evt);
            }
        });
        jButtonEasy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEasyKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonEasy);
        jButtonEasy.setBounds(30, 130, 100, 60);

        jButtonHard.setBackground(new java.awt.Color(153, 153, 153));
        jButtonHard.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButtonHard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/red.png"))); // NOI18N
        jButtonHard.setText(" HARD");
        jButtonHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHardActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHard);
        jButtonHard.setBounds(270, 130, 100, 60);

        jButtonMedium.setBackground(new java.awt.Color(153, 153, 153));
        jButtonMedium.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButtonMedium.setForeground(new java.awt.Color(51, 51, 51));
        jButtonMedium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orange.png"))); // NOI18N
        jButtonMedium.setText(" MEDIUM");
        jButtonMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMediumActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMedium);
        jButtonMedium.setBounds(150, 130, 100, 60);

        jLabel2.setFont(new java.awt.Font("Charlemagne Std", 1, 52)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("S N A K E");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 280, 110);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow-variant-key-on-keyboard (1).png"))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/keyboard-key-pointing-to-right (1).png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/keyboard-key-arrow-up (1).png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow-down-key-on-keyboard (1).png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/button.png"))); // NOI18N
        jLabel10.setText(" Pause");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Controls:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(120, 230, 160, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/culebraloca.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 0, 120, 210);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 110, 400, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\migue\\OneDrive\\Documentos\\NetBeansProjects\\Snake\\src\\imagenes\\campo-surreal.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEasyActionPerformed
        // TODO add your handling code here:
        dispose();
        Configuration.getInstance().setDifficulty(120);
    }//GEN-LAST:event_jButtonEasyActionPerformed

    private void jButtonHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHardActionPerformed
        // TODO add your handling code here:
        dispose();
        Configuration.getInstance().setDifficulty(40);
    }//GEN-LAST:event_jButtonHardActionPerformed

    private void jButtonMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMediumActionPerformed
        // TODO add your handling code here:  
        dispose();
        Configuration.getInstance().setDifficulty(80);
    }//GEN-LAST:event_jButtonMediumActionPerformed

    private void jButtonEasyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEasyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEasyKeyPressed

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
            java.util.logging.Logger.getLogger(AboutDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AboutDialog dialog = new AboutDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEasy;
    private javax.swing.JButton jButtonHard;
    private javax.swing.JButton jButtonMedium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
