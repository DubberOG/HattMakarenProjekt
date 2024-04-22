import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
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
public class AvbrytBeställning extends javax.swing.JFrame {

    /**
     * Creates new form AvbrytBeställning
     */
    public AvbrytBeställning() {
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

        lbTitel = new javax.swing.JLabel();
        btnSök = new javax.swing.JToggleButton();
        lbTitel2 = new javax.swing.JLabel();
        btnAvbrytOrder = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBeställningar = new javax.swing.JTextArea();
        cbVälj = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitel.setText("Avbryt beställning");

        btnSök.setText("Sök");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });

        lbTitel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTitel2.setText("Sök beställning");

        btnAvbrytOrder.setForeground(new java.awt.Color(255, 51, 51));
        btnAvbrytOrder.setText("Anullera");
        btnAvbrytOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytOrderActionPerformed(evt);
            }
        });

        listBeställningar.setColumns(20);
        listBeställningar.setRows(5);
        jScrollPane1.setViewportView(listBeställningar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lbTitel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSök, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(cbVälj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvbrytOrder))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(lbTitel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSök)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAvbrytOrder)
                            .addComponent(cbVälj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed
       sökBeställning();
    }//GEN-LAST:event_btnSökActionPerformed

    private void btnAvbrytOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytOrderActionPerformed
    
    }//GEN-LAST:event_btnAvbrytOrderActionPerformed

    private void sökBeställning()
    {

        try
        {
         ArrayList<HashMap<String, String>> allaBeställningar = Main.idb.fetchRows("Select OrderID from Orders where status = 'bekräftad'");
         for(HashMap <String, String> beställningar : allaBeställningar)
         {
             String orderID = beställningar.get("OrderID");
             String kundID = Main.idb.fetchSingle("Select KundID from Orders where OrderID = '" + orderID + "'");
             String namn = Main.idb.fetchSingle("Select Namn from Kund where KundID = '" + kundID + "'");
             String produktID = Main.idb.fetchSingle("Select ProduktID from ProdukterIOrder where OrdersID = '" + orderID + "'");
             String produktNamn = Main.idb.fetchSingle("SELECT Namn FROM Produkt WHERE ProduktID = '" + produktID + "'");
             
             String information = orderID + " "+ namn + " "+ produktNamn;
             listBeställningar.append(information);
             
             cbVälj.addItem(orderID);
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
            java.util.logging.Logger.getLogger(AvbrytBeställning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvbrytBeställning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvbrytBeställning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvbrytBeställning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvbrytBeställning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAvbrytOrder;
    private javax.swing.JToggleButton btnSök;
    private javax.swing.JComboBox<String> cbVälj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitel;
    private javax.swing.JLabel lbTitel2;
    private javax.swing.JTextArea listBeställningar;
    // End of variables declaration//GEN-END:variables
}
