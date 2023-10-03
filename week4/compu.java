package array2;

import java.util.Scanner;

public class compu {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String course []= {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score []= {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("과목 이름>>");
			String name = scn.next();
			
			if (name.equals("그만"))
				break;
			else {
				for (int i=0; i < course.length; i++) {
					if (course[i].equals(name)) {
						System.out.println(course[i]+"의 점수는"+score[i]);
						break;
					}
					if (i==(course.length-1))
						System.out.println("없는 과목입니다.");
				}
			}
		}
		scn.close();
	}

}
