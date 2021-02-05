
public class SumOfFirstAndLastDigit {
	public static void main(String[] args) {
		int n = 1245;
		int lastDigit = n%10;
		
		int noOfDigits = String.valueOf(n).length();
		int firstDigit = 0;
		
		while(n>0) {   //1245 //124 //12 //1
			// j ==> 4  3 2 1
			if(noOfDigits==2) {
				firstDigit = n%10;
			}
			noOfDigits--;
			n = n/10;
		}
		
		System.out.println(firstDigit+lastDigit);
	}
}
