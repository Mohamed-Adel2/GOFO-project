/*
 * This class for any request that the player make.
 * 
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

public class Request {

    public PlayGrounds ps;
    public String s;
    int[] Hours;
    public int ID;
    public PlayGround PG;
    public Player P;

    /**
     *
     * @param ID , The ID refer to the playground. 
     * @param Hours , The hours that the player will request to reserve it. 
     * @param P , The player who make the request.
     * @param s , The day that the player will request.
     * @param ps , The playgrounds.
     */
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

    /**
     * set playground equal to the ID of playground that will be requested.
     */
    public void setPG(){
        for(int i=0; i<ps.PG.size() ;i++){
            if(ps.PG.get(i).getId()==this.ID)
                PG=ps.PG.get(i);
        }
    }

    /**
     * display all requests.
     */
    public void viewRequest(){
        System.out.println("PlayGround ID: "+ID);
        System.out.println("Player Name: "+P.getName());
        System.out.println("Booking Day: "+s);
    }

    /**
     * set this request to the plater requests.
     */
    public void AddRequesttoPlayer(){
        P.AddRequest(this);
    }

    /**
     * set this request to the playdround owner requests.
     */
    public void AddRequesttoPGO(){
        PG.getPGO().AddRequest(this);
    }
}
