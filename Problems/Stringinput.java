package Problems;

import java.util.Scanner;


public class Stringinput {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
           int name = sc.nextInt();

           String Names[] = new String[name];


           for(int i = 0; i< name; i++) {
              Names[i]=sc.next();
               
           }
           for(int i = 0; i <Names.length; i++) {
            System.out.println(Names[i]);
               
           }





        
    }
}
