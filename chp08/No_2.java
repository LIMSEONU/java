import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class No_2 {
 
	public static void main(String[] args) {
		File f=null;
		FileReader fr=null;
		BufferedReader br=null;
		int c;
		try {
			f=new File("temp/phone.txt");
			fr=new FileReader(f);
			System.out.println(f.getPath()+"를 출력합니다.");
			br=new BufferedReader(fr,30);
			String temp="";
			while(true) {
				temp=br.readLine();
				if(temp==null) {
					break;
				}
				System.out.println(temp);
			}
			fr.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
 
}