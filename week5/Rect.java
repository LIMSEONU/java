package Neww;

public class Rect implements Shape{
	private int width;
	private int height;
	private double area;
	
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		area=this.width*this.height;
	}
	
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형 입니다.");
	}
	
	public double getArea() {
		return area;
	}
	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i = 0; i<list.length; i++)
			list[i].redraw();
		for(int i = 0; i<list.length; i++)
			System.out.println("면적은 "+list[i].getArea());
	}
	

}
