package com.Interest;
import java.util.*;
class CalculatingInterests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.format("%s","1)Select This option for Calculating Simple Interest 2)Select This option for Calculating Compound Interest");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: SimpleInterest si =new Interest();
			   System.out.format("%s","enter principal amount");
		       float principal = sc.nextFloat();
			   System.out.format("%s","enter rate of interest");
		       float rate = sc.nextFloat();
			   System.out.format("%s","enter timeperiod");
		       float timeperiod = sc.nextFloat();
		       float interest_obtained = si.CalculateSimpleInterest(principal,rate,timeperiod);
		       System.out.format("%f",interest_obtained);
		       break;
		case 2:CompoundInterest ci = new Interest();
		       System.out.format("%s","Enter principle amount");
		       double principal1 = sc.nextDouble();
		       System.out.format("%s","Enter rate of interest");
		       double rate_of_interest = sc.nextDouble();
		       System.out.format("%s","Enter number of years");
		       double num_of_years = sc.nextDouble();
		       double interest_obtained1 = ci.calculateCompoundInterest(principal1,rate_of_interest,num_of_years);
		       System.out.format("%f",interest_obtained1);
		       break;

		}
		

	}

}
