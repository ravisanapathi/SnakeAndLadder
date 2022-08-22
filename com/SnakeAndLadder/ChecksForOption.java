package com.SnakeAndLadder;

public class ChecksForOption {

	public static void optionChecking(){
		int min = 1;
		int max =6;
		int dieRoll = (int) (Math.random() * (max-min+1) + min);
	//	System.out.println("Get Number is "+ dieRoll);
		
		int option = (int) Math.floor(Math.random() * 10) % 3;
		int playerPosition = 0;
		if(option == 1) {
			System.out.println("Option is Ladder ");
			playerPosition = dieRoll;
			System.out.println("Player Position is "+playerPosition);
		}
		else if (option == 2) {
			System.out.println("Option is Snake");
			playerPosition = -dieRoll;
			System.out.println("Player Position is "+playerPosition);
		} else {
			System.out.println("No Play");
		}
		
	}
	
	public static void main(String[] args){
		
		optionChecking();
		
		}

}
