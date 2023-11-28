import java.util.*;

abstract class Shape{
	public abstract void draw();
}

class Line extends Shape {
	String name ="line";
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	String name ="Rect";
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	String name ="circle";
	public void draw() {
		System.out.println("Circle");
	}
}
public class Graphic {
	Scanner sc = new Scanner(System.in);
	Vector<Shape> v = new Vector<Shape>();
	public void insert(int shape) {
		Shape s;
		switch(shape) {
		case 1:
			s = new Line(); v.add(s); break;
		case 2: 
			s = new Rect(); v.add(s); break;
		case 3:
			s = new Circle(); v.add(s); break;
		default:
			System.out.println("잘못된 입력입니다."); return;
		}
	}
	public void delete(int pos) {
		v.remove(pos - 1);
	}
	public void print() {
		for(int i = 0; i < v.size(); i++) {
			Shape s = v.get(i);
			s.draw();
		}
	}
	public void run() {
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int n = sc.nextInt();
			switch(n) {
			case 1: 
				System.out.print("Line(1), Rect(2), circle(3)>>");
				int shape = sc.nextInt();
				insert(shape); break;
			case 2:
				System.out.print("삭제할 도형의 위치>>");
				int target = sc.nextInt();
				delete(target); break;
			case 3:
				print(); break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				sc.close();
				return;
			}
		}
	}
	public static void main(String[] args) {
		Graphic e = new Graphic();
		e.run();		
	}
}