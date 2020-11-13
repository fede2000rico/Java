package Lessons;
// ES1: Create a class that manage an integer set; add remove and print
// ES2: Create sum function using for and foreach
// @author fede2

public class ES1intSet{
    //Variables definition
    private int[] numbers;
    private int currentpos;

    //Custom constructor
    public ES1intSet(int dimension){
        numbers=new int[dimension];
        currentpos=0;
    }

    //Add function
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

    //Remove function
    public void remove(){
        //Set to 0 the current item
        numbers[currentpos-1]=0;

        //Decrease the current position
        currentpos--;
    }

    //Print function
    public String print(){
        String str = "Set: {";
        for (int i : numbers) {
            str+=i + ", ";
        }
        str=str.substring(0, str.length()-2);
        str+="}";
        return str;
    }

    //Sum all items value using for
    public int sumfor(){
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        return sum;
    }

    //Sum all items value using foreach
    public int sumforeach(){
        int sum=0;
        for (int i : numbers) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        ES1intSet firstset= new ES1intSet(5);

        //Add random items
        firstset.add(1);
        firstset.add(2);
        firstset.add(3);

        //Try to remove
        firstset.remove();
        
        // Printout
        System.out.println(firstset.print());

        // Print sum
        System.out.println("Sum=" + firstset.sumfor());

        firstset.add(3);

        //Add duplicate
        firstset.add(2);

        //Print sum
        System.out.println("Sum=" +firstset.sumforeach());

        //Printout
        System.out.println(firstset.print());

    }
}