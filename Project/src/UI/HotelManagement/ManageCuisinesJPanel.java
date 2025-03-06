/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HotelManagement;

import Model.Hotel.Cuisine;
import Model.Hotel.Hotel;
import Model.Travel;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutidixit
 */
public class ManageCuisinesJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Travel travel;
    private Hotel hotel;
    public ManageCuisinesJPanel(JPanel userProcessContainer, Travel travel, Hotel hotel) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.travel = travel;
        this.hotel = hotel;
        populateTable();
    }

    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCuisine.getModel();
        dtm.setRowCount(0);
            if (hotel.getCuisine() == null) {
        // Display a warning to the user
        JOptionPane.showMessageDialog(this, "No cuisine available in the hotel.", "Warning", JOptionPane.WARNING_MESSAGE);
        return; // Exit the method
    }
        Cuisine cuisine = hotel.getCuisine();
        for (Map.Entry<String, String> entry : cuisine.getCuisine().entrySet()) {
            Object[] row = new Object[2];
            row[0] = entry.getKey();
            row[1] = entry.getValue();
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
        tblCuisine = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblCuisine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cuisine Type", "Dishes"
            }
        ));
        jScrollPane1.setViewportView(tblCuisine);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCuisine.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table first to delete cuisine", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String cuisineType = (String) tblCuisine.getValueAt(selectedRow, 0);
            for (Hotel h : travel.getHotelDirectory().getHotelList()) {
                h.getCuisine().deleteCuisine(cuisineType);
                JOptionPane.showMessageDialog(this, "Cuisine removed successfuly!");
                populateTable();
                return;
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCuisine;
    // End of variables declaration//GEN-END:variables
}
