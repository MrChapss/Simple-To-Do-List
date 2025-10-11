package STDL;

import java.util.Scanner;
import java.util.ArrayList;

public class TDL {
	public static void main(String[] args) {
		// initialize array list and scanner
		Scanner input = new Scanner(System.in);
		String userTD, userRetry;
		ArrayList<String> userTDAL = new ArrayList<String>();
		
		// using do while to repeat the code
		do {
			System.out.printf("%nWelcome to TO-DO program!%n");
			// I use while loop for safety measure when exiting
			while (true) {
				System.out.print("Input your to-do here (input 'exit' to stop): ");
				userTD = input.nextLine();
				// To prevent empty input from the user
				if (userTD.isEmpty()) {
					System.out.printf("%nPlease provide a to-do!%n%n");
				}
				// To exit inputing to-do
				if (userTD.equalsIgnoreCase("exit")) {
					break;
				} 
				
				// removing intentional/unintentional blank or empty to-do (need some fixing)
				userTDAL.removeIf(inputs -> inputs.contentEquals(""));
				// adding the user input into array list named userTDAL
				userTDAL.add(userTD);
				
			}
			// ilalagay ko to sa void statement since print lang naman gagawin neto
			// print the output
			System.out.printf("%n%nTO-DO LIST:%n");
			// print the object inside of userTDAL Array List
			for (int i=0; i<userTDAL.size(); i++) {
				System.out.println((i+1) + ". " + userTDAL.get(i));
			}
			
			// lagay ko to sa return statement para maayos
			// to ask the user if they want to try again the program
			while (true) {
				System.out.printf("%nDo you want to try again? (Yes/No): ");
				userRetry = input.next();
				
				if (!userRetry.equalsIgnoreCase("Yes") && !userRetry.equalsIgnoreCase("No")) {
					System.out.printf("%nPlease choose from (Yes/No) only!%n");
				}
				
				if (userRetry.equalsIgnoreCase("No") || userRetry.equalsIgnoreCase("Yes")) break;
				
			}
			
		} while (!userRetry.equalsIgnoreCase("No"));
		
		input.close();
	}
}
