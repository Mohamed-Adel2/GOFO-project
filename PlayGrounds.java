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
public class PlayGrounds {
    
    public ArrayList<PlayGround> PG = new ArrayList<PlayGround>();
    
    
    public void Add(PlayGround PGG){
        PG.add(PGG);
    }
    
    public void ViewPlayGrounds(){
        for(int i=0;i<PG.size();i++){
            PG.get(i).displayinfo();
            System.out.println('\n');
        }
    }
}
