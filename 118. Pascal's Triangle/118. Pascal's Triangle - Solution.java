import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList();
		List<Integer> l = new ArrayList();
		List<Integer> l1 = new ArrayList();
		if (numRows == 1) {
			l.add(1);
			result.add(l);
		} else if (numRows == 2) {
			l.add(1);
			result.add(l);
			l = new ArrayList();
			l.add(1);
			l.add(1);
			result.add(l);
		} else if (numRows == 3) {
			l.add(1);
			result.add(l);
			l = new ArrayList();
			l.add(1);
			l.add(1);
			result.add(l);
			l = new ArrayList();
			l.add(1);
			l.add(2);
			l.add(1);
			result.add(l);
		} else {
			l.add(1);
			result.add(l);
			l = new ArrayList();
			l.add(1);
			l.add(1);
			result.add(l);
			l = new ArrayList();
			l.add(1);
			l.add(2);
			l.add(1);
//		Copy
			for (int i = 0; i < l.size(); i++) {
				l1.add(l.get(i));
			}
			result.add(l);
			l = new ArrayList();
			for (int i = 0; i < numRows - 3; i++) {
				int size = l1.size();
				l.add(1);
				for (int j = 0; j < size - 1; j++) {
					int sum = l1.get(j) + l1.get(j + 1);
					l.add(sum);
				}
				l.add(1);
				result.add(l);
				l1 = new ArrayList();
//			Copy
				for (int k = 0; k < l.size(); k++) {
					l1.add(l.get(k));
				}
				l = new ArrayList();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(generate(4));
	}
}
