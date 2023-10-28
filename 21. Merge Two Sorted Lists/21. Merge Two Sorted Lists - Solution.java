import java.util.ArrayList;
import java.util.List;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
//Hàm submit trên LeetCode
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode result = new ListNode();
		List<Integer> integerList = new ArrayList();
//		Duyệt list1 gán vào ArrayList
		while (list1 != null) {
			integerList.add(list1.val);
			list1 = list1.next;
		}
//		Duyệt list2 gán vào ArrayList
		while (list2 != null) {
			integerList.add(list2.val);
			list2 = list2.next;
		}
//		Sắp xếp
		for (int i = 0; i < integerList.size() - 1; i++) {
			for (int j = i + 1; j < integerList.size(); j++) {
				if (integerList.get(i) > integerList.get(j)) {
					int temp = integerList.get(i);
					integerList.set(i, integerList.get(j));
					integerList.set(j, temp);
				}
			}
		}
//		Lưu vào ListNode
		if (integerList.size() != 0) {
			result = new ListNode(integerList.get(integerList.size() - 1));
			ListNode temp = result;
			for (int i = integerList.size() - 2; i >= 0; i--) {
				new ListNode(integerList.get(i), temp);
				temp = new ListNode(integerList.get(i), temp);
			}
			ListNode actual = temp;

			return actual;
		}
		return null;
	}

	public static void main(String[] args) {
//		Create list1
		ListNode list1node3 = new ListNode(4);
		ListNode list1node2 = new ListNode(2, list1node3);
//		ListNode list1 = new ListNode(1, list1node2);
		ListNode list1 = new ListNode(1, list1node2);
//		Create list2
		ListNode list2node3 = new ListNode(4);
		ListNode list2node2 = new ListNode(3, list2node3);
		ListNode list2 = new ListNode(1, list2node2);

//		Duyệt list
		System.out.println(mergeTwoLists(list1, list2).val);
	}
}
