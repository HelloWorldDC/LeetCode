
public class Solution {
	public static boolean isPalindrome(int x) {
		String convert = String.valueOf(x);
		for (int i = 0; i < convert.length()/2; i++) {
			if(!String.valueOf(convert.charAt(i)).equals(String.valueOf(convert.charAt(convert.length()-1-i)))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
	}
}
