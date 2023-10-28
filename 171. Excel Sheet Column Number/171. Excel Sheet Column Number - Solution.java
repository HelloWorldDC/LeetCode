public class Solution {
	public static int convertNumber(String character) {
		int phandu = 0;
		switch (character) {
		case "A":
			phandu = 1;
			break;
		case "B":
			phandu = 2;
			break;
		case "C":
			phandu = 3;
			break;
		case "D":
			phandu = 4;
			break;
		case "E":
			phandu = 5;
			break;
		case "F":
			phandu = 6;
			break;
		case "G":
			phandu = 7;
			break;
		case "H":
			phandu = 8;
			break;
		case "I":
			phandu = 9;
			break;
		case "J":
			phandu = 10;
			break;
		case "K":
			phandu = 11;
			break;
		case "L":
			phandu = 12;
			break;
		case "M":
			phandu = 13;
			break;
		case "N":
			phandu = 14;
			break;
		case "O":
			phandu = 15;
			break;
		case "P":
			phandu = 16;
			break;
		case "Q":
			phandu = 17;
			break;
		case "R":
			phandu = 18;
			break;
		case "S":
			phandu = 19;
			break;
		case "T":
			phandu = 20;
			break;
		case "U":
			phandu = 21;
			break;
		case "V":
			phandu = 22;
			break;
		case "W":
			phandu = 23;
			break;
		case "X":
			phandu = 24;
			break;
		case "Y":
			phandu = 25;
			break;
		case "Z":
			phandu = 26;
			break;
		}
		return phandu;
	}

	public static int titleToNumber(String columnTitle) {
		String phep_toan = "+";
		int result = convertNumber(String.valueOf(columnTitle.charAt(0))) * 26;
		if (columnTitle.length() == 1) {
			result = convertNumber(columnTitle);
		} else {
			for (int i = 1; i < columnTitle.length(); i++) {
				result += convertNumber(String.valueOf(columnTitle.charAt(i)));
				if(i != columnTitle.length()-1) {
					result *= 26;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
//		25 + 26*26 = 701 -> ZY
//		1 + 27*26 = 703 -> AAA
//		2 + 27*26 = 704 -> AAB
//		1 + 29*26 = 755 -> ACA
//		4 + (3 + 2*26)*26 = 1434 -> BCD
		System.out.println(titleToNumber("ZY"));
	}
}
