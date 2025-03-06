/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.EnterpriseAdmin.Roles;

/**
 *
 * @author minal
 */
public class HotelBoardManager extends Profile{
    private String name;

    public HotelBoardManager(String username, String password, String name) {
        super(username, password);
        this.name = name;
    }
    
    @Override
    public String getRole(){
        return  "Hotel Board Personnel";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
