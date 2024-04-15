
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alice
 */
public class Meny extends javax.swing.JFrame {


    /**
     * Creates new form Meny
     */
    public Meny()
    {
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

        btnBeställning = new javax.swing.JButton();
        btnKund = new javax.swing.JButton();
        btnSkrivUtFraktsedel = new javax.swing.JButton();
        lblMeny = new javax.swing.JLabel();
        btnLoggaUt = new javax.swing.JButton();
        btnLager = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBeställning.setText("Beställning");
        btnBeställning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeställningActionPerformed(evt);
            }
        });

        btnKund.setText("Kund");
        btnKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKundActionPerformed(evt);
            }
        });

        btnSkrivUtFraktsedel.setText("Frakt");
        btnSkrivUtFraktsedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkrivUtFraktsedelActionPerformed(evt);
            }
        });

        lblMeny.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblMeny.setText("Meny");

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        btnLager.setText("Lager");
        btnLager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoggaUt)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMeny)
                    .addComponent(btnSkrivUtFraktsedel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBeställning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLoggaUt)
                .addGap(11, 11, 11)
                .addComponent(lblMeny)
                .addGap(38, 38, 38)
                .addComponent(btnBeställning)
                .addGap(18, 18, 18)
                .addComponent(btnKund)
                .addGap(18, 18, 18)
                .addComponent(btnSkrivUtFraktsedel)
                .addGap(18, 18, 18)
                .addComponent(btnLager)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeställningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeställningActionPerformed
    setVisible(false);
    new BeställningsMeny().setVisible(true);
    }//GEN-LAST:event_btnBeställningActionPerformed

    private void btnKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKundActionPerformed
       setVisible(false);
       new KundMeny().setVisible(true);
    }//GEN-LAST:event_btnKundActionPerformed

    private void btnSkrivUtFraktsedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkrivUtFraktsedelActionPerformed
        setVisible(false);
       new SkapaFraktsedel().setVisible(true);
    }//GEN-LAST:event_btnSkrivUtFraktsedelActionPerformed

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        dispose();
        new LoggaIn().setVisible(true);
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnLagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLagerActionPerformed
        // TODO add your handling code here:
        setVisible(false);
       new Lager().setVisible(true);
    }//GEN-LAST:event_btnLagerActionPerformed

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
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeställning;
    private javax.swing.JButton btnKund;
    private javax.swing.JButton btnLager;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnSkrivUtFraktsedel;
    private javax.swing.JLabel lblMeny;
    // End of variables declaration//GEN-END:variables
}
