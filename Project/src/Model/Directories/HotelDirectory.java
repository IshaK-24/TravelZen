/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Directories;

import Model.Hotel.Hotel;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author minal
 */
public class HotelDirectory {
    private ArrayList<Hotel>hotelList;
    int cusid;
    
    public HotelDirectory(){
        this.hotelList = new ArrayList<Hotel>();
    }
        
    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(ArrayList<Hotel>hotelList) {
        this.hotelList = hotelList;
    }
    
        public Hotel addHodel(String businessName, String businessDescription, Map<String, String> loginCredentials, String headquarter, String ownerName, String ownerPhone, String ownerEmail, String type, ImageIcon logoImage){
       Hotel hotel = new Hotel(  businessName,  businessDescription,  loginCredentials,  headquarter,  ownerName,  ownerPhone,  ownerEmail,  type,  logoImage);
       hotelList.add(hotel);
       return hotel;
   } 
    
    public void deleteHotel(Hotel hotel){
       hotelList.remove(hotel);
    } 
    
}
