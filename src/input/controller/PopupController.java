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
		
		String tempWeight= myPopups.grabAnswer("Type in your weight");
		double myWeight = Double.parseDouble(tempWeight);
		myPopups.showResponse("You typed in: " + myWeight);
	
		myTestThing = new Thingy(myName, myAge, myWeight);
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
