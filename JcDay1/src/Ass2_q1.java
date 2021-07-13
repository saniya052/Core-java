/*
1) Print "Salary too large" when salary is greater than 8000.
2) Print "Shifts too small" when the shift is less than 0.
3) Print "Salary too small" when the salary is less than 0
 
 */

import java.util.*; 

public class Ass2_q1 {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  salary amount in INR :");
	    double sal = sc.nextInt();
	    System.out.print("Enter the  no of shift's done in a month:");
	    int shifts= sc.nextInt();
	    System.out.print("Enter the no of days in a month:");
	    int days= sc.nextInt();
	    
	    
	    
	    if(shifts <= 0) {
	    	System.out.println("Shifts too small");
	    }
	    else {
	    	double food=sal*(0.2);
	    	double travel=sal*(0.3);
			double shift_money=((sal/days)*shifts)*(0.2);
			double saving=travel+food;
			System.out.println("Saving:"+saving);
	    	
	    	if(sal<=0) {
		    	System.out.println("Salary too small"+sal);
		    }
		    else if(sal >=8000) {
		    	System.out.println("Salary too big"+sal);
		    }
		    else {
		    	System.out.println("Salary is average" +sal);	
		    }
	    }
	    
	     
	    
	}
}
