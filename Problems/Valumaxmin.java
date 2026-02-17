package Problems;

import java.util.Scanner;

public class Valumaxmin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int value= sc.nextInt();

        int[] values = new int[value];


        for (int i = 0; i < value; i++) {
            values[i] = sc.nextInt();
            
        }

        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        for (int i = 0; i<values.length; i++) {
             if (values[i] < min) {
                 min = values[i];            
             }
             if(values[i] > max) {

                max = values[i];
                
             }

            
                
              
        }
        System.out.println("this is max");
        System.out.println(max);
        System.out.println("this is min");
        System.out.println(min);
    }
    
}
