package OOP.Project;

import java.util.Scanner;

public class Ticket {
    static Scanner scan = new Scanner(System.in);

    public static void input(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(scan.next());
            }
        }
    }

    public static boolean IsItWinning(int FirstDiagonal, int SecondDiagonal, int up, int down) {
        boolean ans = false;
        if (FirstDiagonal == SecondDiagonal) {
            ans = true;
        }

        if (up % 2 == 0) {
            ans = true;
        }
        if (down % 2 == 1) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        int row = Integer.parseInt(scan.next());
        int col = Integer.parseInt(scan.next());

        int[][] arr = new int[row][col];
        input(arr, row, col);

        int FirstDiagonal = 0;
        int up = 0;
        int down = 0;
        int SecondDiagonal = 0;

        int[] winning = new int[4];

        double money = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == i) {
                    FirstDiagonal += arr[i][j];
                    if (arr[i][j] % 2==0){
                        winning[1] +=arr[i][j];
                    }
                }
                if (i < j) {
                    up += arr[i][j];
                }
                if (i > j) {
                    down += arr[i][j];
                }
                if (i + j == row - 1) {
                    SecondDiagonal += arr[i][j];
                }
                if ((i == 0 || i== row-1) && arr[i][j]%2==0){
                    winning[2] += arr[i][j];
                }
                if ((j == 0 || j== col-1) && arr[i][j]%2==1){
                    winning[3] += arr[i][j];
                }
            }
        }
        winning[0] = down;

        if (IsItWinning(FirstDiagonal,SecondDiagonal,up,down)){
            for (int val:winning) {
                money+=val;
            }
            money/=4;
            System.out.println("YES");
            System.out.printf("The amount of money won is %.2f",money);
        }else {
            System.out.println("NO");
        }

    }
}
