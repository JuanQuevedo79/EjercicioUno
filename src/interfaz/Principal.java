/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtInversionUno = new javax.swing.JTextField();
        txtInversionDos = new javax.swing.JTextField();
        txtInversionTres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPorcentajeUno = new javax.swing.JTextField();
        txtPorcentajeDos = new javax.swing.JTextField();
        txtPorcentajeTres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtInversionTotal = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("PORCENTAJES DE INVERSION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 280, -1));

        jLabel2.setText("Inversion 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("Inversion 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel4.setText("Inversion 3:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        txtInversionUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInversionUnoKeyTyped(evt);
            }
        });
        getContentPane().add(txtInversionUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, -1));

        txtInversionDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInversionDosActionPerformed(evt);
            }
        });
        txtInversionDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInversionDosKeyTyped(evt);
            }
        });
        getContentPane().add(txtInversionDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, -1));

        txtInversionTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInversionTresActionPerformed(evt);
            }
        });
        txtInversionTres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInversionTresKeyTyped(evt);
            }
        });
        getContentPane().add(txtInversionTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 60, -1));

        jLabel5.setText("%");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtPorcentajeUno.setEditable(false);
        txtPorcentajeUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentajeUnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPorcentajeUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 90, -1));

        txtPorcentajeDos.setEditable(false);
        getContentPane().add(txtPorcentajeDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 90, -1));

        txtPorcentajeTres.setEditable(false);
        getContentPane().add(txtPorcentajeTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 90, -1));

        jLabel6.setText("%");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel7.setText("%");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Inversion Total :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        txtInversionTotal.setEditable(false);
        txtInversionTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInversionTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtInversionTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 120, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInversionDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInversionDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInversionDosActionPerformed

    private void txtInversionTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInversionTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInversionTresActionPerformed

    private void txtPorcentajeUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentajeUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentajeUnoActionPerformed

    private void txtInversionTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInversionTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInversionTotalActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
       double suma;
       int persona1, persona2, persona3;
       double porc1, porc2, porc3;
       String res1, res2, res3, total;
     

    if(txtInversionUno.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Digite la Inversion número Uno","error", JOptionPane.ERROR_MESSAGE);
         txtInversionUno.requestFocusInWindow();
         txtInversionUno.selectAll();
//validación de vacio de inversion 1
       }

     else if(txtInversionDos.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite la Inversion número Dos","error", JOptionPane.ERROR_MESSAGE);  
        txtInversionDos.requestFocusInWindow();
        txtInversionDos.selectAll();
//validación de vacio de inversion 2
     }  
     else if(txtInversionTres.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite la Inversion número tres","error", JOptionPane.ERROR_MESSAGE);  
        txtInversionTres.requestFocusInWindow(); 
         txtInversionTres.selectAll();    
////validación de vacio de inversion 3
     }
    
     
     else{
  
     persona1=Integer.parseInt(txtInversionUno.getText());
     persona2=Integer.parseInt(txtInversionDos.getText());
     persona3=Integer.parseInt(txtInversionTres.getText());
 // convertir los Labels en enteros     
 
   if(persona1==persona2) {
       JOptionPane.showMessageDialog(this, "Las cantidades individuales deben ser diferentes","error", JOptionPane.ERROR_MESSAGE);  
        txtInversionUno.requestFocusInWindow(); 
        txtInversionUno.selectAll();  
       }  

     else if(persona2==persona3){
     JOptionPane.showMessageDialog(this, "Las cantidades individuales deben ser diferentes","error", JOptionPane.ERROR_MESSAGE);  
        txtInversionDos.requestFocusInWindow(); 
        txtInversionDos.selectAll();              
       }      
 else if(persona1==persona3){
     JOptionPane.showMessageDialog(this, "Las cantidades individuales deben ser diferentes","error", JOptionPane.ERROR_MESSAGE);  
        txtInversionUno.requestFocusInWindow(); 
        txtInversionUno.selectAll();              
       }     
suma=(persona1+persona2+persona3); 
   porc1=(persona1/suma)*100;
   porc2=(persona2/suma)*100;
   porc3=(persona3/suma)*100;

 //Iniciar Operacion
     res1=String.valueOf(porc1);
    txtPorcentajeUno.setText (res1);    
    
    res2=String.valueOf(porc2);
    txtPorcentajeDos.setText (res2);  
    
    res3=String.valueOf(porc3);
    txtPorcentajeTres.setText(res3); 

    total=String.valueOf(suma);
    txtInversionTotal.setText(total);
  
   }
       
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtInversionTotal.setText("");
     txtInversionUno.setText("");
     txtInversionDos.setText("");
     txtInversionTres.setText("");
     txtPorcentajeUno.setText("");
     txtPorcentajeDos.setText("");
     txtPorcentajeTres.setText("");
     txtInversionTotal.requestFocusInWindow();
     txtInversionUno.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtInversionUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInversionUnoKeyTyped
        char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }  
    }//GEN-LAST:event_txtInversionUnoKeyTyped

    private void txtInversionDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInversionDosKeyTyped
        char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }  
    }//GEN-LAST:event_txtInversionDosKeyTyped

    private void txtInversionTresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInversionTresKeyTyped
       char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }  
    }//GEN-LAST:event_txtInversionTresKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtInversionDos;
    private javax.swing.JTextField txtInversionTotal;
    private javax.swing.JTextField txtInversionTres;
    private javax.swing.JTextField txtInversionUno;
    private javax.swing.JTextField txtPorcentajeDos;
    private javax.swing.JTextField txtPorcentajeTres;
    private javax.swing.JTextField txtPorcentajeUno;
    // End of variables declaration//GEN-END:variables
}
