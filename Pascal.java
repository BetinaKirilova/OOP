package OOP.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal {

    public static void print(List<int[]> list, int spaces) {
        System.out.println(" ".repeat(spaces) + "1");
        for (int i = 0; i < list.size(); i++) {
            int[] current = list.get(i);
            spaces -= 2;
            System.out.print(" ".repeat(spaces));
            for (int val : current) {
                System.out.print(val + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int space = (n + ((n - 1) * 3) - 1) / 2;

        List<int[]> list = new ArrayList<>();
        int[] row2 = {1, 1};
        list.add(row2);

        for (int i = 2; i < n; i++) {
            int[] cur = new int[i + 1];
            cur[0] = 1;
            cur[cur.length - 1] = 1;
            for (int j = 1; j < cur.length - 1; j++) {
                int[] prev = list.get(i - 2);
                int num = 0;
                int ind = j;
                while (ind < prev.length) {
                    num = prev[ind - 1] + prev[ind];
                    ind += i;
                }
                cur[j] = num;
            }
            list.add(cur);

        }

        print(list, space);
    }
}

