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
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        PlayGrounds Play_Grounds=new PlayGrounds();
        Player Player1=new Player(Play_Grounds,"Abou-treka","Ab0109238373A","Abou-treka@gmail.com","010011012015","Al-Talbia",22);
        PlayGroundOwner PlayGround_Owner= new PlayGroundOwner("Cap.MoSalah","Mo@122234123","AboSalah@yahoo.com","0110100012015","Faisal",11);
        PlayGround PG1=new PlayGround(PlayGround_Owner,"Faisal",2,1,120);
        PlayGround PG2=new PlayGround(PlayGround_Owner,"Imbaba",3,2,100);
        PlayGround PG3=new PlayGround(PlayGround_Owner,"Haram",2,3,150);
        int a[][]={{1,4,5,6,7},{3,5,7,9},{4,8,11,14,17},{4,6,8},{4,6,7},{1,2},{5,8}};
        int b[][]={{1,6,9,11},{3,6,7},{3,4,5,6,7},{7,9,11},{4,6,7},{4,8},{11}};
        int c[][]={{3,5,7},{1,7,9},{2,6,10,14,15},{1,2,3},{4,6,7},{9,10},{2}};
        for(int i=0;i<7;i++){
            PG1.setAvaliablehours(a[i]);
            PG2.setAvaliablehours(b[i]);
            PG3.setAvaliablehours(c[i]);
        }
        Play_Grounds.Add(PG1);
        Play_Grounds.Add(PG2);
        Play_Grounds.Add(PG3);
        PlayGround_Owner.AddPG(PG1);
        PlayGround_Owner.AddPG(PG2);
        PlayGround_Owner.AddPG(PG3);
        Player1.ViewPs();
        int HourstoBook[]={6,11};
        Request R=new Request(2,HourstoBook,Player1,"SatDay",Play_Grounds);
        R.AddRequesttoPlayer();
        R.AddRequesttoPGO();        
    }
    
}
