/*
write a program to accept a number from the command line and check if it is a prime number. 
*/
import java.util.*;  

public class TypeCastingDemo {
   
	    public static void main (String args[])
	    {
            int n=0;
              //n= Integer.parseInt(args);
              
              int num = 1, i = 2;
              boolean flag = false;
              
              while (i <= num / 2) {
              
                if (num % i == 0) {
                  flag = true;
                  break;
                }

                ++i;
              }

              if (!flag)
                System.out.println(num + " is a prime number.");
              else
                System.out.println(num + " is not a prime number.");
                
	    
            }
              
              
}
	    

