class Solution {
    public void reverseString(char[] s) {
        String chuoi="";
		for (int i = 0; i < s.length; i++) {
			chuoi+=s[i];
		}
		StringBuilder sb=new StringBuilder(chuoi);
		chuoi=sb.reverse().toString();
		for (int i = 0; i < chuoi.length(); i++) {
			s[i]=chuoi.charAt(i);
		}
    }
}