package Neww;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(5, 5);
		this.color = color;
	}
	
	void setXY(int x, int y) {
		move(x,y);
	}
	void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return(color+"색의 ("+getX()+","+getY()+")의 점");
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String st = cp.toString();
		System.out.println(st+"입니다.");
	}
	
	
	
}
