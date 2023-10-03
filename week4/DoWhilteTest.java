package array2;

public class DoWhilteTest {
	public static void main(String[] args) {
		
		int sum=0, i=0;
		do {
			sum=sum+i;
			i+=2;
		}while(i<100);
		System.out.println(sum);
	}
}
