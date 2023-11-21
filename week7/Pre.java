import java.util.*;

public class Pre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> pre = new Vector<Integer>();
		
		while(true) {
			double sum = 0;
			System.out.print("강수량 입력(0 입력 시 종료)");
			int n = sc.nextInt();
			if (n == 0) break;
			
			pre.add(n);
			for(int i = 0; i < pre.size(); i++) {
				System.out.print(pre.get(i) +" ");
				sum += pre.get(i);
			}
			System.out.println();
			System.out.println("현재 평균 " + sum / pre.size());
		}
		sc.close();
	}
}