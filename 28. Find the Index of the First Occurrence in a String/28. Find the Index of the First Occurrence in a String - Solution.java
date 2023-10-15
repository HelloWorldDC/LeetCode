class Solution {
    public int strStr(String haystack, String needle) {
        if(!needle.equals("")) {
		if(haystack.contains(needle)) {
        	for (int i = 0; i < haystack.length(); i++) {
				if(haystack.charAt(i)==needle.charAt(0)) {
					int chi_so=i+1;
					int check=0;
					for (int j = 1; j < needle.length(); j++) {
						if(haystack.charAt(chi_so)!=needle.charAt(j)) {
							check++;
							break;
						}
						chi_so++;
					}
					if(check==0) {
						return i;
					}
				}
			}
        }
        else if(!haystack.contains(needle)) {
        	return -1;
        }
        }
		return 0;
    }
}