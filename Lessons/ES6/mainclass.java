package Lessons.ES6;

//Create a class to handle a music event, with the name of the event and the list of all singers

import java.sql.Date;
import java.util.ArrayList;

public class mainclass {
    

    private static ArrayList<singer> definelineup(ArrayList<singer> lineup){
        lineup.add(new singer("Paolo","Bitta","Dio delle città"));
        lineup.add(new singer("Luca", "Nervi", "Piccola katy"));
        lineup.add(new singer("Silvano", "Rogi", "Prova"));
        lineup.add(new singer("Olmo", "Cognome", "Test"));
        return lineup;
    }
    public static void main(String[] args) {
        ArrayList<singer> lineup = new ArrayList<>();
        challenge current;
        ArrayList<challenge> list = new ArrayList<>();
        current=new challenge("Paolo Bonolis", "Gattopardo", new Date(2000, 11, 21), definelineup(lineup));
        list.add(current);
        current.print();
        
    }
}
