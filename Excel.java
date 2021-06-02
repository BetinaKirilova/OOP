package OOP.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excel {
    static Scanner scan = new Scanner(System.in);

    public static void input(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(scan.next());
            }
        }
    }

    public static Number[] sheets(int arr[][], int row, int col) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double avg = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                avg += arr[i][j];
            }
        }
        avg = avg / (row * col);

        Number[] stats = new Number[3];

        stats[0] = min;
        stats[1] = max;
        stats[2] = avg;
        return stats;
    }

    public static int isBigger (int arr[][],double avg){
        int ans = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > avg){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = scan.nextInt();

        double avg = 0;

        List <int[][]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int row = scan.nextInt();
            int col = scan.nextInt();
            int arr[][] = new int[row][col];
            input(arr, row, col);
            Number[] stats = sheets(arr, row, col);
            System.out.printf("\n%d %d %.2f", stats[0], stats[1], stats[2]);
            avg += (double) stats[2];
            list.add(arr);
        }
        avg /= n;
        System.out.println();
        for (int i = 0; i < n; i++) {
            int[][] curArr = list.get(i);
            System.out.print(isBigger(curArr,avg) + " ");
        }
    }
}
