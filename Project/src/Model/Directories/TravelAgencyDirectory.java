/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Directories;

import Model.TravelAgency.TravelAgency;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author minal
 */
public class TravelAgencyDirectory {
    private ArrayList<TravelAgency>travelAgencyList;
    
    public TravelAgencyDirectory(){
        this.travelAgencyList = new ArrayList<TravelAgency>();
    }
        
    public ArrayList<TravelAgency> getTravelAgencyList() {
        return travelAgencyList;
    }

    public void setTravelAgencyList(ArrayList<TravelAgency>travelAgencyList) {
        this.travelAgencyList = travelAgencyList;
    }
   
    public TravelAgency addTravelAgency(String businessName, String businessDescription, Map<String, String> loginCredentials, String headquarter, String ownerName, String ownerPhone, String ownerEmail, String type, ImageIcon logoImage ){
       TravelAgency localBusiness = new TravelAgency( businessName,  businessDescription,  loginCredentials,  headquarter,  ownerName,  ownerPhone,  ownerEmail,  type,  logoImage);
       travelAgencyList.add(localBusiness);
       return localBusiness;
   } 
     
    public void deleteTravelAgency(TravelAgency travelAgency){
       travelAgencyList.remove(travelAgency);
    }  
    
}
