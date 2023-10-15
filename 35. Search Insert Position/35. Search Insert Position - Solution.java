class Solution {
    public int searchInsert(int[] nums, int target) {
        int chi_so;
		if(Arrays.binarySearch(nums, target)<0) {
        int mang[]=new int[nums.length+1];
        mang[mang.length-1]=target;
        for (int i = 0; i < mang.length-1; i++) {
			mang[i]=nums[i];
		}
        Arrays.sort(mang);
        chi_so=Arrays.binarySearch(mang, target);
		}
		else
			chi_so=Arrays.binarySearch(nums, target);
		return chi_so;
    }
}