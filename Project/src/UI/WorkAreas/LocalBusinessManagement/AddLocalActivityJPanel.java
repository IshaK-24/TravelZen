/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.LocalBusinessManagement;

import Model.Hotel.Room;
import Model.LocalBusiness.LocalActivity;
import Model.LocalBusiness.LocalBusiness;
import Model.Travel;
import static Utilities.Validations.validateName;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author minal
 */
public class AddLocalActivityJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Travel travel;
    private LocalBusiness localBusiness;
    ArrayList<LocalActivity> localActivity = new ArrayList();
    ArrayList<LocalBusiness> localbussinessname = new ArrayList();
    /**
     * Creates new form AddLocalActivityJPanel
     */
    public AddLocalActivityJPanel(JPanel userProcessContainer, Travel travel, LocalBusiness localBusiness) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
                this.travel = travel;
        this.localBusiness = localBusiness;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtLoc = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        optionsCurr = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Local Activity Type: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Local Activity Description:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Location:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Cost:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        txtType.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 230, 40));

        txtDesc.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 230, 40));

        txtLoc.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 230, 40));

        txtCost.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 230, 40));

        btnCancel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 90, 50));

        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 80, 50));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Currency:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 110, 40));

        optionsCurr.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        optionsCurr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNY", "EUR", "INR", "USD" }));
        add(optionsCurr, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 230, 40));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel6.setText("Add Local Activity");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        txtCost.setText("");
        txtDesc.setText("");
        txtLoc.setText("");
        txtType.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String type = txtType.getText();
        String description = txtDesc.getText();
        String location = txtLoc.getText();
        int cost = Integer.parseInt(txtCost.getText());
        if(type.isEmpty() || description.isEmpty() || location.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Please check if all fields are filled before processing", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
                if(validateName(type)){
            JOptionPane.showMessageDialog(this, "Type should be between 3 to 15 length and should not contain any special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
                                if(validateName(description)){
            JOptionPane.showMessageDialog(this, "Type should be between 3 to 15 length and should not contain any special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
                                if(validateName(location)){
            JOptionPane.showMessageDialog(this, "Type should be between 3 to 15 length and should not contain any special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }   
                                
        LocalActivity la = new LocalActivity();
        la.setCost(cost);
        la.setDescription(description);
        la.setLocation(location);
        la.setType(type);
        la.setCurrency(String.valueOf(optionsCurr.getSelectedItem()));
        localActivity.add(la);
        localbussinessname=travel.getLocalBusinessDirectory().getLocalBusinessList();
        localbussinessname.get(0).setLocalActivity(localActivity);
        JOptionPane.showMessageDialog(this, "Local Activity added successfuly!");
        txtCost.setText("");
        txtDesc.setText("");
        txtLoc.setText("");
        txtType.setText("");
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> optionsCurr;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
