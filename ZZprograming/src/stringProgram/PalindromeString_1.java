package stringProgram;

import java.util.Scanner;

public class PalindromeString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input String ");
		Scanner sc= new Scanner(System.in);
		String s1 = sc.nextLine();
		StringBuilder s2 = new StringBuilder(s1);
		
		s2.reverse(); 
		
		if(s1.equals(s2.toString())) {      // use of toString() method 
			System.out.println(" Given String is Palindrome ");
		}
		else {
			System.out.println(" Given String is not Palindrome ");
		}
	}

}
