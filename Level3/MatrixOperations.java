package Java_Methods.Level3;

import java.util.Random;

public class MatrixOperations {
    public static double[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }
    public static double[][] addMatrices(double[][] a, double[][] b) {
        int rows = a.length, cols = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }
    public static double[][] subtractMatrices(double[][] a, double[][] b) {
        int rows = a.length, cols = a[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }
    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
        int rows = a.length, cols = b[0].length, common = b.length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inverse = {
                { m[1][1] / det, -m[0][1] / det },
                { -m[1][0] / det, m[0][0] / det }
        };
        return inverse;
    }
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;
        double[][] cofactors = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double[][] minor = new double[2][2];
                int r = 0;
                for (int x = 0; x < 3; x++) {
                    if (x == i) continue;
                    int c = 0;
                    for (int y = 0; y < 3; y++) {
                        if (y == j) continue;
                        minor[r][c] = m[x][y];
                        c++;
                    }
                    r++;
                }
                cofactors[i][j] = Math.pow(-1, i + j) * determinant2x2(minor);
            }
        }

        double[][] adjoint = transposeMatrix(cofactors);
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inverse[i][j] = adjoint[i][j] / det;
        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f ", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("2x2 MATRIX OPERATIONS:");
        double[][] a2 = generateMatrix(2, 2);
        double[][] b2 = generateMatrix(2, 2);
        System.out.println("Matrix A:");
        displayMatrix(a2);
        System.out.println("Matrix B:");
        displayMatrix(b2);

        System.out.println("A + B:");
        displayMatrix(addMatrices(a2, b2));

        System.out.println("A - B:");
        displayMatrix(subtractMatrices(a2, b2));

        System.out.println("A * B:");
        displayMatrix(multiplyMatrices(a2, b2));

        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(a2));

        System.out.println("Determinant of A: " + determinant2x2(a2));
        double[][] invA2 = inverse2x2(a2);
        if (invA2 != null) {
            System.out.println("Inverse of A:");
            displayMatrix(invA2);
        } else {
            System.out.println("Matrix A has no inverse (det = 0)");
        }

        System.out.println("\n3x3 MATRIX OPERATIONS:");
        double[][] a3 = generateMatrix(3, 3);
        System.out.println("Matrix A:");
        displayMatrix(a3);

        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(a3));

        System.out.println("Determinant of A: " + determinant3x3(a3));
        double[][] invA3 = inverse3x3(a3);
        if (invA3 != null) {
            System.out.println("Inverse of A:");
            displayMatrix(invA3);
        } else {
            System.out.println("Matrix A has no inverse (det = 0)");
        }
    }
}
