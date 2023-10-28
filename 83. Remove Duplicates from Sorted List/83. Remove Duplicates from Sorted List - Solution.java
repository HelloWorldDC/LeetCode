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

	public static ListNode deleteDuplicates(ListNode head) {
		List<Integer> mang = new ArrayList();
		ListNode result;
		ListNode temp1 = new ListNode();
		ListNode actual;
		int temp = -101;
		while (head != null) {
			if (head.val != temp) {
				mang.add(head.val);
				temp = head.val;
			} else {
				head = head.next;
			}
		}
		if (mang.size() > 0) {
			result = new ListNode(mang.get(mang.size() - 1));
			temp1 = result;
		}
		for (int i = mang.size() - 2; i >= 0; i--) {
			new ListNode(mang.get(i), temp1);
			temp1 = new ListNode(mang.get(i), temp1);
		}
		if (mang.size() > 0) {
			actual = temp1;
		} else {
			actual = null;
		}
		return actual;
	}

	public static void main(String[] args) {
		ListNode node5 = new ListNode(3);
		ListNode node4 = new ListNode(3, node5);
		ListNode node3 = new ListNode(2, node4);
		ListNode node2 = new ListNode(1, node3);
		ListNode node1 = new ListNode(1, node2);
		System.out.println(deleteDuplicates(node1));
	}
}
