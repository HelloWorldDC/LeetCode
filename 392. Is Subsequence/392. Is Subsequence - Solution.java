public class Solution {
	public static boolean isSubsequence(String s, String t) {
		if(s.length() == 0 && t.length() > 0) {
			return true;
		}
		else if(s.length() > 0 && t.length() == 0) {
			return false;
		}
		else if(s.length() == 0 && t.length() == 0) {
			return true;
		}
		int index_s = 0;
		int numberDeleted = 0;
		for (int i = 0; i < t.length(); i++) {
			if(s.charAt(index_s)==t.charAt(i)) {
				index_s++;
				if(index_s > s.length() - 1) {
					return true;
				}
			}
			else {
				StringBuilder sb = new StringBuilder(t).deleteCharAt(i);
				t = sb.toString();
				i--;
			}
		}
		if(!s.equals(t)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSubsequence("b", "abc"));
	}
}
