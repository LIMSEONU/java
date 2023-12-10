package classes;

import java.util.Scanner;

public class Grade {
	private int math;
	private int scin;
	private int eng;
	
	
	public Grade(int math, int scin, int eng) {
		super();
		this.math = math;
		this.scin = scin;
		this.eng = eng;
	}
	
	int average() {
		int sum=this.math+this.scin+this.eng;
		return (int)(sum/3);
	}


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scn.nextInt();
		int scin = scn.nextInt();
		int eng = scn.nextInt();
		Grade my = new Grade(math,scin,eng);
		System.out.println("평균은 "+my.average());
		
		scn.close();
				
		
	}

}
