///////////////////////////////////////////////////////////////////////////////
// Title:              Matrix
// Files:              MatrixTester.java, Matrix.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             (YOUR NAME)
// Email:              (YOUR EMAIL ADDRESS)
// Instructor's Name:  (NAME OF YOUR INSTRUCTOR)
//////////////////////////// 80 columns wide //////////////////////////////////

import java.io.IOException;

/**
 * A class to test the Matrix class.
 *
 * Bugs: None known
 *
 * @author (YOUR NAME)
 */
public class MatrixTester {

    /**
     * Method that checks if two matrices are identical or not.
     *
     * Preconditions: matrix1 and matrix2 each contain an integer 2D array.
     *
     * @param matrix1 First matrix that will be compared with matrix2
     * @param matrix2 Second matrix that will be compared with matrix1
     *
     * @return A boolean value, true if the two matrices are identical, false
     *  otherwise.
     *
     * DO NOT MODIFY METHOD THIS METHOD.
     */
    private static boolean matrixMatch(int[][] matrix1, int[][] matrix2)
    {
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length))
            return false;
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                if(!(matrix1[i][j] == matrix2[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Execution point of testing code for the Matrix class.
     *
     * DO NOT MODIFY METHOD DECLARATION.
     */
    public static void main(String[] args) throws IOException {
       /** 
        * findTranposeWrong() works for square matrices, since, the number
        * of rows and columns are both equal to the myMatrix.length,
        * which is the number of rows in the initial matrix.
        // **/
        int[][] inputSquare =  {{1, 5, 3},
                                {5, 2, 85},
                                {3, 85,9}};
        Matrix matrixSquare = new Matrix(inputSquare);
        int[][] transposeSquare =  {{1, 5, 3},
                                    {5, 2, 85},
                                    {3, 85,9}};
        System.out.println("Matrix from inputSquare is: ");
        for (int row = 0; row < matrixSquare.getMyMatrix().length; row++) {
            for (int col = 0; col < matrixSquare.getMyMatrix()[row].length; col++) {
                System.out.print(matrixSquare.getMyMatrix()[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed matrix is: ");
        for (int row = 0; row < matrixSquare.getMyMatrix().length; row++) {
            for (int col = 0; col < matrixSquare.getMyMatrix().length; col++) {
                System.out.print(matrixSquare.findTransposeWrong()[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("EQUAL??: " + matrixMatch(transposeSquare, matrixSquare.findTransposeWrong()));
        // //Testing reading a Matrix from file input2
        // Matrix matrix_input2 = new Matrix("input2");
        // System.out.println("Matrix from input2 is: ");
        // for (int row = 0; row < matrix_input2.getMyMatrix().length; row++) {
        //     for (int col = 0; col < matrix_input2.getMyMatrix()[row].length; col++) {
        //         System.out.print(matrix_input2.getMyMatrix()[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("Tranpose obtained from findTransposeWrong: " + matrixSquare.findTransposeWrong());
        // System.out.println("Tranpose obtained from findTranspose: " + matrixSquare.findTranspose());


        // int[][] input1 =    {{1, 5, 23, 4},
        //                     {6, 2, 85, 5},
        //                     {3, 76, 13, 6}};
        // Matrix matrix1 = new Matrix(input1);
        // int[][] transpose1 = {  {1, 6, 3},
        //                         {5, 2, 76},
        //                         {23, 85, 13},
        //                         {4, 5, 6}};

        // String file1 = "input1";
        // Matrix matrix2 = new Matrix(file1);
        // int[][] transpose2 = { {1, 2, 5},
        //                         {7, 4, 3},
        //                         {3, 2, 4},
        //                         {6, 8, 9}};

        // // Testing for simple assignment within constructor.
        // // We do NOT want a shallow copy - we want a deep copy.
        // // As such, if both matrices have the same reference, then this test fails.
        // if (matrix1.getMyMatrix() == input1) {
        //     System.out.println("Test Failed! Shallow copy detected.");
        // }

        // // if (matrix2.getMyMatrix() == file1) {
        // //     System.out.println("Test Failed! Shallow copy detected.");
        // // }

        // // Testing `findTranspose()` for `matrix1`.
        // // The transpose should be same as transpose1, if not, this test fails.
        // if (!(matrixMatch(matrix1.findTranspose(), transpose1))) {
        //     System.out.println("Test Failed! `matrix1.findTranspose()` returns incorrect o/p.");
        // }

        // // Testing `findTranspose()` for `matrix2`.
        // // The transpose should be same as transpose2, if not, this test fails.
        // if (!(matrixMatch(matrix2.findTranspose(), transpose2))) {
        //     System.out.println("Test Failed! `matrix2.findTranspose()` returns incorrect o/p.");
        // }

        // You should write more tests to ensure constructor functionality (and deep copy),
        // and to test `findTranspose()`.
    }
}