import java.util.*;

public class Ass2_q9 {
	
  public static int isprime(int num) {
	  int n=0;
      int i = 2;
      boolean flag = false;
      if(num==1) {
    	  flag= true;
      }
      while (i <= num / 2) {
      
        if (num % i == 0) {
          flag = true;
          break;
        }

        ++i;
      }
      
      
      if (!flag)
        return 1;
      else
       return -1;
	}
  
  
  public static void sum(int arr[],int n) {
	  int sum=0,c=0;
	  
	  for(int i=0;i<n;i++) {
		  int k=isprime(i+1);
		  if(k== 1) {
			  sum+=arr[i];
			  c+=1;
			  //System.out.print(arr[i]);
		  }
	  }
	  
	  System.out.println("ans: "+sum/c);
  }
 
   public static void main(String args[]) {
	   int arr1[]=new int[100];
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
		
		sum(arr1,n);
   }
   
} 
