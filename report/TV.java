package classes;

public class TV {
	String LG;
	int year;
	int inch;
	

	public TV(String lG, int year, int inch) {
		super();
		LG = lG;
		this.year = year;
		this.inch = inch;
		
	}
	
	public TV() {
		super();
	}
		void show() {
			System.out.println(LG+"에서 만든 "+year+"년형 "+inch+"인치 TV");
		}
		public static void main(String[] args) {
			TV myTV = new TV("LG", 2017, 32);
			myTV.show();
		}
		
	
	
	
}
