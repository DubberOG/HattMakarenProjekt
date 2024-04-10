
import oru.inf.InfDB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alice
 */
public class Meny extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form Meny
     */
    public Meny(InfDB idb) {
        initComponents();
        this.idb = idb;
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

        btnSkrivUtFraktsedel.setText("Skriv ut fraktsedel");
        btnSkrivUtFraktsedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkrivUtFraktsedelActionPerformed(evt);
            }
        });

        lblMeny.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMeny.setText("Meny");

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMeny)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSkrivUtFraktsedel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBeställning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeställningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeställningActionPerformed
    setVisible(false);
    new BeställningsMeny(idb).setVisible(true);
    }//GEN-LAST:event_btnBeställningActionPerformed

    private void btnKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKundActionPerformed
       setVisible(false);
       new KundMeny(idb).setVisible(true);
    }//GEN-LAST:event_btnKundActionPerformed

    private void btnSkrivUtFraktsedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkrivUtFraktsedelActionPerformed
        setVisible(false);
        new SkrivUtFraktsedel(idb).setVisible(true);
    }//GEN-LAST:event_btnSkrivUtFraktsedelActionPerformed

    // Denna knappen loggar man ut med till logga in.
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        setVisible(false);
        new LoggaIn(idb).setVisible(true);    }//GEN-LAST:event_btnLoggaUtActionPerformed

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
                new Meny(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeställning;
    private javax.swing.JButton btnKund;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnSkrivUtFraktsedel;
    private javax.swing.JLabel lblMeny;
    // End of variables declaration//GEN-END:variables
}
