package Lessons.ES7;

//ES7: create a class to handle a stack of integer

public class mainclass {
    public static void main(String[] args) {
        Stack list1=new Stack();
        for(int i=0; i<10;i++){
            list1.push(i);
        }
        list1.print();
        for (int i = 0; i < 2; i++) {
            list1.pop();
        }
        list1.print();
        
    }

}
