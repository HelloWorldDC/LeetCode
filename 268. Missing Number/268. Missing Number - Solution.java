import java.util.Arrays;

public class Solution {
	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int check = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != check) {
				return check;
			}
			check++;
		}
		return check;
	}

	public static void main(String[] args) {
		int nums[] = {0,1};
		System.out.println(missingNumber(nums));
	}
}
