package com.manipal.demo;
import java.util.*;
public class AccountTest {

	public static void main(String[] args) {
		/*int i=1,j=1;
		Account a1=new Account(j,5000,"Saving A/C",i);
	    a1.getAccountDetails();
	    a1.depositAmount(5000);
	    a1.getAccountDetails();
	    i++;
	    j++;
	    Account a2=new Account(j,5000,"Current A/C",i);
	    a2.getAccountDetails();
	    a2.depositAmount(5000);
	    a2.getAccountDetails();
	    */
		
		Account[] cust=new Account[3];  
		
		for(int i=0;i<3;i++) {
			Scanner sc=new Scanner(System.in);
		    System.out.println("enter balance:");
		    int a=sc.nextInt();
		    System.out.println("Enter the Account type:");
			String b=sc.nextLine();
			System.out.println("Enter Deposite anount to:");
		    double amount=sc.nextInt();
			
			cust[i]=new Account(i,a,b,i);
			 //cust[i].getAccountDetails();  
			cust[i].depositAmount(amount);
			//cust[i].getAccountDetails();
			
			
		}
		
	}

}
