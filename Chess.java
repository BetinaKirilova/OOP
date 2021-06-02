package OOP.Project;

import java.util.Scanner;

public class Chess {
    static Scanner scan = new Scanner(System.in);

    public static void input(String[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.next();
            }
        }
    }

    public static boolean isX(String[][] arr) {
        boolean ans = false;

        if (arr[0][0].equals("X") && arr[0][1].equals("X") && arr[0][2].equals("X")) {
            ans = true;
        }
        if (arr[1][0].equals("X") && arr[1][1].equals("X") && arr[1][2].equals("X")) {
            ans = true;
        }
        if (arr[2][0].equals("X") && arr[2][1].equals("X") && arr[2][2].equals("X")) {
            ans = true;
        }

        if (arr[0][0].equals("X") && arr[1][0].equals("X") && arr[2][0].equals("X")) {
            ans = true;
        }

        if (arr[0][1].equals("X") && arr[1][1].equals("X") && arr[2][1].equals("X")) {
            ans = true;
        }
        if (arr[0][2].equals("X") && arr[1][2].equals("X") && arr[2][2].equals("X")) {
            ans = true;
        }
        if (arr[0][0].equals("X") && arr[1][1].equals("X") && arr[2][2].equals("X")) {
            ans = true;
        }
        if (arr[0][2].equals("X") && arr[1][1].equals("X") && arr[2][0].equals("X")) {
            ans = true;
        }


        return ans;
    }

    public static boolean isO(String[][] arr) {
        boolean ans = false;

        if (arr[0][0].equals("O") && arr[0][1].equals("O") && arr[0][2].equals("O")) {
            ans = true;
        }
        if (arr[1][0].equals("O") && arr[1][1].equals("O") && arr[1][2].equals("O")) {
            ans = true;
        }
        if (arr[2][0].equals("O") && arr[2][1].equals("O") && arr[2][2].equals("O")) {
            ans = true;
        }

        if (arr[0][0].equals("O") && arr[1][0].equals("O") && arr[2][0].equals("O")) {
            ans = true;
        }

        if (arr[0][1].equals("O") && arr[1][1].equals("O") && arr[2][1].equals("O")) {
            ans = true;
        }
        if (arr[0][2].equals("O") && arr[1][2].equals("O") && arr[2][2].equals("O")) {
            ans = true;
        }
        if (arr[0][0].equals("O") && arr[1][1].equals("O") && arr[2][2].equals("O")) {
            ans = true;
        }
        if (arr[0][2].equals("O") && arr[1][1].equals("O") && arr[2][0].equals("O")) {
            ans = true;
        }


        return ans;
    }

    public static void main(String[] args) {
        String[][] arr = new String[3][3];
        input(arr);
        if (isX(arr)) {
            System.out.println("The winner is: X");
        }
        if (isO(arr)) {
            System.out.println("The winner is: O");
        }
        if (isX(arr) == false && isO(arr) == false) {
            System.out.println("There is no winner");
        }
    }
}
