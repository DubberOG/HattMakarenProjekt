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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtOrt = new javax.swing.JTextField();
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
        btnLagerforHatt = new javax.swing.JButton();
        txtNamn = new javax.swing.JTextField();
        cbValjTyg = new javax.swing.JComboBox<>();
        cbValjUtsmyckning = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtOrt.setColumns(5);
        txtOrt.setToolTipText("");

        lblNamn.setText("Namn");

        lblStorlek.setText("Storlek");

        txtUtsmyckningsantal.setColumns(5);
        txtUtsmyckningsantal.setToolTipText("");

        lblAntalTimmar.setText("Arbettimmar");

        lblLaggTillHattILager.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblLaggTillHattILager.setText("Lägg till hatt i lager");

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

        btnLagerforHatt.setText("Lagerför hatt");
        btnLagerforHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLagerforHattActionPerformed(evt);
            }
        });

        txtNamn.setColumns(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUtsmyckningsAntal)
                            .addComponent(lblValjUtsmyckning)
                            .addComponent(lblAntalMeter)
                            .addComponent(lblValjTyg)
                            .addComponent(lblAntalTimmar)
                            .addComponent(lblStorlek)
                            .addComponent(lblNamn)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAntalTimmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUtsmyckningsantal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnLagerforHatt)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbValjTyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbValjUtsmyckning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLaggTillHattILager)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLaggTillHattILager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLagerforHatt)
                        .addGap(26, 26, 26))
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
                            .addComponent(txtAntalTimmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValjTyg)
                            .addComponent(cbValjTyg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAntalMeter)
                            .addComponent(txtOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblValjUtsmyckning)
                                    .addComponent(cbValjUtsmyckning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUtsmyckningsAntal)
                                    .addComponent(txtUtsmyckningsantal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnTillbaka)))
                        .addGap(6, 6, 6))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        new KundMeny(idb).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnLagerforHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLagerforHattActionPerformed

        try {
            if (Validering.txtFaltTomt(txtNamn) && Validering.txtFaltTomt(txtStorlek) &&
                Validering.txtFaltTomt(txtAntalTimmar) && Validering.txtFaltTomt(txtPostNummer) &&
                Validering.txtFaltTomt(txtOrt) && Validering.txtFaltTomt(txtTelefonnummer) &&
                Validering.txtEpostKontroll(txtUtsmyckningsantal)){
                String id = idb.getAutoIncrement("Kund", "KundID");
                String namn = txtNamn.getText();
                String efternamn = txtStorlek.getText();
                String adress = txtAntalTimmar.getText();
                String postnummer = txtPostNummer.getText();
                String ort = txtOrt.getText();
                String telefonnummer = txtTelefonnummer.getText();
                String email = txtUtsmyckningsantal.getText();

                //Koppla validering så att det inte blir dubbla värden
                String nyKund = id+",'"+namn+"',"+"'"+efternamn+"',"+"'"+email+"',"+"'"+telefonnummer+"',"+"'"+adress+"',"+"'"+ort+"',"+"'"+postnummer+"'";
                String nyKundFraga = "INSERT INTO Kund (KundID, Namn, Efternamn, Email, Telefon, Adress, Ort, Postnummer) VALUES ("+nyKund+")";
                idb.insert(nyKundFraga);
                JOptionPane.showMessageDialog(null, "En ny kund är registrerad!");

            }}
            catch  (InfException e){
                System.out.println ("internt felmedelande:" + e.getMessage());
            }

    }//GEN-LAST:event_btnLagerforHattActionPerformed

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
    private javax.swing.JButton btnLagerforHatt;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbValjTyg;
    private javax.swing.JComboBox<String> cbValjUtsmyckning;
    private javax.swing.JLabel lblAntalMeter;
    private javax.swing.JLabel lblAntalTimmar;
    private javax.swing.JLabel lblLaggTillHattILager;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblStorlek;
    private javax.swing.JLabel lblUtsmyckningsAntal;
    private javax.swing.JLabel lblValjTyg;
    private javax.swing.JLabel lblValjUtsmyckning;
    private javax.swing.JTextField txtAntalTimmar;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtOrt;
    private javax.swing.JTextField txtStorlek;
    private javax.swing.JTextField txtUtsmyckningsantal;
    // End of variables declaration//GEN-END:variables
}
