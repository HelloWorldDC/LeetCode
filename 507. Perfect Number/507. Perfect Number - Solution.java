public class Solution {
	public static boolean checkPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if(num%i==0) {
				sum += i;
			}
		}
		if(sum != num) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(28));
	}
}
