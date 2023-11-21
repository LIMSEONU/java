import java.util.Scanner;

	public class Person {
		Scanner scn = new Scanner(System.in);
		private String name;
		
		public Person(String name) {
			super();
			this.name = name;
		}
		boolean play() {
			System.out.print("["+name+"]:<Enter>");
			scn.nextLine();
			System.out.print("|t");
			int arr[] = new int[3];
			for (int i=0; i<3; i++) {
				arr[i] = (int)(Math.random()*3+1);
						System.out.print(arr[i]+"|t");
			}
			if((arr[0]==arr[1])&&(arr[0]==arr[2]))
				return true;
			else
				return false;
		}
		String getName() {
			return name;
		}
}
