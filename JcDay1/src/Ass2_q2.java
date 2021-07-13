import java.util.*;

public class Ass2_q2 {

	public static void main (String args[]) {
	    int c=0;
	    int arr[]=new int[100];

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		  if(n<0) {
			  System.out.println("Invalid");
			  System.exit(0);
		  }
		  else {
			  			  
			  for(int i=0;i<n;i++) {
				  arr[i]=sc.nextInt();
				  if(arr[i]<0) {
					System.out.println("Invalid");
					System.exit(0);
				  }
			   }
			  
			/// Arrays.sort(arr);
			  for(int i=0;i<n;i++) {
				  System.out.println("Count:"+arr[i]);
				  if(arr[i]==arr[i+1]) {
					  c++;
				  }
			  }
			  
			  for(int i=0;i<n;i++){
				  
				  for(int j=i+1;j<n;){
					  
					  if(arr[i]==arr[j]){
						  
						  c++;
						  
						  for(int k=j;k<n;k++) {
						    arr[k]=arr[k+1];
						     n--;
						     
						    }
						 }
					   else
						  j++;
					  }
				  }
			  System.out.print(c);
			}
	}
}
