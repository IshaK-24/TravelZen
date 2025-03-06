/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.Customer;


import Model.Roles.Customer;
import Model.TransportAgency.Route;
import Model.Travel;
import Model.TravelAgency.Plan;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minal
 */
public class CustomerBookTripJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerBookTripJPanel
     */
    
    private JPanel userProcessContainer;
    private Travel travel;
    Customer customer;
    DefaultTableModel dtm;
    
    public CustomerBookTripJPanel(JPanel userProcessContainer, Travel travel, Customer customer) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.travel = travel;
        this.customer = customer;
        dtm = (DefaultTableModel) tblJobs.getModel();
        populateTable();
    }
    
    public void populateTable() {
    dtm.setRowCount(0); // Clear the existing table rows

    // Hardcoded data for 5 travel agencies and their plans
    Object[][] hardcodedData = {
        {"Plan 1", "New York", "Los Angeles", 500.0},
        {"Plan 2", "Chicago", "Houston", 350.0},
        {"Plan 3", "Boston", "Miami", 400.0},
        {"Plan 4", "San Francisco", "Los Angeles" ,450.0},
        {"Plan 5", "Dallas", "Phoenix", 300.0}
    };

    // Add each hardcoded row to the table
    for (Object[] row : hardcodedData) {
        dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblJobs = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tblJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Plan Name", "Start Location", "End Location", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblJobs);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Book Trip");

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblJobs.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a Plan from the list!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String planName = (String) tblJobs.getValueAt(selectedRow, 0);
    String startLocation = (String) tblJobs.getValueAt(selectedRow, 1);
    String endLocation = (String) tblJobs.getValueAt(selectedRow, 2);
    double cost = (double) tblJobs.getValueAt(selectedRow, 3);

    int dialogButton = JOptionPane.YES_NO_OPTION;
    int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to book this plan?", "Warning", dialogButton);
    if (dialogResult == JOptionPane.YES_OPTION) {
        // Check if the customer has enough balance
        if (cost > customer.getCurrency().getOrDefault("USD", 0.0)) {
            JOptionPane.showMessageDialog(this, "Insufficient USD funds. Please top up your account!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Route route = new Route();
        //route.setRouteId("Route-" + selectedRow); // Assign a unique route ID
        route.setStartLocation(startLocation);
        route.setEndLocation(endLocation);
        //route.setPrice(cost);

        // Create the Plan object
        Plan newPlan = new Plan();
        newPlan.setPlanId(planName);
        newPlan.setRoute(route);
        newPlan.setCost((int) cost);

        // Add the plan to the customer's plans
        customer.getPlans().add(newPlan);

        

        // Deduct cost and confirm booking
        customer.getCurrency().put("USD", customer.getCurrency().get("USD") - cost);
        JOptionPane.showMessageDialog(this, "Travel Plan '" + planName + "' from " + startLocation + " to " + endLocation + " booked successfully!");

        populateTable(); // Refresh the table
        
    }
     
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJobs;
    // End of variables declaration//GEN-END:variables
}
