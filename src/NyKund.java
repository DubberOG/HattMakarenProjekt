
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
public class NyKund extends javax.swing.JFrame {


    
    /**
     * Creates new form NyKund
     */
    public NyKund() {
        initComponents();
        // forstätt fylla i för ev comboboxar
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistreraKund = new javax.swing.JButton();
        txtFornamn = new javax.swing.JTextField();
        lblFornamn = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblAdress = new javax.swing.JLabel();
        lblPostNummer = new javax.swing.JLabel();
        lblOrt = new javax.swing.JLabel();
        lblTelefonnummer = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        txtEfternamn = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtPostNummer = new javax.swing.JTextField();
        txtOrt = new javax.swing.JTextField();
        txtTelefonnummer = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        lblFyllIUppgifterOmKund = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistreraKund.setText("Registrera kund");
        btnRegistreraKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraKundActionPerformed(evt);
            }
        });

        txtFornamn.setColumns(5);

        lblFornamn.setText("Förnamn");

        lblEfternamn.setText("Efternamn");

        lblAdress.setText("Adress");

        lblPostNummer.setText("Postnummer");

        lblOrt.setText("Ort");

        lblTelefonnummer.setText("Telefonnummer");

        lblEpost.setText("Epost");

        txtEfternamn.setColumns(5);

        txtAdress.setColumns(5);
        txtAdress.setToolTipText("");

        txtPostNummer.setColumns(5);
        txtPostNummer.setToolTipText("");

        txtOrt.setColumns(5);
        txtOrt.setToolTipText("");

        txtTelefonnummer.setColumns(5);
        txtTelefonnummer.setToolTipText("");

        txtEpost.setColumns(5);
        txtEpost.setToolTipText("");

        lblFyllIUppgifterOmKund.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblFyllIUppgifterOmKund.setText("Fyll i uppgifter om kund");

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
                .addGap(27, 27, 27)
                .addComponent(btnTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistreraKund)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblFyllIUppgifterOmKund))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEpost)
                            .addComponent(lblTelefonnummer)
                            .addComponent(lblOrt)
                            .addComponent(lblPostNummer)
                            .addComponent(lblAdress)
                            .addComponent(lblEfternamn)
                            .addComponent(lblFornamn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPostNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblFyllIUppgifterOmKund)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFornamn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEfternamn)
                    .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdress)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostNummer)
                    .addComponent(txtPostNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrt)
                    .addComponent(txtOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonnummer)
                    .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpost)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistreraKund)
                    .addComponent(btnTillbaka))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraKundActionPerformed

        try {
          if (Validering.txtFaltTomt(txtFornamn) && Validering.txtFaltTomt(txtEfternamn) && 
                  Validering.txtFaltTomt(txtAdress) && Validering.txtFaltTomt(txtPostNummer) && 
                  Validering.txtFaltTomt(txtOrt) && Validering.txtFaltTomt(txtTelefonnummer) && 
                  Validering.txtEpostKontroll(txtEpost)){
            String id = Main.idb.getAutoIncrement("Kund", "KundID");
            String namn = txtFornamn.getText();
            String efternamn = txtEfternamn.getText();
            String adress = txtAdress.getText();
            String postnummer = txtPostNummer.getText();
            String ort = txtOrt.getText();
            String telefonnummer = txtTelefonnummer.getText();
            String email = txtEpost.getText();


            //Koppla validering så att det inte blir dubbla värden
            String nyKund = id+",'"+namn+"',"+"'"+efternamn+"',"+"'"+email+"',"+"'"+telefonnummer+"',"+"'"+adress+"',"+"'"+ort+"',"+"'"+postnummer+"'";
            String nyKundFraga = "INSERT INTO Kund (KundID, Namn, Efternamn, Email, Telefon, Adress, Ort, Postnummer) VALUES ("+nyKund+")";
            Main.idb.insert(nyKundFraga);
            JOptionPane.showMessageDialog(null, "En ny kund är registrerad!");
            
        }}
        catch  (InfException e){
            System.out.println ("internt felmedelande:" + e.getMessage());
        }
                
    }//GEN-LAST:event_btnRegistreraKundActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        new KundMeny().setVisible(true); 
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
            java.util.logging.Logger.getLogger(NyKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyKund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NyKund().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraKund;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblFyllIUppgifterOmKund;
    private javax.swing.JLabel lblOrt;
    private javax.swing.JLabel lblPostNummer;
    private javax.swing.JLabel lblTelefonnummer;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextField txtOrt;
    private javax.swing.JTextField txtPostNummer;
    private javax.swing.JTextField txtTelefonnummer;
    // End of variables declaration//GEN-END:variables
}
