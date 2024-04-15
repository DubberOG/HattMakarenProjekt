
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
public class HattLager extends javax.swing.JFrame {

    /**
     * Creates new form HattLager
     */
    public HattLager() {
        initComponents();
        fyllCbValjTyg();
        fyllCbValjUtsmyckning();
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

        txtAntalMeter = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        lblStorlek = new javax.swing.JLabel();
        txtUtsmyckningsantal = new javax.swing.JTextField();
        lblAntalTimmar = new javax.swing.JLabel();
        lblLaggTillHattILager = new javax.swing.JLabel();
        lblValjTyg = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        lblAntalMeter = new javax.swing.JLabel();
        lblValjUtsmyckning = new javax.swing.JLabel();
        lblUtsmyckningsAntal = new javax.swing.JLabel();
        txtStorlek = new javax.swing.JTextField();
        txtAntalTimmar = new javax.swing.JTextField();
        btnSkapaHatt = new javax.swing.JButton();
        txtNamn = new javax.swing.JTextField();
        cbValjTyg = new javax.swing.JComboBox<>();
        cbValjUtsmyckning = new javax.swing.JComboBox<>();
        cbValjStandardhatt = new javax.swing.JComboBox<>();
        lblValjStandardhatt = new javax.swing.JLabel();
        lblSkapaHatt = new javax.swing.JLabel();
        btnLäggILager = new javax.swing.JButton();
        lblNotering = new javax.swing.JLabel();
        txtNotering = new javax.swing.JTextField();
        txtAngeTimpris = new javax.swing.JTextField();
        lblAngeTimpris = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAntalMeter.setColumns(5);
        txtAntalMeter.setToolTipText("");

        lblNamn.setText("Namn");

        lblStorlek.setText("Storlek");

        txtUtsmyckningsantal.setColumns(5);
        txtUtsmyckningsantal.setToolTipText("");

        lblAntalTimmar.setText("Arbettimmar");

        lblLaggTillHattILager.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblLaggTillHattILager.setText("Skapa hatt och lägg till i lager");

        lblValjTyg.setText("Välj tyg");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblAntalMeter.setText("Antal meter");

        lblValjUtsmyckning.setText("Välj Utsmyckning");

        lblUtsmyckningsAntal.setText("Utsmyckningsantal");

        txtStorlek.setColumns(5);

        txtAntalTimmar.setColumns(5);
        txtAntalTimmar.setToolTipText("");

        btnSkapaHatt.setText("Skapa hatt");
        btnSkapaHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaHattActionPerformed(evt);
            }
        });

        txtNamn.setColumns(5);

        lblValjStandardhatt.setText("Välj standardhatt");

        lblSkapaHatt.setText("Skapa hatt");

        btnLäggILager.setText("Lägg i lager");
        btnLäggILager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggILagerActionPerformed(evt);
            }
        });

        lblNotering.setText("Ev Notering");

        txtNotering.setColumns(5);
        txtNotering.setText("Vänligen lämna ej tom");

        txtAngeTimpris.setColumns(5);
        txtAngeTimpris.setToolTipText("");

        lblAngeTimpris.setText("Ange timpris");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblLaggTillHattILager))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTillbaka)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnLäggILager))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblUtsmyckningsAntal)
                                                    .addComponent(lblValjUtsmyckning)
                                                    .addComponent(lblAntalMeter)
                                                    .addComponent(lblValjTyg)
                                                    .addComponent(lblAntalTimmar)
                                                    .addComponent(lblStorlek)
                                                    .addComponent(lblNamn)
                                                    .addComponent(lblNotering))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAntalMeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbValjTyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbValjUtsmyckning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtAntalTimmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lblAngeTimpris)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtAngeTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtUtsmyckningsantal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNotering, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnSkapaHatt)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(lblSkapaHatt)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblValjStandardhatt)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(cbValjStandardhatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(10, 10, 10)))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblLaggTillHattILager)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValjStandardhatt)
                    .addComponent(lblSkapaHatt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbValjStandardhatt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStorlek)
                            .addComponent(txtStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAntalTimmar)
                            .addComponent(txtAntalTimmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAngeTimpris)
                            .addComponent(txtAngeTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValjTyg)
                            .addComponent(cbValjTyg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAntalMeter)
                            .addComponent(txtAntalMeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValjUtsmyckning)
                            .addComponent(cbValjUtsmyckning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUtsmyckningsAntal)
                            .addComponent(txtUtsmyckningsantal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNotering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotering))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLäggILager)
                    .addComponent(btnSkapaHatt))
                .addGap(40, 40, 40)
                .addComponent(btnTillbaka)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        new Lager().setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnSkapaHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaHattActionPerformed

        try {
            if (Validering.txtFaltTomt(txtNamn) && Validering.txtFaltTomt(txtStorlek) &&
                Validering.txtFaltTomt(txtAntalTimmar)  &&
                Validering.txtFaltTomt(txtAntalMeter)  &&
                Validering.txtFaltTomt(txtUtsmyckningsantal)){
                String id = Main.idb.getAutoIncrement("Produkt", "ProduktID");
                String namn = txtNamn.getText();
                String storlek = txtStorlek.getText();
                String strTimmar = txtAntalTimmar.getText();
                double antalTimmar = Double.parseDouble(strTimmar);
                String strTimpris = txtAngeTimpris.getText();
                double angeTimpris = Double.parseDouble(strTimpris);
                String tyg = cbValjTyg.getSelectedItem().toString();
                String valdTygID = tyg.split(" - ")[0];
                String strMeter = txtAntalMeter.getText();
                double antalMeter = Double.parseDouble(strMeter);
                String utsmyckning = cbValjUtsmyckning.getSelectedItem().toString();
                String valdUtsmyckningID = tyg.split(" - ")[0];
                String strAntal = txtUtsmyckningsantal.getText();
                double utsmyckningsantal = Double.parseDouble(strAntal);
                String notering = txtNotering.getText();
                String tygPrisStringFraga = "SELECT PrisPerEnhet FROM Material WHERE MaterialID = '"+valdTygID+"'"; //splitta namn och ID!
                String tygPrisStringResultat = Main.idb.fetchSingle(tygPrisStringFraga);
                double tygPris = Double.parseDouble(tygPrisStringResultat);
                String utsmyckningPrisStringFraga = "SELECT PrisPerEnhet FROM Material WHERE MaterialID = '"+valdUtsmyckningID+"'"; //splitta namn och ID!
                String utsmyckningPrisStringResultat = Main.idb.fetchSingle(utsmyckningPrisStringFraga);
                double utsmyckningPris = Double.parseDouble(utsmyckningPrisStringResultat);
                
                double prisTyg = tygPris * antalMeter;
                double prisUtsmyckning = utsmyckningPris * utsmyckningsantal;
                double prisArbete = antalTimmar * angeTimpris;
                double pris = prisArbete + prisTyg + prisUtsmyckning;
                        
                //Uppdatera materiallager
                
                //Koppla validering så att det inte blir dubbla värden
                String nyHatt = id + ",'" + namn + "','" + storlek + "','" + pris + "'," + "'" + notering + "'";
                String nyHattFraga = "INSERT INTO Produkt (ProduktID, Namn, Storlek, Pris, Noteringar) VALUES ("+nyHatt+")";
                Main.idb.insert(nyHattFraga);
                JOptionPane.showMessageDialog(null, "En ny hatt har skapats!");

            }}
            catch  (InfException e){
                System.out.println ("internt felmedelande:" + e.getMessage());
            }

    }//GEN-LAST:event_btnSkapaHattActionPerformed

    private void btnLäggILagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggILagerActionPerformed
        // Koppla till lägg i lager
        // Skicka med pris
        // Uppdatera meteriallager
    }//GEN-LAST:event_btnLäggILagerActionPerformed
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
         
         private void fyllCbValjTyg() {
            try{
        ArrayList<HashMap<String, String>> allaTyger = Main.idb.fetchRows("SELECT MaterialID, Namn FROM Material WHERE Typ = 'tyg'");
                  
                for(HashMap<String, String> tyg : allaTyger){
                // Hämta KundID och Namn från HashMap
            String tygMaterialID = tyg.get("MaterialID");
            String tygNamn = tyg.get("Namn");
            
            // Skapa en sträng som innehåller både KundID och namn och lägg till i comboboxen
            cbValjTyg.addItem(tygMaterialID + " - " + tygNamn);    
           
                }}
                    
              
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }}
             private void fyllCbValjUtsmyckning() {
            try{
        ArrayList<HashMap<String, String>> allaUtsmyckningar = Main.idb.fetchRows("SELECT MaterialID, Namn FROM Material WHERE Typ = 'Utsmyckning'");
                  
                for(HashMap<String, String> utsmyckning : allaUtsmyckningar){
                // Hämta KundID och Namn från HashMap
            String utsmyckningsMaterialID = utsmyckning.get("MaterialID");
            String utsmyckningsNamn = utsmyckning.get("Namn");
            
            // Skapa en sträng som innehåller både KundID och namn och lägg till i comboboxen
            cbValjUtsmyckning.addItem(utsmyckningsMaterialID + " - " + utsmyckningsNamn);    
           
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
            java.util.logging.Logger.getLogger(HattLager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HattLager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HattLager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HattLager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HattLager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggILager;
    private javax.swing.JButton btnSkapaHatt;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbValjStandardhatt;
    private javax.swing.JComboBox<String> cbValjTyg;
    private javax.swing.JComboBox<String> cbValjUtsmyckning;
    private javax.swing.JLabel lblAngeTimpris;
    private javax.swing.JLabel lblAntalMeter;
    private javax.swing.JLabel lblAntalTimmar;
    private javax.swing.JLabel lblLaggTillHattILager;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblNotering;
    private javax.swing.JLabel lblSkapaHatt;
    private javax.swing.JLabel lblStorlek;
    private javax.swing.JLabel lblUtsmyckningsAntal;
    private javax.swing.JLabel lblValjStandardhatt;
    private javax.swing.JLabel lblValjTyg;
    private javax.swing.JLabel lblValjUtsmyckning;
    private javax.swing.JTextField txtAngeTimpris;
    private javax.swing.JTextField txtAntalMeter;
    private javax.swing.JTextField txtAntalTimmar;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtNotering;
    private javax.swing.JTextField txtStorlek;
    private javax.swing.JTextField txtUtsmyckningsantal;
    // End of variables declaration//GEN-END:variables
}
