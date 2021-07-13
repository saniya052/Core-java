import java.util.*;

public class Ass2_q6 {
	public static void main (String args[]) {
		int arr[]=new int[100];
		System.out.println("Enter array size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n<=0) {
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
				/*else if(i%2!=0){
					System.out.println("Enter cricketer id:");
				}
				else {
					System.out.println("Enter score of that cricketer:");
				}*/
			}
			
		}
		
		System.out.println("Enter the score for comapring:");
		int score=sc.nextInt();
	
		int count=0;
		
		for(int i=1;i<arr.length;i+=2) {
			if(arr[i]>=score) {
				count++;
			}
		}
		
		System.out.println("Ans: "+count);
	}		
}

