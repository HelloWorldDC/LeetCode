import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static String[] findRestaurant(String[] list1, String[] list2) {
		List<String> temp = new ArrayList();
		int min = 5000;
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if(list1[i].equals(list2[j])) {
					if(i + j == min) {
						temp.add(list1[i]);
						min = i + j;
					}
					else if(i + j < min) {
						temp = new ArrayList();
						temp.add(list1[i]);
						min = i + j;
					}
				}
			}
		}
		String result[] = new String[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			result[i] = temp.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		String list1[] = {"Shogun","Tapioca Express","Burger King","KFC"};
		String list2[] = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		System.out.println(findRestaurant(list1, list2));
	}
}
