package STDL;

import java.util.Scanner;
import java.util.ArrayList;

public class TDL {
	public static void main(String[] args) {
		// initialize array list and scanner
		Scanner input = new Scanner(System.in);
		ArrayList<String> userTDAL = new ArrayList<String>();
		// initialize variables
		String userATD, userRetry;
		int uRTD;
		
		
		// using do while to repeat the code
		do {
			System.out.printf("%nWelcome to TO-DO program!%n");
			// I use while loop for safety measure when exiting
			while (true) {
				System.out.print("Input your to-do here (input 'exit' to stop): ");
				userATD = input.nextLine();
				// To prevent empty input from the user
				if (userATD.isEmpty()) {
					System.out.printf("%nPlease provide a to-do!%n%n");
				}
				// To exit inputing to-do
				if (userATD.equalsIgnoreCase("exit")) break;
				// remove the spaces entry
				userTDAL.removeIf(inputs -> inputs.trim().isEmpty());
				// adding the user input into array list named userTDAL
				userTDAL.add(userATD);
			}
			// to-do list
			PTDL(userTDAL);
			
			// deleting to-do
			while(true) {
				System.out.printf("%nIf you want to delete a to-do, choose from the numbers.");
				System.out.printf("%nInput '0' if nothing: ");
				uRTD = input.nextInt();
				// if user type 0 it will break the while loop
				if ((uRTD) == 0) break;
				// to remove the to-do based on their index position
				userTDAL.remove(uRTD-1);
				
				PTDL(userTDAL);
			}
			
			// to ask the user if they want to try again the program
			while (true) {
				System.out.printf("%nDo you want to try again? (Yes/No): ");
				userRetry = input.next();
				// if the user don't choose from (Yes/No)
				if (!userRetry.equalsIgnoreCase("Yes") && !userRetry.equalsIgnoreCase("No")) {
					System.out.printf("Please choose from (Yes/No) only!%n");
				}
				// break the while loop when choose between Yes or No
				if (userRetry.equalsIgnoreCase("No") || userRetry.equalsIgnoreCase("Yes")) break;
				
			}
		// To loop the program again if they input Yes
		} while (!userRetry.equalsIgnoreCase("No"));
		
		input.close();
	}
	
	// printing the output
	public static void PTDL(ArrayList<String> userTDAL) {
		System.out.printf("%nTO-DO LIST:%n");
		// print the object inside of userTDAL Array List
		for (int i=0; i<userTDAL.size(); i++) {
			System.out.println((i+1) + ". " + userTDAL.get(i));
		}
	}
}