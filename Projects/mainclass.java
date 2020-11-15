package Projects;

import java.io.IOException;

public class mainclass {
    // Initial declaration
    public static String fileURL = "https://raw.githubusercontent.com/pcm-dpc/COVID-19/master/dati-regioni/dpc-covid19-ita-regioni-latest.csv";
    public static String filePATH = "Projects/data.csv";
    public static String region = "Bolzano";

    //Include IOException because also download() will include
    public static void main(String[] args) throws IOException {
        //Download the file
        fileURLdownload file =new fileURLdownload(fileURL, filePATH);
        file.download();
        
        //Create a reader object
        CSVread reader = new CSVread(filePATH,region);
        reader.print();
        reader.printuseful();
    }
}