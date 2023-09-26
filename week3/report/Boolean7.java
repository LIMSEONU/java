package if111;

import java.util.Scanner;

public class Boolean7 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int x1 = scn.nextInt();
		int y1 = scn.nextInt();
		int x2 = scn.nextInt();
		int y2 = scn.nextInt();
		
		if ((inRect (x1,y1,100,100,200,200)) || (inRect (x2,y2,100,100,200,200)))
			System.out.println("두 직사각형은 충돌합니다.");
			else
			System.out.println("두 직사각형은 충돌하지않습니다.");

		
		scn.close();
	}


	
}
