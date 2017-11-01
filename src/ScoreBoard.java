
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
public class ScoreBoard extends javax.swing.JPanel {
    
    private int score;
    
    public ScoreBoard() {
        initComponents();
        score = 0;
    }

    public void reset() {
        score = 0;
        increment(0);
    }
    
    public void increment(int inc) {
        score = score + inc;
        scoreLabel.setText("" + score);
    }
    
    public int getScore() {
        return score;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setForeground(new java.awt.Color(255, 255, 255));

        scoreLabel.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
