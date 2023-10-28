public class Solution {
	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int result[][] = null;
		if(mat.length * mat[0].length == r*c) {
			result = new int[r][c];
			int temp[] = new int[mat.length*mat[0].length];
			int index = 0;
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[0].length; j++) {
					temp[index] = mat[i][j];
					index++;
				}
			}
			index = 0;
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[0].length; j++) {
					result[i][j] = temp[index];
					index++;
				}
			}
		}
		else {
			return mat;
		}
		return result;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 2 }, { 3, 4 } };
		System.out.println(matrixReshape(mat,2,4));
	}
}
