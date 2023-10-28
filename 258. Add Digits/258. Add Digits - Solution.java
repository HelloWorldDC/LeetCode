public class Solution {
	public static int addDigits(int num) {
		String convertString = String.valueOf(num);
		int sum = 0;
		for (int j = 0;; j++) {
			for (int i = 0; i < convertString.length(); i++) {
				sum += Integer.valueOf(String.valueOf(convertString.charAt(i)));
			}
			convertString = String.valueOf(sum);
			if(sum < 10) {
				break;
			}
			else {
				sum = 0;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(addDigits(0));
	}
}
