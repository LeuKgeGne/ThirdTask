package javaMatrix;
import java.util.ArrayList;

public class TheMatrix {
	private double[][] matrix;
	
	public TheMatrix(int c, int r) {
		matrix = new double[c][r];
	}
	
	public int getAmountOfColumns() {
		return matrix.length;
	}
	
	public int getAmountOfRows() {
		return matrix[0].length;
	}
	
	public double getElement(int i, int j) {
		return matrix[i][j];
	}
	
	public void setElement(int i, int j, double value) {
		matrix[i][j] = value;
	}
	
	public double getMaxElement() {
		double maxElement = matrix[0][0];
		
		for(double[] matArr : matrix) {
			for(double element : matArr) {
				
				if(maxElement < element) {
					maxElement = element;
				}
			}
		}
		return maxElement;
	}
	
	public double getMinElement() {
		double minElement = matrix[0][0];
		
		for(double[] matArr : matrix) {
			for(double element : matArr) {
				
				if(minElement > element) {
					minElement = element;
				}
			}
		}
		return minElement;
	}
	
	public void printMatrix() {
		for(double[] matArr : matrix) {
			for(double element : matArr) {
				System.out.printf("%.1f ", element);
			}
			System.out.println();
		}
	}

	public double getArithmeticalMean() {
		double result = 0;
		
		for(double[] matArr : matrix) {
			for(double element : matArr) {
				result += element;
			}
		}
		return (result / (getAmountOfRows() * getAmountOfColumns()));
	}
	
	public double getGeometricalMean() {
		double result = 1;
		
		for(double[] matArr : matrix) {
			for(double element : matArr) {
				result *= element;
			}
		}
		return Math.pow(result, 1.0 / (this.getAmountOfColumns() * this.getAmountOfRows()));
	}

	public boolean isLocalMin(int i, int j) {
	    double n = matrix.length;
	    double m = matrix[0].length;
	    
	    ArrayList<Double> neighbours = new ArrayList<Double>(8);
	    for (int x = Math.max(i-1, 0); x <= Math.min(i+1, n-1); ++x)
	        for (int y = Math.max(j-1, 0); y <= Math.min(i+1, m-1); ++y)
	    for (Double v : neighbours)
	        if (matrix[i][j] >= v)
	            return false;
	    return true;
	}
	
	public boolean isLocalMax(int i, int j) {
	    double n = matrix.length;
	    double m = matrix[0].length;
	    
	    ArrayList<Double> neighbours = new ArrayList<Double>(8);
	    for (int x = Math.max(i-1, 0); x >= Math.min(i+1, n-1); ++x)
	        for (int y = Math.max(j-1, 0); y >= Math.min(i+1, m-1); ++y)
	    for (Double v : neighbours)
	        if (matrix[i][j] <= v)
	            return false;
	    return true;
	}
	
	public void transMatrix() {
		double[][] transMatrix = new double[this.getAmountOfRows()][this.getAmountOfColumns()];
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < transMatrix.length; ++j) {
				transMatrix[j][i] = matrix[i][j];
			}
		}
		for(double[] matArr : transMatrix) {
			for(double element : matArr) {
				System.out.printf("%.1f ", element);
			}
			System.out.println();
		}
	}
}
