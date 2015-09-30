package input.view;

import javax.swing.JOptionPane;

public class monsterpopup
{
	private monsterpopup myPopups;
	
	public void start()
	{
		String monsterName = myPopups.grabAnswer("Type in a better name for the monster");
		myPopups.showResponse("You typed in: " + monsterName);
		
		int monsterEyes = myPopups.grabAnswer("Type in a different number of eyes for the monster");
		myPopups.showResponse("You typed in: " + monsterEyes); 
		
		int monsterNoses = myPopups.grabAnswer("Type in a different number of noses for the monster");
		myPopups.showResponse("You typed in: " + monsterNoses);
		
		double monsterHairs = myPopups.grabAnswer("Type in a better number of hairs for the monster");
		myPopups.showResponse("You typed in: " + monsterHairs);
		
		double monsterLegs = myPopups.grabAnswer("Type a better number of legs for the monster");
		myPopups.showResponse("You typed in: " + monsterLegs);
		
		boolean monsterBellyButton = myPopups.grabAnswer("Type in a better boolean for the monster's belly button");
		myPopups.showResponse("Youtyped in: " + monsterBellyButton);
	
		myPopups.showResponse
	}
	
	
}
