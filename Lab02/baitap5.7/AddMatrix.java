package matrix;

public class AddMatrix {
	private int Matrix1[][];
	private int Matrix2[][];
	
	
	public int[][] getMatrix1() {
		return Matrix1;
	}
	public void setMatrix1(int[][] matrix1) {
		Matrix1 = matrix1;
	}
	public int[][] getMatrix2() {
		return Matrix2;
	}
	public void setMatrix2(int[][] matrix2) {
		Matrix2 = matrix2;
	}
	
	public void AddMatrix() {
		int m = Matrix1.length;
		int n = Matrix1[0].length;
		int Matrix3[][] = new int [m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				Matrix3[i][j] = Matrix1[i][j] + Matrix2[i][j];
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(Matrix3[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
