
import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alice
 */
public class SeBestallningarDatum extends javax.swing.JFrame {

    /**
     * Creates new form SeBestallningarDatum
     */
    public SeBestallningarDatum() {
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

        lblDatum1 = new javax.swing.JLabel();
        txtDatum1 = new javax.swing.JTextField();
        lblDatum2 = new javax.swing.JLabel();
        txtDatum2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaBestallningar = new javax.swing.JTextArea();
        btnHämta = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDatum1.setText("Se beställningar mellan:");

        lblDatum2.setText("och:");

        txtAreaBestallningar.setColumns(20);
        txtAreaBestallningar.setRows(5);
        jScrollPane1.setViewportView(txtAreaBestallningar);

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHämta)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDatum2)
                            .addComponent(lblDatum1))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnTillbaka)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatum1)
                    .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatum2)
                    .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnHämta)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTillbaka)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Meny().setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        // TODO add your handling code here:
        boolean rattDatumFormat1 = Validering.datumKontroll(txtDatum1);
        boolean rattDatumFormat2 = Validering.datumKontroll(txtDatum2);
        txtAreaBestallningar.setText("");
        String datum1 = txtDatum1.getText();
        String datum2 = txtDatum2.getText();
      ArrayList<HashMap<String, String>> Bestallningar;
      
      if(rattDatumFormat1 && rattDatumFormat2){
        try {
        String query = "SELECT * FROM Orders WHERE Datum BETWEEN '" + datum1 + "' AND '" + datum2 + "'";
        Bestallningar = Main.idb.fetchRows(query);
        txtAreaBestallningar.append("OrderID" + "\t" + "Datum" + "\t" + "Status" + "\t" + "KundID" + "\t" + "ProduktID" + "\t" + "Pris" + "\n");
        
        for(HashMap<String, String> bestallning : Bestallningar) {
            txtAreaBestallningar.append(bestallning.get("OrderID") + "\t");
                    txtAreaBestallningar.append(bestallning.get("Datum") + "\t");
                    txtAreaBestallningar.append(bestallning.get("Status") + "\n");
                    txtAreaBestallningar.append(bestallning.get("KundID") + "\n");
                    txtAreaBestallningar.append(bestallning.get("ProduktID") + "\n");
                    txtAreaBestallningar.append(bestallning.get("Pris") + "\n");
                    
        
        }
        }
        catch (InfException e) {
            System.out.println("Internal error message: " + e.getMessage());
            
        }
    
    
    }//GEN-LAST:event_btnHämtaActionPerformed
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
            java.util.logging.Logger.getLogger(SeBestallningarDatum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeBestallningarDatum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeBestallningarDatum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeBestallningarDatum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeBestallningarDatum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatum1;
    private javax.swing.JLabel lblDatum2;
    private javax.swing.JTextArea txtAreaBestallningar;
    private javax.swing.JTextField txtDatum1;
    private javax.swing.JTextField txtDatum2;
    // End of variables declaration//GEN-END:variables
}
