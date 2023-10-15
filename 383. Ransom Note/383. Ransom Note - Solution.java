class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int check=0;
		StringBuilder sb=new StringBuilder(magazine);
		for(int i=0;i<ransomNote.length();i++) {
			for (int j = 0; j < sb.length(); j++) {
				if(ransomNote.charAt(i)==sb.charAt(j)) {
					check++;
					sb= sb.deleteCharAt(j);
					break;
				}
			}
		}
		if(check==ransomNote.length()) {
			return true;
		}
        return false;
    }
}