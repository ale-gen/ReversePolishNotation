package ONP;

public class InToPostChange {
	
	private CharStack stack;
	private String input;
	private String output = "";
	
	public InToPostChange(String input) {
		this.input = input;
		int stackSize = input.length();
		stack = new CharStack(stackSize);
	}
	
	public String conversion() {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			
			switch(ch) {
			
			case '+':
			case '-':
				gotOperand(ch, 1);
				break;
							
			case '*':
			case '/': 
				gotOperand(ch, 2);
				break;
			
			case '(': 
				stack.push(ch);
				break;
			
			case ')': 
				gotParentheness(ch);
				break;
				
			case ' ':
				continue;
			
			default: 
				output = output + ch;
				break;
			
			
			}
		}
		while ( !stack.isEmpty()) {
			output = output + " " +  stack.pop();
		}
		return output;
	}
	
	public void gotOperand(char operand, int priority) {
		while ( !stack.isEmpty()) {
			char ch = stack.pop();
			
			if(ch == '(') {
				stack.push(ch);
				break;
			} else {
				int priority2;
				if (ch == '+' || ch == '-') {
					priority2 = 1;
				} else {
					priority2 = 2;
				}
				if (priority2 < priority) {
					stack.push(ch);
					break;
				} else {
					output = output + " " + ch;
				}
			}
		}
		output = output + " ";
		stack.push(operand);
	}
	
	public void gotParentheness(char paren) {
		while ( !stack.isEmpty()) {
			char ch = stack.pop();
			
			if(ch == '(') {
				break;
			} else {
				output = output + " " + ch;
			}
		}
	}

}
