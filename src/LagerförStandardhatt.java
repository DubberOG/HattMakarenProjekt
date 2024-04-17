
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
 * @author mallan
 */
public class LagerförStandardhatt extends javax.swing.JFrame {

    /**
     * Creates new form LagerförStandardhatt
     */
    public LagerförStandardhatt() {
        initComponents();
        fyllCbValjStandardhatt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbValjStandardhatt = new javax.swing.JComboBox<>();
        lblValjStandardhatt = new javax.swing.JLabel();
        btnLagerförHatt = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValjStandardhatt.setText("Välj standardhatt");

        btnLagerförHatt.setText("Lagerför Hatt");
        btnLagerförHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLagerförHattActionPerformed(evt);
            }
        });

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
                .addGap(23, 23, 23)
                .addComponent(btnTillbaka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLagerförHatt)
                    .addComponent(lblValjStandardhatt)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbValjStandardhatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblValjStandardhatt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbValjStandardhatt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLagerförHatt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLagerförHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLagerförHattActionPerformed

        try {

                String hatt = cbValjStandardhatt.getSelectedItem().toString();
                String valdHattID = hatt.split(" - ")[0];

                String uppdateraHattlager = "UPDATE Produktlager SET Antal = Antal + 1 WHERE ProduktID = '" + valdHattID + "'";
                Main.idb.update(uppdateraHattlager);

                JOptionPane.showMessageDialog(null, "En ny hatt har lagerförts!");

            }
            catch  (InfException e){
                System.out.println ("internt felmedelande:" + e.getMessage());
            }
    }//GEN-LAST:event_btnLagerförHattActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        new Lager().setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed
         private void fyllCbValjStandardhatt() {
            try{
        ArrayList<HashMap<String, String>> allaStandardhattar = Main.idb.fetchRows("SELECT ProduktID, Namn FROM Produkt WHERE ProduktID = 331 OR ProduktID = 332 OR ProduktID = 333");
                  
                for(HashMap<String, String> produkt : allaStandardhattar){
                // Hämta KundID och Namn från HashMap
            String ProduktID = produkt.get("ProduktID");
            String Namn = produkt.get("Namn");
            
            // Skapa en sträng som innehåller både KundID och namn och lägg till i comboboxen
            cbValjStandardhatt.addItem(ProduktID + " - " + Namn);    
           
                }}
            catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }}
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
            java.util.logging.Logger.getLogger(LagerförStandardhatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LagerförStandardhatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LagerförStandardhatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LagerförStandardhatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LagerförStandardhatt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLagerförHatt;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbValjStandardhatt;
    private javax.swing.JLabel lblValjStandardhatt;
    // End of variables declaration//GEN-END:variables
}
