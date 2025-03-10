/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WorkAreas.Login;

import Model.Directories.TravelAgencyDirectory;
import Model.Hotel.Hotel;
import Model.LocalBusiness.LocalBusiness;
import Model.Travel;
import UI.HotelManagement.HotelManagementJPanel;
import UI.WorkAreas.ApplicationAdmin.ApplicationAdminMainJPanel;
import UI.WorkAreas.LocalBusinessManagement.LocalBusinessManagementJPanel;
import UI.WorkAreas.TransportationBoard.TransportationBoardMainJPanel;
import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author minal
 */
public class AdminLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminLoginJPanel
     */
    private JPanel userProcessContainer;
    private Travel travel;
    private Hotel hotel;
    private String username;
    private LocalBusiness localBusiness;

    public AdminLoginJPanel(JPanel userProcessContainer, Travel travel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.travel = travel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        lblLogin.setText("Login");
        add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 135, 90));

        txtUserName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 147, 210, 40));

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 120, 22));

        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 120, -1));

        btnLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 80, -1));

        btnBack.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 80, -1));

        txtPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 217, 210, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String usernameInput = txtUserName.getText().trim();
        String passwordInput = String.valueOf(txtPassword.getPassword());
        if (usernameInput.isEmpty() || passwordInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please check if all fields are filled before processing", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if ((usernameInput.equals(travel.getAppAdmin().getUsername())) && (BCrypt.checkpw(passwordInput, travel.getAppAdmin().getPassword()))) {
            ApplicationAdminMainJPanel panel = new ApplicationAdminMainJPanel(userProcessContainer, travel);
            userProcessContainer.add("ApplicationAdminMainJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            txtPassword.setText("");
            return;
        }
        if ((usernameInput.equals(travel.getTraBoaAdmin().getUsername())) && (BCrypt.checkpw(passwordInput, travel.getTraBoaAdmin().getPassword()))) {
            TransportationBoardMainJPanel panel = new TransportationBoardMainJPanel(userProcessContainer, travel);
            userProcessContainer.add("TransportationBoardMainJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            txtPassword.setText("");
            return;
        }
        if ((usernameInput.equals(travel.getHotelAdmin().getUsername())) && (BCrypt.checkpw(passwordInput, travel.getHotelAdmin().getPassword()))) {
            HotelManagementJPanel panel = new HotelManagementJPanel(userProcessContainer, travel, hotel, username);
            userProcessContainer.add("HotelManagementJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            txtPassword.setText("");
            return;
        }
        
        if ((usernameInput.equals(travel.getLocalbuAdmim().getUsername())) && (BCrypt.checkpw(passwordInput, travel.getLocalbuAdmim().getPassword()))) {
            LocalBusinessManagementJPanel panel = new LocalBusinessManagementJPanel(userProcessContainer, travel, localBusiness , usernameInput);
            userProcessContainer.add("LocalBusinessManagementJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            txtPassword.setText("");
            return;
        }

        
        JOptionPane.showMessageDialog(this, "Incorrect Username or Password.", "Credentials Error", JOptionPane.ERROR_MESSAGE);
        txtPassword.setText("");

    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
