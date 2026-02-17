package Problems;

import java.util.Scanner;

public class Greaternumber {
    public static int Comapre(int a, int b) {
        if ( a >b  & a==b) {
            return a;
            
        }else{
            return b;

        }
        
       
    }  
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();  
        
       int com = Comapre(a, b);
       System.out.println(com);
    } 
}
