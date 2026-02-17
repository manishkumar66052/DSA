package Problems;


import java.util.Scanner;

public class Average {
    public static double   Aver(int a, int  b, int c) {
             return (a+b+c)/3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        
        System.out.println("THE AVERAGE OF"+ Aver(a, b, c));
    
    }
          
}
