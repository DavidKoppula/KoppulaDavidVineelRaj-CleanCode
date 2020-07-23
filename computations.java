package com.Interest;
import java.lang.Math;
public class Interest {
 double calculateCompoundInterest(double Principal,double rate,double time_period)
 {
	 return (Principal*(Math.pow(1+rate/100,time_period)));
 }
  float CalculateSimpleInterest(float principal,float rate,float time_period)
	{
		return (principal*rate*time_period)/100;
	}


}