package array2;

import java.util.Scanner;
import java.util.Random;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random ram = new Random();

        System.out.print("정수 몇개?");
        int e = scn.nextInt();

        if (e >= 100) {
            scn.close();
            return;
        }

        int[] num = new int[e];
        boolean[] used = new boolean[101];

        for (int i = 0; i < e; i++) {
            int random;
            do {
                random = ram.nextInt(100) + 1;
            } while (used[random]);

            num[i] = random;
            used[random] = true;
        }

        System.out.println();
        for (int i = 0; i < e; i++) {
            System.out.print(num[i] + " ");
        }

        scn.close();
    }
}
