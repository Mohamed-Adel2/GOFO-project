/*
 * This class that can any playground owner set his playground information.
 * 
 */
package main;

/**
 *
 * @author OWNER
 */

import java.util.ArrayList;

/**
 *
 * @author sayed
 */

public class PlayGround {
    private String location;
    private int cancelationperiod;
    public ArrayList<int[]> avaliablehours = new ArrayList<int[]>();
    private int id;
    private int price;
    private PlayGroundOwner PGO;

    
    /**
     * parametrized constructor
     * 
     * @param PGO , an object from playground owner. 
     * @param location , this is the location of the playground ex:(faisal).
     * @param cancelationperiod , the period that can the player cancel the request.
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
     * @param AH , set the avaliable houres for the playground .
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
    

    /**
     * @return , the Avaliable hours for each day for the playground .
     */
    public void getAvaliablehours() {
        String Days[]={"SatDay","SunDay","MonDay","TuesDay","WednesDay","ThursDay","FriDay"};
        int i=0;
        System.out.println("PlayGround Avaliable Hours: ");
        for(int[] anIntArray:avaliablehours) {
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
    
    
    /**
     *
     * @display , function to display the information of playground . .
     */
    
    void displayinfo(){
        System.out.println("PlayGround ID: "+this.getId());
        System.out.println("PlayGround Location: "+this.getLocation());
        System.out.println("PlayGround CancelationPeriod: "+this.getCancelationperiod() + " Days");
        System.out.println("PlayGround Price: "+this.getPrice() + " LE.");
        getAvaliablehours();
    }
    
    
    /**
     *
     * @return get the information of the playground owner .
     */

    public PlayGroundOwner getPGO() {
        return PGO;
    }
       
}
