class Solution {
    public int[] plusOne(int[] digits) {
        int check=0;
		for (int i = 0; i < digits.length; i++) {
			if(digits[i]!=9) {
				check=1;
			}
		}
		if (check==1) {
			for (int i = digits.length-1; i >= 0; i--) {
				if(digits[i]==9) {
					digits[i]=0;
				}
				else {
					digits[i]=digits[i]+1;
					break;
				}
			}
		}
		else {
			int mang[]=new int[digits.length+1];
			mang[0]=1;
			digits=mang;
		}
		return digits;
    }
}