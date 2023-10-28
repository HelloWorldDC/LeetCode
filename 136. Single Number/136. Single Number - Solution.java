public class Solution {

	public static int singleNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result = nums[i];
			for (int j = 0; j < nums.length; j++) {
				if (j != i) {
					if (nums[j] == result) {
						break;
					}
					if (j == nums.length - 1) {
						return result;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
}
