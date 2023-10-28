import java.math.BigInteger;

public class Solution {
	// you need treat n as an unsigned value
    public static int reverseBits(int n) {
    	String binaryString = Integer.toBinaryString(n);
    	String reversebinary = "";
    	for (int i = binaryString.length() - 1; i >= 0 ; i--) {
			reversebinary += String.valueOf(binaryString.charAt(i));
		}
    	while(reversebinary.length() < 32) {
    		reversebinary += "0";
    	}
    	int result = new BigInteger(reversebinary,2).intValue(); 
        return result;
    }

	public static void main(String[] args) {
		System.out.println(reverseBits(43261596));
	}
}
