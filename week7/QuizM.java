import java.util.*;

public class QuizM {
	Scanner sc = new Scanner(System.in);
	HashMap<String, String> v =  new HashMap<String, String>();
	
	public QuizM() {
	v.put("멕시코", "멕시코시티");
	v.put("스페인", "리스본");
	v.put("프랑스", "파리");
	v.put("영국", "런던");
	v.put("그리스", "아테네");
	v.put("독일", "베를린");
	v.put("일본", "동경");
	v.put("중국", "베이찡");
	v.put("러시아", "모스크바");
	}
	
	public void insert() {
		System.out.println("현재 " + v.size() + "개 나라와 수도가 입력되어 있습니다.");
		while(true) {
			System.out.print("나라와 수도 입력>>");
			String country = sc.next();
			if(country.equals("그만")) break;
			String capital = sc.next();
			
			if(v.containsKey(country)) {
				System.out.println(country + "는 이미 있습니다!");
				continue;
			}
			
			v.put(country, capital);
		}
	}
	
	public void play() {
		while(true) {
			Set<String> keys = v.keySet();
			Object [] array = (keys.toArray());
			int index = (int)(Math.random()*array.length);

			String question = (String)array[index];
			String answer = v.get(question);

			System.out.print(question + "의 수도는? ");
			
			String capitalFromUser = sc.next();
			if(capitalFromUser.equals("그만")) {
				break;
			}
			if(capitalFromUser.equals(answer))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");				
		}	
	}
	
	public void run() {
		System.out.println("***수도 맞추기 게임을 시작합니다. ***");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>>");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				insert(); break;
			case 2:
				play(); break;
			case 3:
				sc.close();
				System.out.println("게임을 종료합니다.");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Quiz q = new Quiz();
		q.run();
	}
}