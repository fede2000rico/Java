package Projects;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class fileURLdownload {
    private String url;
    private String fileName;

    public fileURLdownload(String url, String fileName){
        this.url =url;
        this.fileName=fileName;
    }

    public void download() throws IOException{
        URL webUrl = new URL(url);
        Path path = Paths.get(fileName);
        try (InputStream in = webUrl.openStream()) {
            Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}

