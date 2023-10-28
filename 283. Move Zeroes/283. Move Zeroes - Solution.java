import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void moveZeroes(int[] nums) {
		List<Integer> listnums = new ArrayList();
		for (int i = nums.length - 1; i >= 0; i--) {
			if(nums[i]==0) {
				listnums.add(nums[i]);
			}
			else {
				listnums.add(0, nums[i]);
			}
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = listnums.get(i);
		}
	}

	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		moveZeroes(nums);
	}
}
