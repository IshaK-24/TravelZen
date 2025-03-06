/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Directories;

import Model.Roles.Customer;
import java.util.ArrayList;

/**
 *
 * @author minal
 */
public class CustomerDirectory  {
    private ArrayList<Customer>customerList;
    
    public CustomerDirectory(){
        this.customerList = new ArrayList<Customer>();
    }
        
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer>customerList) {
        this.customerList = customerList;
    }
   
    public Customer addCustomer(String name, String email, String phone, String username, String password){
       Customer customer = new Customer( name, email,  phone,  username,  password);
       customerList.add(customer);
       return customer;
   } 
   
    
    public void deleteCustomer(Customer customer){
       customerList.remove(customer);
    }
   
    public Customer searchCustomerByEmail(String email){
       for(Customer c: customerList){
           if(c.getEmail().equals(email)){
               return c;
           }
       }
       return null;
   }    
    
        public Customer searchCustomerByUsername(String username){
       for(Customer c: customerList){
           if(c.getUsername().equals(username)){
               return c;
           }
       }
       return null;
   }  
    
}
