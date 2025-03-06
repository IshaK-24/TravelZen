/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author minal
 */
public class Validations {
    public static boolean validatePassword(String password) {
    // Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.
    return !password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])[a-zA-Z\\d@#$%^&+=]{8,}$");
  }
    
    public static boolean validateUsername(String username) {
        return !username.matches("^[a-zA-Z0-9.\\s]{5,15}$");
    }
    
        public static boolean validateName(String username) {
        return !username.matches("^[a-zA-Z0-9.\\s]{3,15}$");
    }
    
    public static boolean validateEmail(String email) {
        return !email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
    
     public static boolean validateNumberField(String email) {
        return !email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
            
    public static boolean validatePhone(String phone) {
        return !phone.matches("^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$");
    }
    
    public static boolean validateDateFormat(String date) {
        // Specify the expected date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        dateFormat.setLenient(false);

        try {
            // Parse the input date
            Date parsedDate = dateFormat.parse(date);
            // If parsing succeeds, the date is valid
            return false;
        } catch (ParseException e) {
            // Parsing failed, the date is not in the expected format
            return true;
        }
    
}
    public static boolean isFutureDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        dateFormat.setLenient(false);

        try {
            // Parse the input date
            Date parsedDate = dateFormat.parse(date);
            // Get the current date
            Date currentDate = new Date();

            // Check if the parsed date is in the future
            return !parsedDate.after(currentDate);
        } catch (ParseException e) {
            // Parsing failed, the date is not in the expected format
            return true;
        }
    }
}
