/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Hotel;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shrutidixit
 */
public class Cuisine {
    private Map<String,String>dishes;

 public Cuisine() {
        this.dishes = new HashMap<>();
    }
 
     public Map<String, String> getCuisine() {
        return dishes;
    }

    public void setCuisine(Map<String, String> dishes) {
        this.dishes = dishes;
    }

    public void addCuisine(String type,String dishName) {
       dishes.put(type, dishName);
    }
    
    public void deleteCuisine(String type) {
        dishes.remove(type);
    }
    
}
