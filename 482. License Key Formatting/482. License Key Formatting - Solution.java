public class Solution {
	public static String licenseKeyFormatting(String s, int k) {
		s = s.replaceAll("[-]", "");
		StringBuilder sb = new StringBuilder(s).reverse();
		s = sb.toString();
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if(i % k == 0 && i != 0) {
				result += "-";
				result += String.valueOf(s.charAt(i));
			}
			else {
				result += String.valueOf(s.charAt(i));
			}
		}
		StringBuilder convert = new StringBuilder(result).reverse();
		return convert.toString().toUpperCase();
	}

	public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
	}
}
