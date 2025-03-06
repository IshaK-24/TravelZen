/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.TransportAgency;



import Model.Hotel.Cuisine;
import Model.Hotel.Staff;
import Model.Organizations.Organization;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author shrutidixit
 */
public class TransportAgency extends Organization{
private ArrayList<Guest> guests;
private ArrayList<Route>routes;
private Cuisine cuisine;
private ArrayList<Staff> staffList;
private String mode;

    public TransportAgency(String businessName, String businessDescription, Map<String, String> loginCredentials, String headquarter, String ownerName, String ownerPhone, String ownerEmail, String type, ImageIcon logoImage, String mode) {
        super(businessName, businessDescription, loginCredentials, headquarter, ownerName, ownerPhone, ownerEmail, type, logoImage);
             guests = new ArrayList<> ();
         routes = new ArrayList<> ();
         staffList = new ArrayList<> ();
         this.mode= mode;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }

        public void addStaff(Staff staff) {
        this.staffList.add(staff);
    }
    
       public void deleteStaff(Staff staffName) {
        staffList.removeIf(staff -> staff.equals(staffName));
    }   
       
              public void deleteRoute(Route route) {
        routes.removeIf(r -> r.equals(route));
    }   
}
