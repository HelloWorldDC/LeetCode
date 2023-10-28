public class Solution {
	// you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
    	String binaryString = Integer.toBinaryString(n);
    	int count = 0;
    	for (int i = 0; i < binaryString.length(); i++) {
			if(String.valueOf(binaryString.charAt(i)).equals("1")) {
				count++;
			}
		}
        return count;
    }

	public static void main(String[] args) {
		System.out.println(hammingWeight(43261596));
	}
}
