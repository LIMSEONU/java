package packEx;

import java.util.*;

public class Buffer {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print(">>");
		String s= scn.nextLine();
		
		while(true) {
			System.out.print("명령 : ");
			String order = scn.nextLine();
			if(order.equals("그만"))
				break;
			String orders[] = order.split("!");
			if (orders[0].equals(""))
				System.out.println("잘못된 명령입니다!");
		 else {
			StringBuffer sb = new StringBuffer(s);
			int start = sb.indexOf(orders[0]);
			sb = sb.replace(start, start+orders[0].length(), orders[1]);
			s = sb.toString();
			System.out.println(s);
		 }
	}
		System.out.println("종료합니다.");
	}
}
