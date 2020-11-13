package Lessons;
// Create a class that manage an integer set; add remove and print
// @author fede2

public class intSet{
    //Variables definition
    private int[] numbers;
    private int currentpos;

    //Custom constructor
    public intSet(int dimension){
        numbers=new int[dimension];
        currentpos=0;
    }

    public void add(int newitem){
        //Check if newitem already exists
        for (int i : numbers) {
            if(i==newitem) {
                System.out.println("New item already exists!");
                return;
            }
        }

        //Check if the current position is still in the array (index too high maybe)
        if(currentpos>=numbers.length) {
            return;
        }

        //If the item pass the previous conditions than it can be added
        numbers[currentpos]=newitem;

        //Increase the current position
        currentpos++;
        return;
    }

    public void remove(){
        //Set to 0 the current item
        numbers[currentpos-1]=0;

        //Decrease the current position
        currentpos--;
    }

    public String print(){
        String str = "Set: {";
        for (int i : numbers) {
            str+=i + ", ";
        }
        str=str.substring(0, str.length()-2);
        str+="}";
        return str;
    }

    public static void main(String[] args) {
        intSet firstset= new intSet(5);

        //Add random items
        firstset.add(1);
        firstset.add(2);
        firstset.add(3);

        //Try to remove
        firstset.remove();
        firstset.add(3);

        //Add duplicate
        firstset.add(2);

        //Printout
        System.out.println(firstset.print());

    }
}