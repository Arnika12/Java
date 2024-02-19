//8. Write Java program to find multiplication of two matrix. Accept matrix from user.

import java.util.*;
public class MatrixMultiplication
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrix A: ");
        int RA = sc.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int CA = sc.nextInt();

        System.out.print("Enter the number of rows for matrix B: ");
        int RB = sc.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int CB = sc.nextInt();

        System.out.println("Enter elements of the first matrix:");
        int[][] matrix1 = new int[RA][CA];
        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CA; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "][" + (j + 1) + "] : ");
                matrix1[i][j] = sc.nextInt();
            }
        }

         System.out.println("Enter elements of the second matrix:");
        int[][] matrix2 = new int[RB][CB];
        for (int i = 0; i < RB; i++) {
            for (int j = 0; j < CB; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "][" + (j + 1) + "] : ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("Matrix A:");
        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CA; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix B:");
        for (int i = 0; i < RB; i++) {
            for (int j = 0; j < CB; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplication of two matrices
        if (CA != RB) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] resultMatrix = new int[RA][CB];
            for (int i = 0; i < RA; i++) {
                for (int j = 0; j < CB; j++) {
                    for (int k = 0; k < CA; k++) {
                        resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("The Multiplication of Matrix A & Matrix B : ");
            for (int i = 0; i < RA; i++) {
                for (int j = 0; j < CB; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
