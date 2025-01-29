package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What amount of money did you start with?");
		double startAmount = in.nextDouble();

		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();

		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		while (startAmount > 0 && startAmount < winLimit) {
			
			
			double random = Math.random();
			if (random <= winChance) {
				System.out.println(startAmount++);
			}
			if (random > winChance) {
				System.out.println(startAmount--);
			}
			System.out.println(startAmount);
		}
	}
}
