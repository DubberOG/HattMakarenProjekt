
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author soficarlsson
 */
public class ReklameraOrder extends javax.swing.JFrame {

    /**
     * Creates new form ReklameraOrder
     */
    public ReklameraOrder() {
        initComponents();
        fyllcbxOrderID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrderID = new javax.swing.JLabel();
        cbxOrderID = new javax.swing.JComboBox<>();
        lbBestallning = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnÄndraStatus = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOrderID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblOrderID.setText("Ange order ID");

        lbBestallning.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBestallning.setText("Ändra status");

        lblStatus.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblStatus.setText("Ange status");

        btnÄndraStatus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnÄndraStatus.setText("Ändra status");
        btnÄndraStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraStatusActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekräftad", "Tillverkas", "Redo", "Skickad", "Reklamerad", "Avbruten" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnÄndraStatus)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(lbBestallning))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lblOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnTillbaka)))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbBestallning)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderID)
                    .addComponent(cbxOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnÄndraStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÄndraStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraStatusActionPerformed
try {
        String valdOrder = cbxOrderID.getSelectedItem().toString();
        String valdStatus = cbStatus.getSelectedItem().toString();

        String fraga = "UPDATE Orders SET Status = '" + valdStatus + "' WHERE OrderID = '" + valdOrder + "'";
        Main.idb.update(fraga);
       
        
     JOptionPane.showMessageDialog(null, "Statusen har ändrats.");
    } catch (InfException ettUndantag) {
        JOptionPane.showMessageDialog(null, "Databasfel!");
        System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
    }
    }//GEN-LAST:event_btnÄndraStatusActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        new Meny().setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed
    private void fyllcbxOrderID() {
    String fraga = "SELECT OrderID FROM Orders";
    ArrayList<String> allaOrderID;
    try {
        allaOrderID = Main.idb.fetchColumn(fraga);
        for(String ettID : allaOrderID) {
            cbxOrderID.addItem(ettID);
        }
       
        }
      catch (InfException ettUndantag)  {
          JOptionPane.showMessageDialog(null, "Databasfel");
          System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
          
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
            java.util.logging.Logger.getLogger(ReklameraOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReklameraOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReklameraOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReklameraOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReklameraOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnÄndraStatus;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbxOrderID;
    private javax.swing.JLabel lbBestallning;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}