import java.util.Scanner;
import java.lang.Math;

public class kaprekarNumber{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();

		//Find The square

		int i=9;
		
		while(n>0) {
			int sq = (int) Math.pow(i,2);
		
			String str = String.valueOf(i);
			int noOfDigit = str.length();
			
			int divisor = (int) Math.pow(10,noOfDigit);
			
			int last_n_digit = sq%divisor;
			int first_n_digit = sq/divisor;
			
			int sum = last_n_digit+first_n_digit;
			if(sum == i) {
				System.out.println(i+" is Kaprekar Number");
				n--;
			}
			i++;
		}		
	}
	
}