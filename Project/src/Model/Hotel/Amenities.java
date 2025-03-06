/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Hotel;

import java.util.ArrayList;

/**
 *
 * @author shrutidixit
 */
public class Amenities {
    
    
   private ArrayList<String> facilities;

    public Amenities() {
        this.facilities = new ArrayList<>();
    }

    public ArrayList<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(ArrayList<String> facilities) {
        this.facilities = facilities;
    }

    public void addFacility(String facility) {
        this.facilities.add(facility);
    }
    
    public void deleteFacility(String facility){
        this.facilities.remove(facility);
    }
    
}
