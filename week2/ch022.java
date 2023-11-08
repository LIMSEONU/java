import java.util.Scanner;

public class ch022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>>");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            int tens = number / 10;
            int ones = number % 10;

            if (tens == ones) {
                System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
            } else {
                System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
            }
        } else {
            System.out.println("입력한 숫자가 10~99 사이의 숫자가 아닙니다.");
        }
    }
}
