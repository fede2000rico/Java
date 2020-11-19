package Projects.Covidreader;

//Imports all libraries
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//Define the class that reads file from internet and save into a file
public class fileURLdownload {

    //URL of download file
    private String url;

    //File path
    private String fileName;

    //Custom constructor
    public fileURLdownload(String url, String fileName){
        this.url =url;
        this.fileName=fileName;
    }

    public void download() throws IOException{
        //Create URL from string
        URL webUrl = new URL(url);

        //Create path from string
        Path path = Paths.get(fileName);

        //Try to avoid possible errors
        try (InputStream in = webUrl.openStream()) {
            //Copy from URL into file
            Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}

