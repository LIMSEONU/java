import java.util.*;

class Student2 {
	private String name, major, sNumber;
	private double grade;
	public Student2(String name, String major, String sNumber, double grade) {
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
public class StudentEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> info = new HashMap<String, Student>();
		
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
			info.put(name, s);
		}
		
		Set<String> key = info.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Student student = info.get(name);
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
			
			Student student = info.get(name); 
			if(student == null) { 
				System.out.println(name + " 학생 없습니다.");
			}
			else { 
				System.out.print(student.getName() + ", ");
				System.out.print(student.getMajor() + ", ");
				System.out.print(student.getsNumber() + ", ");
				System.out.println(student.getGrade());
			}
		}
		sc.close();
	}	
}
