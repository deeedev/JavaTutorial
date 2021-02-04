import java.util.Scanner;

public class MathOperation {
	//Instance Variable
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int num) {
		if(num <= 0) {
			System.out.println("Please Enter Number greater than Zero");
		}else {
			this.b = num;
		}
	}
	//Constructor is a special method that has not return type and the name of the method is same as the class name
	//Constructor is a method which get executed first when you create the object/Instance of the class
	//To create the oject of the class. To instantiate the intstance variable of the class.
		

	public void AirtmaticOperation() {
		int sum = a+b;
		int multiply = a*b;
		int divsion = a/b;
		int subtraction = a-b;
		int modulo = a%b;
		System.out.println("Sum: "+ sum);
		System.out.println("Multiply: "+ multiply);
		System.out.println("Division: "+ divsion);
		System.out.println("Subtraction: "+ subtraction);
		System.out.println("Modulo: "+ modulo);
		
		
	}
	//Return type is must in method declaration --> Primitive datatype, String, void{nothing}
	//Controller Method
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a");
//		int a = sc.nextInt();
//		System.out.println("Enter b");
//		int b = sc.nextInt();
//		
//		MathOperation math = new MathOperation(a,b);
///*5*/		math.AirtmaticOperation();
//	}
	
}