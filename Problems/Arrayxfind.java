package Problems;

import java.util.Scanner;

public class Arrayxfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int size =sc.nextInt();

            int number[] =new int[size];

            int x=sc.nextInt();

            for (int i = 0; i < size ; i++) {
                number[i] = sc.nextInt();
                
            }

            for (int i = 0; i <number.length; i++) {
                if (number[i]==x) {
                    System.out.println("x is found"+i);
                    
                }
               
                
            }
          
           
        }
    }
}
