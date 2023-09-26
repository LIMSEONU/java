package if111;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		int number;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		number = scn.nextInt();
		                         
	    if (number < 1 || number > 99) {
	    } else {
		int clap = countClaps(number);
		if (clap == 1) {
			System.out.println("박수짝");
		} else if (clap == 2) {
			System.out.println("박수짝짝");
		}
	}
		
	    scn.close();
	}
	
	public static int countClaps(int number) {
		int count = 0;
		while (number > 0) {
		int dig = number % 10;
		if (dig == 3 || dig == 6 || dig == 9) {
			count++;
			
		}
		number /=10;
     }
	return count;
   }
}