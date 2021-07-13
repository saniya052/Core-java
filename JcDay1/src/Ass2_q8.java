import java.util.*;

public class Ass2_q8 {
	
   public static void highestFeedBack(int metlife[],int hardfort[],int size) {
	   for(int i=0;i<size;i+=2) {
		   if(metlife[i] == hardfort[i] ) {
			   if(metlife[i+1]>=hardfort[i+1]) {
				   System.out.println(metlife[i]+"---"+metlife[i+1]);
			   }
			   else {
				   System.out.println(hardfort[i]+"---"+hardfort[i+1]);
			   }	   
		   }
		   
		   else {
			   System.out.println(metlife[i]+"---"+metlife[i+1]);
			   System.out.println(hardfort[i]+"---"+hardfort[i+1]);
			   
		   }
	   }
   }
   public static void main(String args[]) {
	    int arr1[]=new int[100];
	    int arr2[]=new int[100];
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
			for(int j=0;j<n;j++) {
					arr2[j]=sc.nextInt();
					if(arr2[j]<0) {
						System.out.println("Invalid");
						System.exit(0);
					}
                }
			
			}
		  highestFeedBack(arr1,arr2,n);
		
		}
    
   
}

