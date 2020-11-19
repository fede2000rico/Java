package Projects.Instaanalysis;

//Imports all libraries
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVreader {

    // Create string's array that contains data
    private ArrayList<String> users = new ArrayList<>();

    //Custom constructor
    public CSVreader(String path){
        //Create variable to read the *.csv file
        String line = "";

        try {
            // parsing a CSV file into BufferedReader class constructor
            try(BufferedReader br = new BufferedReader(new FileReader(path))){

                //While there are data
                while ((line = br.readLine()) != null) 
                {
                    //Split the line into an array and set into region
                    users.add(line);
                }
            }

        //Manage exception
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Print entire value of region (array)
    public void print(){
        String full="";
        for (String str : users) {
            full+= str +", ";
        }
        System.out.println(full);
    }   

    public boolean contain(String user){
        return users.contains(user);
    }

    public String read(int index){
        return users.get(index);
    }

    public int length(){
        return users.size();
    }
   
}

