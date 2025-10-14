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
		int uRTD, uStart;
		
		
		// using do while to repeat the code
		do {
			tdlIntro();
			// instructions
			System.out.printf("%nYour choice is (1-4): ");
			uStart = input.nextInt();
			// use switch for better layout
			switch(uStart) {
			// case 1 - let the user know he/she saved something in to-do list
				case 1:
					PTDL(userTDAL);
					break;
			// case 2 - adding a to-do
				case 2:
					while (true) {
						// list of to-do 
						PTDL(userTDAL);
						// instructions
						System.out.printf("%nInput your to-do here (input 'exit' to stop): ");
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
					// SAVED ONLY WHEN LOOPING "Yes" (RESET IF QUITTING "No"/FRESH START)
					System.out.printf("%nTo-do list saved!%n");
					break;
			// case 3 - delete a to-do
				case 3:
					while(true) {
						// list of to-do 
						PTDL(userTDAL);
						// instructions
						System.out.printf("%nIf you want to delete a to-do, choose from the numbers.");
						System.out.printf("%nInput '0' if nothing: ");
						uRTD = input.nextInt();
						// if user type 0 it will break the while loop
						if ((uRTD) == 0) break;
						// to remove the to-do based on their index position
						userTDAL.remove(uRTD-1);
						
						PTDL(userTDAL);
					}
					// SAVED ONLY WHEN LOOPING "Yes" (RESET IF QUITTING "No"/FRESH START)
					System.out.printf("%nTo-do list saved!%n");
					break;
			// case 4 - Exiting the from the choices
				case 4:
					System.out.println("Exiting...");
					break;
			// default - when the user input beyond (1-3)
				default:
					System.out.println("Invalid option");
					
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
	// introduction/guide
	public static void tdlIntro() {
		System.out.printf("%nWelcome to Simple To-Do List Program!%n%n");
		System.out.println("Choose from the options!");
		System.out.println("1. To-Do List");
		System.out.println("2. Add a To-Do");
		System.out.println("3. Remove a To-Do");
		System.out.println("4. Exit");
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