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
		
		System.out.println("How many days of simulations do you want to run?");
		double totalSimulations = in.nextDouble();
		
		
		
		
		
		
		//keeps track of the current day
		
		int currentDaySimulation = 1;
		
		
		
		
		while (currentDaySimulation < totalSimulations) {
		
		System.out.println("Day " + currentDaySimulation);
		currentDaySimulation = currentDaySimulation + 1; 
		
		
			
		// game day simulation, we go big or we go home
		double currentAmount = startAmount;
		
		
		//generates our game simulation 
		int playCounter = 0;
		int gameOver = 0;
		
		
		
		//one day's simulation
		
			while(gameOver == 0) {
				
				boolean winTrue = false;
				double gameSimulation = Math.random();
				playCounter = playCounter + 1;
				
				//losing condition
				if (gameSimulation > winChance) {
					currentAmount = currentAmount - 1;
					System.out.println("Play " + playCounter + ": " + " Lost");
					
				}
				
				
				//winning condition 
				
				if (gameSimulation <= winChance) {
					currentAmount = currentAmount + 1;
					System.out.println("Play " + playCounter + ": " + " Won");
					
				}
				
				
				//checking conditions
				
					if (currentAmount >= winLimit) {
						gameOver = 1;
						winTrue = true;
						
						
						
						
						
					}
					if (currentAmount <= 0) {
						gameOver = 1;
						winTrue = false;
						
						
					
					
					}
					
					
					
				}
			
				
		
		
			System.out.println("Today is day " + currentDaySimulation + " ");
			System.out.print ("# of Plays: " + playCounter + " ");
			
			
		
			
		}
		

	}

}
