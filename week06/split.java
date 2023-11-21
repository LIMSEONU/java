package packEx;

import java.util.*;

public class split {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String s = scn.nextLine();
			if(s.equals("그만"))
				break;
			String arr[] = s.split(s);
			System.out.println("어절 개수는 " +arr.length);
		}
		System.out.println("종료합니다...");
	}
}
