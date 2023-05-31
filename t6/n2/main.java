package t6.n2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int MatrixSize = cs.nextInt();

        Matrix matrix = new Matrix();
        System.out.println("generation matrix");
        matrix.Print_matrix(matrix.Matrix_generation(MatrixSize));
        System.out.println();
        System.out.println("generation 1 matrix");
        matrix.Print_matrix(matrix.Identity_matrix(MatrixSize));
        System.out.println();
        System.out.println("sum");
        matrix.Print_matrix(matrix.Sum_matrix(matrix.Matrix_generation(MatrixSize), matrix.Matrix_generation(MatrixSize)));

    }
}
