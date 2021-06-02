package OOP.Project;

import java.util.Scanner;

public class MinCol {
   static Scanner scan = new Scanner(System.in);

    public static void input(int[][]arr,int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(scan.next());
            }
        }
    }

    public static void PrintArray(int[][]arr,int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("    " + arr[i][j]);
            }
            System.out.println();
        }

    }

    public static int []getMin(int row, int col, int[][]arr){
        int [] min = new int[col];
        for (int i = 0  ; i < col; i++){
            min[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if(min[i] > arr[j][i]){
                    min[i] = arr[j][i];
                }
            }
        }

return min;
    }
    public static void main(String[] args) {

        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] arr = new int[row][col];

        input(arr,row,col);
        PrintArray(arr,row,col);
        int[]min = getMin(row,col,arr);

        for (int val : min) {
            System.out.print("    " + val );
        }
    }
}
