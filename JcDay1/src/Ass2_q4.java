import java.util.*;
public class Ass2_q4 {
	public static void main (String args[]) {
	   int a[]=new int[]{500,100,50,5,1};
	   
	   Scanner sc=new Scanner(System.in);
	   int fees=sc.nextInt();
	   int count=0,rs=0,i=0;
	   while(rs<= fees) {
		   rs=(500 - fees);
	      if( (500 - fees)>0 &  rs>=500 ){
				   count++;
			   }
	      else if((100 - fees)>0 & rs>=100 ) {
	    	  count++;
	      }
		   
	      else if((50 - fees)>0 & rs>=50){
	    	  count++;
	      }
         else if((5 - fees)>0 & rs>=5) {
        	 count++;
         }
         else if((1 - fees)>0 & rs>=1 ) {
        	 count++;
         }
	   }
	  System.out.println(count);
	}
	
}
