package Problems;
import java.util.Scanner;

public class AgeChecker {
    public static String AgeCheck(int a) {
         
            if (a>=18) {
             return  "  You are Eligible for Vote";
                
            }else {
                return "You are NOT 33Eligible for Vote ";
                
            }
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("ENTER YOUR AGE");
        int a = sc.nextInt();
        
       
       
        System.out.println(AgeCheck(a));


    }
}
