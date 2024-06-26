import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author michelle
 */
public class SkrivUtFaktura extends javax.swing.JFrame {

    private static String cbValet;
    private static String txtFakturaNr;
    
   
    public SkrivUtFaktura(String cbValet, String txtFakturaNr ) {
 
        initComponents();
        this.cbValet = cbValet;
        this.txtFakturaNr = txtFakturaNr;
        fyllDatum();
        fyllDatumEnManad();
        fyllIText();

    }
    
    private void fyllDatum()
     {
         Date datum = new Date();
         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
         String dagensDatum = format.format(datum);
         lbDagensDatumVisa.setText(dagensDatum);
     }
    
    
    private void fyllDatumEnManad() {
    // Skapa ett Calendar-objekt och sätt det till dagens datum
    Calendar kalender = Calendar.getInstance();
    
    // Lägg till en månad till dagens datum
    kalender.add(Calendar.MONTH, 1);
    
    // Skapa ett SimpleDateFormat-objekt för att formatera datumet
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    // Konvertera datumet till en sträng
    String nyttDatum = format.format(kalender.getTime());
    
    // Sätt den nya datumsträngen till din lbDagensDatumVisa
    lbManadFramDatum.setText(nyttDatum);
}   
    
        private void fyllIText()
    {
        txAllinfo.setText("");

        try
        {
         String valdKund = Main.idb.fetchSingle("Select KundID from Orders where OrderID = '" + cbValet + "' ");
         String namn = Main.idb.fetchSingle("Select Namn from Kund where KundID = '"+ valdKund +"'");
         String enamn = Main.idb.fetchSingle("Select Efternamn from Kund where KundID = '"+ valdKund +"'");
         String adress = Main.idb.fetchSingle("Select Adress from Kund where KundID = '"+ valdKund +"'");
         String pNummer = Main.idb.fetchSingle("Select Postnummer from Kund where KundID = '"+ valdKund +"'");
         String ort = Main.idb.fetchSingle("Select Ort from Kund where KundID = '"+ valdKund +"'");
         String summa = Main.idb.fetchSingle("Select Pris from Orders where OrderID = '"+ cbValet +"'");
         //DENNA VART ALDRIG KLAR ArrayList<HashMap <String, String>> allaProdukter = Main.idb.fetchRows("Select ProduktID from ProdukterIOrder where OrderID ='" + cbValet +"'");
         
        
        lbKundNamnVisas.setText(namn + " "+  enamn);
        lbKundNummerVisas.setText(valdKund);
        lbFaktureringsadressVisas.setText(adress +", " + pNummer + ", " + ort);
        lbOrderNummerVisa.setText(cbValet);
        lbSummaVisas.setText(summa);
        lbAttBetalaVisas.setText(summa);
        lbSummaAttBetala2Visas.setText(summa);
        lbFakturaNrVisasHar.setText(txtFakturaNr);
        
        double summastr = Double.parseDouble(summa);
        double svar = summastr;
        double utanmoms = 0.75;
        double prisUtanMoms = svar * utanmoms;
        String prisUtanMomsVisas = Double.toString(prisUtanMoms);
        lbExklMomsVisas.setText(prisUtanMomsVisas);
        
        double svarMoms = summastr;
        double moms = 0.75;
        double prisMoms = svarMoms * moms;
        String MomsVisas = Double.toString(prisMoms);
        lbExklMomsVisas.setText(MomsVisas);
        
       //Denna vart aldrig klar txAllinfo.append("\nTest!");

        }
        
        catch(InfException e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Kunde inte hämta kunden");
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

        jLabel2 = new javax.swing.JLabel();
        lbOttosHattmakeriIgen = new javax.swing.JLabel();
        lbOrtFrån = new javax.swing.JLabel();
        lbOttosHattmakeri = new javax.swing.JLabel();
        lbDatum = new javax.swing.JLabel();
        lbDagensDatumVisa = new javax.swing.JLabel();
        PlusGiro = new javax.swing.JLabel();
        Förfallodatum = new javax.swing.JLabel();
        Bankgiro = new javax.swing.JLabel();
        btnSkrivUT = new javax.swing.JButton();
        lbFaktura = new javax.swing.JLabel();
        lbKundnummer = new javax.swing.JLabel();
        lbKundNummerVisas = new javax.swing.JLabel();
        lbFakturanummer = new javax.swing.JLabel();
        lbPlusGiroNummer = new javax.swing.JLabel();
        lbFrånAdressen = new javax.swing.JLabel();
        lbFakturaNrVisasHar = new javax.swing.JLabel();
        lbBangiroNummer = new javax.swing.JLabel();
        lbManadFramDatum = new javax.swing.JLabel();
        lbBetalningsvillkor = new javax.swing.JLabel();
        AttBetala = new javax.swing.JLabel();
        lbAttBetalaVisas = new javax.swing.JLabel();
        lbExlMoms = new javax.swing.JLabel();
        lbSumma = new javax.swing.JLabel();
        lbMomsbelopp = new javax.swing.JLabel();
        lbAttBetala2 = new javax.swing.JLabel();
        lbSummaVisas = new javax.swing.JLabel();
        lbExklMomsVisas = new javax.swing.JLabel();
        lbMomsVisas = new javax.swing.JLabel();
        lbSummaAttBetala2Visas = new javax.swing.JLabel();
        lbKundNamn = new javax.swing.JLabel();
        lbFaktureringsAdress = new javax.swing.JLabel();
        lbKundNamnVisas = new javax.swing.JLabel();
        lbFaktureringsadressVisas = new javax.swing.JLabel();
        lbOrderID = new javax.swing.JLabel();
        lbOrderNummerVisa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAllinfo = new javax.swing.JTextArea();
        lbProduktbeskrivning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbOttosHattmakeriIgen.setText("Ottos Hattmakeri");

        lbOrtFrån.setText("SE-702 82 Örebro");

        lbOttosHattmakeri.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbOttosHattmakeri.setText("Ottos Hattmakeri AB");

        lbDatum.setText("Datum:");

        lbDagensDatumVisa.setText("0000-00-00");

        PlusGiro.setText("PlusGiro");

        Förfallodatum.setText("Förfallodatum");

        Bankgiro.setText("Bankgiro");

        btnSkrivUT.setText("Skriv ut");
        btnSkrivUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkrivUTActionPerformed(evt);
            }
        });

        lbFaktura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbFaktura.setText("FAKTURA");

        lbKundnummer.setText("Kundnummer:");

        lbKundNummerVisas.setText("000");

        lbFakturanummer.setText("Fakturanummer");

        lbPlusGiroNummer.setText("123 481");

        lbFrånAdressen.setText("Fakultetsgatan 1");

        lbFakturaNrVisasHar.setText("00000");

        lbBangiroNummer.setText("444 88");

        lbManadFramDatum.setText("00000");

        lbBetalningsvillkor.setText("Betalningsvillkor: 30 dagar");

        AttBetala.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AttBetala.setText("Att betala SEK:");

        lbAttBetalaVisas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbAttBetalaVisas.setText("00000");

        lbExlMoms.setText("Exl. moms");

        lbSumma.setText("Summa");

        lbMomsbelopp.setText("Momsbelopp 25%");

        lbAttBetala2.setText("Att betala SEK");

        lbSummaVisas.setText("00000");

        lbExklMomsVisas.setText("00000");

        lbMomsVisas.setText("00000");

        lbSummaAttBetala2Visas.setText("00000");

        lbKundNamn.setText("Kundnamn:");

        lbFaktureringsAdress.setText("Faktureringsadress:");

        lbKundNamnVisas.setText("Carl Andersson");

        lbFaktureringsadressVisas.setText("Karlsdalsallén 120");

        lbOrderID.setText("OrderID");

        lbOrderNummerVisa.setText("000");

        txAllinfo.setColumns(20);
        txAllinfo.setRows(5);
        jScrollPane2.setViewportView(txAllinfo);

        lbProduktbeskrivning.setText("Produktbeskrivning:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lbExlMoms)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbExklMomsVisas))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lbSumma)
                            .addGap(69, 69, 69)
                            .addComponent(lbSummaVisas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMomsbelopp)
                            .addComponent(lbAttBetala2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSummaAttBetala2Visas)
                            .addComponent(lbMomsVisas))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbBetalningsvillkor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbOttosHattmakeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbProduktbeskrivning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFrånAdressen, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOttosHattmakeriIgen, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOrtFrån)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDatum)
                                    .addComponent(lbDagensDatumVisa))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bankgiro)
                                    .addComponent(Förfallodatum)
                                    .addComponent(PlusGiro)
                                    .addComponent(AttBetala))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbBangiroNummer)
                                    .addComponent(lbPlusGiroNummer)
                                    .addComponent(lbManadFramDatum)
                                    .addComponent(lbAttBetalaVisas)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbFaktura)
                                            .addComponent(lbKundNamn))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbFakturanummer)
                                                    .addComponent(lbFakturaNrVisasHar))
                                                .addGap(35, 35, 35))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lbFaktureringsAdress)
                                                .addGap(18, 18, 18))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbKundNamnVisas)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbFaktureringsadressVisas)
                                        .addGap(27, 27, 27)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbOrderNummerVisa)
                                    .addComponent(lbOrderID)
                                    .addComponent(lbKundNummerVisas)
                                    .addComponent(lbKundnummer)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnSkrivUT)))))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOttosHattmakeri)
                            .addComponent(lbFaktura)))
                    .addComponent(btnSkrivUT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(657, 657, 657))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDatum)
                            .addComponent(lbKundnummer)
                            .addComponent(lbFakturanummer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDagensDatumVisa)
                            .addComponent(lbKundNummerVisas)
                            .addComponent(lbFakturaNrVisasHar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbKundNamn)
                            .addComponent(lbFaktureringsAdress)
                            .addComponent(lbOrderID))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbKundNamnVisas)
                            .addComponent(lbFaktureringsadressVisas)
                            .addComponent(lbOrderNummerVisa))
                        .addGap(18, 18, 18)
                        .addComponent(lbOttosHattmakeriIgen, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFrånAdressen, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbOrtFrån)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlusGiro)
                            .addComponent(lbPlusGiroNummer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bankgiro)
                            .addComponent(lbBangiroNummer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Förfallodatum)
                            .addComponent(lbManadFramDatum)
                            .addComponent(lbBetalningsvillkor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AttBetala)
                            .addComponent(lbAttBetalaVisas)
                            .addComponent(lbProduktbeskrivning))
                        .addGap(507, 507, 507)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSumma)
                    .addComponent(lbSummaVisas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbExlMoms)
                    .addComponent(lbExklMomsVisas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMomsbelopp)
                    .addComponent(lbMomsVisas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAttBetala2)
                    .addComponent(lbSummaAttBetala2Visas))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(323, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkrivUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkrivUTActionPerformed
        JOptionPane.showMessageDialog(null, "HITTA INGEN SKRIVARE!");
        dispose();
    }//GEN-LAST:event_btnSkrivUTActionPerformed
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
            java.util.logging.Logger.getLogger(SkrivUtFaktura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkrivUtFaktura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkrivUtFaktura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkrivUtFaktura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SkrivUtFaktura(cbValet, txtFakturaNr).setVisible(true);
            }
        });
     
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AttBetala;
    private javax.swing.JLabel Bankgiro;
    private javax.swing.JLabel Förfallodatum;
    private javax.swing.JLabel PlusGiro;
    private javax.swing.JButton btnSkrivUT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAttBetala2;
    private javax.swing.JLabel lbAttBetalaVisas;
    private javax.swing.JLabel lbBangiroNummer;
    private javax.swing.JLabel lbBetalningsvillkor;
    private javax.swing.JLabel lbDagensDatumVisa;
    private javax.swing.JLabel lbDatum;
    private javax.swing.JLabel lbExklMomsVisas;
    private javax.swing.JLabel lbExlMoms;
    private javax.swing.JLabel lbFaktura;
    private javax.swing.JLabel lbFakturaNrVisasHar;
    private javax.swing.JLabel lbFakturanummer;
    private javax.swing.JLabel lbFaktureringsAdress;
    private javax.swing.JLabel lbFaktureringsadressVisas;
    private javax.swing.JLabel lbFrånAdressen;
    private javax.swing.JLabel lbKundNamn;
    private javax.swing.JLabel lbKundNamnVisas;
    private javax.swing.JLabel lbKundNummerVisas;
    private javax.swing.JLabel lbKundnummer;
    private javax.swing.JLabel lbManadFramDatum;
    private javax.swing.JLabel lbMomsVisas;
    private javax.swing.JLabel lbMomsbelopp;
    private javax.swing.JLabel lbOrderID;
    private javax.swing.JLabel lbOrderNummerVisa;
    private javax.swing.JLabel lbOrtFrån;
    private javax.swing.JLabel lbOttosHattmakeri;
    private javax.swing.JLabel lbOttosHattmakeriIgen;
    private javax.swing.JLabel lbPlusGiroNummer;
    private javax.swing.JLabel lbProduktbeskrivning;
    private javax.swing.JLabel lbSumma;
    private javax.swing.JLabel lbSummaAttBetala2Visas;
    private javax.swing.JLabel lbSummaVisas;
    private javax.swing.JTextArea txAllinfo;
    // End of variables declaration//GEN-END:variables
}
