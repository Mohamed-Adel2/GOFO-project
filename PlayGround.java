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
public class PlayGround {
//    private String name;
    private String location;
    private int cancelationperiod;
    public ArrayList<int[]> avaliablehours = new ArrayList<int[]>();
    //int[] avaliablehours;
    private int id;
    private int price;
    private PlayGroundOwner PGO;

    /**
     * parametrized constructor
     * 
     * @param name , the is the name of playground ex:(camp nou). 
     * @param location , this is the location of the playground ex:(faisal).
     * @param cancelationperiod , the period that can the player cancel the request. 
     * @param avaliablehours , the hours that can the player request to reserve it.
     * @param id , the id of the playground ex:(if playground owner has many playgrounds, then each have ID).
     * @param price , the price of reservation per hour.
     */
    public PlayGround(PlayGroundOwner PGO, String location, int cancelationperiod , int id,int price) {
        this.PGO=PGO;
        this.location = location;
        this.cancelationperiod = cancelationperiod;
        this.id = id;
        this.price=price;
    }

    /**
     *
     * @param location , set the location address of playground with this location address.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @param cancelationperiod , set the cancelation period of playground with this period.
     */
    public void setCancelationperiod(int cancelationperiod) {
        this.cancelationperiod = cancelationperiod;
    }

    /**
     *
     * @param avaliablehours , set the avialable hours of playground with this hours.
     */
    public void setAvaliablehours(int[] AH) {
        avaliablehours.add(AH);
    }

    /**
     *
     * @param id set the ID period of playground with this ID.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     *
     * @param price set the price per hour of playground with this price.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     *
     * @return , get the location address of the playground.
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @return , get the Cancelation period of the playground.
     */
    public int getCancelationperiod() {
        return cancelationperiod;
    }
    
    public PlayGroundOwner GetPGO(){
        return PGO;
    }
    /**
     * @return show the avialable hours of playground to user.
     */
    public void getAvaliablehours() {
        String Days[]={"SatDay","SunDay","MonDay","TuesDay","WednesDay","ThursDay","FriDay"};
        int i=0;
        System.out.println("PlayGround Avaliable Hours: ");
        for(int[] anIntArray:avaliablehours) {
        //iterate the retrieved array an print the individual elements
            System.out.print( Days[i] + " : ");
            i+=1;
            for (int aNumber : anIntArray) {
                   System.out.print(aNumber + " ");
            }
            System.out.print('\n');
        }
    }

    /**
     *
     * @return  , get the ID of the playground.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return  , get the price per hour period of the playground.
     */
    public int getPrice() {
        return price;
    }
    
    void displayinfo(){
        System.out.println("PlayGround ID: "+this.getId());
        System.out.println("PlayGround Location: "+this.getLocation());
        System.out.println("PlayGround CancelationPeriod: "+this.getCancelationperiod() + " Days");
        System.out.println("PlayGround Price: "+this.getPrice() + " LE.");
        getAvaliablehours();
    }
    
    
//    boolean checkavialabilty(int r){
//        for(int i=0;i<avaliablehours.length;i++)
//        {
//            if(avaliablehours[r]==1)return true;
//        }
//        return false;
//    }

    public PlayGroundOwner getPGO() {
        return PGO;
    }
    
    
}