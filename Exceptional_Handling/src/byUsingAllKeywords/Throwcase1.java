package byUsingAllKeywords;

import java.util.InputMismatchException;

public class Throwcase1 {
	static InputMismatchException e1 = new InputMismatchException();
	ArithmeticException  e2 = new ArithmeticException();
	public static void main(String[] args) {
		throw e1;	
	}
	void task() {
		throw e2;//can make not static reference to non-statc exception
	}

}
