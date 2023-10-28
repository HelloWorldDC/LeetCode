public class Solution {
	public static boolean isPowerOfTwo(int n) {
		if(n == 1) {
			return true;
		}
		for (int i = 1; i <= 31; i++) {
			int result = 1;
			for (int j = 1; j <= i; j++) {
				if(j == 31) {
					return false;
				}
				else {
					result *= 2;
				}
			}
			if(result == n) {
				break;
			}
			if(result > n ) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(2147483647));
	}
}
