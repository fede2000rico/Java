package Lessons.ES6;

import java.sql.Date;
import java.util.ArrayList;

//Define the class challenge and its methods

public class challenge {
    private String announcer;
    private String location;
    private Date date;
    private ArrayList<singer> lineup= new ArrayList<>();


    //Custom constructor
    public challenge(String announcer,String location, Date date, ArrayList<singer> lineup){
        this.announcer=announcer;
        this.location=location;
        this.date=date;
        for (singer i : lineup) {
            this.lineup.add(i);
        }
    }


    //Void to print infos
    public void print(){
        System.out.println("Announcer: " + announcer);
        System.out.println("Location: "+ location);
        System.out.println("Date: "+ date);
        System.out.println("Singers: ");
        for (singer i : lineup) {
            System.out.println("    -"+ i.name() +" "+ i.surname());
        }
    }
}
