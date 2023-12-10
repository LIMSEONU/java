package classes;

import java.util.Scanner;

class Circle_2 {
	static int max;
	private double x,y;
	private int radius;
	

	public Circle_2(double x, double y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}


	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public void maxArea() {
		if (max<=this.radius)
			max=this.radius;
	}
	
	public void showMaxArea() {
		if (max==this.radius)
			System.out.println("가장 면적이 큰 원은 ("+this.x+","+this.y+")"+this.radius);
	}
}

public class CircleManager2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle_2 c [] = new Circle_2[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle_2(x,y,radius);
		}
		for(int i=0; i<c.length; i++)
			c[i].maxArea();
		
		for(int i=0; i<c.length; i++)
			c[i].showMaxArea();
		scanner.close();
	}

}
