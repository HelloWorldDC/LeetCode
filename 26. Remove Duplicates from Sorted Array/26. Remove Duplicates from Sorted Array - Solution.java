import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static int removeDuplicates(int[] nums) {
		List<Integer> removeDuplicate = new ArrayList();
		removeDuplicate.add(nums[0]);
		int checkKhongCo = 1;
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < removeDuplicate.size(); j++) {
				if(nums[i] == removeDuplicate.get(j)) {
					checkKhongCo = 0;
					break;
				}
			}
			if(checkKhongCo == 1) {
				removeDuplicate.add(nums[i]);
			}
			checkKhongCo = 1;
		}
		for (int i = 0; i < removeDuplicate.size(); i++) {
			nums[i] = removeDuplicate.get(i);
		}
		return removeDuplicate.size();
	}

	public static void main(String[] args) {
		int nums[] = { 1,1,2 };
		System.out.println(removeDuplicates(nums));
	}
}
