package inheritance;

public class Won2Dollar extends Converter{

	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}
	Won2Dollar(double ratio){
		this.ratio = ratio;
	}

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1303);
		toDollar.run();
	}
	
}
