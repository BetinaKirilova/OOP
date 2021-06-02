package OOP.Project;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int col = scan.nextInt();

        int [][] arr = new int[row][col];
        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        //print
        for (int i = 0; i < row; i++) {
            double sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];

                System.out.print("         "+arr[i][j]);
            }
            System.out.printf("      %.2f\n",sum/col);

        }

    }
}
