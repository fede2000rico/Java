package Lessons;
// ES3: Create a class that describes a polygon in 2D, each polygon it's a sequence of cartesian coordinates.
// @author fede2


public class ES3polygon {
    //I use an array of coordinates (other class)
    private coordinates[] polygon;
    //Int that individuates the current position when it adds a new point
    private int current;


    //Custom constructor
    public ES3polygon(int sides){
        polygon= new coordinates[sides+1];
        current=0;
    }

    //Add point function
    public void addpoint(int x, int y){
        if(current<polygon.length){
            //Initialize the coordinates of array's item
            polygon[current]= new coordinates(x,y);
            current++;
        }
        else{
            System.out.println("Out of index!");
        }
    }

    //Remove last point
    public void rempoint(){
        polygon[current-1]= new coordinates(0,0);
        current--;
    }
    
    //Calculate the perimeter
    public double perimeter(){
        //Double value because it needs a square root
        double len=0.0;

        //Define a variable for each coordinate of the two points
        int x1,x2,y1,y2;

        //Cycle on every point
        for (int i=0;i<(polygon.length-1);i++) {

            //Case all pont except the last
            if(i!=polygon.length-2){
                x1=polygon[i].x();
                x2 = polygon[i+1].x();
                y1 = polygon[i].y();
                y2= polygon[i+1].y();

                //Distance formule
                len+= Math.sqrt(Math.pow((x2-x1),2) +Math.pow((y2 - y1),2));

            }

            //Last point
            else{
                x1 = polygon[0].x();
                x2 = polygon[i].x();
                y1 = polygon[0].y();
                y2 = polygon[i].y();

                len += Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            }
        }
        return len;
    }
    
    public static void main(String[] args) {
        ES3polygon pol =new ES3polygon(4);
        pol.addpoint(0, 0);
        pol.addpoint(0, 3);
        pol.addpoint(3, 3);
        pol.addpoint(3, 0);

        System.out.println(pol.perimeter());

    }
}
