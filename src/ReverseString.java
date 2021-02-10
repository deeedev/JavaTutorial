// Java program to Convert a String 
// to a Character array using Naive Approach 

 

public class ReverseString { 

	public static void main(String args[]) 
	{ 
		String str = "GeeksForGeeks"; 

		// Creating array of string length 
		char[] ch = new char[str.length()]; 
		//[G][e][e][k][s][F][o][r][G][e][e][k][s]
		// Copy character by character into array 
		for (int i = 0; i < str.length(); i++) { 
			ch[i] = str.charAt(i); 
		} 

		String reverse = "";
		// Printing content of array 
		for(int i=ch.length-1;i>=0;i--) {
			reverse += ch[i];
			
		}		
	} 
} 
