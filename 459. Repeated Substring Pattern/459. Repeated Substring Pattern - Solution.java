public class Solution {
	public static boolean repeatedSubstringPattern(String s) {
		String temp;
		String temp2 = "";
		for (int i = 1; i < s.length(); i++) {
			temp = s.substring(0,i);
			for (int j = 0; j < s.length()/temp.length(); j++) {
				temp2 += temp;
			}
			if(temp2.equals(s)) {
				return true;
			}
			temp2 = "";
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abcabcabcabc"));
	}
}
