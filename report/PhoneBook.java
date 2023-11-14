package classes;

import java.util.Scanner;

class Phone {
	private String name;
	private String phoneNumber;
	
	public Phone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	boolean getNumber (String name) {
		if (this.name.equals(name)) {
			System.out.println(name + "의 번호는 " +this.phoneNumber +" 입니다.");
			return true;
		} else
			return false;
	}
}

public class PhoneBook {
	private Phone phone[];
	int i;
	boolean tf;
	
	PhoneBook (int num) {
		phone = new Phone[num];
	}
	
	void bookSet (int num, String name, String phoneNumber) {
		phone[num] = new Phone(name,phoneNumber);
	}
	void show (String name) {
		for (int i = 0; i < this.phone.length; i++) {
			tf = phone[i].getNumber(name);
			if (tf==true)
				break;
			
		}
		if (i==this.phone.length)
			System.out.println(name + " 이 없습니다.");
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num;
		String name;
		String phoneNumber;
		
		System.out.print("인원수>> ");
		num = scn.nextInt();
		PhoneBook phoneBook = new PhoneBook(num);
		
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = scn.next();
			phoneNumber = scn.next();
			phoneBook.bookSet(i, name, phoneNumber);
			
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			name = scn.next();
			if (name.equals("그만"))
				break;
			phoneBook.show(name);
		}

	}
	
}
