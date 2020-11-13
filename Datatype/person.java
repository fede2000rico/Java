package Datatype;

public class person {
    private String name;
    private int age;
    private String gender;
    private boolean registered;

    //Custom conpersonor
    public person(String name,int age, String gender, boolean reg){
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
        String str;

        str= this.name+ ", " +this.age + ", " +this.gender + ", " +this.registered;

        return str;
    }


    public static void main(String[] args) {
        person person1 = new person("Federico",20,"Male",true);

        System.out.println(person1.toString());

    }
}
