import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class No_3 {
 
	public static void main(String[] args) {
		File f=null;
		FileReader fr=null;
		try {
			f=new File("c:\\windows\\system.ini");
			fr=new FileReader(f);
			int c;
			char C;
			while((c=fr.read())!=-1) {
				C=(char)c;
				if(C>='a'&&C<='z') {
					C=Character.toUpperCase(C);
				}
				System.out.print(C);
			}
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
 
}