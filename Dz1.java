import java.util.Scanner;

public class Dz1 {
	public static void main(String[] args) {
		System.out.print("Enter float number 1: ");
		Scanner sc = new Scanner(System.in);		
		float a = sc.nextFloat();
		System.out.println(a);
		System.out.print("Enter float number 2: ");
		float b = sc.nextFloat();
		System.out.println(b);
		float c = a + b;
		System.out.println("Result " + a + " + " + b + " = " + c);
		c = a * b;
		System.out.println("Result " + a + " * " + b + " = " + c);
		c = a/b;	
		System.out.println("Result " + a + " / " + b + " = " + c + 1.0 + 2.0);		
		
	}		
}
