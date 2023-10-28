import java.util.Arrays;

public class Solution {
	public static int distributeCandies(int[] candyType) {
		Arrays.sort(candyType);
		int check = candyType[0];
		int count = 1;
		for (int i = 1; i < candyType.length; i++) {
			if(candyType[i] != check) {
				count++;
				check = candyType[i];
			}
		}
		if(count > candyType.length/2) {
			count = candyType.length/2;
		}
		return count;
	}

	public static void main(String[] args) {
		int candyType[] = { 6,6,6,6 };
		System.out.println(distributeCandies(candyType));
	}
}
