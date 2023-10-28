public class Solution {

	public static String convertToTitle(int columnNumber) {
		String mang[] = { "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		int temp = 27;
		String result = "";
		while (temp > 26) {
			int phandu = columnNumber % 26;
			if (phandu == 0) {
				phandu = 26;
			}
			result = mang[phandu] + result;
//			phandu + X*26 = 701
			int X = (columnNumber - phandu) / 26;
			temp = X;
			columnNumber = X;
			if (X <= 26) {
				result = mang[X] + result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
//		25 + 26*26 = 701 -> ZY
		System.out.println(convertToTitle(52));
	}
}
