package if111;

import java.util.Scanner;

public class Chawon2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        int x = scn.nextInt();
        int y = scn.nextInt();

        int LTX = 100;
        int LTY = 100;
        int RBX = 200;
        int RBY = 200;

        if ((x >= LTX && x <= RBX) && (y >= LTY && y <= RBY)) {
            System.out.print("(" + x + ", " + y + ")");
            System.out.print("는 사각형 안에 있습니다.");
        }


        scn.close();

    }

}
