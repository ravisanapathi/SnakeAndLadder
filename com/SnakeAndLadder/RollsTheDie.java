package com.SnakeAndLadder;

public class RollsTheDie {
	public static void main(String[] args){
	
	int min = 1;
	int max =6;
	int dieRoll = (int) (Math.random() * (max-min+1) + min);
	System.out.println("Get Number is "+ dieRoll);
	
	}

}
