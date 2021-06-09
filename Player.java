/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author OWNER
 */
import java.util.ArrayList;
public class Player implements User{
    private ArrayList<Request> PR = new ArrayList<Request>();
    public PlayGrounds ps;
    private String name;
    private String password;
    private String Email;
    private String Phone;
    private String Location;
    private int ID;

    //public PlayerRequest PR;


    public Player(PlayGrounds ps,String name, String password, String Email, String Phone, String Location, int ID) {
        this.name = name;
        this.password = password;
        this.Email = Email;
        this.Phone = Phone;
        this.Location = Location;
        this.ID = ID;
        this.ps=ps;
    }

    public void UpdateName(String name){
        this.name = name;
    }

    public void UpdatePassword(String password) {
        this.password = password;
    }

    public void UpdateEmail(String Email) {
        this.Email = Email;
    }

    public void UpdatePhone(String Phone) {
        this.Phone = Phone;
    }

    public void UpdateLocation(String Location) {
        this.Location = Location;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getLocation() {
        return Location;
    }

    public int getID() {
        return ID;
    }
    public void AddRequest(Request R){
        PR.add(R);
        System.out.println("Request Sent Successfuly! ");
    }
    public void ViewPs(){
        ps.ViewPlayGrounds();
    }
    public void viewReq(){
        for (int i=0;i<PR.size();i++){
            PR.get(i).viewRequest();
            System.out.println('\n');
        }
    }

}