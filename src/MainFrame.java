
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
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {

        InitDialog initDialog = new InitDialog(this, true);
        initDialog.setVisible(true);
        initComponents();
        
        switch (Configuration.getInstance().getDifficulty()) {
            case 120:
                jRadioButtonMedium.setSelected(false);
                jRadioButtonEasy.setSelected(true);
                jRadioButtonHard.setSelected(false);
            case 80:
                jRadioButtonMedium.setSelected(true);
                jRadioButtonEasy.setSelected(false);
                jRadioButtonHard.setSelected(false);
            case 40:
                jRadioButtonMedium.setSelected(false);
                jRadioButtonEasy.setSelected(false);
                jRadioButtonHard.setSelected(true);
            default:
                jRadioButtonMedium.setSelected(true);
                jRadioButtonEasy.setSelected(false);
                jRadioButtonHard.setSelected(false);
        }

        if (Configuration.getInstance().isMusic() == true) {
            jRadioButtonMenuItemMusicOn.setSelected(true);
            jRadioButtonMenuItemMusicOff.setSelected(false);
        } else {
            jRadioButtonMenuItemMusicOn.setSelected(false);
            jRadioButtonMenuItemMusicOff.setSelected(true);
        }

        setResizable(false);
        setLocationRelativeTo(null);
        setTitle(" S N A K E     by Miguel ");
        board2.setScoreBoard(scoreBoard2);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("src/imagenes/serpiente.png");
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jMenuItem3 = new javax.swing.JMenuItem();
        board2 = new Board();
        scoreBoard2 = new ScoreBoard();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuDifficulty = new javax.swing.JMenu();
        jRadioButtonEasy = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMedium = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonHard = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuMusic = new javax.swing.JMenu();
        jRadioButtonMenuItemMusicOn = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemMusicOff = new javax.swing.JRadioButtonMenuItem();
        jMenuItemControls = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();

        jDialog1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("    This is a game programmed & designed by Miguel, Enjoy it!");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(900, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        javax.swing.GroupLayout board2Layout = new javax.swing.GroupLayout(board2);
        board2.setLayout(board2Layout);
        board2Layout.setHorizontalGroup(
            board2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );
        board2Layout.setVerticalGroup(
            board2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        getContentPane().add(board2);
        board2.setBounds(40, 40, 510, 480);
        getContentPane().add(scoreBoard2);
        scoreBoard2.setBounds(660, 490, 134, 70);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SCORE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(660, 450, 130, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/red.png"))); // NOI18N
        jLabel1.setText("  1x Score Point");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 280, 180, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/magenta.png"))); // NOI18N
        jLabel3.setText("  3x Score Points");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 310, 160, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/black.png"))); // NOI18N
        jLabel7.setText("  Don't touch");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(600, 370, 160, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orange.png"))); // NOI18N
        jLabel5.setText("  5x Score Points");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(600, 340, 160, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campo-surreal.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 910, 600);

        jMenu1.setText("Snake");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuDifficulty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ouroboros.png"))); // NOI18N
        jMenuDifficulty.setText("Start game");
        jMenuDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDifficultyActionPerformed(evt);
            }
        });

        jRadioButtonEasy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, 0));
        jRadioButtonEasy.setBackground(new java.awt.Color(102, 255, 102));
        jRadioButtonEasy.setSelected(true);
        jRadioButtonEasy.setText("Easy");
        jRadioButtonEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEasyActionPerformed(evt);
            }
        });
        jMenuDifficulty.add(jRadioButtonEasy);

        jRadioButtonMedium.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, 0));
        jRadioButtonMedium.setBackground(new java.awt.Color(255, 255, 102));
        jRadioButtonMedium.setSelected(true);
        jRadioButtonMedium.setText("Medium");
        jRadioButtonMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMediumActionPerformed(evt);
            }
        });
        jMenuDifficulty.add(jRadioButtonMedium);

        jRadioButtonHard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, 0));
        jRadioButtonHard.setBackground(new java.awt.Color(255, 0, 0));
        jRadioButtonHard.setSelected(true);
        jRadioButtonHard.setText("Hard");
        jRadioButtonHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHardActionPerformed(evt);
            }
        });
        jMenuDifficulty.add(jRadioButtonHard);

        jMenu1.add(jMenuDifficulty);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pause (1).png"))); // NOI18N
        jMenuItem1.setText("Pause");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/auriculares-de-musica-icono-7220-16.png"))); // NOI18N
        jMenuMusic.setText("Music");

        jRadioButtonMenuItemMusicOn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        jRadioButtonMenuItemMusicOn.setSelected(true);
        jRadioButtonMenuItemMusicOn.setText("On");
        jRadioButtonMenuItemMusicOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemMusicOnActionPerformed(evt);
            }
        });
        jMenuMusic.add(jRadioButtonMenuItemMusicOn);

        jRadioButtonMenuItemMusicOff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        jRadioButtonMenuItemMusicOff.setSelected(true);
        jRadioButtonMenuItemMusicOff.setText("Off");
        jRadioButtonMenuItemMusicOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemMusicOffActionPerformed(evt);
            }
        });
        jMenuMusic.add(jRadioButtonMenuItemMusicOff);

        jMenu1.add(jMenuMusic);

        jMenuItemControls.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, 0));
        jMenuItemControls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gamepad.png"))); // NOI18N
        jMenuItemControls.setText("Controls");
        jMenuItemControls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControlsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemControls);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        jMenuItem2.setText("More info");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        board2.pauseTimer();
        NewDialog newDialog = new NewDialog(this, true);
        newDialog.setBoard(board2);
        newDialog.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        board2.pauseTimer();
        AboutDialog about = new AboutDialog(this, true);
        about.setVisible(true);
        board2.startGame();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDifficultyActionPerformed
        // TODO add your handling code here:
        board2.pauseTimer();
    }//GEN-LAST:event_jMenuDifficultyActionPerformed

    private void jRadioButtonEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEasyActionPerformed
        // TODO add your handling code here: 
        jRadioButtonMedium.setSelected(false);
        jRadioButtonHard.setSelected(false);
        Configuration.getInstance().setDifficulty(120);
        board2.initializeBoard(Configuration.getInstance().getDifficulty());
        scoreBoard2.reset();
        board2.restart();
    }//GEN-LAST:event_jRadioButtonEasyActionPerformed

    private void jRadioButtonMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMediumActionPerformed
        // TODO add your handling code here:
        jRadioButtonEasy.setSelected(false);
        jRadioButtonHard.setSelected(false);
        Configuration.getInstance().setDifficulty(80);
        board2.initializeBoard(Configuration.getInstance().getDifficulty());
        scoreBoard2.reset();
        board2.restart();
    }//GEN-LAST:event_jRadioButtonMediumActionPerformed

    private void jRadioButtonHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHardActionPerformed
        // TODO add your handling code here:
        jRadioButtonEasy.setSelected(false);
        jRadioButtonMedium.setSelected(false);
        Configuration.getInstance().setDifficulty(40);
        board2.initializeBoard(Configuration.getInstance().getDifficulty());
        scoreBoard2.reset();
        board2.restart();
    }//GEN-LAST:event_jRadioButtonHardActionPerformed

    private void jMenuItemControlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControlsActionPerformed
        // TODO add your handling code here:
        board2.pauseTimer();
        InstrucctionsDialog instrucctions = new InstrucctionsDialog(this, true);
        instrucctions.setVisible(true);
        board2.startGame();

    }//GEN-LAST:event_jMenuItemControlsActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        board2.pauseTimer();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here: 
        Music.getInstance();
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButtonMenuItemMusicOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemMusicOnActionPerformed
        jRadioButtonMenuItemMusicOff.setSelected(false);
        Configuration.getInstance().setMusic(true);
        Music.musicOn();

    }//GEN-LAST:event_jRadioButtonMenuItemMusicOnActionPerformed

    private void jRadioButtonMenuItemMusicOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemMusicOffActionPerformed
        jRadioButtonMenuItemMusicOn.setSelected(false);
        Configuration.getInstance().setMusic(false);
        Music.musicOff();
    }//GEN-LAST:event_jRadioButtonMenuItemMusicOffActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

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
    private Board board2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDifficulty;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemControls;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenu jMenuMusic;
    private javax.swing.JRadioButtonMenuItem jRadioButtonEasy;
    private javax.swing.JRadioButtonMenuItem jRadioButtonHard;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMedium;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemMusicOff;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemMusicOn;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private ScoreBoard scoreBoard2;
    // End of variables declaration//GEN-END:variables
}
