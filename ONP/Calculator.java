package ONP;

public class Calculator {
	
	private DoubleStack stack;
	private String input;
	
	public Calculator(String input) {
		this.input = input;
	}
	
	public double count() {
		stack = new DoubleStack(20);
		char ch;
		double number1, number2;
		double result;
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			
			if ( ch >= '0' && ch <= '9') {
				stack.push( (int) ch - '0');
			} else if (ch == ' ') {
				continue;
			}
			else {
				number2 = stack.pop();
				number1 = stack.pop();
				
				switch(ch) {
				
				case '+': 
					result = number1 + number2;
					break;
					
				case '-':
					result = number1 - number2;
					break;
					
				case '*':
					result = number1 * number2;
					break;
					
				case '/': 
					result = number1 / number2;
					break;
					
				default:
					result = 0;
				}
				stack.push(result);
			}
		}
		result = stack.pop();
		return result;
	}
	
	public double count2() {
		input = input.trim();
		stack = new DoubleStack(20);
		double number1, number2;
		double result;
		String[] tab;
		tab = input.split(" +"); 
		
		for  (String tabs : tab) {
			if (!tabs.equals("+") && !tabs.equals("-") && !tabs.equals("*") && !tabs.equals("/")) {
				double value = Double.parseDouble(tabs);
				stack.push(value); 
			} else {
				number2 = stack.pop();
				number1 = stack.pop();
				
				switch(tabs) {
				
				case "+": 
					result = number1 + number2;
					break;
					
				case "-":
					result = number1 - number2;
					break;
					
				case "*":
					result = number1 * number2;
					break;
					
				case "/": 
					result = number1 / number2;
					break;
					
				default:
					result = 0;
				}
				stack.push(result);
			}
		}
		result = stack.pop();
		return result;
	}
	
	

}
