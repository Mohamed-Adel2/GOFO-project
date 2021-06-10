/*
* This class for player that can set his information,
* and also can requests a playground in specific day and time.
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

public class Player implements User{
    private ArrayList<Request> PR = new ArrayList<Request>();
    public PlayGrounds ps;
    private String name;
    private String password;
    private String Email;
    private String Phone;
    private String Location;
    private int ID;

    /**
     *
     * @param ps , this is object from all playgrounds.
     * @param name , the name of the player.
     * @param password , the password of the player.
     * @param Email , the email of the player.
     * @param Phone , the phone of the player.
     * @param Location , the location of the player.
     * @param ID , the ID of the player.
     */
    public Player(PlayGrounds ps,String name, String password, String Email, String Phone, String Location, int ID) {
        this.name = name;
        this.password = password;
        this.Email = Email;
        this.Phone = Phone;
        this.Location = Location;
        this.ID = ID;
        this.ps=ps;
    }

    
    /**
     *
     * @param name , update player name.
     */
    public void UpdateName(String name){
        this.name = name;
    }

    
    /**
     *
     * @param password , update player password.
     */
    public void UpdatePassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param Email , update player email.
     */
    public void UpdateEmail(String Email) {
        this.Email = Email;
    }

    
    /**
     *
     * @param Phone , update player phone.
     */
    public void UpdatePhone(String Phone) {
        this.Phone = Phone;
    }

    
    /**
     *
     * @param Location , update player location.
     */
    public void UpdateLocation(String Location) {
        this.Location = Location;
    }

    
    /**
     *
     * @param ID , update player ID.
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    
    /**
     *
     * @return , get the name of the player.
     */
    public String getName() {
        return name;
    }

    
    /**
     *
     * @return , get the password of the player.
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return , get the email of the player.
     */
    public String getEmail() {
        return Email;
    }

    /**
     *
     * @return , get the phone of the player.
     */
    public String getPhone() {
        return Phone;
    }

    /**
     *
     * @return , get the location of the player.
     */
    public String getLocation() {
        return Location;
    }

    /**
     *
     * @return , get the ID of the player.
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @param R , set request to specific playground and pass it to playground owner. 
     */
    public void AddRequest(Request R){
        PR.add(R);
        System.out.println("Request Sent Successfuly! ");
    }

    /**
     * display all playgrounds.
     */
    public void ViewPs(){
        ps.ViewPlayGrounds();
    }

    /**
     * display my requests.
     */
    public void viewReq(){
        for (int i=0;i<PR.size();i++){
            PR.get(i).viewRequest();
            System.out.println('\n');
        }
    }

}
