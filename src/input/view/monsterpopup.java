package input.view;

import javax.swing.JOptionPane;

public class monsterpopup
{
	private monsterpopup myPopups;
	
	//Methods for popups
	
	//Grab String
	public String grabAnswer(String stuff)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, stuff);
		return answer;
	}
	
	//Grab Integer
	public int grabInteger(int stuff)
	{
		int numberGrab = 0;
		numberGrab = JOptionPane.showInputDialog();
		return numberGrab;
	}
	
	//Grab Double
	public double grabDouble()
	{
		double doubleGrab = 0.0;
		doubleGrab = JOptionPane.showInputDialog();
		return doubleGrab;
	}
	
	//Grab Boolean
	public boolean grabBoolean()
	{
		boolean booleanGrab = false;
		booleanGrab = JOptionPane.showInputDialog();
		return booleanGrab;
	}
	
	//Show Answer
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	//Commence the process
	public void start()
	{
		String monsterName = myPopups.grabAnswer("Type in a better name for the monster");
		myPopups.showResponse("You typed in: " + monsterName);
		
		int userEyes = myPopups.grabInteger("Type in a different number of eyes for the monster");
		int monsterEyes = Integer.parseInt(userEyes);
		myPopups.showResponse("You typed in: " + monsterEyes); 
		
		int userNoses = myPopups.grabInteger("Type in a different number of noses for the monster");
		int monsterNoses = Integer.parseInt(userNoses);
		myPopups.showResponse("You typed in: " + monsterNoses);
		
		double userHairs = myPopups.grabDouble("Type in a better number of hairs for the monster");
		int monsterHairs = Double.parseDouble(userHairs);
		myPopups.showResponse("You typed in: " + monsterHairs);
		
		double userLegs = myPopups.grabDouble("Type a better number of legs for the monster");
		int monsterLegs = Double.parseDouble(userLegs);
		myPopups.showResponse("You typed in: " + monsterLegs);
		
		boolean userBellyButton = myPopups.grabBoolean("Type in a better boolean for the monster's belly button");
		int monsterBellyButton = Boolean.parseBoolean(userBellyButton);
		myPopups.showResponse("Youtyped in: " + monsterBellyButton);
	
		myPopups.showResponse("Your monster's name is: " + monsterName + ", it has " +monsterEyes + " Eyes, " + monsterNoses + " Noses, " + monsterHairs + " Hairs, " + monsterLegs + " Legs, and its Belly Button is: " + monsterBellyButton + "."); 
	}
	
	
}
