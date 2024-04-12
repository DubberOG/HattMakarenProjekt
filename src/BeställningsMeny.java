
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
public class BeställningsMeny extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form BeställningsMeny
     */
    public BeställningsMeny(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
    
    private BeställningsMeny()
    {
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

        btnLäggTillBeställning = new javax.swing.JButton();
        btnVisaTidigareBeställningar = new javax.swing.JButton();
        btnÄndraBeställning = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLäggTillBeställning.setText("Lägg till beställning");
        btnLäggTillBeställning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillBeställningActionPerformed(evt);
            }
        });

        btnVisaTidigareBeställningar.setText("Visa tidigare beställningar");
        btnVisaTidigareBeställningar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaTidigareBeställningarActionPerformed(evt);
            }
        });

        btnÄndraBeställning.setText("Ändra/Uppdatera beställning");
        btnÄndraBeställning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraBeställningActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Beställning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnTillbaka)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnVisaTidigareBeställningar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLäggTillBeställning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnÄndraBeställning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnLäggTillBeställning)
                .addGap(30, 30, 30)
                .addComponent(btnVisaTidigareBeställningar)
                .addGap(27, 27, 27)
                .addComponent(btnÄndraBeställning, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna knappen tar dig till LaggTillBestallning frame.
    private void btnLäggTillBeställningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillBeställningActionPerformed
        setVisible(false);
        new LaggTillBestallning(idb).setVisible(true);
    }//GEN-LAST:event_btnLäggTillBeställningActionPerformed

    //Denna knappen tar dig till AndraBestallning frame.
    private void btnÄndraBeställningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraBeställningActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AndraBestallning(idb).setVisible(true);
    }//GEN-LAST:event_btnÄndraBeställningActionPerformed

    //Denna knappen tar dig tillbaka till Meny frame.
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        new Meny(idb).setVisible(true);    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnVisaTidigareBeställningarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaTidigareBeställningarActionPerformed
        setVisible(false);
        new OrderHistorik(idb).setVisible(true); 
    }//GEN-LAST:event_btnVisaTidigareBeställningarActionPerformed

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
            java.util.logging.Logger.getLogger(BeställningsMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeställningsMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeställningsMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeställningsMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeställningsMeny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggTillBeställning;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnVisaTidigareBeställningar;
    private javax.swing.JButton btnÄndraBeställning;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
