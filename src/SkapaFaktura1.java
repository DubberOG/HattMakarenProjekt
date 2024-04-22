
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * Här vill vi lägga till information som ska gå till SkrivutFaktura, att denna klass skickar med en del information till nästa klass, ett alternativc
 * Hade varit att vi med den nyckeln skickar med info som gör att v, 
 * 
 */
/**
 *
 * @author willi
 */
public class SkapaFaktura1 extends javax.swing.JFrame {

    /**
     * Creates new form SkapaFraktsedel
     */
    public SkapaFaktura1() {
        initComponents();
        btnSkapa.setEnabled(false);
        fyllICombobox();

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
        btnSkapa = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAInformation = new javax.swing.JTextArea();
        lbOrderLista = new javax.swing.JLabel();
        lbValjKund = new javax.swing.JLabel();
        cbValjOrderVal = new javax.swing.JComboBox<>();
        txtFakturaNummer = new javax.swing.JTextField();
        lbFakturaNummer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Skapa faktura");

        btnSkapa.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSkapa.setText("Skapa");
        btnSkapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaActionPerformed(evt);
            }
        });

        btnAvbryt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        txAInformation.setColumns(20);
        txAInformation.setRows(5);
        jScrollPane1.setViewportView(txAInformation);

        lbOrderLista.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbOrderLista.setText("Information om order:");

        lbValjKund.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbValjKund.setText("Välj order:");

        txtFakturaNummer.setText("12345 EX");

        lbFakturaNummer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbFakturaNummer.setText("Fakturanummer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbValjOrderVal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbValjKund)
                            .addComponent(txtFakturaNummer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbFakturaNummer))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAvbryt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSkapa))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbOrderLista)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValjKund)
                    .addComponent(lbOrderLista, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSkapa)
                            .addComponent(btnAvbryt)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbValjOrderVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lbFakturaNummer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFakturaNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        avbrytFaktura();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void btnSkapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaActionPerformed
        //Omvandlar resultatet från getSelectedItem() till en sträng
        String cbVal = (String) cbValjOrderVal.getSelectedItem();
        
        //Sparar vikten som angivits i variabeln txtVikt
        String txtFaktura = txtFakturaNummer.getText();
            
        //Säkerställer att valet var avsiktligt
        int val = JOptionPane.showConfirmDialog(null, "Vill du skriva ut fakturan?", "Skapa faktura", JOptionPane.YES_NO_OPTION );
        
        if(val == JOptionPane.YES_OPTION)
        {
           //Skickar med informationen till klassen SkrivUtFraktsedel
            new SkrivUtFaktura( cbVal, txtFaktura).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSkapaActionPerformed
    
    private void txtFakturaNummerKeyReleased(java.awt.event.KeyEvent evt) {                                       
       checkTxtFakturaNummer();
    }
    private void avbrytFaktura()
    {
        {
          int val = JOptionPane.showConfirmDialog(null, "Vill du avbryta beställningen?", "Avbryt", JOptionPane.YES_NO_OPTION);
          if(val == JOptionPane.YES_OPTION)
          {
              dispose();
              new Meny().setVisible(true);
          }
     }
    }
             private void fyllcbValjOrder(){
    
         String fraga = "SELECT OrderID FROM Orders WHERE Status = 'Skickad'";
         ArrayList<String> allaOrderID;
    
         try{
    
            allaOrderID = Main.idb.fetchColumn(fraga);
            
            for(String ettID : allaOrderID){
            
                cbValjOrderVal.addItem(ettID);
            
            }
            
         }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Databasfel! " );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());     
          }
        }
    private void fyllICombobox()
    {
        //SQL-fråga för att hämta OrderID från databasen
         try{
        ArrayList<HashMap<String, String>> allaOrderar = Main.idb.fetchRows("SELECT OrderID, KundID FROM Orders WHERE Status = 'Skickad'");
                  
        //Går igenom listan 
                for(HashMap<String, String> order : allaOrderar){
                
            // Hämta orderId från listan och sparar det i en sträng
            String orderID = order.get("OrderID");
            String kundID = order.get("KundID");
            
            //Lägger till OrderID i comboboxen
            if(kundID != null)
            {
                cbValjOrderVal.addItem(orderID); 
            }
        }}
                    
              
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }
    }
    
    
    
    public boolean checkTxtFakturaNummer() {
    String fakturaNummer = txtFakturaNummer.getText();
    ArrayList<HashMap<String, String>> listaAvExisterandeFakturaNummer = new ArrayList<>();

    // Loopa igenom alla existerande fakturanummer
    for (HashMap<String, String> faktura : listaAvExisterandeFakturaNummer) {
         String fakturaID = faktura.get("FakturaID");

        // Jämför det angivna fakturanumret med varje existerande fakturanummer
        if (fakturaID.equals(fakturaNummer)) {
            JOptionPane.showMessageDialog(null, "Fakturanumret finns redan. Välj ett annat fakturanummer.", "Fel", JOptionPane.ERROR_MESSAGE);
            return false; // Fakturanumret finns redan, returnera false
        }
    }
    
    // Om loopen avslutas utan att hitta någon matchning, anses fakturanumret vara unikt
    JOptionPane.showMessageDialog(null, "Fakturanumret godkänt.", "Rätt", JOptionPane.INFORMATION_MESSAGE);
    return true; // Fakturanumret är unikt, returnera true
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
            java.util.logging.Logger.getLogger(SkapaFraktsedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkapaFraktsedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkapaFraktsedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkapaFraktsedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SkapaFraktsedel().setVisible(true);
            }
        });
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnSkapa;
    private javax.swing.JComboBox<String> cbValjOrderVal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFakturaNummer;
    private javax.swing.JLabel lbOrderLista;
    private javax.swing.JLabel lbValjKund;
    private javax.swing.JTextArea txAInformation;
    private javax.swing.JTextField txtFakturaNummer;
    // End of variables declaration//GEN-END:variables
}
