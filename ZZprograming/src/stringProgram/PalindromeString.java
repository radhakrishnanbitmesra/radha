package stringProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse ="";
		
		
		System.out.println("Enter the input String ");
		Scanner sc= new Scanner(System.in);
		String origanal = sc.nextLine();
		
		for(int i =origanal.length()-1; i>=0;i-- ) {
			reverse = reverse+origanal.charAt(i);		//once chack the charAt() method	
		}
		
		if(origanal.equals(reverse)) {
			System.out.println(" Given String is Palindrome ");
		}
		else {
			System.out.println(" Given String is not Palindrome ");
		}
	}

}
