import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array --> stores same kind of datavariables 
		//Declaration of Array;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the Student:");
		int n = sc.nextInt();
		
		int students [] = new int[n];
		
	 //index Zer0		
		
		System.out.println("Enter the value for Array");
		for(int i=0;i<students.length;i++) {
			students[i] = sc.nextInt();
		}
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	}

}
