package Problems;

import java.util.Scanner;

public class Circle {
    public static double  Circumference(double  radius) {
        //double diameter=radius*2;
        //10double Circum= 3.142*diameter;
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextInt();

        System.out.println(Circumference(radius));
    }
    
}
