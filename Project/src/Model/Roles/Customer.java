/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Roles;

import Model.EnterpriseAdmin.Roles.Profile;
import Model.LocalBusiness.Activity;
import Model.TravelAgency.Plan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author minal
 */
public class Customer extends Profile{
    String name;
    String email;
    String phone;
    String status;
    HashMap<String,Double> currency = new HashMap<>();
    //private Map<Job, String> appliedJobs;
   private ArrayList<Activity> localActivity;
   ArrayList<Plan> plans;

    public Customer(String name, String email, String phone, String username, String password) {
        super(username, password);
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = "Not Verified";
        currency.put("INR", 0.0);
        currency.put("USD", 0.0);
        currency.put("CNY", 0.0);
        currency.put("EUR", 0.0);
       // this.appliedJobs = new HashMap<>();
       this.localActivity = new ArrayList<>();
       this.plans = new ArrayList<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String getRole(){
        return  "Customer";
    }

    public HashMap<String, Double> getCurrency() {
        return currency;
    }

    public void setCurrency(HashMap<String, Double> currency) {
        this.currency = currency;
    }

    /*public Map<Job, String> getAppliedJobs() {
        return appliedJobs;
    }

    public void applyForJob(Job jobPosting) {
        this.appliedJobs.put(jobPosting, "Pending");
        jobPosting.addApplicant(this);
    }

    public List<Job> getUnappliedJobs(List<Job> allJobs) {
        List<Job> unappliedJobs = new ArrayList<>(allJobs);
        unappliedJobs.removeAll(this.appliedJobs.keySet());
        return unappliedJobs;
    }*/

    public ArrayList<Activity> getLocalActivity() {
        return localActivity;
    }

    public void setLocalActivity(ArrayList<Activity> localActivity) {
        this.localActivity = localActivity;
    }
    
    @Override 
    public String toString(){
        return this.getUsername();
    }

    public ArrayList<Plan> getPlans() {
        return plans;
    }

    public void setPlans(ArrayList<Plan> plans) {
        this.plans = plans;
    }
    
    
}
