package ArrayofJava;

public class largest_numberin_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 42 }, { 4, 114, 6 }, { 7, 8, 94 } };

		for (int i = 0; i < a.length; i++) {
			int larg = a[i][0]; // Integer.MIN_VALUE;
			for (int j = 0; j < a[i].length; j++) {
				if (larg < a[i][j]) {
					larg = a[i][j];
				}
			}
			System.out.println(larg);

		}
		 
		}
	}


