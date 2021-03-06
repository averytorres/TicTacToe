/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Owner
 */
public class boardForm extends javax.swing.JFrame  { 
    
    //globals
    boolean isTurn=true;
    int pressed[][] = new int[3][3];
    Image o_pic;
    Image x_pic;
    
    /**
     * Creates new form boardForm
     */
    public boardForm() throws IOException {
        //set up board
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Tic-Tac-Toe");
        loseScreen.setLocationRelativeTo(null);
        drawScreen.setLocationRelativeTo(null);
        
        //initialize pressed board
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                pressed[i][j]=0;
            }
        }
        
        //initialize pics
        o_pic= ImageIO.read(getClass().getResource("o.png"));
        x_pic=  ImageIO.read(getClass().getResource("x.png"));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loseScreen = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        winScreen = new javax.swing.JDialog();
        jTextField2 = new javax.swing.JTextField();
        drawScreen = new javax.swing.JDialog();
        jTextField3 = new javax.swing.JTextField();
        oneOne = new javax.swing.JButton();
        oneTwo = new javax.swing.JButton();
        oneThree = new javax.swing.JButton();
        twoOne = new javax.swing.JButton();
        twoTwo = new javax.swing.JButton();
        twoThree = new javax.swing.JButton();
        threeOne = new javax.swing.JButton();
        threeTwo = new javax.swing.JButton();
        threeThree = new javax.swing.JButton();

        loseScreen.setTitle("Lose!");
        loseScreen.setPreferredSize(new java.awt.Dimension(54, 92));
        loseScreen.setResizable(false);

        jTextField1.setText("You Lose!");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loseScreenLayout = new javax.swing.GroupLayout(loseScreen.getContentPane());
        loseScreen.getContentPane().setLayout(loseScreenLayout);
        loseScreenLayout.setHorizontalGroup(
            loseScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loseScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loseScreenLayout.setVerticalGroup(
            loseScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loseScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField2.setText("You Win!!");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout winScreenLayout = new javax.swing.GroupLayout(winScreen.getContentPane());
        winScreen.getContentPane().setLayout(winScreenLayout);
        winScreenLayout.setHorizontalGroup(
            winScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        winScreenLayout.setVerticalGroup(
            winScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        drawScreen.setTitle("Draw!");
        drawScreen.setPreferredSize(new java.awt.Dimension(54, 92));
        drawScreen.setResizable(false);

        jTextField3.setText("You Lose!");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout drawScreenLayout = new javax.swing.GroupLayout(drawScreen.getContentPane());
        drawScreen.getContentPane().setLayout(drawScreenLayout);
        drawScreenLayout.setHorizontalGroup(
            drawScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        drawScreenLayout.setVerticalGroup(
            drawScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oneOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneOneActionPerformed(evt);
            }
        });

        oneTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneTwoActionPerformed(evt);
            }
        });

        oneThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneThreeActionPerformed(evt);
            }
        });

        twoOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoOneActionPerformed(evt);
            }
        });

        twoTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoTwoActionPerformed(evt);
            }
        });

        twoThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoThreeActionPerformed(evt);
            }
        });

        threeOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeOneActionPerformed(evt);
            }
        });

        threeTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeTwoActionPerformed(evt);
            }
        });

        threeThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeThreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(twoOne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(twoTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(twoThree, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(oneOne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(oneTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(oneThree, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(threeOne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(threeTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(threeThree, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oneOne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneThree, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twoOne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoThree, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(threeOne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeThree, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneOneActionPerformed
        // TODO add your handling code here:

        
        if(isTurn&&pressed[0][0]==0){
            humanTurn(0,0,oneOne);
        }
    }//GEN-LAST:event_oneOneActionPerformed

    private void oneTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneTwoActionPerformed
        // TODO add your handling code here:
        if(isTurn&&pressed[0][1]==0){
            humanTurn(0,1,oneTwo);
        
        }
    }//GEN-LAST:event_oneTwoActionPerformed

    private void oneThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneThreeActionPerformed
        // TODO add your handling code here:
        if(isTurn&&pressed[0][2]==0){
            humanTurn(0,2,oneThree);
        }
    }//GEN-LAST:event_oneThreeActionPerformed

    private void twoOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoOneActionPerformed
        // TODO add your handling code here:
        if(isTurn&&pressed[1][0]==0){
            humanTurn(1,0,twoOne);
        }
    }//GEN-LAST:event_twoOneActionPerformed

    private void twoTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoTwoActionPerformed
        // TODO add your handling code here:
        if(isTurn&&pressed[1][1]==0){
            humanTurn(1,1,twoTwo);
        }
    }//GEN-LAST:event_twoTwoActionPerformed

    private void twoThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoThreeActionPerformed
        // TODO add your handling code here:
        if(isTurn&&pressed[1][2]==0){
            humanTurn(1,2,twoThree);
        }
    }//GEN-LAST:event_twoThreeActionPerformed

    private void threeOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeOneActionPerformed
        // TODO add your handling code here:
        if(isTurn&&pressed[2][0]==0){
            humanTurn(2,0,threeOne);
        }
    }//GEN-LAST:event_threeOneActionPerformed

    private void threeTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeTwoActionPerformed
        // TODO add your handling code here:
        if(isTurn&&pressed[2][1]==0){
            humanTurn(2,1,threeTwo);
        }
    }//GEN-LAST:event_threeTwoActionPerformed

    private void threeThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeThreeActionPerformed
        // TODO add your handling code here:
        if(isTurn&&pressed[2][2]==0){
            humanTurn(2,2,threeThree);
        }
    }//GEN-LAST:event_threeThreeActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(boardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(boardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(boardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(boardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new boardForm().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(boardForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog drawScreen;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JDialog loseScreen;
    private javax.swing.JButton oneOne;
    private javax.swing.JButton oneThree;
    private javax.swing.JButton oneTwo;
    private javax.swing.JButton threeOne;
    private javax.swing.JButton threeThree;
    private javax.swing.JButton threeTwo;
    private javax.swing.JButton twoOne;
    private javax.swing.JButton twoThree;
    private javax.swing.JButton twoTwo;
    private javax.swing.JDialog winScreen;
    // End of variables declaration//GEN-END:variables

    private void computerTurn() {

                            
        //attack moves
            //right most rows
            if(atkMove(0,0,0,1,0,2,oneThree)){
                
                return;
            }
            else if(atkMove(1,0,1,1,1,2,twoThree)){
                
                return;
            }
            else if(atkMove(2,0,2,1,2,2,threeThree)){
                    
                return;
            }
            //leftmost rows
            else if(atkMove(0,1,0,2,0,0,oneOne)){
                
                    return;
            }
            else if(atkMove(1,1,1,2,1,0,twoOne)){
                
                    return;
            }
            else if(atkMove(2,1,2,2,2,0,threeOne)){
                
                    return;
            }
            //center rows
            else if(atkMove(0,0,0,2,0,1,oneTwo)){
                
                    return;
            }
            else if(atkMove(1,0,1,2,1,1,twoTwo)){
                
                    return;
            }
            else if(atkMove(2,0,2,2,2,1,threeTwo)){
                
                    return;
            }
            //top row
            else if(atkMove(2,0,1,0,0,0,oneOne)){
                
                    return;
            }
            else if(atkMove(2,1,1,1,0,1,oneTwo)){
                
                    return;
            }
            else if(atkMove(2,2,1,2,0,2,oneThree)){
                
                    return;
            }
            //center row
            else if(atkMove(2,0,0,0,1,0,twoOne)){
                
                    return;
            }
            else if(atkMove(2,1,0,1,1,1,twoTwo)){
                
                    return;
            }
            else if(atkMove(2,2,0,2,1,2,twoThree)){
                
                    return;
            }
            //bottom row
            else if(atkMove(0,0,1,0,2,0,threeOne)){
                
                    return;
            }
            else if(atkMove(0,1,1,1,2,1,threeTwo)){
                
                    return;
            }
            else if(atkMove(0,2,1,2,2,2,threeThree)){
                
                    return;
            }
            //top left
            else if(atkMove(1,1,2,2,0,0,oneOne)){
                
                    return;
            }
            //top right
            else if(atkMove(1,1,2,0,0,2,oneThree)){
                
                    return;
            }
            //bottom left
            else if(atkMove(1,1,0,2,2,0,threeOne)){
                
                    return;
            }
            //bottom right
            else if(atkMove(0,0,1,1,2,2,threeThree)){
                
                    return;
            }

            //defense moves
            
            //right most rows
                    else if(defMove(2,1,1,2,2,2,threeThree)){
            
                    return;
            }                    
                    else if(defMove(0,0,2,2,0,1,oneTwo)){
            
                    return;
            }       
                    else if(defMove(2,0,0,2,2,1,threeTwo)){
            
                    return;
            }
                    
                    
        else if(defMove(0,0,0,1,0,2,oneThree)){
            
                    return;
            }
            else if(defMove(1,0,1,1,1,2,twoThree)){
                
                    return;
            }
            else if(defMove(2,0,2,1,2,2,threeThree)){
                
                    return;
            }
            //leftmost rows
            else if(defMove(0,1,0,2,0,0,oneOne)){
                
                    return;
            }
            else if(defMove(1,1,1,2,1,0,twoOne)){
                
                    return;
            }
            else if(defMove(2,1,2,2,2,0,threeOne)){
                
                    return;
            }
            //center rows
            else if(defMove(0,0,0,2,0,1,oneTwo)){
                
                    return;
            }
            else if(defMove(1,0,1,2,1,1,twoTwo)){
                
                    return;
            }
            else if(defMove(2,0,2,2,2,1,threeTwo)){
                
                    return;
            }
            //top row
            else if(defMove(2,0,1,0,0,0,oneOne)){
                
                    return;
            }
            else if(defMove(2,1,1,1,0,1,oneTwo)){
                
                    return;
            }
            else if(defMove(2,2,1,2,0,2,oneThree)){
                
                    return;
            }
            //center row
            else if(defMove(2,0,0,0,1,0,twoOne)){
                
                    return;
            }
            else if(defMove(2,1,0,1,1,1,twoTwo)){
                
                    return;
            }
            else if(defMove(2,2,0,2,1,2,twoThree)){
                
                    return;
            }
            //bottom row
            else if(defMove(0,0,1,0,2,0,threeOne)){
                
                    return;
            }
            else if(defMove(0,1,1,1,2,1,threeTwo)){
                
                    return;
            }
            else if(defMove(0,2,1,2,2,2,threeThree)){
                
                    return;
            }
            //top left
            else if(defMove(1,1,2,2,0,0,oneOne)){
                
                    return;
            }
            //top right
            else if(defMove(1,1,2,0,0,2,oneThree)){
                
                    return;
            }
            //bottom left
            else if(defMove(1,1,0,2,2,0,threeOne)){
                
                    return;
            }
            //bottom right
            else if(defMove(0,0,1,1,2,2,threeThree)){
                
                    return;
            }
            
            
            //filler moves??
            //if center not taken
            else if(pressed[1][1]==0){
                
                   if(filMove(1,1,twoTwo)){
                       
                    return;
                }
            }
            //moved to top right corner
            else if(pressed[0][0]==1&&pressed[2][2]==0){
                
                if(filMove(0,0,2,2,threeThree)){
                    
                    return;
                }
            }
            //moved to top left
            else if(pressed[0][2]==1&&pressed[2][0]==0){
                if(filMove(0,2,2,0,threeOne)){
                    return;
                }
            }
            //moved to bottom left
            else if(pressed[2][0]==1&&pressed[0][2]==0){
                if(filMove(2,0,0,2,oneThree)){
                    return;
                }
            }
            //moved to bottom right
            else if(pressed[2][2]==1&&pressed[0][0]==0){
                if(filMove(2,2,0,0,oneOne)){
                    return;
                }
            }
                        //covers corner if no other option
                        else if(pressed[0][0]==0){
                if(filMove(0,0,oneOne)){
                    return;
                }
            }
                        else if(pressed[0][2]==0){
                if(filMove(0,2,oneThree)){
                    return;
                }
            }
                        else if(pressed[2][0]==0){
                if(filMove(2,0,threeOne)){
                    return;
                }
            }
                        else if(pressed[2][2]==0){
                if(filMove(2,2,threeThree)){
                    return;
                }
            }
            //covers a edge if no other option
            else if(pressed[0][1]==0){
                if(filMove(0,1,oneTwo)){
                    return;
                }
            }
                        else if(pressed[1][0]==0){
                if(filMove(1,0,twoOne)){
                    return;
                }
            }
                        else if(pressed[1][2]==0){
                if(filMove(1,2,twoThree)){
                    return;
                }
            }
                        else if(pressed[2][1]==0){
                if(filMove(2,1,threeTwo)){
                    return;
                }
            }

                        
            
        
        
        //check if reset is needed
        int filled =0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(pressed[i][j]>0) {
                    filled++;
                }
            }
        }
        if(filled==9){
            drawScreen.setVisible(true);
            
            clearBoard();
        }

        

        
        
    }

    private void humanTurn(int i, int i0, JButton button) {
        button.setIcon(new ImageIcon(x_pic)); 
        
        pressed[i][i0]=1;
        isTurn=false;
        
        computerTurn();
        
    }

    private void clearBoard() {
        wait(5);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                pressed[i][j]=0;
            }
        }
        oneOne.setIcon(null);
        oneTwo.setIcon(null);
        oneThree.setIcon(null);
        twoOne.setIcon(null);
        twoTwo.setIcon(null);
        twoThree.setIcon(null);
        threeOne.setIcon(null);
        threeTwo.setIcon(null);
        threeThree.setIcon(null);
        isTurn=true;
    }

    private void isWin() {
        

        
        for(int i=1;i<3;i++){
             if(pressed[0][0]==i&&pressed[0][1]==i&&pressed[0][2]==i){
                 if(i==1){
                     
                 }
                 else if(i==2){
                       loseScreen.setVisible(true);
                       clearBoard();
                 }
             }
             else if(pressed[1][0]==i&&pressed[1][1]==i&&pressed[1][2]==i){
                 if(i==1){
                     
                 }
                 else if(i==2){
                       loseScreen.setVisible(true);
                       clearBoard();
                 }
             }
             else if(pressed[2][0]==i&&pressed[2][1]==i&&pressed[2][2]==i){
                 if(i==1){
                     
                 }
                 else if(i==2){
                       loseScreen.setVisible(true);
                       clearBoard();
                 }
             }
             else if(pressed[0][0]==i&&pressed[1][0]==i&&pressed[2][0]==i){
                 if(i==1){
                     
                 }
                 else if(i==2){
                       loseScreen.setVisible(true);
                       clearBoard();
                 }
             }
             else if(pressed[0][1]==i&&pressed[1][1]==i&&pressed[2][1]==i){
                 if(i==1){
                     
                 }
                 else if(i==2){
                       loseScreen.setVisible(true);
                       clearBoard();
                 }
             }
             else if(pressed[0][2]==i&&pressed[1][2]==i&&pressed[2][2]==i){
                 if(i==1){
                     
                 }
                 else if(i==2){
                       loseScreen.setVisible(true);
                       clearBoard();
                 }
             }
             else if(pressed[0][0]==i&&pressed[1][1]==i&&pressed[2][2]==i){
                 if(i==1){
                     
                 }
                 else if(i==2){
                       loseScreen.setVisible(true);
                       clearBoard();
                 }
             }
             else if(pressed[0][2]==i&&pressed[1][1]==i&&pressed[2][0]==i){
                 if(i==1){
                     
                 }
                 else if(i==2){
                       loseScreen.setVisible(true);
                       clearBoard();
                 }
             }
        }
    }

    private boolean defMove(int x1, int x2, int y1, int y2,int z1, int z2, JButton target) {
        
        if(pressed[x1][x2]==1&&pressed[y1][y2]==1&&pressed[z1][z2]==0){
                target.setIcon(new ImageIcon(o_pic));       
                pressed[z1][z2]=2;
                isWin();
                isTurn=true;
                return true;
            }
        return false;
    }

    private boolean atkMove(int x1, int x2, int y1, int y2, int z1, int z2, JButton target) {
                if(pressed[x1][x2]==2&&pressed[y1][y2]==2&&pressed[z1][z2]==0){
                target.setIcon(new ImageIcon(o_pic));       
                pressed[z1][z2]=2;
                isWin();
                isTurn=true;
                return true;
            }
        return false;
    }

    private boolean filMove(int x1, int x2, int z1, int z2, JButton target) {
                        if(pressed[x1][x2]==1&&pressed[z1][z2]==0){
                target.setIcon(new ImageIcon(o_pic));       
                pressed[z1][z2]=2;
                isWin();
                isTurn=true;
                return true;
            }
        return false;
    }

    private boolean filMove(int z1, int z2, JButton target) {
                        if(pressed[z1][z2]==0){
                target.setIcon(new ImageIcon(o_pic));       
                pressed[z1][z2]=2;
                isWin();
                isTurn=true;
                return true;
            }
        return false;
    }
    public static void wait (int n){
        long t0,t1;
        t0=System.currentTimeMillis();
        do{
            t1=System.currentTimeMillis();
        }
        while (t1-t0<1000);
}



}
