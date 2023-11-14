package Neww;

public class PositivePoint extends Point{
	
	PositivePoint(){
		super(0,0);
	}
	
	PositivePoint(int x, int y){
		super(0,0);
		move(x, y);
	}
	
	public String toString() {
		int x = getX();
		int y = getY();
		String st = "("+x+","+y+")의 점";
		return st;
	}

	@Override
	protected void move(int x, int y) {
		if ((x>0)&&(y>0))
		// TODO Auto-generated method stub
		super.move(x, y);
	}
	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"입니다.");
	}
	
	
	
	

}
