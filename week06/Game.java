import java.util.*;

public class Game {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Person person[] = new Person[n];
		for (int i=0; i<n; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			person[i] = new Person(scn.next());
		}
		int key =1;
		while(key==1) {
			for(int i= 0; i<n; i++) {
				if(person[i].play()) {
					System.out.println(person[i].getName()+"님이 이겼습니다!");
					key =0;
					break;
				}else
					System.out.println("아쉽군요!");
			}
		}
		
	}
}
