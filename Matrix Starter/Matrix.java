///////////////////////////////////////////////////////////////////////////////
// Main Class File:    MatrixTester.java
// File:               Matrix.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Devanshi Jain
// Email:              djain@ucsd.edu
// Instructor's Name:  Greg Miranda
//////////////////////////// 80 columns wide //////////////////////////////////

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/**
 * A class that maintains a rectangular 2D array (Matrix)
 *
 * Bugs: Something is wrong with `findTransposeWrong()`...
 *
 * @author Devanshi Jain
 */

public class Matrix {

    private int[][] myMatrix;

    /**
     * Constructor to initialize the Matrix via another matrix (2D array).
     * DO NOT MODIFY THE CONSTRUCTOR DECLARATION.
     *
     * @param matrixIn the matrix to DEEP copy into myMatrix
     */
    public Matrix(int[][] matrixIn) {
        this.myMatrix = new int[matrixIn.length][matrixIn[0].length];
        // System.out.print("matrixfi: " );
        for (int i = 0; i < matrixIn.length; ++i) {
            for (int j = 0; j< matrixIn[i].length; ++j){
                this.myMatrix[i][j] = matrixIn[i][j];
                // System.out.print(myMatrix[i][j] + ", ");
            }
        }
    }
    
    /**
     * Constructor to initialize myMatrix via an input file.
     *
     * DO NOT MODIFY THE CONSTRUCTOR DECLARATION.
     *
     * @param inputPath the file to read and create for myMatrix
     */
    public Matrix(String inputPath) throws IOException {
        File file = new File(inputPath);
        Scanner scnr = new Scanner(file);
        int row = scnr.nextInt();
        int col = scnr.nextInt();
        this.myMatrix = new int[row][col];
        // System.out.print("thru file: " );
        for (int i = 0; i < row; ++i){
            for (int j = 0; j < col; ++j){
                // System.out.println(scnr.nextInt());
                this.myMatrix[i][j] = scnr.nextInt(); 
                // System.out.print(myMatrix[i][j] + ", ");
            }
        }       
        scnr.close();
    }

    /**
     * Getter method for returning `myMatrix`.
     *
     * DO NOT MODIFY THIS METHOD.
     *
     * @return this.myMatrix
     */
    public int[][] getMyMatrix() {
        return this.myMatrix;
    }

    /**
     * Finds the transpose of myMatrix, but there are errors...
     * Can you find the errors?
     *
     * DO NOT MODIFY THIS METHOD.
     *
     * @return transpose of the matrix 'myMatrix'
     */
    public int[][] findTransposeWrong() {
        int rows = myMatrix.length;
        int cols = myMatrix.length;
        int [][]transpose = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = myMatrix[i][j];
            }
        }
        return transpose;
    }

    /**
     * Finds the transpose of myMatrix, but the errors should be fixed.
     * Use `findTransposeWrong()` as template code, and fix the errors.
     *
     * DO NOT MODIFY METHOD DECLARATION.
     *
     * @return transpose of the matrix 'myMatrix'
     */
    public int[][] findTranspose() {
        int rows = this.myMatrix.length;
        int cols = this.myMatrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < cols; ++i) {
            for (int j = 0; j < rows; ++j) {
                transpose[i][j] = myMatrix[j][i];
            }
        }
        return transpose;
        // return new int[0][0];
    }
}
