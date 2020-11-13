//In this package there are all the files *.java in the folder
package Datatype;
//Working with Java class import
//@author fede2

public class array{

    //Main
    public static void main(String[] args) {
        //Create an array of objects
        person person1[] = new person[4];

        //Set the first two values of the array
        person1[0]=new person("Federico",20,"Male",true);
        person1[1] = new person("Pippo", 30, "Female", false);

        //For cycle over every array's item
        for(int i=0; i<person1.length; i++){

            //Check if isn't null
            if(person1[i]!=null){
                //Printout the value of the array's item
                System.out.println(person1[i].toString());
            }
        }

    }
}
