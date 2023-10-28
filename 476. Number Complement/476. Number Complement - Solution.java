public class Solution {
	public static int findComplement(int num) {
		String convert = Integer.toBinaryString(num);
		convert = convert.replaceAll("0", "a");
		convert = convert.replaceAll("1", "0");
		convert = convert.replaceAll("a", "1");
		return Integer.parseInt(convert, 2);
	}

	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}
}
