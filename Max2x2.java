package OOP.Project;

import java.util.Scanner;

public class Max2x2 {
    static Scanner scan = new Scanner(System.in);
    public static void input(int[][]arr,int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(scan.next());
            }
        }
    }
    public static void main(String[] args) {

        int row = scan.nextInt();
        int col = scan.nextInt();

        int [][] arr = new int[row][col];
        input(arr,row,col);

        int sum = Integer.MIN_VALUE;
        String result = "";
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < col-1; j++) {
                int curSum = arr[i][j] + arr[i+1][j] + arr[i][j+1] + arr[i+1][j+1];
                if (sum < curSum){
                    result = arr[i][j] + " " + arr[i][j+1] + "\n" + arr[i+1][j] + " " + arr[i+1][j+1];
                sum = curSum;
                }
            }
        }
        System.out.println(result);
    }
}
