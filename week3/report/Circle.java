package if111;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		 System.out.print("원의 중심과 반지름 입력>>");
	        double center_x = scn.nextDouble();
	        double center_y = scn.nextDouble();
	        double radius = scn.nextDouble();

	        System.out.print("점 입력>>");
	        double x = scn.nextDouble();
	        double y = scn.nextDouble();

	        double distance = Math.sqrt(Math.pow(x - center_x, 2) + Math.pow(y - center_y, 2));

	        if (distance < radius) {
	            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
	        } 
	   

	        scn.close();
	}

}
