
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author William
 */
public class LaggTillProdukt extends javax.swing.JFrame {
    
    private InfDB idb;
    /**
     * Creates new form LaggTillBestallning
     * @param idb
     */
    public LaggTillProdukt(InfDB idb) {
        initComponents();
        this.idb = idb;

    }
    /**
     * Creates new form LaggTillProdukt
     */
    public LaggTillProdukt() {
        initComponents();
    }
    
    private void fyllCbValjForm() {
            try{
        ArrayList<HashMap<String, String>> allaNamn = idb.fetchRows("SELECT Namn FROM ProduktLager");
                  
                for(HashMap<String, String> namnet : allaNamn){
            
       
            String namn = namnet.get("Namn");
            
            // Skapa en sträng som innehåller namn och lägg till i comboboxen
            cbForm.addItem(namn);    
           
                }}  
            catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }}
    
    private void fyllCbValjTyg() {
            try{
        ArrayList<HashMap<String, String>> allaNamn = idb.fetchRows("SELECT Namn FROM TygLager");
                  
                for(HashMap<String, String> namnet : allaNamn){
            
       
            String namn = namnet.get("Namn");
            
            // Skapa en sträng som innehåller namn och lägg till i comboboxen
            cbTyg.addItem(namn);    
           
                }}  
            catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }}
    
    private void fyllCbValjUtsmyckning() {
            try{
        ArrayList<HashMap<String, String>> allaNamn = idb.fetchRows("SELECT Namn FROM UtsmyckningsLager");
                  
                for(HashMap<String, String> namnet : allaNamn){
            
       
            String namn = namnet.get("Namn");
            
            // Skapa en sträng som innehåller namn och lägg till i comboboxen
            cbSmycke.addItem(namn);    
           
                }}  
            catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbForm = new javax.swing.JComboBox<>();
        lblValjForm = new javax.swing.JLabel();
        cbTyg = new javax.swing.JComboBox<>();
        lblValjTyg = new javax.swing.JLabel();
        cbSmycke = new javax.swing.JComboBox<>();
        lblValjSmycke = new javax.swing.JLabel();
        txtAtgang = new javax.swing.JTextField();
        txtAntal = new javax.swing.JTextField();
        lblValjAntal = new javax.swing.JLabel();
        lblValjÅtgång = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnTaBort = new javax.swing.JButton();
        btnSpara = new javax.swing.JButton();
        btnLaggTill = new javax.swing.JButton();
        lblSkapaEnProdukt = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFormActionPerformed(evt);
            }
        });

        lblValjForm.setText("Välj form");

        cbTyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTygActionPerformed(evt);
            }
        });

        lblValjTyg.setText("Välj Tyg");

        cbSmycke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSmyckeActionPerformed(evt);
            }
        });

        lblValjSmycke.setText("Välj Smycke");

        txtAntal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAntalActionPerformed(evt);
            }
        });

        lblValjAntal.setText("Välj Antal");

        lblValjÅtgång.setText("Välj Åtgång i meter");

        jScrollPane1.setViewportView(jList1);

        btnTaBort.setText("Ta bort val");

        btnSpara.setText("Spara Produkt");

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        lblSkapaEnProdukt.setText("Skapa en produkt");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbTyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(lblValjTyg))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbSmycke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValjSmycke)
                                    .addComponent(btnLaggTill)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSkapaEnProdukt)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(lblValjForm))
                                        .addComponent(cbForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAtgang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAntal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValjÅtgång)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblValjAntal)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSpara)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnTaBort)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSkapaEnProdukt)
                .addGap(33, 33, 33)
                .addComponent(lblValjForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValjTyg)
                            .addComponent(lblValjÅtgång))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAtgang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValjSmycke)
                            .addComponent(lblValjAntal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSmycke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAntal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTill)
                    .addComponent(btnSpara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTaBort)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFormActionPerformed

    private void cbTygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTygActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTygActionPerformed

    private void cbSmyckeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSmyckeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSmyckeActionPerformed

    private void txtAntalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAntalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAntalActionPerformed

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        // TODO add your handling code here:
        String atgang = txtAtgang.getText();
        String antal = txtAntal.getText();
    }//GEN-LAST:event_btnLaggTillActionPerformed

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
            java.util.logging.Logger.getLogger(LaggTillProdukt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillProdukt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillProdukt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillProdukt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaggTillProdukt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JComboBox<String> cbForm;
    private javax.swing.JComboBox<String> cbSmycke;
    private javax.swing.JComboBox<String> cbTyg;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSkapaEnProdukt;
    private javax.swing.JLabel lblValjAntal;
    private javax.swing.JLabel lblValjForm;
    private javax.swing.JLabel lblValjSmycke;
    private javax.swing.JLabel lblValjTyg;
    private javax.swing.JLabel lblValjÅtgång;
    private javax.swing.JTextField txtAntal;
    private javax.swing.JTextField txtAtgang;
    // End of variables declaration//GEN-END:variables
}
