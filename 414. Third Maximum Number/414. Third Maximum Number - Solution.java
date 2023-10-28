import java.util.Arrays;

public class Solution {
	public static int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int duyet = nums[nums.length-1];
		int count = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if(nums[i]!= duyet) {
				duyet = nums[i];
				count++;
			}
			if(count==3) {
				break;
			}
			if(i == 0 && count < 3) {
				return nums[nums.length-1];
			}
		}
		return duyet;
	}

	public static void main(String[] args) {
		int nums[] = { 1,2};
		System.out.println(thirdMax(nums));
	}
}
