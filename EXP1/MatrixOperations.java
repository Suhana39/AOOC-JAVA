import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        System.out.println("Enter elements for first 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter elements for second 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix2[i][j] = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1: Addition");
        System.out.println("2: Multiplication");
        System.out.println("3: Transpose of first matrix");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int[][] sum = new int[2][2];
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.println("Addition of matrices:");
                printMatrix(sum);
                break;
            case 2:
                int[][] product = new int[2][2];
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        product[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
                System.out.println("Multiplication of matrices:");
                printMatrix(product);
                break;
            case 3:
                int[][] transpose = new int[2][2];
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        transpose[j][i] = matrix1[i][j];
                System.out.println("Transpose of first matrix:");
                printMatrix(transpose);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }

    static void printMatrix(int[][] m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
