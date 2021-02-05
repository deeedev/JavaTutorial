import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathOperation {
	//Instance Variable
	
	BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
	private int a;
	private int b;
	int randomNumber;
	public MathOperation() throws NumberFormatException, IOException {
		System.out.println("Enter the Random Number:");
		this.randomNumber = Integer.parseInt(sb.readLine());
		System.out.println("Rnadom Number:" +randomNumber);
	}
	
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