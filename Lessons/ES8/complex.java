package Lessons.ES8;

public class complex {
    double r;
    double i;

    public complex(double r, double i){
        this.r=r;
        this.i=i;
    }
    
    public double module(){
        return Math.sqrt(Math.pow(r, 2)+Math.pow(i, 2));
    }

    public double phase(){
        return Math.atan(i/r);
    }

    public double real(){
        return r;
    }

    public double immaginary(){
        return i;
    }

    public complex sum(complex value){
        double rsum;
        double isum;
        rsum=r+value.real();
        isum=i+value.immaginary();
        return new complex(rsum,isum);
    }
}
