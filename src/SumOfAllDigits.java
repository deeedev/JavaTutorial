import java.util.Scanner;
import java.lang.Math;

public class SumOfAllDigits {
	
	public void printAllDigit(int n) {
		int size = String.valueOf(n).length();
		System.out.println("Size:"+size);
		int arr [] = new int[size];
		
		int i = 0;
		while(n>0) {//1245 245 45
			arr[i] = n%10;
			n = n/10;
			i++;
		}
		
		for(int j=arr.length-1;j>=0;j--) { //j=3,2,1,0
			if(j!=0) //true true true false
				System.out.print(arr[j]+"\n\r");//1,2,4,
			else
				System.out.println(arr[j]); //5
		}
	}
	
	public int sumOfDigits(int n){ //1245,124,12,1,0
		int sum = 0;   //sum =0,5,9,11,12
		
		while(n>0) { //n>0 true true true true false
			sum += n%10; // sum = 0+5 sum=5+4 sum = 9+2 sum=11+1
			n = n/10; 
		}
		
		return sum;
	}
	
	public boolean isArmstrongNumber(int n) { 
		
		int temp = n;
		int sumOfCubeOfDigits = 0;
		while(temp>0) {
			sumOfCubeOfDigits += Math.pow(temp%10,3);
			temp /= 10;
		}
		
		if(sumOfCubeOfDigits == n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int n = sc.nextInt();
		SumOfAllDigits digits = new SumOfAllDigits();
		digits.printAllDigit(n);
		
		System.out.println(digits.sumOfDigits(n));
		
		boolean arms = digits.isArmstrongNumber(n);
		if(arms) {
			System.out.println("this is armsstrong number");
		}else {
			System.out.println("not a armsstrong number");
		}
	}

}
