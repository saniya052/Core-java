import java.util.*;

public class Ass2_q10 {
	
         
   public static void main(String args[]) {
	    int arr1[]=new int[20];
		System.out.println("Enter array size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n<=0) {
			  System.out.println("Invalid");
			  System.exit(0);
		  }
		else {
			for(int i=0;i<n;i++) {
				arr1[i]=sc.nextInt();
				if(arr1[i]<0) {
					System.out.println("Invalid");
					System.exit(0);
				}
			}
      }
		
		System.out.println("Search no: ");
		int search=sc.nextInt(),count=0;
		 
	    for(int i=0;i<arr1.length;i++) {
	    	if (arr1[i]== search) {
	    		count++;
	    	}
	    }
       
       System.out.print("Count: "+count);
  }
}
