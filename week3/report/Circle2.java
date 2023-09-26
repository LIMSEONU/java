package if111;

import java.util.Scanner;

public class Circle2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        double radius1 = scn.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();
        double radius2 = scn.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        if (distance <= radius1 + radius2) {
        	System.out.println("두 원은 서로 겹친다.");
        	
        }
        scn.close();
        
	}

}
