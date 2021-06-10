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
        
        PlayGrounds Play_Grounds=new PlayGrounds(); // Creating new object of playgrounds to held all play grounds
        Player Player1=new Player(Play_Grounds,"Abou-treka","Ab0109238373A","Abou-treka@gmail.com","010011012015","Al-Talbia",22);//register New Player
        PlayGroundOwner PlayGround_Owner= new PlayGroundOwner("Cap.MoSalah","Mo@122234123","AboSalah@yahoo.com","0110100012015","Faisal",11);//register new PlayGround Owner
        PlayGround PG1=new PlayGround(PlayGround_Owner,"Faisal",2,1,120);//register New PlayGround
        PlayGround PG2=new PlayGround(PlayGround_Owner,"Imbaba",3,2,100);//register New PlayGround
        PlayGround PG3=new PlayGround(PlayGround_Owner,"Haram",2,3,150);//register New PlayGround
        int a[][]={{1,4,5,6,7},{3,5,7,9},{4,8,11,14,17},{4,6,8},{4,6,7},{1,2},{5,8}};//Avaliable hours for first Playground
        int b[][]={{1,6,9,11},{3,6,7},{3,4,5,6,7},{7,9,11},{4,6,7},{4,8},{11}};//Avaliable hours for Second Playground
        int c[][]={{3,5,7},{1,7,9},{2,6,10,14,15},{1,2,3},{4,6,7},{9,10},{2}};//Avaliable hours for Third Playground
        for(int i=0;i<7;i++){//Assign Values of Avaliable Hours for the three play Grounds
            PG1.setAvaliablehours(a[i]);
            PG2.setAvaliablehours(b[i]);
            PG3.setAvaliablehours(c[i]);
        }
        Play_Grounds.Add(PG1);//Add the first PlayGround For PlayGrounds Object to store it
        Play_Grounds.Add(PG2);//Add the second PlayGround For PlayGrounds Object to store it
        Play_Grounds.Add(PG3);//Add the third PlayGround For PlayGrounds Object to store it
        PlayGround_Owner.AddPG(PG1);//Add the PlayGround For His Owner
        PlayGround_Owner.AddPG(PG2);//Add the PlayGround For His Owner
        PlayGround_Owner.AddPG(PG3);//Add the PlayGround For His Owner
        Player1.ViewPs();//Display All PlayGrounds In the System for User
        int HourstoBook[]={6,11};//Hours That User Need To Book
        Request R=new Request(2,HourstoBook,Player1,"SatDay",Play_Grounds);//Create Request Object that will be Send for PlayGround owner with info (hours and Day and player)
        R.AddRequesttoPlayer();//Add the Request of Booking to player
        R.AddRequesttoPGO();   //Add the Request of Booking to PlayGround Owner
        PlayGround_Owner.AcceptRequest(R);//PlayGround Owner will accept this request
    }
    
}
