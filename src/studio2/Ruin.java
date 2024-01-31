package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		
		//input values
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your starting amount?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		
		System.out.println("What is our win limit?");
		double winLimit = in.nextDouble();
		
		
		
		// game day simulation, we go big or we go home
		
		
		double currentAmount = startAmount;
		
		//generates our game simulation 
		
		double gameSimulation = Math.random();
		
		
		
		int gameOver = 0;
			while(gameOver == 0) {
				
				//losing condition
				if (gameSimulation > winChance) {
					currentAmount = currentAmount - 1;
					System.out.println("you lost, current money: " + currentAmount);
				}
				
				
				//winning condition 
				
				if (gameSimulation <= winChance) {
					currentAmount = currentAmount + 1;
					System.out.println("you won, current money: " + currentAmount);
				}
				
				
				//checking conditions
				
					if (currentAmount >= winLimit) {
						gameOver = 1;
					}
					if (currentAmount <= 0) {
						gameOver = 1;
					}
				}
		
			int j = 0;
			while (j < 2) {
				System.out.println("loop number" + j);
				j++;
			};
			
			for (int i = 0; i < 10; i++) {
			
				
				
			}
		

	}

}
