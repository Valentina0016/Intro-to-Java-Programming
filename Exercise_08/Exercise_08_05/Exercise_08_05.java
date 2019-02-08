/*********************************************************************************
* (Algebra: add two matrices) Write a method to add two matrices. The header of  *
* the method is as follows:                                                      *
*                                                                                *
* public static double[][] addMatrix(double[][] a, double[][] b)                 *
*                                                                                *
* In order to be added, the two matrices must have the same dimensions and the   *
* same or compatible types of elements. Let c be the resulting matrix. Each      *
* element cij is aij + bij.                                                      *
* Write a test program that prompts the user to enter two 3 * 3 matrices and     *
* displays their sum.                                                            *
*********************************************************************************/
// TODO Auto-generated method stub
import java.util.Scanner;
	public class Exercise_08_05 {
	public static void main(String[] args) {
		// Initialize two 3 x 3 matrices
		int rows = 3;
		int cols = 3;
		double[][] matrix1 = new double[rows][cols];
		double[][] matrix2 = new double[rows][cols];

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a 3-by-3 matrix
		System.out.print("Enter matrix1: ");
		for (int row = 0; row < matrix1.length; row++){
			for (int col = 0; col < matrix1[row].length; col++) {
				matrix1[row][col] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		for (int row = 0; row < matrix2.length; row++){
			for (int col = 0; col < matrix2[row].length; col++) {
				matrix2[row][col] = input.nextDouble();
			}
		}

		double[][] result =  addMartix(matrix1, matrix2);

		// add the matrices

      //Print out
		System.out.println("The matrices are added as follows");
		System.out.println(matrix1[0][0] + " " +matrix1[0][1] +" "+
				matrix1[0][2] + "       " +matrix2[0][0] + " " +matrix2[0][1] +" "+matrix2[0][2]
						+"       " +result[0][0] + " " +result[0][1] +" "+result[0][2]);

		System.out.println(matrix1[1][0] + " " +matrix1[1][1] +" "+
				matrix1[1][2] + "   +   " +matrix2[1][0] + " " +matrix2[1][1] +" "+matrix2[1][2]
						+"   =   " +result[1][0] + " " +result[1][1] +" "+result[1][2]);

		System.out.println(matrix1[2][0] + " " +matrix1[2][1] +" "+
				matrix1[2][2] + "       " +matrix2[2][0] + " " +matrix2[2][1] +" "+matrix2[2][2]
						+"       " +result[2][0] + " " +result[2][1] +" "+result[2][2]);
	}


	public static double[][] addMartix(double[][] a, double[][] b){
		double [][] sum = new double [3][3];
		int row,column;
		for(row = 0;row < a.length;row++){
			for(column = 0;column < a[row].length;column++){
				sum[row][column] = a[row][column]+b[row][column];
			}
		}
		return sum;
	}

}

