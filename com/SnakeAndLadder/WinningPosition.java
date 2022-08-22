package com.SnakeAndLadder;

public class WinningPosition {
	public static final int winningPosition = 100;

	public static void optionChecking(){
		
		int min = 1;
		int max =6;
	//	int dieRoll = (int) (Math.random() * (max-min+1) + min);
	//	System.out.println("Get Number is "+ dieRoll);
		int playerPosition = 0; int presentPosition = 0;
		for(presentPosition = 0; presentPosition <= winningPosition; presentPosition++) {
		//	dieRoll++;
			int dieRoll = (int) (Math.random() * (max-min+1) + min);
		    int option = (int) Math.floor(Math.random() * 10) % 3;
		if(option == 1) {
			System.out.println("Option is Ladder ");
			playerPosition = dieRoll;
			System.out.println("Player Position is "+dieRoll);
		}
		else if (option == 2) {
			System.out.println("Option is Snake");
			playerPosition = -dieRoll;
			System.out.println("Player Position is "+(-dieRoll));
		} else {
			System.out.println("No Play");
		}
		presentPosition += playerPosition;
		
	}
		System.out.println(presentPosition);
	}
	public static void main(String[] args){
		optionChecking();
		
	}
}
