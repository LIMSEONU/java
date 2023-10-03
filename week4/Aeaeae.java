package array2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aeaeae {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n= scn.nextInt();
				int m= scn.nextInt();
				System.out.println(n+"x"+m+"="+n*m);
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scn.nextLine();
				continue;
				
			}
		}
		scn.close();
	}

}
