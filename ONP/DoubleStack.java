package ONP;

public class DoubleStack {
	
	private final int DEFAULT_SIZE = 20;
	private double[] stack;
	private int top;
	
	public DoubleStack() {
		stack = new double[DEFAULT_SIZE];
		top = -1;
	}
	
	public DoubleStack(int size) {
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
