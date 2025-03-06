/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;


import jakarta.mail.Transport;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
//import java.net.PasswordAuthentication;
import jakarta.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.Random;
/*import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.PasswordAuthentication;*/


/**
 *
 * @author minal
 */
public class SendEmail {
    public static int generateVerificationCode() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // Generates a random number between 100000 and 999999
    }
    
    public static boolean sendVerificationCode(String toEmail, String name, int verificationCode, boolean isForgotPassword) {
        final String username = "travelzen30@gmail.com"; // Replace with your Gmail email address
        final String password = "zivl sgtb pjkt scgy"; // Replace with your Gmail password

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        //props.put("mail.debug", "true");

        Session session = Session.getInstance(props,
                new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Verification Code for Customer Registration");
            String messageText;
            if (!isForgotPassword) {
                messageText = String.format("Hi " + name + ",\n\n"
                        + "Thank you for choosing TravelZen! To complete your registration, please use the following one-time verification code:: %s.\n\n"
                        + "This code is valid for one-time use only and ensures the security of your account. If you did not request this code, you can safely ignore this email. Welcome to TravelZen!\n\n\n"
                        + "Thanks and Regards,\n"
                        + "TravelZen", verificationCode);
            } else {
                messageText = String.format("Hi " + name + ",\n\n"
                        + "We received a request to reset your password for your TravelZen account. Please use the following one-time verification code to proceed with the password reset: %s.\n\n"
                        + "This code is valid for a single use and is time-sensitive. If you did not initiate this password reset, please ignore this email.\n\n"
                        + "Thanks and Regards,\n"
                        + "TravelZen", verificationCode);

            }
            message.setText(messageText);

            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", 587, username, password);
            Transport.send(message);
            
            System.out.println("Verification code sent to " + toEmail);
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }

}
