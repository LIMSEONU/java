package classes;

import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {
	Scanner scn = new Scanner(System.in);
		Day d [];
		
		public MonthSchedule(int day) {
			d = new Day[day];
			for(int i=0; i<day; i++)
				d[i] = new Day();
		}
		
	void input(Day d[], int day, String work) {
		d[day].set(work);
	}
	
	void view(Day d[], int day) {
		System.out.print(day+"일의 할 일은 ");
		d[day].show();
	}
	
	int finish() {
		System.out.println("프로그램을 종료합니다.");
		return 0;
	}
	
	void run() {
		int t=1;
		int option;
		int day;
		String work;
		System.out.println("이번달 스케줄 관리 프로그램.");
		
		while(t==1) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			option=scn.nextInt();
			switch (option) {
			case 1:
				System.out.print("날짜(1~30)?");
				day = scn.nextInt();
				System.out.print("할일(빈칸없이입력)?");
				work = scn.next();
				this.input(this.d,day,work);
				System.out.println();
				break;
			case 2:
				System.out.print("날짜(1~30)?");
				day=scn.nextInt();
				this.view(this.d,day);
				System.out.println();
				break;
			case 3:
				t=this.finish();
				break;
			}
			
		}
	}
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
