package com.kat.vishal.palindrome;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeChecker pc = new PalindromeChecker();
		
		if(pc.isPalindrome(123454321)){
			System.out.println("the integer is palindrome");
		}
		if(pc.isPalindrome("aabbccbbaa")){
			System.out.println("the string is palindrome");
		}
	}

}
