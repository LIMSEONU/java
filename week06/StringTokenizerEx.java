package packEx;

import java.util.*;

public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String s = scn.nextLine();
            if (s.equals("그만"))
                break;
            StringTokenizer st = new StringTokenizer(s);

            System.out.println("어절 개수는 " + st.countTokens());
        }

        System.out.println("종료합니다...");
    }
}
