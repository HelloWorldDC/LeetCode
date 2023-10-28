public class Solution {
	public static boolean checkRecord(String s) {
		int Absent = 0;

		for (int i = 0; i < s.length(); i++) {
			if (String.valueOf(s.charAt(i)).equals("A")) {
				Absent++;
			}
			if (String.valueOf(s.charAt(i)).equals("L")) {
				if (i + 1 < s.length()) {
					if (String.valueOf(s.charAt(i + 1)).equals("L")) {
						if (i + 2 < s.length()) {
							if (String.valueOf(s.charAt(i + 2)).equals("L")) {
								return false;
							}
						}
					}
				}
			}
		}
		if (Absent >= 2) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLL"));
	}
}
