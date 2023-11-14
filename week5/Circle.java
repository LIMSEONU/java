package Neww;

public class Circle implements Shape{
	private int radius;
	private double area;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
		area = this.radius*this.radius*PI;
	}
	
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}
	
	public double getArea() {
		return area;
	}
	public static void main(String[] args) {
		Shape s = new Circle(10);
		s.redraw();
		System.out.println("면적은 "+s.getArea());
	}
	
	
	
	
	

}
