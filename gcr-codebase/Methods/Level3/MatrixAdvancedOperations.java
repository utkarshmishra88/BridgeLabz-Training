// Java program to perform matrix operations: transpose, determinant and inverse.

public class MatrixAdvancedOperations {

    // Method to create a random square matrix
    public static double[][] createRandomMatrix(int size){
        double[][] matrix = new double[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        return matrix;
    }

    // Method to find transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix){
        double[][] transpose = new double[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find determinant of a 2x2 matrix
    public static double findDeterminant(double[][] matrix){
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find inverse of a 2x2 matrix
    public static double[][] findInverse(double[][] matrix){
        double det = findDeterminant(matrix);
        if(det == 0)
            return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

    // Method to print matrix
    public static void printMatrix(double[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String args[]){
        double[][] matrix = createRandomMatrix(2);
        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("Transpose:");
        printMatrix(transposeMatrix(matrix));
        double determinant = findDeterminant(matrix);
        System.out.println("Determinant = " + determinant);
        double[][] inverse = findInverse(matrix);

        if(inverse != null){
            System.out.println("Inverse:");
            printMatrix(inverse);
        }else{
            System.out.println("Inverse not possible");
        }
    }
}
