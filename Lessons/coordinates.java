package Lessons;

public class coordinates {
    private int x;
    private int y;

    public coordinates(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int x(){
        return x;
    }

    public int y(){
        return y;
    }

    public String print(){
        String str="(";
        str+= x + ", ";
        str+=y + ")";
        return str;
    }

    public static void main(String[] args) {
        coordinates var1= new coordinates(1, 2);
        System.out.println(var1.print());
    }
}


