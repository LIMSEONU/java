package if111;

import java.util.Scanner;

public class Maaaaaath {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("연산>>");
		double x = scn.nextDouble();
        String opreator = scn.next();
        double y = scn.nextDouble();
        
        double result = 0.0;
        
        if(y != 0) {
        	switch(opreator) {
        	case "+":
        		result = x + y;
        		break;
        	case "-":
        		result = x - y;
        		break;
        	case "*":
        		result = x * y;
        		break;
        	case "/":
        		result = x / y;
        		break; 
        }
        
        	System.out.println(x+opreator+y+ "의 계산 결과는" +result);
	   } else {
        	System.out.println("0으로 나눌 수 없습니다.");
        	
        	}
       scn.close();
        	
	}

}
