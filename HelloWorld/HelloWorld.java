package HelloWorld;

//First Java App: It prints Helloworld!
//@author fede2


//Class declaration: public means that it's accessible from outside
public class HelloWorld {

    //main function declaration: static means that it's the same for every object in the code
    public void hello() {
        //Printout defoult function
        System.out.println("ABX");
    }

    //Main code
    public static void main(String[] args) {

        HelloWorld s = new HelloWorld();
        //Launch hello()
        s.hello();
    }

}