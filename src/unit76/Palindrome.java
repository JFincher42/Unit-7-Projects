package unit76;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("madamimadam"));
		System.out.println(isPalindrome("madamimmadam"));
		System.out.println(isPalindrome("foodf"));
		System.out.println(isPalindrome("amanaplanacanalpanama"));
	}
	
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) return true;
		if (s.length() == 2) return (s.charAt(0) == s.charAt(1));
		
		if (s.charAt(0) == s.charAt(s.length()-1))
			return isPalindrome(s.substring(1,s.length()-1));
		else return false;
	}

}
