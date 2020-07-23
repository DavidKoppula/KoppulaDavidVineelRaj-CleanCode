package ConstructionOfHouse;

public class ConstructionCost {
	
	float calculateConstructionCost(String material,float no_of_square_feet)
	{
		
		if(material.equals("standard"))
		{
			return 1200*no_of_square_feet;
		}
		else if(material.equals("above standard"))
		{
			return 1500*no_of_square_feet;
		}
		else if(material.equals("high standard"))
		{
			return 1800*no_of_square_feet;
		}
		else if(material.equals("hidh standard and fully automated home"))
		{
			return 2500*no_of_square_feet;
		}
		else {
		return 0;
		}
	}

}
