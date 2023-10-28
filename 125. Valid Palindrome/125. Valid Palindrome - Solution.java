public class Solution {

	public static boolean isPalindrome(String s) {
		String regexReplace =  s.replaceAll("[^a-zA-Z0-9]", "");
		String lowercase = regexReplace.toLowerCase();
		String reverseString = "";
		for (int i = lowercase.length() - 1; i >= 0 ; i--) {
			reverseString += String.valueOf(lowercase.charAt(i));
		}
		if(!lowercase.equals(reverseString)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
}
