/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Directories;

import Model.LocalBusiness.LocalBusiness;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author minal
 */
public class LocalBusinessDirectory {
        private ArrayList<LocalBusiness>localBusinessList;
    
    public LocalBusinessDirectory(){
        this.localBusinessList = new ArrayList<LocalBusiness>();
    }
        
    public ArrayList<LocalBusiness> getLocalBusinessList() {
        return localBusinessList;
    }

    public void setLocalBusinessList(ArrayList<LocalBusiness>localBusinessList) {
        this.localBusinessList = localBusinessList;
    }
   
    public LocalBusiness addLocalBusiness(String businessName, String businessDescription, Map<String, String> loginCredentials, String headquarter, String ownerName, String ownerPhone, String ownerEmail, String type, ImageIcon logoImage){
       LocalBusiness localBusiness = new LocalBusiness( businessName,  businessDescription,  loginCredentials,  headquarter,  ownerName,  ownerPhone,  ownerEmail,  type,  logoImage);
       localBusinessList.add(localBusiness);
       return localBusiness;
   } 
   
    
    public void deleteLocalBusiness(LocalBusiness localBusiness){
       localBusinessList.remove(localBusiness);
    }
    
}
