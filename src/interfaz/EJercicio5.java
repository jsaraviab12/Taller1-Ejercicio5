/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class EJercicio5 extends javax.swing.JFrame {

    /**
     * Creates new form EJercicio5
     */
    public EJercicio5() {
        initComponents();
        txtLpp.setEditable(false); 
        txtSs.setEditable(false);
        txtSf.setEditable(false) ;
        txtCa.setEditable(false); 
        txtSueldo.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtSueldob = new javax.swing.JTextField();
        txtLpp = new javax.swing.JTextField();
        txtSs = new javax.swing.JTextField();
        txtCa = new javax.swing.JTextField();
        txtSf = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 28)); // NOI18N
        jLabel1.setText("Sueldo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel2.setText("Sueldo base");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel3.setText("Ley politica publica");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel4.setText("Seguro Social");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel5.setText("Caja de ahorro");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel6.setText("Seugro forzoso");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel7.setText("Sueldo final");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        cmdCalcular.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(0, 102, 0));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 100, 30));

        jButton2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        txtSueldob.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        txtSueldob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldobKeyTyped(evt);
            }
        });
        jPanel1.add(txtSueldob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, -1));

        txtLpp.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jPanel1.add(txtLpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, -1));

        txtSs.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jPanel1.add(txtSs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, -1));

        txtCa.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jPanel1.add(txtCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 100, -1));

        txtSf.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jPanel1.add(txtSf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 100, -1));

        txtSueldo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
       String res1,res2,res3,res4,res5;
       double sueldo,lpp=0,ss=0,sf=0,ca=0,suma=0,resta=0;
       if(txtSueldob.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this,"Por favor dijite su sueldo base"," Error", JOptionPane.ERROR_MESSAGE);
           txtSueldob.requestFocusInWindow();
       }else{
           try {
          sueldo = Double.parseDouble(txtSueldob.getText());
          lpp =(sueldo*1)/100;
          ss  = (sueldo*4)/100;
          sf  = (sueldo*0.5)/100;
          ca  = (sueldo*5)/100;
          suma = lpp + ss + sf + ca;
          resta =sueldo-suma;
       }catch (Exception e){
               JOptionPane.showMessageDialog(this,"Ingrese numero valido","Error", JOptionPane.ERROR_MESSAGE);
            txtSueldob.requestFocusInWindow();
       }
           res1=String.valueOf(lpp);
           res2=String.valueOf(ss);
           res3=String.valueOf(sf);
           res4=String.valueOf(ca);
           res5=String.valueOf(resta);
           txtLpp.setText(res1);
           txtSs.setText(res2);
           txtSf.setText(res3);
           txtCa.setText(res4);
           txtSueldo.setText(res5);
           
       }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtSueldob.setText("");
        txtLpp.setText("");
        txtSs.setText("");
        txtSueldo.setText("");
        txtCa.setText("");
        txtSf.setText("");
        txtSueldob.requestFocusInWindow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSueldobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldobKeyTyped
       char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='.'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtSueldobKeyTyped

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
            java.util.logging.Logger.getLogger(EJercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EJercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EJercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EJercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EJercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCa;
    private javax.swing.JTextField txtLpp;
    private javax.swing.JTextField txtSf;
    private javax.swing.JTextField txtSs;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldob;
    // End of variables declaration//GEN-END:variables
}
