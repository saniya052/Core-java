import java.util.*;

public class Ass2_q5 {
	public static int amount(int km) {
		int ans=1;
		if(km<0) {
			return -1;
		}
		else {
			while(km>0) {
				int rem=km%10;
				ans*=rem;
				km/=10;		
			}
			if(ans > 32767) {
				return -1;
			}
			else {
				return ans;
			}
		}
		
		//return km;
	}
	
	public static void main (String args[]) {
		System.out.println("Enter the km travlelled:");
		Scanner sc=new Scanner(System.in);
		int km=sc.nextInt();
		int ans=amount(km);
		if(ans>0) {
			System.out.println("Your Money as per the"+km+ "km "+" is: "+ans+" Rs");
		}else {
			System.out.println("INvalid");
		}
		
	}
}
