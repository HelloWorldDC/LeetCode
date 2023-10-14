class Solution {
    public int romanToInt(String s) {
        
		int convert_num = 0;
		int check =0;
		for (int i = 0; i < s.length(); i++) {
			if(i+1<s.length()) {
			if (String.valueOf(s.charAt(i)).equals("I") && String.valueOf(s.charAt(i + 1)).equals("V")) {
				convert_num += 4;
				i = i + 1;
				check++;
			} else if (String.valueOf(s.charAt(i)).equals("I") && String.valueOf(s.charAt(i + 1)).equals("X")) {
				convert_num += 9;
				i = i + 1;
				check++;
			} 
			else if (String.valueOf(s.charAt(i)).equals("X") && String.valueOf(s.charAt(i + 1)).equals("L")) {
				convert_num += 40;
				i = i + 1;
				check++;
			} else if (String.valueOf(s.charAt(i)).equals("X") && String.valueOf(s.charAt(i + 1)).equals("C")) {
				convert_num += 90;
				i = i + 1;
				check++;
			}
			else if (String.valueOf(s.charAt(i)).equals("C") && String.valueOf(s.charAt(i + 1)).equals("D")) {
				convert_num += 400;
				i = i + 1;
				check++;
			} else if (String.valueOf(s.charAt(i)).equals("C") && String.valueOf(s.charAt(i + 1)).equals("M")) {
				convert_num += 900;
				i = i + 1;
				check++;
			}
			}
			if(check==0) {
			if (String.valueOf(s.charAt(i)).equals("I")) {
				convert_num+=1;

			} else if (String.valueOf(s.charAt(i)).equals("V")) {
				convert_num+=5;

			} else if (String.valueOf(s.charAt(i)).equals("X")) {
				convert_num+=10;

			} else if (String.valueOf(s.charAt(i)).equals("L")) {
				convert_num+=50;
			} 
			else if(String.valueOf(s.charAt(i)).equals("C")) {
				convert_num+=100;
			}
			else if(String.valueOf(s.charAt(i)).equals("D")) {
				convert_num+=500;
			}
			else if(String.valueOf(s.charAt(i)).equals("M")) {
				convert_num+=1000;
			}
			}
			check=0;

		}
		return convert_num;
    }
}