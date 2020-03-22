package ONP;

public class IntStack {
	
	private final int DEFAULT_SIZE = 20;
	private double[] stack;
	private int top;
	
	public IntStack() {
		stack = new double[DEFAULT_SIZE];
		top = -1;
	}
	
	public IntStack(int size) {
		stack = new double[size];
		top = -1;
	}
	
	public void push(double number) {
		stack[++top] = number;
	}
	
	public double pop() {
		return stack[top--];
	}
	
	public double peek() {
		return stack[top];
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}

}
