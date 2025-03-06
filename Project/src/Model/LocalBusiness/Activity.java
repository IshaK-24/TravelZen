/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.LocalBusiness;

/**
 *
 * @author minal
 */
public class Activity {
    private static int nextId = 1;
    int id;
    LocalBusiness lb;
    LocalActivity la;
    String date;

    public Activity(LocalBusiness lb, LocalActivity la, String date) {
        this.id = nextId;
        this.lb = lb;
        this.la = la;
        this.date = date;
        nextId++;
    }

    public LocalBusiness getLb() {
        return lb;
    }

    public void setLb(LocalBusiness lb) {
        this.lb = lb;
    }

    public LocalActivity getLa() {
        return la;
    }

    public void setLa(LocalActivity la) {
        this.la = la;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Activity.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.id);
    }
    
}
