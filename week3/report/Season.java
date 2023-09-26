package if111;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scn.nextInt();
		
		if(month >= 1 && month <= 12)
			switch(month) {
			case 12,1,2:
				System.out.println("겨울");
				break;
			case 3,4,5:
				System.out.println("봄");
			 	break;
			case 6,7,8:
				System.out.println("여름");
				break;
			default:
				System.out.println("가을");
				break;
				
			}
		scn.close();
		
	}
}
