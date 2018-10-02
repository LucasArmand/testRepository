//Lucas Armand
//period 6 comp sci

import java.util.Scanner;
public class Pythag {

	public static void main(String[] args) {
		double sideA,sideB;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter side A of the rectangle: ");
		sideA = in.nextDouble();
		System.out.print("Please enter side B of the rectangle: ");
		sideB = in.nextDouble();
		
		System.out.printf("The area of the rectangle is      %.2f\n",sideA * sideB );
		System.out.printf("The perimeter of the rectangle is %.2f\n",2 * sideA  + 2 *  sideB );
		System.out.printf("The diagonal of the rectangle is  %.2f\n",Math.pow(sideA*sideA + sideB*sideB, 0.5));

	}

}
