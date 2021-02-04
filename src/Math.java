import java.util.Scanner;

public class Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MathOperation math = new MathOperation();
	
		System.out.println("Enter A: ");
		math.setA(sc.nextInt());
		
		System.out.println("Enter B:");
		math.setB(sc.nextInt());
		
		math.AirtmaticOperation();
		
		System.out.println("A: "+math.getA());
		System.out.println("B: "+math.getB());
		
	}
}
