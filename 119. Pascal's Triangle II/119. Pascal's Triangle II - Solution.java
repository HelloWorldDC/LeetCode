import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> l = new ArrayList();
		List<Integer> l1 = new ArrayList();
		if (rowIndex == 0) {
			l.add(1);
		} else if (rowIndex == 1) {
			l.add(1);
			l.add(1);
		} else if (rowIndex == 2) {
			l.add(1);
			l.add(2);
			l.add(1);
		} else {
			l.add(1);
			l.add(2);
			l.add(1);
//		Copy
			for (int i = 0; i < l.size(); i++) {
				l1.add(l.get(i));
			}
			l = new ArrayList();
			for (int i = 0; i <= rowIndex - 3; i++) {
				int size = l1.size();
				l.add(1);
				for (int j = 0; j < size - 1; j++) {
					int sum = l1.get(j) + l1.get(j + 1);
					l.add(sum);
				}
				l.add(1);
				l1 = new ArrayList();
//			Copy
				for (int k = 0; k < l.size(); k++) {
					l1.add(l.get(k));
				}
				if (i != rowIndex - 3) {
					l = new ArrayList();
				}
			}
		}
		return l;
	}

	public static void main(String[] args) {
		System.out.println(getRow(4));
	}
}
