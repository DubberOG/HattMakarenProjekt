import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author willi
 */
public class LaggTillBestallning extends javax.swing.JFrame {

    /**
     * Creates new form LaggTillBestallning
     * @param idb
     */
    public LaggTillBestallning() {
        initComponents();
        fyllCbValjKund();
        fyllCbValjProdukt();
        fylliDatum();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSpara = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        lbBestallning = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbValjKund = new javax.swing.JComboBox<>();
        lblProdukt = new javax.swing.JLabel();
        cbValjProdukt = new javax.swing.JComboBox<>();
        lblProdukt1 = new javax.swing.JLabel();
        tfDatum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        txtPris = new javax.swing.JTextField();
        lblpris = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnLäggTill = new javax.swing.JButton();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSpara.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSpara.setForeground(new java.awt.Color(51, 255, 51));
        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        btnAvbryt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAvbryt.setForeground(new java.awt.Color(255, 51, 0));
        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        lbBestallning.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBestallning.setText("Lägg till beställning");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Välj kund");

        cbValjKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjKundActionPerformed(evt);
            }
        });

        lblProdukt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProdukt.setText("Välj produkt");

        cbValjProdukt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjProduktActionPerformed(evt);
            }
        });

        lblProdukt1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProdukt1.setText("Skriv in datum");

        tfDatum.setColumns(8);
        tfDatum.setText("xxxx-xx-xx");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Välj status");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekräftad", "Tillverkas", "Redo", "Skickad" }));

        txtPris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrisActionPerformed(evt);
            }
        });

        lblpris.setText("Pris till kund");

        btnLäggTill.setText("Lägg till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnSpara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvbryt)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpris)
                            .addComponent(txtPris, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbValjKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbBestallning)
                        .addContainerGap(215, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProdukt)
                            .addComponent(cbValjProdukt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLäggTill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblProdukt1)))
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBestallning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbValjKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdukt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbValjProdukt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdukt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLäggTill))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSpara)
                            .addComponent(btnAvbryt))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpris)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        avbrytBestallning();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        sparaBestallning();
    }//GEN-LAST:event_btnSparaActionPerformed

    private void txtPrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrisActionPerformed

    private void cbValjKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjKundActionPerformed
        // TODO add your handling code here:
        fyllPris();
    }//GEN-LAST:event_cbValjKundActionPerformed

    private void cbValjProduktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjProduktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbValjProduktActionPerformed

    //Denna metoden lägger till de valda produkterna i en TextArea när man trycker på lägg till.
    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed

         String valdProdukt = cbValjProdukt.getSelectedItem().toString();
         
        txtArea.append(valdProdukt + "\n");
    }//GEN-LAST:event_btnLäggTillActionPerformed

   
    private void fyllPris(){
        Object kollarNull = cbValjProdukt.getSelectedItem();
        if(kollarNull != null){
            try{
                //Hämtar vald produkt
                String valdProdukt = cbValjProdukt.getSelectedItem().toString();
                String fraga = "SELECT Pris FROM PRODUKT WHERE Namn = '" +valdProdukt+"'";
                double svar = Double.parseDouble(Main.idb.fetchSingle(fraga));
                double marginal = 1.2;
                double prisTillKund = svar * 1.25 * marginal;
                txtPris.setText(String.valueOf(prisTillKund));

            } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }}
        else{
            System.out.println("null");
        }
    }
    
    private void fyllCbValjKund() {
            try{
                ArrayList<HashMap<String, String>> allaKunder = Main.idb.fetchRows("SELECT KundID, Namn FROM Kund");
                for(HashMap<String, String> kund : allaKunder){
                    // Hämta KundID och Namn från HashMap
                        System.out.println("a");
                        String kundID = kund.get("KundID");
                        String namn = kund.get("Namn");

                        // Skapa en sträng som innehåller både KundID och namn och lägg till i comboboxen
                        cbValjKund.addItem(kundID + " - " + namn);
                }}
                    
              
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }}
     private void fyllCbValjProdukt() {
            try{
        ArrayList<HashMap<String, String>> allaProdukter = Main.idb.fetchRows("SELECT ProduktID, Namn FROM Produkt");
                  
                for(HashMap<String, String> produkt : allaProdukter){
                // Hämta KundID och Namn från HashMap
            String produktID = produkt.get("ProduktID");
            String namn = produkt.get("Namn");
            
            // Skapa en sträng som innehåller både KundID och namn och lägg till i comboboxen
            cbValjProdukt.addItem(produktID + " - " + namn);  
           
                }}
                    
              
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }}
     
     private void fylliDatum()
     {
         Date datum = new Date();
         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
         String dagensDatum = format.format(datum);
         tfDatum.setText(dagensDatum);
         System.out.println("C");
     }
     
     private void avbrytBestallning()
     {
          int val = JOptionPane.showConfirmDialog(null, "Vill du avbryta beställningen?", "Avbryt", JOptionPane.YES_NO_OPTION);
          if(val == JOptionPane.YES_OPTION)
          {
              dispose();
              new Meny().setVisible(true);
          }
     }
   
     private void sparaBestallning() {
    try {
        // Hämta vald kund och produkt från comboboxarna
        String valdKund = (String) cbValjKund.getSelectedItem();
        String valdKundID = valdKund.split(" - ")[0]; // Hämta ProduktID från kombinerad sträng
        String valdProdukt = (String) cbValjProdukt.getSelectedItem();
        String valdProduktID = valdProdukt.split(" - ")[0]; // Hämta KundID från kombinerad sträng
        String orderID = Main.idb.getAutoIncrement("Orders", "OrderID");
        // Hämta datum från textfältet
        String datum = tfDatum.getText();

        String produkter= txtArea.getText();
        
        // Hämta vald status från comboboxen
        String status = (String) cbStatus.getSelectedItem();
        String priset = txtPris.getText();
        String orderFraga = "INSERT INTO Orders (OrderID, Datum, Status, KundID, Pris) VALUES ('" + orderID + "', '" + datum + "', '" + status + "', '" + valdKundID + "','" + priset + "')";
        Main.idb.insert(orderFraga);
        String getLastIDQuery = "SELECT OrderID FROM Orders ORDER BY OrderID DESC LIMIT 1";
        String lastIDResult = Main.idb.fetchSingle(getLastIDQuery);
        int lastInsertedID = Integer.parseInt(lastIDResult);
        String [] delad = produkter.split("\n");
        
        for(String enDel : delad)
        {
        String[] del = enDel.split("-");
        String deladOrderID = del[0];
        //String deladOrderNamn = del[1];
        
        // SQL-fråga för att infoga data i ordertabellen
        //String orderFraga = "INSERT INTO Orders (OrderID, Datum, Status, KundID, Pris) VALUES ('" + orderID + "', '" + datum + "', '" + status + "', '" + valdKundID + "','" + priset + "')";
        String produktFraga = "INSERT INTO ProdukterIOrder (OrdersID, ProduktID) VALUES ('" + lastInsertedID +  "', '" + deladOrderID+ "')";
        // Utför SQL-frågan
         //Main.idb.insert(orderFraga);
         Main.idb.insert(produktFraga);
        
        //Vi måste lagra infon i Orders och ProdukterIOREDRS.
        
        // Meddela användaren att beställningen har sparats
        JOptionPane.showMessageDialog(null, "Beställningen har sparats!");
        }
    } catch (InfException ex) {
        JOptionPane.showMessageDialog(null, "Kunde inte spara beställningen!");
        System.out.println("Internt felmeddelande" + ex.getMessage());
    }
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
            java.util.logging.Logger.getLogger(LaggTillBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LaggTillBestallning().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnSpara;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbValjKund;
    private javax.swing.JComboBox<String> cbValjProdukt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBestallning;
    private javax.swing.JLabel lblProdukt;
    private javax.swing.JLabel lblProdukt1;
    private javax.swing.JLabel lblpris;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtPris;
    // End of variables declaration//GEN-END:variables
}
