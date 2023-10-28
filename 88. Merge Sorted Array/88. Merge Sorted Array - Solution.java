import java.util.ArrayList;
import java.util.List;

public class ListNode {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = m;
		for (int i = 0; i < nums2.length; i++) {
			nums1[index] = nums2[i];
			index++;
		}
		for (int i = 0; i < nums1.length - 1; i++) {
			for (int j = i + 1; j < nums1.length; j++) {
				if(nums1[i]>nums1[j]) {
					int temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		merge(nums1,3,nums2,3);
	}
}
