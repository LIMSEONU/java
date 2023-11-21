import java.util.*;

class Student {
	private String name, major, sNumber;
	private double grade;
	public Student(String name, String major, String sNumber, double grade) {
		this.name = name;
		this.major = major;
		this.sNumber = sNumber;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getsNumber() {
		return sNumber;
	}
	public double getGrade() {
		return grade;
	}
}
public class StundetEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> info = new ArrayList<Student>();
		
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String sNumber = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student s = new Student(name, major, sNumber, grade);
			info.add(s);
		}
		
		Iterator<Student> it = info.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println("---------------------------");
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getMajor());
			System.out.println("학번:" + student.getsNumber());
			System.out.println("학점평균:" + student.getGrade());
			System.out.println("---------------------------");
		}	
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = sc.nextLine();
			if(name.equals("그만")) break;
			
			for(int i = 0; i < info.size(); i++) {
				Student s = info.get(i);
				if(s.getName().equals(name)) {
					System.out.print(s.getName() + ", ");
					System.out.print(s.getMajor() + ", ");
					System.out.print(s.getsNumber() + ", ");
					System.out.println(s.getGrade());
					break;
				}
			}
		}
		sc.close();
	}	
}