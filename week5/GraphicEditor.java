import java.util.Scanner;

public class GraphicEditor {
	static int count = 0;
	Shape start, last, obj, next_obj;
	
	void insert() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int c = scn. nextInt();
		
		if(count == 0) {
			if(c == 1)
				start = new Line();
			else if (c == 2)
				start = new Rect();
			else
				start = new Circle();
			last = start;
		}
		else {
			if (c == 1)
				obj = new Line();
			else if (c == 2)
				obj = new Rect();
			else
				obj = new Circle();
			last.setNext(obj);
			last=obj;
		}
		count++;
	}
	void delete() {
		Scanner scn = new Scanner(System.in);
		System.out.print("삭제할 도형의 위치>>");
		int order = scn.nextInt();
		
		if(order>count)
			System.out.println("삭제할 수 없습니다.");
		else {
			if (order==1) {
				if(last==start)
					last=start = null;
				else
					start = start.getNext();
			}
			else if (order == count) {
				obj = start;
				next_obj = obj.getNext();
				for (int i =2; i<order; i++) {
					obj = next_obj;
					next_obj = next_obj.getNext();
				}
				obj.setNext(null);
			} else {
				obj = start;
				next_obj = obj.getNext();
				for (int i =2; i<order; i++) {
					obj = next_obj;
					next_obj = next_obj.getNext();
				}
				obj.setNext(next_obj.getNext());
			}
			count --;
		}
			} 
	void printAll() {
		if (count == 0)
			System.out.println("나타낼 그래픽이 존재하지 않습니다.");
		else if (count == 1)
			start.draw();
		else {
			start.draw();
			obj = start.getNext();
			for(int i =2; i<count;i++) {
				obj.draw();
				obj = obj.getNext();
			}
			obj.draw();
		}
	}
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int test = 1;
		int c = 0;
		
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		GraphicEditor ge = new GraphicEditor();
		
		while (test == 1) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			c = scn.nextInt();
			
			switch (c) {
			case 1:
				ge.insert();
				break;
			case 2:
				ge.delete();
				break;
			case 3:
				ge.printAll();
				break;
			case 4:
				System.out.println("beauty를 종료합니다.");
				test = 0;
				break;
			}
		}
	}
}
