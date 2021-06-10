/*
 * This class is for all playgrounds.
 * 
 * .
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

public class PlayGrounds {
    
    /**
     * array list for playgrounds.
     */
    public ArrayList<PlayGround> PG = new ArrayList<PlayGround>();
    
    /**
     *
     * @param PGG , add playground to my list.
     */
    public void Add(PlayGround PGG){
        PG.add(PGG);
    }
    
    /**
     * display all playgrounds in the list.
     */
    public void ViewPlayGrounds(){
        for(int i=0;i<PG.size();i++){
            PG.get(i).displayinfo();
            System.out.println('\n');
        }
    }
}
