
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
 * @author willi
 */
public class SkapaFraktsedel extends javax.swing.JFrame {

    /**
     * Creates new form SkapaFraktsedel
     */
    public SkapaFraktsedel() {
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

        lbVikt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txAngeVikt = new javax.swing.JTextField();
        btnSkapa = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAInformation = new javax.swing.JTextArea();
        lbOrderLista = new javax.swing.JLabel();
        lbValjKund = new javax.swing.JLabel();
        cbValjOrder = new javax.swing.JComboBox<>();
        btnSok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbVikt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbVikt.setText("Ange vikt:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Skapa fraktsedel");

        txAngeVikt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txAngeViktKeyReleased(evt);
            }
        });

        btnSkapa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSkapa.setForeground(new java.awt.Color(51, 255, 51));
        btnSkapa.setText("Skapa");
        btnSkapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaActionPerformed(evt);
            }
        });

        btnAvbryt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAvbryt.setForeground(new java.awt.Color(255, 0, 0));
        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        txAInformation.setColumns(20);
        txAInformation.setRows(5);
        jScrollPane1.setViewportView(txAInformation);

        lbOrderLista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbOrderLista.setText("Information om order:");

        lbValjKund.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbValjKund.setText("Välj order:");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSkapa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvbryt)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbVikt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbValjOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(txAngeVikt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValjKund)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbOrderLista)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSok))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVikt)
                    .addComponent(lbOrderLista)
                    .addComponent(lbValjKund))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSkapa)
                            .addComponent(btnAvbryt)
                            .addComponent(btnSok))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbValjOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txAngeVikt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        avbrytFraktsedel();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void txAngeViktKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAngeViktKeyReleased
       //Kollar så att vikt är ifyllt samt att en order har valts i comboboxen

       if (!txAngeVikt.getText().isEmpty() && cbValjOrder.getSelectedItem() != null) 
        {
            btnSkapa.setEnabled(true);
        }
        

    }//GEN-LAST:event_txAngeViktKeyReleased

    private void btnSkapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaActionPerformed
        //Omvandlar resultatet från getSelectedItem() till en sträng
        String cbVal = (String) cbValjOrder.getSelectedItem();
        
        //Sparar vikten som angivits i variabeln txtVikt
        String txtVikt = txAngeVikt.getText();
        
        //Säkerställer att valet var avsiktligt
        int val = JOptionPane.showConfirmDialog(null, "Vill du skapa fraktsedeln?", "Skapa fraktsedel", JOptionPane.YES_NO_OPTION );
        
        if(val == JOptionPane.YES_OPTION)
        {
           //Skickar med informationen till klassen SkrivUtFraktsedel
            new SkrivUtFraktsedel( cbVal, txtVikt).setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_btnSkapaActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
       fyllTextArea();
    }//GEN-LAST:event_btnSokActionPerformed
    
    private void avbrytFraktsedel()
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
    
    private void fyllICombobox()
    {
        //SQL-fråga för att hämta OrderID från databasen
         try{
        ArrayList<HashMap<String, String>> allaOrderar = Main.idb.fetchRows("SELECT OrderID, KundID FROM Orders WHERE Status = 'Redo'");
                  
        //Går igenom listan 
                for(HashMap<String, String> order : allaOrderar){
                
            // Hämta orderId från listan och sparar det i en sträng
            String orderID = order.get("OrderID");
            String kundID = order.get("KundID");
            
            //Lägger till OrderID i comboboxen
            if(kundID != null)
            {
                cbValjOrder.addItem(orderID); 
            }
             
           
                }}
                    
              
        catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }
    }
    
    private void fyllTextArea()
    {
        String valdOrder = (String) cbValjOrder.getSelectedItem();
        txAInformation.setText("");
        try
        {
            String valdKund = Main.idb.fetchSingle("Select KundID from Orders where OrderID = '" + valdOrder + "' ");
            String namn = Main.idb.fetchSingle("Select Namn from Kund where KundID = '"+ valdKund +"'");
            String enamn = Main.idb.fetchSingle("Select Efternamn from Kund where KundID = '"+ valdKund +"'");
            String adress = Main.idb.fetchSingle("Select Adress from Kund where KundID = '"+ valdKund +"'");
            String pNummer = Main.idb.fetchSingle("Select Postnummer from Kund where KundID = '"+ valdKund +"'");
            String ort = Main.idb.fetchSingle("Select ort from Kund where KundID = '"+ valdKund +"'");
           txAInformation.append(namn + " " + enamn + "\n" + adress +  "\n" + pNummer + " " + ort);
        }
        
        catch(InfException e)
        {
            JOptionPane.showMessageDialog(null, "Ajdå!");
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
    private javax.swing.JButton btnSok;
    private javax.swing.JComboBox<String> cbValjOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbOrderLista;
    private javax.swing.JLabel lbValjKund;
    private javax.swing.JLabel lbVikt;
    private javax.swing.JTextArea txAInformation;
    private javax.swing.JTextField txAngeVikt;
    // End of variables declaration//GEN-END:variables
}
