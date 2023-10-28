public class Solution {
	public static boolean isHappy(int n) {
		String convertString = String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < convertString.length(); i++) {
			sum += Math.pow(Integer.parseInt(String.valueOf(convertString.charAt(i))),2);
			if(sum == 1 && i == convertString.length() - 1) {
				break;
			}
			if(i == convertString.length() - 1) {
				i = -1;
				convertString = String.valueOf(sum);
				System.out.println(sum);
				if(sum == 4) {
					return false;
				}
				sum = 0;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isHappy(2147483647));
	}
}
