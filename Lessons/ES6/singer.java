package Lessons.ES6;

//ES6: define the singer class and the methods to extract infos

public class singer {
    private String valname;
    private String valsurname;
    private String valsong;

    public String name(){
        return valname;
    }

    public String surname() {
        return valsurname;
    }

    public String song() {
        return valsong;
    }

    public singer(String name,String surname, String song){
        this.valname=name;
        this.valsurname=surname;
        this.valsong=song;
    }

}
