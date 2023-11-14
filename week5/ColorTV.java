package inheritance;

class TV {
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
		protected int getSize() {
			return size; //protected int getSize()도 소스로 할 수 있나요?
		}
	}


public class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	void printProperty() {
		System.out.println(getSize()+ "인치 "+color+"컬러");
	}
	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}
