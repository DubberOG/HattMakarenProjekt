
import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sofia
 */
public class KundLista extends javax.swing.JFrame {

    private InfDB idb;

    
    public KundLista(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
   
    private KundLista() {
        initComponents();
        this.idb = idb;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaKundLista = new javax.swing.JTextArea();
        btnSeKunder = new javax.swing.JButton();
        btnKundlistaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Kundlista");

        txtAreaKundLista.setColumns(20);
        txtAreaKundLista.setRows(5);
        jScrollPane1.setViewportView(txtAreaKundLista);

        btnSeKunder.setText("Se kunder");
        btnSeKunder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeKunderActionPerformed(evt);
            }
        });

        btnKundlistaTillbaka.setText("Tillbaka");
        btnKundlistaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKundlistaTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnSeKunder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnKundlistaTillbaka)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnSeKunder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnKundlistaTillbaka)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeKunderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeKunderActionPerformed
        // TODO add your handling code here:
      
   
   ArrayList<String> orders = new ArrayList<>();
        try{
            String nyKundFraga = "SELECT * FROM Kund";
            ArrayList<HashMap<String,String>> kunders = idb.fetchRows(nyKundFraga);
            for (HashMap<String,String> kunder : kunders) {
                for (String Kund : kunder.keySet()) {
            orders.add(Kund + ": " + kunder.get(Kund));
        }
    }
           for (String order : orders) {
            txtAreaKundLista.append(order + "\n");
    }

        }catch (InfException e){
            System.out.println ("internt felmedelande:" + e.getMessage());
        }
       

    }//GEN-LAST:event_btnSeKunderActionPerformed

    private void btnKundlistaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKundlistaTillbakaActionPerformed
   setVisible(false);
        new Meny(idb).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnKundlistaTillbakaActionPerformed
    
//     * @param args the command line arguments
//     */
    public static void main (String args[]) {
    InfDB idb;
    try {
        idb = new InfDB("Hattmakaren", "3306", "hattmakaren", "HTM123");
    } catch (InfException ex) {
        JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen!");
        return; // Stanna körningen om anslutningen misslyckades
    }
        
    
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
            java.util.logging.Logger.getLogger(KundLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KundLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KundLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KundLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KundLista(idb).setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKundlistaTillbaka;
    private javax.swing.JButton btnSeKunder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaKundLista;
    // End of variables declaration//GEN-END:variables
}
