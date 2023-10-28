public class Solution {

	public static int majorityElement(int[] nums) {
//		Ngưỡng
		int nguong = nums.length / 2;
//		Số đã duyệt
		int sodaduyet = nums[0];
		int count = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == sodaduyet && i!=0) {
					break;
				}
				if (nums[i] == nums[j] && i!=j) {
					count++;
				}
				if (count > nguong) {
					return nums[i];
				}
				if (j == nums.length - 1 && i != 0) {
					sodaduyet = nums[i];
				}
			}
			count = 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));
	}
}
