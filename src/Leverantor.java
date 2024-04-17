
import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sofia
 */
public class Leverantor extends javax.swing.JFrame {

   

    /**
     * Creates new form Leverantör
     */
    public Leverantor() {
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

        txtSeLeverantörer = new javax.swing.JTextField();
        btnSeLeverantörer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSeLeverantorer = new javax.swing.JTextArea();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSeLeverantörer.setText("Lista med leverantörer:");
        txtSeLeverantörer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeLeverantörerActionPerformed(evt);
            }
        });

        btnSeLeverantörer.setText("Se leverantörer");
        btnSeLeverantörer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeLeverantörerActionPerformed(evt);
            }
        });

        txtAreaSeLeverantorer.setColumns(20);
        txtAreaSeLeverantorer.setRows(5);
        jScrollPane1.setViewportView(txtAreaSeLeverantorer);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSeLeverantörer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeLeverantörer)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txtSeLeverantörer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnSeLeverantörer)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeLeverantörerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeLeverantörerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeLeverantörerActionPerformed

    private void btnSeLeverantörerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeLeverantörerActionPerformed
        // TODO add your handling code here:
        ArrayList<String> orders = new ArrayList<>();
        try{
            String nyLeverantorFraga = "SELECT * FROM leverantör";
            ArrayList<HashMap<String,String>> leverantorer = Main.idb.fetchRows(nyLeverantorFraga);
            for (HashMap<String,String> leverantor : leverantorer) {
                for (String Leverantor : leverantor.keySet()) {
            orders.add(leverantor + ": " + leverantor.get(leverantor));
        }
    }
           for (String order : orders) {
            txtAreaSeLeverantorer.append(order + "\n");
    }

        }catch (InfException e){
            System.out.println ("internt felmedelande:" + e.getMessage());
        }     
         
        ArrayList<HashMap<String, String>> leverantorer = new ArrayList<>();
    try {
        // Hämta leverantörer från databasen och lagra dem i listan
        String query = "SELECT * FROM Leverantor";
        leverantorer = Main.idb.fetchRows(query);
        
        // Iterera över varje leverantör och lägg till deras data i textfältet
        for (HashMap<String, String> leverantor : leverantorer) {
            for (String key : leverantor.keySet()) {
                String value = leverantor.get(key);
                txtAreaSeLeverantorer.append(leverantor + "\n");
            }
        }
    } catch (InfException e) {
        // Hantera eventuella databasfel
        System.out.println("Internt felmeddelande: " + e.getMessage());
    }
    }//GEN-LAST:event_btnSeLeverantörerActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
  
    setVisible(false);
    new Meny().setVisible(true);
    
    }//GEN-LAST:event_btnTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(Leverantör.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leverantör.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leverantör.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leverantör.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leverantor().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeLeverantörer;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaSeLeverantorer;
    private javax.swing.JTextField txtSeLeverantörer;
    // End of variables declaration//GEN-END:variables
}
