import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
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

    private InfDB idb;
    /**
     * Creates new form LaggTillBestallning
     * @param idb
     */
    public LaggTillBestallning(InfDB idb) {
        initComponents();
        this.idb = idb;

    }
    private LaggTillBestallning() {
        initComponents();
        
        try {
            idb = new InfDB("Hattmakaren", "3306", "hattmakaren","HTM123");
        fyllCbValjKund();
        fyllCbValjProdukt();
        fylliDatum();
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

        lblProdukt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProdukt.setText("Välj produkt");

        lblProdukt1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProdukt1.setText("Skriv in datum");

        tfDatum.setColumns(8);
        tfDatum.setText("xxxx-xx-xx");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Välj status");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekräftad", "Under tillverkning", "Redo att skickas" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnSpara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(btnAvbryt)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cbValjKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProdukt)
                            .addComponent(cbValjProdukt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProdukt1)
                            .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbBestallning))
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpara)
                    .addComponent(btnAvbryt))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        avbrytBestallning();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
sparaBestallning();
    }//GEN-LAST:event_btnSparaActionPerformed

   
    
    private void fyllCbValjKund() {
            try{
        ArrayList<HashMap<String, String>> allaKunder = idb.fetchRows("SELECT KundID, Namn FROM Kund");
                  
                for(HashMap<String, String> kund : allaKunder){
                // Hämta KundID och Namn från HashMap
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
        ArrayList<HashMap<String, String>> allaProdukter = idb.fetchRows("SELECT ProduktID, Namn FROM Produkt");
                  
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
     }
     
     private void avbrytBestallning()
     {
          int val = JOptionPane.showConfirmDialog(null, "Vill du avbryta beställningen?", "Avbryt", JOptionPane.YES_NO_OPTION);
          if(val == JOptionPane.YES_OPTION)
          {
              dispose();
              new Meny(idb).setVisible(true);
          }
     }
   
     private void sparaBestallning() {
    try {
        // Hämta vald kund och produkt från comboboxarna
        String valdKundProdukt = (String) cbValjKund.getSelectedItem();
        String valdProdukt = valdKundProdukt.split(" - ")[0]; // Hämta ProduktID från kombinerad sträng
        String valdKund = (String) cbValjProdukt.getSelectedItem();
        String valdKundID = valdKund.split(" - ")[0]; // Hämta KundID från kombinerad sträng
        String orderID = idb.getAutoIncrement("Orders", "OrderID");
        // Hämta datum från textfältet
        String datum = tfDatum.getText();

        // Hämta vald status från comboboxen
        String status = (String) cbStatus.getSelectedItem();

        // SQL-fråga för att infoga data i ordertabellen
        String orderFraga = "INSERT INTO Orders (OrderID, Datum, Status, KundID, ProduktID) VALUES ('" + orderID + "', '" + datum + "', '" + status + "', '" + valdKundID + "', '" + valdProdukt + "')";

        // Utför SQL-frågan
        idb.insert(orderFraga);

        // Meddela användaren att beställningen har sparats
        JOptionPane.showMessageDialog(null, "Beställningen har sparats!");

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
    private javax.swing.JButton btnSpara;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbValjKund;
    private javax.swing.JComboBox<String> cbValjProdukt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbBestallning;
    private javax.swing.JLabel lblProdukt;
    private javax.swing.JLabel lblProdukt1;
    private javax.swing.JTextField tfDatum;
    // End of variables declaration//GEN-END:variables
}
