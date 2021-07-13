import java.util.*;

public class Ass2_q7 {

    public static void main (String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the  Temprature in Ferenhit:");
      
      float f= sc.nextInt();
      double c;
      
      c=(f-32)/1.8000;
      if(f<0) {
    	  System.out.println("Invalid");
    	  System.exit(0);
      }
      else {
    	  System.out.println("Temprature in Ferenhit:"+String.format("%.2f", f)+"`F");
          System.out.println("Temprature in Centigrade:"+String.format("%.2f", c)+"`C");
          //System.out.print(String.format("%.2f", c));

      }
     
      
    }
}
