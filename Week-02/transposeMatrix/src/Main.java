public class Main {
    public static void main(String[] args) {
        //This program prints matrix and transpose of matrix.
        //Created a matrix
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("******** Matrix ********");
        //This code line calls printMatrix method and prints "matrix".
        printMatrix(matrix);
        System.out.println("******** Transpose of Matrix ********");
        //This code line calls printMatrix method and transpose method, then prints transpose of "matrix".
        printMatrix(transpose(matrix));

    }

    //This method takes matrix[2][3] variable and turns it transposeMatrix[3][2]. This method returns transposeMatrix[3][2].
    public static int[][] transpose(int[][] matrix){
        //This "row" and "column" variables get matrix's value of row and column.
        int row = matrix.length;
        int column = matrix[0].length;
        //Created a new matrix as a transpose transposeMatrix[column][row].
        int[][] transposeMatrix = new int[column][row]; //transpose - changed column and row values(matrix[2][3] turned transposeMatrix[3][2].
        //This for loop fills the transposeMatrix's elements.
        for (int i = 0; i < transposeMatrix.length; i++){
            for (int j = 0; j < transposeMatrix[i].length; j++){
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }

    //This method prints 2d Matrix. Takes paremeter int[][] matrix.
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}