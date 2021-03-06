import java.util.Scanner;

public class Rectangle {
	static double perimeter = 0;
	static double height = 0;
	static double length = 0;
	
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the height in inches?");
		height = keyboard.nextDouble();
		System.out.println("What is the length in inches?");
		length = keyboard.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim() {
		perimeter = 2 * (length + height);
	}
	
	public static void print() {
		System.out.printf("Your rectangle is %1.5f ft. around.\n", perimeter);
	}
}