package packEx;

import java.util.*;

public class LoveU {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다. ");
		String s = scn.nextLine();
		
		for(int i = 1; i<s.length(); i++)
			System.out.println(s.substring(i)+s.substring(0,i));
		System.out.println(s);
	}
	

}
