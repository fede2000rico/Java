package Projects;

public class mainclass{
    public static String fileURL = "https://raw.githubusercontent.com/pcm-dpc/COVID-19/master/dati-regioni/dpc-covid19-ita-regioni-latest.csv";
    public static String filePATH = "Projects/data.csv";
    public static String region="Bolzano";
    public static void main(String[] args) {
        CSVread data = new CSVread();
        data.print(data.dataregion(filePATH,region));
    }
}