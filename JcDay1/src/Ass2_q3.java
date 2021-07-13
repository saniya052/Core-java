import java.util.*;


public class Ass2_q3 {
	

private static int max(int e, int o) {
// TODO Auto-generated method stub
	if(e>o) return e;
return o;
}
	public static void main (String args[]) {
		    int e=0,o=0;
		    
		    int arr[]=new int[100];

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
				}
				
				for(int i=0;i<n;i++) {
					if(arr[i]%2 == 0) {
						e+=arr[i];
					}
					else {
						o+=arr[i];
					}
				}
				int ans= max(e,o);
				System.out.println(ans);
				
			}
		    
			
	}
}
