public class Solution {
	public static String addBinary(String a, String b) {
		String resultSum = "";
		int nho = 0;
		if ((a.length() - b.length()) < 0) {
			int hieu = Math.abs(a.length() - b.length());
			for (int i = 0; i < hieu; i++) {
				a = "0" + a;
			}
		} else {
			int hieu = Math.abs(a.length() - b.length());
			for (int i = 0; i < hieu; i++) {
				b = "0" + b;
			}
		}
		for (int i = a.length() - 1; i >= 0; i--) {
			if (a.charAt(i) != b.charAt(i)) {
				if (nho == 0) {
					resultSum = "1" + resultSum;
				} else {
					resultSum = "0" + resultSum;
				}
			} else if (a.charAt(i) == b.charAt(i) && a.charAt(i) == 48) {
				if (nho == 0) {
					resultSum = "0" + resultSum;
				} else {
					resultSum = "1" + resultSum;
					nho--;
				}
			} else if (a.charAt(i) == b.charAt(i) && a.charAt(i) == 49) {
				if (nho == 0) {
					resultSum = "0" + resultSum;
					nho++;
				} else {
					resultSum = "1" + resultSum;
				}
			}
		}
		if(nho == 1) {
			resultSum = "1" + resultSum;
		}
		return resultSum;
	}

	public static void main(String[] args) {
		System.out.println(addBinary("1010", "1011"));
	}
}
