package Model.Hotel;

import Model.Organizations.Organization;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shrutidixit
 */
public class Hotel extends Organization {
    private ArrayList<Guest> guests;
    private ArrayList<Room> rooms;
    private ArrayList<Staff> staffList;
    private Amenities amenities;
    private Cuisine cuisine;

     public Hotel(String businessName, String businessDescription, Map<String, String> loginCredentials, String headquarter, String ownerName, String ownerPhone, String ownerEmail, String type, ImageIcon logoImage) {
        super(businessName, businessDescription, loginCredentials, headquarter, ownerName, ownerPhone, ownerEmail, type, logoImage);
         guests = new ArrayList<> ();
         rooms = new ArrayList<> ();
         staffList = new ArrayList<> ();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
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

    public Amenities getAmenities() {
        return amenities;
    }

    public void setAmenities(Amenities amenities) {
        this.amenities = amenities;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public void deleteRooms(String roomNumber) {
        rooms.removeIf(room -> room.getRoomNumber() == roomNumber);
    }
    
       public void deleteStaff(Staff staffName) {
        staffList.removeIf(staff -> staff.equals(staffName));
    }

}
