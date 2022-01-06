public class MatrixMult {
 

public static int[][] matMult(int[][] x, int[][] y){
		int num = 0;
		if (x[0].length != y.length){
			System.out.println("Not compatible Matrixes" + x.length + y[0].length);
			return x;
		}
		System.out.println();
		int zeile = x.length;
		int spalte = y[0].length;
		
		int[][] arr = new int[zeile][spalte];
		
		for (int i = 0; i < zeile; i++){
				for (int j = 0; j < spalte; j++){
					for (int m = 0; m < x[0].length; m++){
						arr [i][j] += (x[i][m] * y[m][j]);
						
					}
				}
		}
		return arr;
}



public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++){
		for (int j = 0; j < matrix[0].length; j++){
			System.out.printf("%2d ", (matrix[i][j]));
		}
		System.out.println();
	}
}


public static void main (String[] args){
		 // Ausgabe Hello World!
		int[][] arr = {{1,2,3},{1,2,3}, {1,2,4}};
		int[][] arr2 = {{1,2,3},{1,2,3}, {1,2,3}};
		System.out.printf("%2d %2d \n", arr.length, arr2[0].length);
		printMatrix(matMult(arr, arr2));
	}
}