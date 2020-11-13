package Datatype;

public class personarray {
    private String name;
    private int age;
    private String gender;
    private boolean registered;

    //Custom conpersonor
    public personarray(String name,int age, String gender, boolean reg){
        this.name=name;
        this.age = age;
        this.gender=gender;
        this.registered=reg;
    }

    //#region Edit methods
    
    //These are the functions that edit the class variables
    public personarray editname(String newname){
        this.name=newname;
        return this;
    }

    public personarray editage(int newage) {
        this.age = newage;
        return this;
    }

    public personarray editgender(String newgender){
        this.gender=newgender;
        return this;
    }

    public personarray editreg(boolean newreg) {
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
        personarray person1[] = new personarray[4];
        person1[0]=new personarray("Federico",20,"Male",true);
        person1[1] = new personarray("Pippo", 30, "Female", false);

        for(int i=0; i<person1.length; i++){
            if(person1[i]!=null){
                System.out.println(person1[i].toString());
            }
        }

    }
}
