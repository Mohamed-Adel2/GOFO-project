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

public class PlayGroundOwner implements User {
    private ArrayList<Request> PR = new ArrayList<Request>();
    private String name;
    private String password;
    private String Email;
    private String Phone;
    private String Location;
    private int ID;
     //ArrayList<String> cars = new ArrayList<String>();
    private ArrayList<PlayGround> PG = new ArrayList<PlayGround>();
    //private PlayGround PGG;
  
    
//    public PlayGroundOwner(){
//        ArrayList<PlayGround> PG = ;
//    }
    public PlayGroundOwner(String name,String password, String Email, String Phone, String Location, int ID) {
        this.name=name;
        this.password = password;
        this.Email = Email;
        this.Phone = Phone;
        this.Location = Location;
        this.ID = ID;
//        ArrayList<PlayGround> PG=new ArrayList<PlayGround>();
    }

    public void UpdateName(String name) {
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

    public void AddRequest(Request R){
        PR.add(R);
        System.out.println('\n'+"Request was sent to PlayGround Owner he will answer soon, Please wait for response! ");
        System.out.println("Reply in progress......! " + '\n');
        AcceptRequest(R);
    }
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
                if(flagg==1){System.out.println("Request Accepted!.");PR.remove(R);}
                else DenyRequest(R);
                
        }
        
  
        }
    }
}
    public void DenyRequest(Request R){
        System.out.println("Request Denied!.");
        PR.remove(R);
    }
    public void viewReq(){
        for(int i=0;i<PR.size();i++){
           PR.get(i).viewRequest();
        }
    }
    
}
