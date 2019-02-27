package javaMatrix;

public class MatrixCreator {
	public static TheMatrix createRandomized(int c, int r) {
		TheMatrix matrix = new TheMatrix(c, r);
		
		for(int i = 0; i < c; ++i) {
			for(int j = 0; j < r; ++j) {
				matrix.setElement(i,  j, (Math.random()*r*c)); //my variant
			}
		}
		return matrix;
	}
}
