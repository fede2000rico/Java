package Projects;

import java.io.IOException;

public class download {
    public static String fileURL = "https://raw.githubusercontent.com/pcm-dpc/COVID-19/master/dati-regioni/dpc-covid19-ita-regioni-latest.csv";
    public static String filePATH = "C:/Users/fede2/OneDrive/Documenti/GitHub/Java/Java/Projects/data.csv";

    public static void main(String[] args) throws IOException {
        fileURLdownload d = new fileURLdownload(fileURL, filePATH);
            d.download();
        }
}
