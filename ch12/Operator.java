package JavaPro;

public class Operator {
	Database db = null;
	MainFrame mf = null;
	JoinFrame jf = null;
	
	public static void main(String[] args) {
		Operator opt = new Operator();
		opt.db = new Database();
		opt.mf = new MainFrame(opt);
		opt.jf = new JoinFrame(opt);
	}
}