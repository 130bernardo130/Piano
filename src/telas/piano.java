/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Classes.Teclas;

/**
 *
 * @author Bernardo
 */
public class piano extends javax.swing.JFrame {

    /**
     * Creates new form piano
     */
    public piano() {
        initComponents();
    }
    int escala=0;
    int i=0;
    static Teclas teclas;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBC = new javax.swing.JButton();
        JBC_T = new javax.swing.JButton();
        JBD = new javax.swing.JButton();
        JBD_T = new javax.swing.JButton();
        JBE = new javax.swing.JButton();
        JBF = new javax.swing.JButton();
        JBF_T = new javax.swing.JButton();
        JBG = new javax.swing.JButton();
        JBG_T = new javax.swing.JButton();
        JBA_T = new javax.swing.JButton();
        JBA = new javax.swing.JButton();
        JBB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JBESC1 = new javax.swing.JButton();
        JBESC2 = new javax.swing.JButton();
        JBESC3 = new javax.swing.JButton();
        JBESC4 = new javax.swing.JButton();
        JBESC5 = new javax.swing.JButton();
        JBESC6 = new javax.swing.JButton();
        JBESC9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JBESCALTA = new javax.swing.JButton();
        JBESCBAIXA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBC.setText("C");
        JBC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBCMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JBCMouseReleased(evt);
            }
        });
        JBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCActionPerformed(evt);
            }
        });
        JBC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JBCKeyPressed(evt);
            }
        });

        JBC_T.setText("C#");
        JBC_T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JBC_TMouseReleased(evt);
            }
        });
        JBC_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC_TActionPerformed(evt);
            }
        });

        JBD.setText("D");
        JBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JBDMouseReleased(evt);
            }
        });
        JBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDActionPerformed(evt);
            }
        });

        JBD_T.setText("D#");
        JBD_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD_TActionPerformed(evt);
            }
        });

        JBE.setText("E");
        JBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEActionPerformed(evt);
            }
        });

        JBF.setText("F");
        JBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFActionPerformed(evt);
            }
        });

        JBF_T.setText("F#");
        JBF_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF_TActionPerformed(evt);
            }
        });

        JBG.setText("G");
        JBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGActionPerformed(evt);
            }
        });

        JBG_T.setText("G#");
        JBG_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG_TActionPerformed(evt);
            }
        });

        JBA_T.setText("A#");
        JBA_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA_TActionPerformed(evt);
            }
        });

        JBA.setText("A");
        JBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAActionPerformed(evt);
            }
        });

        JBB.setText("B");
        JBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBActionPerformed(evt);
            }
        });

        jLabel1.setText("Escalas");

        JBESC1.setText("1");
        JBESC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBESC1ActionPerformed(evt);
            }
        });

        JBESC2.setText("2");
        JBESC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBESC2ActionPerformed(evt);
            }
        });

        JBESC3.setText("3");
        JBESC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBESC3ActionPerformed(evt);
            }
        });

        JBESC4.setText("4");
        JBESC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBESC4ActionPerformed(evt);
            }
        });

        JBESC5.setText("5");
        JBESC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBESC5ActionPerformed(evt);
            }
        });

        JBESC6.setText("6");
        JBESC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBESC6ActionPerformed(evt);
            }
        });

        JBESC9.setText("7");
        JBESC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBESC9ActionPerformed(evt);
            }
        });

        jLabel2.setText("teclas");

        JBESCALTA.setText("alta");
        JBESCALTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBESCALTAActionPerformed(evt);
            }
        });

        JBESCBAIXA.setText("baixa");
        JBESCBAIXA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBESCBAIXAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JBESC1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(JBC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBC_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBESC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBD, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(JBESC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBD_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBESC4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBE, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(JBESC5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBF, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(JBESC6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBF_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBESC9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBG_T)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBA_T)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBESCALTA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBESCBAIXA)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBESC1)
                    .addComponent(JBESC2)
                    .addComponent(JBESC3)
                    .addComponent(JBESC4)
                    .addComponent(JBESC5)
                    .addComponent(JBESC6)
                    .addComponent(JBESC9)
                    .addComponent(JBESCALTA)
                    .addComponent(JBESCBAIXA))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBC, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBG, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBA, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBC_T, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBD_T, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBA_T, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBG_T, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBF_T, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBCKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JBCKeyPressed

    private void JBESC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBESC1ActionPerformed
        // TODO add your handling code here:
       if(escala ==0){
           i=0;
       }
       else{
        i=84;
       }
       
       System.out.println(escala);
    }//GEN-LAST:event_JBESC1ActionPerformed

    private void JBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i).reproduzir();
    }//GEN-LAST:event_JBCActionPerformed

    private void JBC_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBC_TActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+1).reproduzir();
    }//GEN-LAST:event_JBC_TActionPerformed

    private void JBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+2).reproduzir();
    }//GEN-LAST:event_JBDActionPerformed

    private void JBD_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBD_TActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+3).reproduzir();
    }//GEN-LAST:event_JBD_TActionPerformed

    private void JBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+4).reproduzir();
    }//GEN-LAST:event_JBEActionPerformed

    private void JBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+5).reproduzir();
    }//GEN-LAST:event_JBFActionPerformed

    private void JBF_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBF_TActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+6).reproduzir();
    }//GEN-LAST:event_JBF_TActionPerformed

    private void JBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+7).reproduzir();
       
    }//GEN-LAST:event_JBGActionPerformed

    private void JBG_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBG_TActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+8).reproduzir();
    }//GEN-LAST:event_JBG_TActionPerformed

    private void JBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+9).reproduzir();
    }//GEN-LAST:event_JBAActionPerformed

    private void JBA_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBA_TActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+10).reproduzir();
    }//GEN-LAST:event_JBA_TActionPerformed

    private void JBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBActionPerformed
        // TODO add your handling code here:
        teclas.getTecla(i+11).reproduzir();
    }//GEN-LAST:event_JBBActionPerformed

    private void JBESC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBESC2ActionPerformed
        // TODO add your handling code here:
       if(i>72){
          i=96; 
       }else{
        i=12;}
    }//GEN-LAST:event_JBESC2ActionPerformed

    private void JBESC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBESC3ActionPerformed
        // TODO add your handling code here:
        if(escala ==0){
            i=24;
        }
        else{
            i=108;
        }
    }//GEN-LAST:event_JBESC3ActionPerformed

    private void JBESC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBESC4ActionPerformed
        // TODO add your handling code here:
       if(escala == 0){
           i=36;
       }else{
           i=120;
       }
    }//GEN-LAST:event_JBESC4ActionPerformed

    private void JBESC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBESC5ActionPerformed
        // TODO add your handling code here:
        if(escala==0){
            i=48;
        }else{
            i=132;
        }
        
        
    }//GEN-LAST:event_JBESC5ActionPerformed

    private void JBESC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBESC6ActionPerformed
        // TODO add your handling code here:
        if(escala==0){
            i=60;
        }
        else{
            i=144;
        }
    }//GEN-LAST:event_JBESC6ActionPerformed

    private void JBESC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBESC9ActionPerformed
        // TODO add your handling code here:
         if(escala==0){
             i=72;
         }else{
             i=156;
         }
    }//GEN-LAST:event_JBESC9ActionPerformed

    private void JBESCALTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBESCALTAActionPerformed
        // TODO add your handling code here:
        escala =0;
        if(i>72){
            i-=72;
        }
        
    }//GEN-LAST:event_JBESCALTAActionPerformed

    private void JBESCBAIXAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBESCBAIXAActionPerformed
        // TODO add your handling code here:
        escala = 1;
        if(i<=72){
           int s= i/12;
           int t = s*12+72;
           i=t;
           System.out.println(i);
        }
    }//GEN-LAST:event_JBESCBAIXAActionPerformed

    private void JBCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCMouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_JBCMouseReleased

    private void JBC_TMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBC_TMouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_JBC_TMouseReleased

    private void JBDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBDMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JBDMouseReleased

    private void JBCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCMouseExited
        // TODO add your handling code here:
         
    }//GEN-LAST:event_JBCMouseExited

    /**
     * @param args the command line arguments
     *
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
   *
        
        try {        
               for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form *
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               //teclas.iniciarTeclas();
                new piano().setVisible(true);
          }
       });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBA;
    private javax.swing.JButton JBA_T;
    private javax.swing.JButton JBB;
    private javax.swing.JButton JBC;
    private javax.swing.JButton JBC_T;
    private javax.swing.JButton JBD;
    private javax.swing.JButton JBD_T;
    private javax.swing.JButton JBE;
    private javax.swing.JButton JBESC1;
    private javax.swing.JButton JBESC2;
    private javax.swing.JButton JBESC3;
    private javax.swing.JButton JBESC4;
    private javax.swing.JButton JBESC5;
    private javax.swing.JButton JBESC6;
    private javax.swing.JButton JBESC9;
    private javax.swing.JButton JBESCALTA;
    private javax.swing.JButton JBESCBAIXA;
    private javax.swing.JButton JBF;
    private javax.swing.JButton JBF_T;
    private javax.swing.JButton JBG;
    private javax.swing.JButton JBG_T;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
