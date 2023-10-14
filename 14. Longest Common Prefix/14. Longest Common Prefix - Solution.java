class Solution {
    public String longestCommonPrefix(String[] strs) {
        int check=0;
        int index=0;
        int check_so_luong=0;
        String prefix_common="";
        if(strs[0].length()>1||strs.length>1) {
		for (int i = 1; i <= strs[0].length(); i++) {
			for (int j = 0; j < strs.length-1; j++) {
				if(strs[j].length()>=i&&strs[j+1].length()>=i) {
				if(strs[j].charAt(index)==strs[j+1].charAt(index)) {
					check_so_luong++;
					if(check_so_luong==strs.length-1) {
					prefix_common+=strs[j].charAt(index);
					}
				}
				else
					return prefix_common;
				}
				else {
					check++;
				break;}
			}
			if(check>0) {
				break;
			}
			index++;
			check_so_luong=0;
		}
        }
        else
        	return strs[0];
		
		return prefix_common;
    }
}