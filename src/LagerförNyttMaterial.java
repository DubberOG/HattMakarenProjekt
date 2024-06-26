/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import oru.inf.InfException;
import javax.swing.JOptionPane;
/**
 *
 * @author oliviacleve
 */
public class LagerförNyttMaterial extends javax.swing.JFrame {

    /**
     * Creates new form LagerförNyttMaterial
     */
    public LagerförNyttMaterial() {
        initComponents();
        fyllComboBox();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        cbValjTyp = new javax.swing.JComboBox<>();
        lblVäljTyp = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        txtFärg = new javax.swing.JTextField();
        lblFärg = new javax.swing.JLabel();
        txtPris = new javax.swing.JTextField();
        lblPris = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        btnLäggTill = new javax.swing.JButton();
        txtAntal = new javax.swing.JTextField();
        lblAntal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblRubrik.setText("Fyll i värden för att lagerföra nytt material");

        lblVäljTyp.setText("Välj typ:");

        txtNamn.setColumns(5);

        lblNamn.setText("Ange namn:");

        txtFärg.setColumns(5);

        lblFärg.setText("Ange färg:");

        txtPris.setColumns(5);

        lblPris.setText("Ange pris per enhet:");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnLäggTill.setText("Lägg till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });

        txtAntal.setColumns(5);

        lblAntal.setText("Antal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addGap(211, 211, 211)
                        .addComponent(btnLäggTill))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblRubrik)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVäljTyp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbValjTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFärg)
                                    .addComponent(lblPris)
                                    .addComponent(lblNamn)
                                    .addComponent(lblAntal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFärg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAntal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblRubrik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVäljTyp)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbValjTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAntal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAntal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFärg)
                    .addComponent(txtFärg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPris))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLäggTill)
                    .addComponent(btnTillbaka))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
     {                                            
        setVisible(false);
        new Meny().setVisible(true);    }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
        läggTill();
    }//GEN-LAST:event_btnLäggTillActionPerformed

    
     public void fyllComboBox()
    {
        
        cbValjTyp.removeAllItems();

        HashSet<String> unikaTyper = new HashSet<>();

    try {
    
    ArrayList<HashMap<String, String>> allaTyper = Main.idb.fetchRows("SELECT Typ FROM Material");

    for (HashMap<String, String> enTyp : allaTyper) {
        String namnTyp = enTyp.get("Typ");
        unikaTyper.add(namnTyp);
    }

    for (String typ : unikaTyper) {
        cbValjTyp.addItem(typ);
    }
    
        }
        catch(InfException e)
        {
          JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
      public void läggTill()
    {
        String stringPris = txtPris.getText();
        double pris = Double.parseDouble(stringPris);
        int angeAntal = Integer.parseInt(txtAntal.getText());
            try
            {
               if(!txtNamn.getText().toString().isEmpty() && 
            !txtFärg.getText().toString().isEmpty() && 
            !txtPris.getText().toString().isEmpty()) 
                  
              
               
                   
               {
               String id = Main.idb.getAutoIncrement("Material", "MaterialID");

                Main.idb.insert("INSERT INTO material (MaterialID, Typ, Namn, Färg, PrisPerEnhet) " +
                "VALUES ('"+id+"', '"+cbValjTyp.getSelectedItem()+"', '"+txtNamn.getText()+"', '"+txtFärg.getText()+"', '"+pris+"')");

                
                String lagerID = Main.idb.getAutoIncrement("MaterialLager", "MaterialLagerID");
                
                Main.idb.insert("INSERT INTO materialLager (MaterialLagerID, MaterialID, Typ, Namn, Antal, PrisPerEnhet) " +
                "VALUES ('"+lagerID+"', '"+id+"', '"+cbValjTyp.getSelectedItem()+"', '"+txtNamn.getText()+"', '"+angeAntal+"', '"+pris+"')");
                      JOptionPane.showMessageDialog(null, "Nytt material har lagts till i lagret");
               }
            }
            catch(InfException e)
            {
                JOptionPane.showMessageDialog(null, e);
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
            java.util.logging.Logger.getLogger(LagerförNyttMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LagerförNyttMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LagerförNyttMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LagerförNyttMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LagerförNyttMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbValjTyp;
    private javax.swing.JLabel lblAntal;
    private javax.swing.JLabel lblFärg;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPris;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblVäljTyp;
    private javax.swing.JTextField txtAntal;
    private javax.swing.JTextField txtFärg;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPris;
    // End of variables declaration//GEN-END:variables
}
