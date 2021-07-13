import java.util.*;

public class Ass2_q11 {
	
	static boolean isPowerOfTwo(int n)
	{
	    if(n==0)
	    return false;
	 
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==(int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}
	 
	public static void main(String[] args)
	{  
		System.out.println("Ente the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0) {
			System.out.println("Number too small");
		}
		else if(num> 32767){
			System.out.println("Number too large");
		}
		else {
			    if(isPowerOfTwo(num))
			    System.out.println("Yes");
			    else
			    System.out.println("No");
		}
	    
	     
	
	}
}
