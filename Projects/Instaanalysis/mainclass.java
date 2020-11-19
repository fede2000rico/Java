package Projects.Instaanalysis;

import java.util.ArrayList;

public class mainclass {
    private static String FILEfws="Projects/Instaanalysis/followers.CSV";
    private static String FILEfwg="Projects/Instaanalysis/following.CSV";

    public static void main(String[] args) {
        CSVreader followers = new CSVreader(FILEfws);
        CSVreader following = new CSVreader(FILEfwg);

        ArrayList<String> notfollow =new ArrayList<>();

        for (int i=0;i<following.length();i++) {
            String user= following.read(i);
            if(!followers.contain(user)){
                notfollow.add(user);
            }
        }

        String full="";
        for (String str : notfollow) {
            full+= str +", ";
        }
        System.out.println(full);
    }
}


// 153193726517970
// 10c33f34649b73963552fbc7a6d0d03d