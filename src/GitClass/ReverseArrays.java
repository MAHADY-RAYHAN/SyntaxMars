package GitClass;

import java.util.Scanner;

public class ReverseArrays {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] day = new String[7];

		for (int i = 0; i < 7; i++) {
			System.out.println("Please enter day " + (i + 1) + " of the week ");
			day[i] = input.next();
		}

		input.close();

		for (int i = 0; i < day.length; i++) {
			System.out.println(day[i]);

		}
		
		}
	
}
