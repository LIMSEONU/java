import java.util.Scanner;

public class ch023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();

        int omanwon = money / 50000;
        money = money % 50000;
        int manwon = money / 10000;
        money = money % 10000;
        int chunwon = money / 1000;
        money = money % 1000;
        int obaekwon = money / 500;
        money = money % 500;
        int baekwon = money / 100;
        money = money % 100;
        int osipwon = money / 50;
        money = money % 50;
        int sipwon = money / 10;
        money = money % 10;
        int ilwon = money;
        
        System.out.println("오만원권 " + omanwon + "매 만원권 " + manwon + "매 천원권 " + chunwon + "매 백원 " + baekwon + "개 오십원 " + osipwon + "개 십원 " + sipwon + "개 일원 " + ilwon + "개");
    }
}
