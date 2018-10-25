//Lucas Armand
//Computer Science Period 5

import java.util.Scanner;

public class Craps {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int roll1,roll2;
		
		int point = 0;
		do {
			System.out.print("Press 'enter' to roll the dice...");
			in.nextLine();
			roll1 = d1.roll();
			roll2 = d2.roll();
			System.out.println("Rolled " + roll1 + " and " + roll2);
			point = roll1 + roll2;
			
			mainSwitch:
			if (point == 11 || point == 7) {
				System.out.println("Congrats, you rolled " + point + ", with " + roll1 + " and " + roll2 + ", so you win!");
			}
			else if (point == 12 || point == 2) {
				System.out.println("Sorry, you rolled " + point + ", with " + roll1 + " and " + roll2 + ", so you lose");
			}
			else {
				System.out.println("Point set at " + point);
				do {
					System.out.print("Press 'enter' to roll the dice...");
					in.nextLine();
					roll1 = d1.roll();
					roll2 = d2.roll();
					System.out.println("Rolled " + roll1 + " and " + roll2);
					if (roll1 + roll2 == 7) {
						System.out.println("Sorry, you rolled 7, with " + roll1 + " and " + roll2 + ", so you lose");
						break;
					}
				}while(roll1 + roll2 != point);
				if (roll1 + roll2 != 7) {System.out.println("Congrats, you rolled your point of " + point+ ", with " + roll1 + " and " + roll2 + ", so you win!");}
			}
			System.out.println("Play Again? Y/N: ");
		}while(in.nextLine().toUpperCase().equals("Y"));
	}
}
