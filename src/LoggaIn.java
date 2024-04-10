/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.util.Arrays;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author alice
 */
public class LoggaIn extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form LoggaIn
     * @param idb
     */
    public LoggaIn(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
    private LoggaIn() {
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

        txtAnvändarnamn = new javax.swing.JTextField();
        lblAnvändarnamn = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        btnLoggaIn = new javax.swing.JButton();
        pswordLösenord = new javax.swing.JPasswordField();
        lblFelmeddelande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAnvändarnamn.setText("Användarnamn");

        lblLösenord.setText("Lösenord");

        btnLoggaIn.setText("Logga In");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAnvändarnamn)
                            .addComponent(txtAnvändarnamn, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(lblLösenord)
                            .addComponent(pswordLösenord)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnLoggaIn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblFelmeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblAnvändarnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswordLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoggaIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFelmeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        // TODO add your handling code here:
        verifieraInlogg();
    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void verifieraInlogg() {
        
        String angivetAnvändarnamn = txtAnvändarnamn.getText(); //hämta angivet användarnamnt
        char [] angivetLösenord = pswordLösenord.getPassword(); //hämtar angivet lösen
        String lösenordString = new String(angivetLösenord); //gör om lösenordet från char till string
        
        if (inloggningStämmer(angivetAnvändarnamn, lösenordString)) {
        setVisible(false); //stänger nuvarande fönster
        new Meny(idb).setVisible(true);
        } else {
            //om inloggningen är felaktig, visa ett felmeddelande
            lblFelmeddelande.setText("Fel användarnamn eller lösenord, försök igen");
            
        }
        
    }
            
    private boolean inloggningStämmer(String användarnamn, String lösenord) {
        //metoden ska kontrollera användarnamnet och lösenordet, om 
        boolean isAnställd = false;
        String angivetAnvändarnamn = txtAnvändarnamn.getText();
        char [] angivetLösenord = pswordLösenord.getPassword(); 
        
        try {
            String anställdQuery = "Select Lösenord FROM Anställd WHERE Användarnamn = '" + angivetAnvändarnamn + "'";
            //hämtar lösenordet som är angivet vid det användarnamn som skrivs in
            String lagratLösenord = idb.fetchSingle(anställdQuery); 
            
            if (lagratLösenord != null && Arrays.equals(angivetLösenord, lagratLösenord.toCharArray())){
            isAnställd = true;
            }
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande: " + e.getMessage());
        }
        return isAnställd;
        
    }
    
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
            java.util.logging.Logger.getLogger(LoggaIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoggaIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoggaIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoggaIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 try {
            // Skapa en ny instans av InfDB
            idb = new InfDB("Hattmakaren", "3306", "hattmakaren","HTM123");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoggaIn(idb).setVisible(true);
            }
        });
    } catch (InfException ex) {       
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblAnvändarnamn;
    private javax.swing.JLabel lblFelmeddelande;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JPasswordField pswordLösenord;
    private javax.swing.JTextField txtAnvändarnamn;
    // End of variables declaration//GEN-END:variables
}
