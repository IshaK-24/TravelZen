/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.LocalBusiness;

import Model.Hotel.Staff;
import Model.Organizations.Organization;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author minal
 */
public class LocalBusiness extends Organization {
    private ArrayList<Guest> guests;
    private ArrayList<Staff> staff;
    private ArrayList<LocalActivity>localActivity;
    public LocalBusiness(String businessName, String businessDescription, Map<String, String> loginCredentials, String headquarter, String ownerName, String ownerPhone, String ownerEmail, String type, ImageIcon logoImage) {
        super(businessName, businessDescription, loginCredentials, headquarter, ownerName, ownerPhone, ownerEmail, type, logoImage);
    guests = new ArrayList<> ();
    staff = new ArrayList<> ();
    localActivity = new ArrayList<> ();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    public ArrayList<LocalActivity> getLocalActivity() {
        return localActivity;
    }

    public void setLocalActivity(ArrayList<LocalActivity> localActivity) {
        this.localActivity = localActivity;
    }
    public void addStaff(Staff s) {
        this.staff.add(s);
    }
    
           public void deleteStaff(String staffName) {
        staff.removeIf(staff -> staff.getName() == staffName);
    }
      
                      public void deleteLocalActivity(String type) {
        localActivity.removeIf(localActivity -> localActivity.getType() == type);
    }
                      
    @Override
    public String toString(){
        return this.getBusinessName();
    }
    
    
}
