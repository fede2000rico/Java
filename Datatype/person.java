package Datatype;
//Working with datatypes in Java
//@author fede2

public class person {
    //Variables declaration
    private String name;
    private int age;
    private String gender;
    private boolean registered;

    //Custom constructor
    public person(String name,int age, String gender, boolean reg){

        //Set the variables
        this.name=name;
        this.age = age;
        this.gender=gender;
        this.registered=reg;
    }

    //#region Edit methods
    
    //These are the functions that edit the class variables
    public person editname(String newname){
        this.name=newname;
        return this;
    }

    public person editage(int newage) {
        this.age = newage;
        return this;
    }

    public person editgender(String newgender){
        this.gender=newgender;
        return this;
    }

    public person editreg(boolean newreg) {
        this.registered = newreg;
        return this;
    }
    //#endregion

    public String toString(){

        //Declare string
        String str;

        //Set the string
        str= this.name+ ", " +this.age + ", " +this.gender + ", " +this.registered;

        //Return edited string
        return str;
    }
}
