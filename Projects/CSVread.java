package Projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CSVread {
    private String path ="";
    private String[] region;

    public CSVread(String path, String dataregion){
        this.path=path;
        String line = "";
        String splitBy = ",";
        String[] err ={"Error"};
        try {
            // parsing a CSV file into BufferedReader class constructor
            try(BufferedReader br = new BufferedReader(new FileReader(path))){
                while ((line = br.readLine()) != null) 
                {
                    region = line.split(splitBy); 
                    if(region[3].contains(dataregion)){
                        region= Arrays.copyOfRange(region, 0, (region.length-1));
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        region= err;
    }

    public void print(){
        String full="";
        for (String str : region) {
            full+= str +", ";
        }
        System.out.println(full);
    }

    public void printuseful(){
        System.out.println("Dati Bolzano");
        System.out.println("Incremento positivi: "+ region[12]);
        System.out.println("Incremento deceduti: " + region[14]);

    }
    
}
