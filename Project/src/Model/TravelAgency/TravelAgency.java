/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.TravelAgency;


import Model.Hotel.Staff;
import Model.Organizations.Organization;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;


/**
 *
 * @author shrutidixit
 */
public class TravelAgency extends Organization {

    private ArrayList<Staff> staffList;
    private ArrayList<Plan> plan;
    public TravelAgency(String businessName, String businessDescription, Map<String, String> loginCredentials, String headquarter, String ownerName, String ownerPhone, String ownerEmail, String type, ImageIcon logoImage) {
        super(businessName, businessDescription, loginCredentials, headquarter, ownerName, ownerPhone, ownerEmail, type, logoImage);
    staffList = new ArrayList<> ();
    plan = new ArrayList<>();
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }

    public ArrayList<Plan> getPlan() {
        return plan;
    }

    public void setPlan(ArrayList<Plan> plan) {
        this.plan = plan;
    }

   
    
    public void addStaff(Staff staff) {
        this.staffList.add(staff);
    } 
    
           public void deleteStaff(Staff staffName) {
        staffList.removeIf(staff -> staff.equals(staffName));
    }
}
