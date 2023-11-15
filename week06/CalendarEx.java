package packEx;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {
		Scanner scn = new Scanner(System.in);
		private String name;
		private int time;
		
		CalendarEx (String name){
			this.name=name;
			
			System.out.print(name+" 시작 <Enter>키>>");
			scn.nextLine();
			Calendar s = Calendar.getInstance();
			int sec = s.get(Calendar.SECOND);
			System.out.println("    현재 초 시간 = "+sec);
			System.out.print("10초 예상 후 <Enter>키>>");
			scn.nextLine();
			Calendar e = Calendar.getInstance();
			int esc = e.get(Calendar.SECOND);
			System.out.println("    현재 초 시간 = "+esc);
			if(esc > sec)
				time = esc - sec;
			else
				time = 60 + esc - sec;
		}
		
		String getName() {
			return name;
		}
		int getTime() {
			return time;
		}
		
		public static void main(String[] args) {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		CalendarEx p1 = new CalendarEx("황기태");
		CalendarEx p2 = new CalendarEx("이재문");
		
		System.out.print(p1.getName()+"의 결과 "+p1.getTime()+", "+p2.getName()+"의 결과 "+p2.getTime());
		if(Math.abs(p1.getTime()-10)<Math.abs(p2.getTime()-10))
			System.out.println(", 승자는 황기태");
		else if (Math.abs(p1.getTime()-10)>Math.abs(p2.getTime()-10))
			System.out.println(", 승자는 이재문");
		else
			System.out.println(", 비겼습니다.");
	} 

}
