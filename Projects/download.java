package Projects;

//Import a library to manage IOException
import java.io.IOException;

//This class download files from URL into a file
public class download {
    //RAW file on github 
    public static String fileURL = "https://raw.githubusercontent.com/pcm-dpc/COVID-19/master/dati-regioni/dpc-covid19-ita-regioni-latest.csv";

    //Relative path to save the downloaded file
    public static String filePATH = "Projects/data.csv";

    public static void main(String[] args) throws IOException {
        //Create an object from the class that read file from internet
        fileURLdownload d = new fileURLdownload(fileURL, filePATH);

            //Send download metod
            d.download();
        }
}
