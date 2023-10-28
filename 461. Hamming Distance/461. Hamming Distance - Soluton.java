public class Solution {
	public static int hammingDistance(int x, int y) {
		int xor = x^y;
		String binaryString = Integer.toBinaryString(xor);
		int count = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i)==49) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
	}
}
