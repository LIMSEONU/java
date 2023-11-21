package packEx;

import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String arr[] = {"가위", "바위", "보"};
		
		while(true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			int p = scn.nextInt();
			if (p == 4)
				break;
			int cpt = (int)(Math.random()*3+1);
			System.out.println("철수("+arr[p-1]+") : 컴퓨터("+arr[cpt-1]+")");
			if(((p==1)&&(cpt==1))||((p==2)&&(cpt==2))||((p==3)&&(cpt==3)))
				System.out.println("비겼습니다.");
			else if(((p==1)&&(cpt==3))||((p==2)&&(cpt==1))||((p==3)&&(cpt==2)))
				System.out.println("철수가 이겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
		}
	}
}
