package STDL;

import java.util.Scanner;
import java.util.ArrayList;

public class TDL {
	public static void main(String[] args) {
		// initialize array list and scanner
		Scanner input = new Scanner(System.in);
		ArrayList<String> userTDAL = new ArrayList<String>();
		TDL methods = new TDL();
		
		// using do while to repeat the code
		do {
			System.out.printf("%nWelcome to TO-DO program!%n");
			// I use while loop for safety measure when exiting
			methods.UATD(input, userTDAL);
			
			// print the output
			otdList(userTDAL);
			
			// to ask the user if they want to try again the program
			URT(input);
		// the do while is not working bruh
		} while (true);
		
	}
	
	// print the to-do list
	private static void otdList(ArrayList<String> userTDAL) {
		System.out.printf("%nTO-DO LIST:%n");
		for (int i=0; i<userTDAL.size(); i++) {
			System.out.println((i+1) + ". " + userTDAL.get(i));
		}
	}
	
	// add to-do
	private String UATD(Scanner userTD, ArrayList<String> uTDAL) {
		while(true) {
			System.out.print("Input your to-do here (input 'exit' to stop): ");
			String ATD = userTD.nextLine();
			// this is not working man when empty or intentional enter
			if (ATD.isEmpty()){
				return "Please input a to-do!";
			}
			
			if (ATD.equalsIgnoreCase("exit")){
				return ATD;
			}
			
			uTDAL.removeIf(inputs -> inputs.trim().isEmpty());
			uTDAL.add(ATD);
		}
	}
	
	// if user should try again
	public static String URT(Scanner rt) {
		while(true) {
			System.out.printf("%nDo you want to try again? (Yes/No): ");
			String choice = rt.next();
			
			if (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No")) {
				return "%nPlease choose from (Yes/No) only!%n";
			}
			
			if (choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("Yes")) return choice;
		}
	}
}

