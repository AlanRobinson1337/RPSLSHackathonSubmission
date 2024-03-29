/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpslshackathon;

import java.util.Random;

/**
 *
 * @author Alan
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRock = new javax.swing.JButton();
        btnPaper = new javax.swing.JButton();
        btnScissors = new javax.swing.JButton();
        btnLizard = new javax.swing.JButton();
        btnSpock = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        lblMsg2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRock.setText("Rock");
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });

        btnPaper.setText("Paper");
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });

        btnScissors.setText("Scissors");
        btnScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorsActionPerformed(evt);
            }
        });

        btnLizard.setText("Lizard");
        btnLizard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLizardActionPerformed(evt);
            }
        });

        btnSpock.setText("Spock");
        btnSpock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpockActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        jLabel1.setText("Select A Button To Play: Rock Paper Scissors Lizard Spock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnScissors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLizard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSpock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRock, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMsg)
                                    .addComponent(lblMsg2))
                                .addGap(193, 193, 193))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lblResult)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 56, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRock)
                    .addComponent(lblMsg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPaper)
                    .addComponent(lblMsg2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnScissors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLizard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpock)
                    .addComponent(lblResult))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        int x = 1;
        splitter(x);
    }//GEN-LAST:event_btnRockActionPerformed

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        int x = 2;
        splitter(x);        
    }//GEN-LAST:event_btnPaperActionPerformed

    private void btnScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorsActionPerformed
        int x = 3;
        splitter(x);
    }//GEN-LAST:event_btnScissorsActionPerformed

    private void btnLizardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLizardActionPerformed
        int x = 4;
        splitter(x);
    }//GEN-LAST:event_btnLizardActionPerformed

    private void btnSpockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpockActionPerformed
        int x = 5;
        splitter(x);
    }//GEN-LAST:event_btnSpockActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    //To do
    //-------------------------------------------------------------------
    //set return values for case statements
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }
    
    public int rand(){
        Random randint = new Random();
        int rand = randint.nextInt(5 - 1 + 1)+1;
        return rand;
    }
    
    public void splitter(int x){
            int y = rand();
            int z;
        switch(x){
            case 1:
                stringSetterUsr(x);
                stringSetterCPU(y);
                z = rockSplit(x,y);
                winLose(z);
                break;
            case 2:
                stringSetterUsr(x);
                stringSetterCPU(y);
                z = paperSplit(x,y);
                winLose(z);
                break;
            case 3:
                stringSetterUsr(x);
                stringSetterCPU(y);
                z = scissorsSplit(x,y);
                winLose(z);
                break;
            case 4:
                stringSetterUsr(x);
                stringSetterCPU(y);
                z = lizardSplit(x,y);
                winLose(z);
                break;
            case 5:
                stringSetterUsr(x);
                stringSetterCPU(y);
                z = spockSplit(x,y);
                winLose(z);
                break;
        }
    } //This is the "main"
    
    public void stringSetterUsr(int x){
        String text = "You Chose ";
        
        switch(x){
            case 1:
                lblMsg.setText(text+" Rock");
                break;
            case 2:
                lblMsg.setText(text+" Paper");
                break;
            case 3:
                lblMsg.setText(text+" Scissors");
                break;
            case 4:
                lblMsg.setText(text+" Lizard");
                break;
            case 5:
                lblMsg.setText(text+" Spock");
                break;
        }
    }
    
    public void stringSetterCPU(int x){
        String text = "The Cpu Chose ";
        
        switch(x){
            case 1:
                lblMsg2.setText(text+" Rock");
                break;
            case 2:
                lblMsg2.setText(text+" Paper");
                break;
            case 3:
                lblMsg2.setText(text+" Scissors");
                break;
            case 4:
                lblMsg2.setText(text+" Lizard");
                break;
            case 5:
                lblMsg2.setText(text+" Spock");
                break;
        }
    }
    
    public int spockSplit(int x ,int y){
        if(x==5 && y==3){//
            return 1;
        }
        if(x==5 && y==1){//
            return 1;
        }
        if(y==2 && x ==5){//???
            return 2;
        }
        if(y == 5 && x==4){//
            return 2;
        }
        if(x==5 && y == 5){
            return 3;
        }        
        return 0;
    }
    
    public int lizardSplit(int x ,int y){
        if(x==4 && y==3){//
            return 2;
        }
        if(x==4 && y==1){//
            return 2;
        }
        if(y==2 && x ==4){//???
            return 1;
        }
        if(y == 5 && x==4){//
            return 1;
        }
        if(x==4 && y == 4){
            return 3;
        }        
        return 0;
    }
    
    public int scissorsSplit(int x ,int y){
        if(x==3 && y==4){//
            return 1;
        }
        if(x==3 && y==1){//
            return 2;
        }
        if(y==2 && x ==3){//???
            return 1;
        }
        if(y == 5 && x==3){//
            return 2;
        }
        if(x==3 && y == 3){
            return 3;
        }        
        return 0;
    }
    
    public int paperSplit(int x ,int y){
        if(x==2 && y==4){
            return 2;
        }
        if(x==2 && y==3){
            return 2;
        }
        if(y==1 && x ==2){
            return 1;
        }
        if(y == 5 && x==2){
            return 1;
        }
        if(x==2 && y == 2){
            return 3;
        }        
        return 0;
    }
    
    public int rockSplit(int x , int y){
        if(x==1 && y==4){
            return 1;
        }
        if(x==1 && y==3){
            return 1;
        }
        if(y==2 && x ==1){
            return 2;
        }
        if(y == 5 && x==1){
            return 2;
        }
        if(x==1 && y == 1){
            return 3;
        }
        return 0;
    }
    
    public void winLose(int z){
        if(z == 1){
            lblResult.setText("Winner");
        }
        if(z == 2){
            lblResult.setText("Looser");
        }
        if(z == 3){
            lblResult.setText("Draw");
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLizard;
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnScissors;
    private javax.swing.JButton btnSpock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblMsg2;
    private javax.swing.JLabel lblResult;
    // End of variables declaration//GEN-END:variables
}
