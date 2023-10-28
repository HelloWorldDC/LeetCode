public class Solution {
	public static int removeElement(int[] nums, int val) {
		int index = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				count++;
				nums[index] = nums[i];
				index++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int nums[] = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums,2));
	}
}
