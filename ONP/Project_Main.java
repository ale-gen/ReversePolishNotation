package ONP;

import java.io.IOException;
import java.util.Scanner;

public class Project_Main {
	
	public static void main(String[] args) throws IOException {
		String input, output;
		double finalOutput;
		
		while(true) {
			System.out.println("Wprowadż wyrażenie infiksowe:");
			System.out.flush();
			input = getString();
			if (input.isEmpty()) 
				break;
			
			InToPostChange trans = new InToPostChange(input);
			output = trans.conversion();
			System.out.println("Postać w odwrotnej notacji polskiej: " + output);
			
			Calculator calc = new Calculator(output);
			finalOutput = calc.count();
			System.out.println("Wynik działania wynosi: " + finalOutput + "\n");
			
		}
	}
	
	public static String getString() throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		return s;
	}

}
