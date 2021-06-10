/*
 * This class for playground owner that can set his information,
 * and his requests to his playgrounds,
 * he can accept them or deny them .
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

public class PlayGroundOwner implements User {
    private ArrayList<Request> PR = new ArrayList<Request>();
    private String name;
    private String password;
    private String Email;
    private String Phone;
    private String Location;
    private int ID;
    private ArrayList<PlayGround> PG = new ArrayList<PlayGround>();
  
    
    /**
     *
     * @param name , playground owner name.
     * @param password , playground owner password.
     * @param Email , playground owner email.
     * @param Phone , playground owner phone.
     * @param Location , playground owner location.
     * @param ID , playground owner ID.
     */
    public PlayGroundOwner(String name,String password, String Email, String Phone, String Location, int ID) {
        this.name=name;
        this.password = password;
        this.Email = Email;
        this.Phone = Phone;
        this.Location = Location;
        this.ID = ID;
    }

    /**
     *
     * @param name , update playground owner name.
     */
    public void UpdateName(String name) {
        this.name = name;
    }
    
    
    /**
     *
     * @param password , update playground owner password.
     */
    public void UpdatePassword(String password) {
        this.password = password;
    }

    
    /**
     *
     * @param Email , update playground owner email.
     */
    public void UpdateEmail(String Email) {
        this.Email = Email;
    }

    
    /**
     *
     * @param Phone , update playground owner phone.
     */
    public void UpdatePhone(String Phone) {
        this.Phone = Phone;
    }

    
    /**
     *
     * @param Location , update playground owner location.
     */
    public void UpdateLocation(String Location) {
        this.Location = Location;
    }

    
    /**
     *
     * @param ID , update playground owner ID.
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    
    /**
     *
     * @return , get playground owner name.
     */
    public String getName() {
        return name;
    }
    
    
    /**
     *
     * @return , get playground owner password.
     */
    public String getPassword() {
        return password;
    }

    
    /**
     *
     * @return , get playground owner email.
     */
    public String getEmail() {
        return Email;
    }

    
    /**
     *
     * @return , get playground owner phone.
     */
    public String getPhone() {
        return Phone;
    }

    
    /**
     *
     * @return , get playground owner location.
     */
    public String getLocation() {
        return Location;
    }

    
    /**
     *
     * @return , get playground owner ID.
     */
    public int getID() {
        return ID;
    }

    
    /**
     *
     * @param PGG , add playground.
     */
    public void AddPG(PlayGround PGG){
        PG.add(PGG);
    }
    
    
    void viewPlayGrounds(){
        System.out.println("PlayGroundOwner Name: "+getName());
        System.out.print('\n');
        for(int i=0;i<PG.size();i++)
        {
            System.out.println("Play Ground " + (i+1) + " Info");
            System.out.println("---------------------------------");
            (PG.get(i)).displayinfo();        
        }
    }

    
    /**
     *
     * @param R , player request added here.
     */
    public void AddRequest(Request R){
        PR.add(R);
        System.out.println('\n'+"Request was sent to PlayGround Owner he will answer soon, Please wait for response! ");
        System.out.println("Reply in progress......! " + '\n');
        AcceptRequest(R);
    }

    
    /**
     *
     * @param R , function take player request and accept or deny it.
     */
    public void AcceptRequest(Request R){
        int indx=0;
        int flag=0,flagg=0;
        int c=0;
        String Days[]={"SatDay","SunDay","MonDay","TuesDay","WednesDay","ThursDay","FriDay"};
        for(int i=0;i<Days.length;i++){
            if(R.s==Days[i]){
                indx=i;
                break;
            }
        }
        for(int i=0;i<PG.size();i++){
            if(R.ID==PG.get(i).getId()){
                if((PG.get(i).avaliablehours.get(indx).length)<(R.Hours.length)){System.out.println("Request Denied"  + '\n');break;}
                else{
                int x[]=new int[(PG.get(i).avaliablehours.get(indx).length)-(R.Hours.length)];
                int a[]=PG.get(i).avaliablehours.get(indx);
                for(int k=0;k<a.length;k++){
                    for(int j=0;j<R.Hours.length;j++){
                       if(a[k]==R.Hours[j]){flag =1;break;}
                    }
                    if (flag==0){
                        x[c]=a[k];
                        c+=1;
                    }
                    flag=0;
                }
                PG.get(i).avaliablehours.remove(indx);
                PG.get(i).avaliablehours.add(indx,x);
                flagg=1;
                if(flagg==1)System.out.println("Request Accepted!.");
                else System.out.println("Request Denied!.");
                PR.remove(R);
        }
        }
    }
}

    
    /**
     *
     * @param R , deny request function.
     */
    public void DenyRequest(Request R){
        System.out.println("Request Denied!.");
        PR.remove(R);
    }

    
    /**
     * display the requests of playground have.
     */
    public void viewReq(){
        for(int i=0;i<PR.size();i++){
           PR.get(i).viewRequest();
        }
    }
    
}
