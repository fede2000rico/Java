package Lessons;
// Create a class that manage an integer set; add remove and print
// @author fede2

public class intSet{
    private int[] numbers = new int[5];
    private int current_pos;

    public intSet(){
        current_pos=0;
    }

    public void add(int new_item){
        //Check if new_item already exists
        for (int i : numbers) {
            if(i==new_item) {
                System.out.println("New item already exists!");
                return;
            }
        }

        //Check if the current position is still in the array (index too high maybe)
        if(current_pos>=numbers.length) {
            return;
        }

        //If the item pass the previous conditions than it can be added
        numbers[current_pos]=new_item;

        //Increase the current position
        current_pos++;
        return;
    }

    public void remove(){
        //Set to 0 the current item
        numbers[current_pos-1]=0;

        //Decrease the current position
        current_pos--;
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
        intSet firstset= new intSet();
        firstset.add(1);
        firstset.add(2);
        firstset.add(3);
        firstset.remove();
        firstset.add(3);
        firstset.add(2);
        System.out.println(firstset.print());

    }
}