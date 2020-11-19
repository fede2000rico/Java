import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
