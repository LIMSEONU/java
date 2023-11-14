package Neww;

public class Oval implements Shape{
	private int rad1;
	private int rad2;
	private double area;
	
	public Oval(int rad1, int rad2) {
		super();
		this.rad1 = rad1;
		this.rad2 = rad2;
		area = rad1*rad2*PI;
	}
	public void draw() {
		System.out.println(rad1+"x"+rad2+"에 내접하는 타원입니다.");
	}
	
	public double getArea() {
		return area;
	}
	
	

}
