package input.controller;

import input.controller.InputRunner;
import input.model.Thingy;
import input.view.PopupDisplay;

public class PopupController
{
	private PopupDisplay myPopups;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String myName = myPopups.grabAnswer("Type  your name");
		myPopups.showResponse("You typed in: " + myName);
		String temp = myPopups.grabAnswer("Type in your age");
		int myAge;
		
		if(isInteger(temp))
		{
			myAge = Integer.parseInt(temp);
		}
		else
		{
			myAge = -9999999;
		}
		
		myPopups.showResponse("You typed in: " + myAge);
		
		String userNumber = myPopups.grabAnswer("Type in your age");
		int myAge = Integer.parseInt(userNumber);
		
		String tempWeight= myPopups.grabAnswer("Type in your weight");
		double myWeight = Double.parseDouble(tempWeight);
		
		while(!isInteger(userNumber))
		{
			userNumber = myPopups.grabAnswer("Type in a positive integer for your age!!!");
		}
		if(isInteger(userNumber))
		{
			myAge = Integer.parseInt(userNumber);
		}
		else
		{
			myAge = -9999999;
		}
			
		while(!isInteger(tempWeight))
		{
			temp = myPopups.grabAnswer("Type in a positive integer for your weight!!!");
		}
		if(isDouble(tempWeight))
		{
			myWeight = Double.parseDouble(tempWeight);
		}
		else
		{
			myWeight = -99.99;
		}
				
		myPopups.showResponse("You typed in: " + myWeight);
	
		myTestThingy = new Thingy(myName, myAge, myWeight);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
		double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		
		return isDouble;
	}
}