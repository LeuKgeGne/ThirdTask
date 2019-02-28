package javaMatrix;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Runner {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int columns, rows, i, j;
			TheMatrix matrix;
			
			System.out.print("Input amount of columns: ");
			columns = scan.nextInt();
			System.out.print("Input amount of rows: ");
			rows = scan.nextInt();
			
			
			matrix = MatrixCreator.createRandomized(columns, rows);
			
			matrix.printMatrix();
			
			System.out.printf("\nMax element is: %.1f", matrix.getMaxElement());
			System.out.printf("\nMin element is: %.1f", matrix.getMinElement());
			
			System.out.printf("\nArithmetical mean is: %.1f", matrix.getArithmeticalMean());
			System.out.printf("\nGeometrical mean is: %.1f", matrix.getGeometricalMean());
			
			System.out.println("\nEnter your coordinates:");
			System.out.print("The first is: ");
			i = scan.nextInt();
			System.out.print("The second is: ");
			j = scan.nextInt();
			scan.close();
			
			if(i > 0 && j > 0) {
				if(matrix.isLocalMin(i, j)) {
					System.out.printf("\nThis is local minimum! Coordinates: [%d][%d]\n", i, j);
				}
				else {
					System.out.println("That is not local minimum :(");
				}
				
				if(matrix.isLocalMax(i, j)) {
					System.out.printf("\nThis is local maximum! Coordinates: [%d][%d]\n", i, j);
				}
				else {
					System.out.println("That is not local maximum :(");
				}
			}
			else {
				System.out.println("Wrong coordinates!");
			}
			
			System.out.println("\nThe Matrix is:");
			matrix.printMatrix();
			
			System.out.println("\nThe transposed matrix is:");
			matrix.transMatrix();
			} 
		catch (InputMismatchException exc) {
			System.out.println("Wrong Input!");
		}

	}

}
