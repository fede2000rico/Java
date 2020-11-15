package Projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CSVread {
    private static String path ="Projects/data.csv";
    private String[] region;

    public String[] dataregion(){
        String line = "";
        String splitBy = ",";
        String[] err ={"Error"};
        try {
            // parsing a CSV file into BufferedReader class constructor
            try(BufferedReader br = new BufferedReader(new FileReader(path))){
                while ((line = br.readLine()) != null) 
                {
                    region = line.split(splitBy); 
                    if(region[2].equals("21")){
                        region= Arrays.copyOfRange(region, 0, (region.length-2));
                        return region;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return err;
    }

    public void print(String[] input){
        String full="";
        for (String str : input) {
            full+= str +", ";
        }
        System.out.println(full);
    }
    
}
