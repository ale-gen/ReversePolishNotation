package ONP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	
	public void menuChoice() {
		System.out.println("Menu : "); 
		System.out.println("1 : Wprowadź własne wyrażenie (każdy znak oddzielamy spacją, np. 2 * (4 + 5)");
		System.out.println("2 : Odczytaj z pliku"); 
		System.out.println("0 : Wyjście");
	}
	
	public void displayMenu() throws IOException {
		
		int option; 
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		option = sc.nextInt(); 
		sc.nextLine();
		if (option != 0) {
			switch(option) {
				case 1: 
					String input, output;
					double finalOutput;
					
						System.out.println("Wprowadż wyrażenie infiksowe:");
						System.out.flush();
						input = getString();
						if (input.isEmpty()) 
							break;
						
						InToPostChange trans = new InToPostChange(input);
						output = trans.conversion();
						System.out.println("Postać w odwrotnej notacji polskiej: " + output);
						
						Calculator calc = new Calculator(output);
						finalOutput = calc.count2();
						System.out.println("Wynik działania wynosi: " + finalOutput + "\n");
						
					break;
					
				case 2:
					String input2, output2;
					double finalOutput2;
					input2 = readFile();
					if (input2.isEmpty()) 
						break;
					
					InToPostChange trans2 = new InToPostChange(input2);
					output2 = trans2.conversion();
					System.out.println("Postać w odwrotnej notacji polskiej: " + output2);
					
					Calculator calc2 = new Calculator(output2);
					finalOutput2 = calc2.count2();
					System.out.println("Wynik działania wynosi: " + finalOutput2 + "\n");
					break;
				default: {
					System.out.println("Brak wyboru");
					break; 					
							}
						}
					}
					else
						break;
			}
	}
	
	
	public static String getString() throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
		return s;
	}

	public static String readFile() {
		String s = "";
		try {
			Scanner reader = new Scanner(new File("onp"));
			s = reader.nextLine();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		return s;
	}


}
