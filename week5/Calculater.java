package Neww;

import java.util.Scanner;

public class Calculater {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scn.nextInt();
		int b = scn.nextInt();
		String oper = scn.next();
		
		switch (oper) {
		case "+":
			Add add = new Add(a,b);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub(a,b);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul(a,b);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div(a,b);
			System.out.println(div.calculate());
			break;
			
		}
		scn.close();
	}
}



