package com.kat.vishal.palindrome;

public class PalindromeChecker implements CanCheckPalindrome{

	@Override
	public boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer();
		StringBuffer str2 = new StringBuffer();
		str.append(s);
		str2 = str.reverse();
		
		if(str2 == str){
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public boolean isPalindrome(Integer i) {
		// TODO Auto-generated method stub
		int temp = i;
		int rev = 0;
		int rem =0;
		
		for(int k = 0 ; k <3 ; k++){
		rem = temp % 10;
		rev = (rev*10) + rem;
		temp = temp / 10;
		}
		
		if(rev == i){
			return true;
		}
		else{
			return false;
		}
	}
	
}
