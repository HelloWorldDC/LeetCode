public class Solution {
	public static char findTheDifference(String s, String t) {
		int sum_s =0;
		int sum_t =0;
		if(s.length() == 0) {
			return t.charAt(0);
		}
		for (int i = 0; i < s.length(); i++) {
			sum_s += s.charAt(i);
			sum_t += t.charAt(i);
			if(i == s.length() - 1) {
				sum_t += t.charAt(i+1);
			}
		}
		
		return (char)(sum_t-sum_s);
	}

	public static void main(String[] args) {
		System.out.println(findTheDifference("", "y"));
	}
}
