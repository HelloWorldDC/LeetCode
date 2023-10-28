public class Solution {
	public static String reverseWords(String s) {
		String temp[] = s.split(" ");
		String result = "";
		for (int i = 0; i < temp.length; i++) {
			StringBuilder sb = new StringBuilder(temp[i]).reverse();
			if(i == temp.length - 1) {
				result += sb.toString();
			}
			else {
				result += sb.toString() + " ";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
}
