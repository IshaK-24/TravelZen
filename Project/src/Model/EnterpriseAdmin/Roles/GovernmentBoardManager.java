/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.EnterpriseAdmin.Roles;

/**
 *
 * @author minal
 */
public class GovernmentBoardManager extends Profile {
    private String name;

    public GovernmentBoardManager(String username, String password, String name) {
        super(username, password);
        this.name = name;
    }
    
    @Override
    public String getRole(){
        return  "Government Personnel";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
