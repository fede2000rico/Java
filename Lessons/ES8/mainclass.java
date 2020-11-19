package Lessons.ES8;

public class mainclass {
    public static void main(String[] args) {
        complex n1 = new complex(2,0);
        complex n2 = new complex(0,1);
        complex sum;

        System.out.println("N1: "+ n1.real() +"+ i"+ n1.immaginary() + " - " + n1.module() +", "+ (int) (n1.phase() * 180 / 3.14));
        System.out.println("N2: " + n2.real() + "+ i" + n2.immaginary() + " - " + n2.module() + ", " + (int)(n2.phase()*180/3.14));

        sum = n1.sum(n2);

        System.out.println("N2: " + sum.real() + "+ i" + sum.immaginary() + " - " + sum.module() + ", " + (int)(sum.phase()*180/3.14));
    }
}
