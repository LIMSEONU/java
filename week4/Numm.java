package array2;

import java.util.Scanner;

public class Numm {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scn.next();
		char n = s.charAt(0);
		
		for(char i = n; i >= 'a'; i--) {
			for(char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		scn.close();
		
	}

}
