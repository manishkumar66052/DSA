package Problems;

import java.util.Scanner;

public class AllOddSum {
    public static int SumOdd(int num) {
        int sum =0;
        for (int i = 1; i <=num; i++){
            if (i%2 !=0) {
                sum +=i;
                
            }
            
        }
        return sum;
    }
   
    
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
       
       
        System.out.println(SumOdd(num));
    }
    
}
