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
public class Request {
    public PlayGrounds ps;
    public String s;
    int[] Hours;
    public int ID;
    public PlayGround PG;
    public Player P;

    public Request(int ID ,int[] Hours, Player P,String s, PlayGrounds ps){
    this.ID=ID;
    this.P=P;
    this.Hours = new int[Hours.length];
    for(int i=0;i<Hours.length;i++){
        this.Hours[i]=Hours[i];
    }
    this.s=s;
    this.ps=ps;
    setPG();
    } 
    public void setPG(){
        for(int i=0; i<ps.PG.size() ;i++){
            if(ps.PG.get(i).getId()==this.ID)
                PG=ps.PG.get(i);
        }
    }
    public void viewRequest(){
        System.out.println("PlayGround ID: "+ID);
        System.out.println("Player Name: "+P.getName());
        System.out.println("Booking Day: "+s);
    }
    public void AddRequesttoPlayer(){
        P.AddRequest(this);
    }
    public void AddRequesttoPGO(){
        PG.getPGO().AddRequest(this);
    }
}