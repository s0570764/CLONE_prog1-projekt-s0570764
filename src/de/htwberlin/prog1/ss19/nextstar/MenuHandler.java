/**
 *
 */
package de.htwberlin.prog1.ss19.nextstar;


import java.util.Scanner;

/**
 * @author Mohammed
 *
 */
public class MenuHandler {

	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		while(true) {
		showMenu();
		int choice= readUserInput();
		handle(choice);
		System.out.println("====================");
		}
	}
/**
 * 
 * @return
 */
	private static int readUserInput() {
		System.out.print("Bitte, geben Sie die Nummer des Menüeintrages ein:\t");
		int choice = scanner.nextInt();
		return choice;
	}
/**
 * 
 * @param choice
 */
	private static void handle(int choice) {
		switch(choice) {
		case 1: addProduction();break;
		case 2:break;
		default: {System.out.println("Ungültige Eingabe. Bitte Ihre Eingabe überprüfen"); showMenu();}
		}
	}
	
	/**
	 * 
	 */
	private static void addProduction() {
		
		System.out.println("Produktion anlegen - Stammdaten");

		}
/**
 * 
 */
	private static void showMenu() {
		String menuItems [] = {	"(01)\tProduktion anlegen" ,
								"(10)\tBeenden"
							};

		System.out.println("\nNextStar Asset Manager 1.0\n");
		
		for(int i=0 ; i<menuItems.length; i++ ){
			System.out.println(menuItems[i]);
		}
	}

}
