/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organizations;

import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author minal
 */
public class Organization {
    String businessName;
    String businessDescription;
    private Map<String, String> loginCredentials;
    String headquarter;
    String managerName;
    String managerPhone;
    String managerEmail;
    String type; 
    private ImageIcon logoImage;

    public Organization(String businessName, String businessDescription, Map<String, String> loginCredentials, String headquarter, String managerName, String managerPhone, String managerEmail, String type, ImageIcon logoImage) {
        this.businessName = businessName;
        this.businessDescription = businessDescription;
        this.loginCredentials = loginCredentials;
        this.headquarter = headquarter;
        this.managerName = managerName;
        this.managerPhone = managerPhone;
        this.managerEmail = managerEmail;
        this.type = type;
        this.logoImage = logoImage;
    }
    
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessDescription() {
        return businessDescription;
    }

    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
    }

    public Map<String, String> getLoginCredentials() {
        return loginCredentials;
    }

    public void setLoginCredentials(Map<String, String> loginCredentials) {
        this.loginCredentials = loginCredentials;
    }

    public String getHeadquarter() {
        return headquarter;
    }

    public void setHeadquarter(String headquarter) {
        this.headquarter = headquarter;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    @Override
public String toString(){
        return this.getBusinessName();
    }
    
}
