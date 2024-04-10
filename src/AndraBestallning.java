
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;
import oru.inf.InfDB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alice
 */
public class AndraBestallning extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form AndraBestallning
     */
    public AndraBestallning(InfDB idb) {
        initComponents();
        this.idb = idb;
        
       
    }

    private AndraBestallning() {
        initComponents();
        
        try {
            idb = new InfDB("Hattmakaren", "3306", "hattmakaren","HTM123");
        fyllcbxOrderID();
        //fyllCbValjKund();
        //fyllCbValjProdukt();
        //fylliDatum();
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

        tfDatum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSpara = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        lbBestallning = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblProdukt = new javax.swing.JLabel();
        lblProdukt1 = new javax.swing.JLabel();
        lblOrderID = new javax.swing.JLabel();
        cbxOrderID = new javax.swing.JComboBox<>();
        txtProdukt = new javax.swing.JTextField();
        txtKund = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfDatum.setColumns(8);
        tfDatum.setText("xxxx-xx-xx");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Status");

        btnSpara.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSpara.setForeground(new java.awt.Color(51, 255, 51));
        btnSpara.setText("Spara Ändringar");
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
        lbBestallning.setText("Ändra beställning");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Kund ID");

        lblProdukt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProdukt.setText("Produkt ID");

        lblProdukt1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProdukt1.setText("Datum");

        lblOrderID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblOrderID.setText("Ange order ID");

        cbxOrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrderIDActionPerformed(evt);
            }
        });

        txtProdukt.setColumns(5);

        txtKund.setColumns(5);

        txtStatus.setColumns(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnSpara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btnAvbryt)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lbBestallning)
                .addGap(0, 199, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(cbxOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProdukt)
                            .addComponent(lblProdukt1))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdukt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBestallning)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderID)
                    .addComponent(cbxOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdukt)
                    .addComponent(txtProdukt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdukt1)
                    .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpara)
                    .addComponent(btnAvbryt))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
//if(Validering.valideraKundID(txtKund, idb)&& Validering.txtFaltTomt(txtKund)&& Validering.valideraProduktID(txtProdukt, idb)&& Validering.txtFaltTomt(txtProdukt)&& Validering.datumKontroll(tfDatum)&& Validering.txtFaltTomt(txtStatus)){
        try{ 
            if(Validering.valideraKundID(txtKund, idb)&& Validering.txtFaltTomt(txtKund)&& Validering.valideraProduktID(txtProdukt, idb)&& Validering.txtFaltTomt(txtProdukt)&& Validering.datumKontroll(tfDatum)&& Validering.txtFaltTomt(txtStatus)){

                String fragaOrder = "SELECT * FROM Orders";

            ArrayList<HashMap<String, String>> Order = idb.fetchRows(fragaOrder);

           String valdOrder = cbxOrderID.getSelectedItem().toString();
           String nyttKund = txtKund.getText();
           String nyttProdukt = txtProdukt.getText();
           String nyttDatum = tfDatum.getText();
           String nyttStatus = txtStatus.getText();
         
           
           String updateQueryDatum = "UPDATE Orders SET Datum = '" + nyttDatum + "' WHERE OrderID = '" + valdOrder + "'";
           
                 idb.update(updateQueryDatum);
       
            String updateQueryStatus = "UPDATE Orders SET Status = '" + nyttStatus + "' WHERE OrderID = '" + valdOrder + "'";
           
                 idb.update(updateQueryStatus);
                
            String updateQueryKund = "UPDATE Orders SET KundID = '" + nyttKund + "' WHERE OrderID = '" + valdOrder + "'";
           
                 idb.update(updateQueryKund);
                 
                 
            String updateQueryProdukt = "UPDATE Orders SET ProduktID = '" + nyttProdukt + "' WHERE OrderID = '" + valdOrder + "'";
          
                 idb.update(updateQueryProdukt);
                
                 
            JOptionPane.showMessageDialog(null, " Informationen har ändrats." );
           }     
            }catch(InfException ettUndantag){

            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmedelande" + ettUndantag.getMessage());    
       
                   }

    }//GEN-LAST:event_btnSparaActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        avbrytBestallning();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void cbxOrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrderIDActionPerformed

     
     ArrayList<HashMap<String, String>> orderIDLista = new ArrayList<HashMap<String, String>>();
 
      try{
      
          String valdOrder = cbxOrderID.getSelectedItem().toString();
          String fraga = "SELECT OrderID, Datum, Status, KundID, ProduktID FROM Orders";
          orderIDLista = idb.fetchRows(fraga);
          
          for(HashMap<String, String> enOrder : orderIDLista){
        
              String orderIDFranLista = enOrder.get("OrderID");
                 
                if (orderIDFranLista.equals(valdOrder)){
                    //Sätter in anställningsdatum för agenten i anst.dat.rutan
                 tfDatum.setText(enOrder.get("Datum"));
                 }
                 
                 if (orderIDFranLista.equals(valdOrder)){
                    //Sätter in namnet för agenten i namnrutan
                 txtStatus.setText(enOrder.get("Status"));
                 }
                 
                if (orderIDFranLista.equals(valdOrder)){
                    //Sätter in telefonnumret för agenten i telefonrutan
                 txtKund.setText(enOrder.get("KundID"));
                }
                
                if (orderIDFranLista.equals(valdOrder)){
                    //Sätter in epost för agenten i epostrutan
                 txtProdukt.setText(enOrder.get("ProduktID"));
                }
    
                     
                    
                   }
               
                }catch (InfException UndantagEn) {
                    JOptionPane.showMessageDialog(null, "Databasfel!");
                    System.out.println("Internt felmeddelande" + UndantagEn.getMessage());
                    
                }
                catch (Exception UndantagEn) {
                    JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
                    System.out.println("Internt felmeddelande" + UndantagEn.getMessage());
          }
     
     
     
     
    }//GEN-LAST:event_cbxOrderIDActionPerformed

    private void fyllcbxOrderID() {
    String fraga = "SELECT OrderID FROM Orders";
    ArrayList<String> allaOrderID;
    try {
        allaOrderID = idb.fetchColumn(fraga);
        for(String ettID : allaOrderID) {
            cbxOrderID.addItem(ettID);
        }
       
        }
      catch (InfException ettUndantag)  {
          JOptionPane.showMessageDialog(null, "Databasfel");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
          
    }
}
         private void avbrytBestallning()
     {
          int val = JOptionPane.showConfirmDialog(null, "Vill du avbryta ändring av beställningen?", "Avbryt", JOptionPane.YES_NO_OPTION);
          if(val == JOptionPane.YES_OPTION)
          {
              dispose();
              new Meny(idb).setVisible(true);
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
            java.util.logging.Logger.getLogger(AndraBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraBestallning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraBestallning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnSpara;
    private javax.swing.JComboBox<String> cbxOrderID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbBestallning;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblProdukt;
    private javax.swing.JLabel lblProdukt1;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextField txtKund;
    private javax.swing.JTextField txtProdukt;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
