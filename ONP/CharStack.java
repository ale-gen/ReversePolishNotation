package ONP;

public class CharStack {
	
	private final int DEFAULT_SIZE = 20;
	private char[] stack;
	private int top;
	
	public CharStack() {
		stack = new char[DEFAULT_SIZE];
		top = -1;
	}
	
	public CharStack(int size) {
		stack = new char[size];
		top = -1;
	}
	
	public void push(char ch) {
		stack[++top] = ch;
	}
	
	public char pop() {
		return stack[top--];
	}
	
	public char peek() {
		return stack[top];
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	
	

}
