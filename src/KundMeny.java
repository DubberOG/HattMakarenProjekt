
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author michellebergelin
 */
public class KundMeny extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form KundMeny
     */
    public KundMeny() {
        initComponents();
        try {
            idb = new InfDB("Hattmakaren", "3306", "hattmakaren","HTM123");
        } catch (InfException ex) {       
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen!");
        }
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblKund = new javax.swing.JLabel();
        btnLäggTillNyKund = new javax.swing.JButton();
        btnTaBortKund = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        btnSeKundlista = new javax.swing.JButton();
        btnUppdateraKund = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblKund.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblKund.setText("Kund");

        btnLäggTillNyKund.setText("Lägg till ny kund");
        btnLäggTillNyKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillNyKundActionPerformed(evt);
            }
        });

        btnTaBortKund.setText("Ta bort kund");
        btnTaBortKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortKundActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnSeKundlista.setText("Se kundlista");
        btnSeKundlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeKundlistaActionPerformed(evt);
            }
        });

        btnUppdateraKund.setText("Uppdatera kunduppgifter");
        btnUppdateraKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraKundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTillbaka)
                    .addComponent(lblKund)
                    .addComponent(btnTaBortKund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLäggTillNyKund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeKundlista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUppdateraKund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblKund)
                .addGap(34, 34, 34)
                .addComponent(btnLäggTillNyKund)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTaBortKund)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeKundlista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUppdateraKund)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLäggTillNyKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillNyKundActionPerformed
        setVisible(false);
        new NyKund().setVisible(true); 
    }//GEN-LAST:event_btnLäggTillNyKundActionPerformed

    private void btnTaBortKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortKundActionPerformed
        setVisible(false);
        new TaBortKund().setVisible(true); 
    }//GEN-LAST:event_btnTaBortKundActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        new Meny().setVisible(true);         
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnSeKundlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeKundlistaActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new KundLista(Main.idb).setVisible(true);
    }//GEN-LAST:event_btnSeKundlistaActionPerformed

    private void btnUppdateraKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraKundActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AndraKund().setVisible(true);
    }//GEN-LAST:event_btnUppdateraKundActionPerformed

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
            java.util.logging.Logger.getLogger(KundMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KundMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KundMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KundMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KundMeny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggTillNyKund;
    private javax.swing.JButton btnSeKundlista;
    private javax.swing.JButton btnTaBortKund;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnUppdateraKund;
    private javax.swing.JLabel lblKund;
    // End of variables declaration//GEN-END:variables
}
