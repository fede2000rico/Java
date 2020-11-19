package Projects.Covidreader;

//Imports all libraries
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CSVread {
    //Create string's array that contains data
    private String[] region;

    //Custom constructor
    public CSVread(String path, String dataregion){
        //Create variable to read the *.csv file
        String line = "";

        //Split rule
        String splitBy = ",";

        //Return array in case of error
        String[] err ={"Error"};
        try {
            // parsing a CSV file into BufferedReader class constructor
            try(BufferedReader br = new BufferedReader(new FileReader(path))){

                //While there are data
                while ((line = br.readLine()) != null) 
                {
                    //Split the line into an array and set into region
                    region = line.split(splitBy); 

                    //Is this region?
                    if(region[3].contains(dataregion)){
                        region= Arrays.copyOfRange(region, 0, (region.length-1));
                        return;
                    }
                }
            }

        //Manage exception
        } catch (IOException e) {
            e.printStackTrace();
        }
        region= err;
    }


    //Print entire value of region (array)
    public void print(){
        String full="";
        for (String str : region) {
            full+= str +", ";
        }
        System.out.println(full);
    }

    //Print only useful data (Italian version)
    public void printuseful(){
        System.out.println("Dati Bolzano");
        System.out.println("Incremento positivi: "+ region[12]);
        System.out.println("Incremento deceduti: " + region[14]);
    }
    
}
