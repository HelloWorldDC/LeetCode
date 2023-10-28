import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList();
		Arrays.sort(nums);
		for (int i = 1; i <= nums.length; i++) {
			if(Arrays.binarySearch(nums, i) < 0) {
				result.add(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}
}
