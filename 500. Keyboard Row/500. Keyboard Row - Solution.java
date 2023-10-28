public class Solution {
	public static String[] findWords(String[] words) {
		String result = "";
		String firstRowKeyboard = "qwertyuiop";
		String seconRowKeyboard = "asdfghjkl";
		String thirdRowKeyboard = "zxcvbnm";
		for (int i = 0; i < words.length; i++) {
			int length = words[i].length();
			int count_firstRow = 0;
			int count_secondRow = 0;
			int count_thirdRow = 0;
			for (int j = 0; j < length; j++) {
				if(firstRowKeyboard.contains(String.valueOf(words[i].toLowerCase().charAt(j)))) {
					count_firstRow++;
				}
				if(seconRowKeyboard.contains(String.valueOf(words[i].toLowerCase().charAt(j)))) {
					count_secondRow++;
				}
				if(thirdRowKeyboard.contains(String.valueOf(words[i].toLowerCase().charAt(j)))) {
					count_thirdRow++;
				}
				if(j == length - 1) {
					if(count_firstRow == length || count_secondRow == length|| count_thirdRow == length) {
						result += words[i]+",";
					}
				}
			}
		}
		return (result.split("[,]")[0] != "") ? result.split("[,]") :  new String[0];
	}

	public static void main(String[] args) {
		String words[] = { "omk" };
		System.out.println(findWords(words));
	}
}
