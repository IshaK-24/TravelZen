/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Travel to edit this template
 */
package Model;

import Model.Directories.CustomerDirectory;
import Model.Directories.HotelDirectory;
import Model.Directories.LocalBusinessDirectory;
import Model.Directories.TransportAgencyDirectory;
import Model.Directories.TravelAgencyDirectory;
import Model.EnterpriseAdmin.Roles.ApplicationAdmin;
import Model.EnterpriseAdmin.Roles.FinancialManager;
import Model.EnterpriseAdmin.Roles.GovernmentBoardManager;
import Model.EnterpriseAdmin.Roles.HotelBoardManager;
import Model.EnterpriseAdmin.Roles.LocalBusinessBoardManager;
import Model.EnterpriseAdmin.Roles.TransportationBoardManager;
import Model.EnterpriseAdmin.Roles.TravelAgencyBoardManager;
import Model.Financial.ForexFinance;
import Model.LocalBusiness.LocalBusiness;

import org.mindrot.jbcrypt.BCrypt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author minal
 */
public class Travel {
    private String name;
    private ApplicationAdmin appAdmin;
    private CustomerDirectory customerDirectory;
    private ForexFinance forexFinance;
    private LocalBusinessDirectory localBusinessDirectory;
    private HotelDirectory hotelDirectory;
    private TransportAgencyDirectory transportAgencyDirectory;
    private TransportationBoardManager traBoaAdmin;
    private HotelBoardManager hotelAdmin;
    private LocalBusinessBoardManager localbuAdmim;
    private GovernmentBoardManager govBoaAdmin;
    private FinancialManager finManAdmin;
    private TravelAgencyBoardManager travelABoaAdmin;


    public TravelAgencyDirectory getTravelAgencyDirectory() {
        return travelAgencyDirectory;
    }
    
    
    private TravelAgencyDirectory travelAgencyDirectory;

    public HotelDirectory getHotelDirectory() {
        return hotelDirectory;
    }

    public void setHotelDirectory(HotelDirectory hotelDirectory) {
        this.hotelDirectory = hotelDirectory;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    String salt = BCrypt.gensalt();

    public Travel(String name) {
        String cPassword = BCrypt.hashpw("Admin@123", salt);
        this.appAdmin = new ApplicationAdmin("Admin", cPassword, "Application Admin");
        saveUserToDatabase("Admin", cPassword, "Application Admin");
        cPassword = BCrypt.hashpw("TraPersonnel@23", salt);
        this.traBoaAdmin = new TransportationBoardManager("TraPersonnel", cPassword, "Transportation Board Personnel");
        saveUserToDatabase("TraPersonnel", cPassword, "Transportation Board Personnel");
        cPassword = BCrypt.hashpw("HotelPersonnel@123", salt);
        this.hotelAdmin = new HotelBoardManager("HotelPersonnel", cPassword, "Hotel Board Personnel");
        saveUserToDatabase("HotelPersonnel", cPassword, "Hotel Board Personnel");
        cPassword = BCrypt.hashpw("localbu@123", salt);
        this.localbuAdmim = new LocalBusinessBoardManager("localbu", cPassword, "Local Business Board Personnel");
        saveUserToDatabase("localbu", cPassword, "Local Business Board Personnel");
        cPassword = BCrypt.hashpw("GovPersonnel@23", salt);
        this.govBoaAdmin = new GovernmentBoardManager("GovPersonnel", cPassword, "Government Personnel");
        cPassword = BCrypt.hashpw("FinManager@23", salt);
        this.finManAdmin = new FinancialManager("FinManager", cPassword, "Financial Manager");
        cPassword = BCrypt.hashpw("TravelAPersonnel@23", salt);
        this.travelABoaAdmin = new TravelAgencyBoardManager("TravelAPersonnel", cPassword, "Travel Agency Board Personnel");
        saveUserToDatabase("TravelAPersonnel", cPassword, "Travel Agency Board Personnel");
        this.name = name;
        this.customerDirectory = new CustomerDirectory();
        this.localBusinessDirectory = new LocalBusinessDirectory();
        this.hotelDirectory = new HotelDirectory();
        this.transportAgencyDirectory = new TransportAgencyDirectory();
        this.travelAgencyDirectory = new TravelAgencyDirectory();
    }

    public GovernmentBoardManager getGovBoaAdmin() {
        return govBoaAdmin;
    }

    public void setGovBoaAdmin(GovernmentBoardManager govBoaAdmin) {
        this.govBoaAdmin = govBoaAdmin;
    }

    public FinancialManager getFinManAdmin() {
        return finManAdmin;
    }

    public void setFinManAdmin(FinancialManager finManAdmin) {
        this.finManAdmin = finManAdmin;
    }

    public TravelAgencyBoardManager getTravelABoaAdmin() {
        return travelABoaAdmin;
    }

    public void setTravelABoaAdmin(TravelAgencyBoardManager travelABoaAdmin) {
        this.travelABoaAdmin = travelABoaAdmin;
    }

    public LocalBusinessBoardManager getLocalbuAdmim() {
        return localbuAdmim;
    }

    public void setLocalbuAdmim(LocalBusinessBoardManager localbuAdmim) {
        this.localbuAdmim = localbuAdmim;
    }

    public HotelBoardManager getHotelAdmin() {
        return hotelAdmin;
    }

    public void setHotelAdmin(HotelBoardManager hotelAdmin) {
        this.hotelAdmin = hotelAdmin;
    }

    public TransportAgencyDirectory getTransportAgencyDirectory() {
        return transportAgencyDirectory;
    }

    public void setTransportAgencyDirectory(TransportAgencyDirectory transportAgencyDirectory) {
        this.transportAgencyDirectory = transportAgencyDirectory;
    }

    

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public ApplicationAdmin getAppAdmin() {
        return appAdmin;
    }

    public void setAppAdmin(ApplicationAdmin appAdmin) {
        this.appAdmin = appAdmin;
    }
    
    public ForexFinance getForexFinance() {
        return forexFinance;
    }

    public void setForexFinance(ForexFinance forexFinance) {
        this.forexFinance = forexFinance;
    }
    public LocalBusinessDirectory getLocalBusinessDirectory() {
        return localBusinessDirectory;
    }
    public TransportAgencyDirectory getTrnsportAgencyDirectory() {
        return transportAgencyDirectory;
    }
    public TransportationBoardManager getTraBoaAdmin() {
        return traBoaAdmin;
    }
    
    public void saveUserToDatabase(String username, String hashedPassword, String role) {
        String insertQuery = "INSERT INTO users (username, password_hash, role) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
            stmt.setString(1, username);
            stmt.setString(2, hashedPassword);
            stmt.setString(3, role);

            stmt.executeUpdate();
            System.out.println("User " + username + " saved to database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
