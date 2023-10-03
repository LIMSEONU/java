package array2;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

		
		System.out.print("금액을 입력하시오>>");
		int n = scn.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			if (n / unit[i]!=0)
				System.out.println(unit[i] +"원 짜리 : "+n / unit[i]+"개");
			
				n = n % unit[i];
		}
		
		scn.close();
		
	}

}
