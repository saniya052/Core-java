package com.manipal.demo;
import java.util.*;

public class Account {
	public int accountNo  ;
	public double accountBalance ;
	public String accountType ;
	public  static int accountCount ;
	
	Account(int a,double b,String c,int d){
	   
		accountNo=a;
		accountBalance=b;
		accountType=c;
		accountCount=d;
	}
	
	void depositAmount(double amount)
	{
		// To add amount into account balance
		//Scanner sc=new Scanner(System.in);   
		accountBalance+=amount;
	}
	   
	 void getAccountDetails()
	 {
		 //  To display account details
		  System.out.println(accountNo+"  "+accountBalance+"  "+accountType+"  "+accountCount);
	 }
	

}
