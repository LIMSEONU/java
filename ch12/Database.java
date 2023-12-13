package JavaPro;
import java.sql.*;

public class Database {
	Connection con = null;
	Statement stmt = null;
	String url = "jdbc:mysql://localhost:3306/dbstudy";	//dbstudy 스키마
	String user = "root";
	String passwd = "";		//본인이 설정한 root 계정의 비밀번호를 입력하면 된다.
	
	Database() {	//데이터베이스에 연결한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, passwd);
			stmt = con.createStatement();
			System.out.println("MySQL 서버 연동 성공");
		} catch(Exception e) {
			System.out.println("MySQL 서버 연동 실패 > " + e.toString());
		}
	}

	/* 로그인 정보를 확인 */
	boolean logincheck(String _i, String _p) {
		boolean flag = false;
		
		String id = _i;
		String pw = _p;
		
		try {
			String checkingStr = "SELECT password FROM member WHERE id='" + id + "'";
			ResultSet result = stmt.executeQuery(checkingStr);
			
			int count = 0;
			while(result.next()) {
				if(pw.equals(result.getString("password"))) {
					flag = true;
					System.out.println("로그인 성공");
				}
				
				else {
					flag = false;
					System.out.println("로그인 실패");
				}
				count++;
			}
		} catch(Exception e) {
			flag = false;
			System.out.println("로그인 실패 > " + e.toString());
		}
		return flag;
	}
		
		
		boolean joinCheck(String _i, String _p) {
			boolean flag = false;
			
			String id = _i;
			String pw = _p;
				
			try {
				String insertStr = "INSERT INTO member VALUES('" + id + "', '" + pw + "')";
				stmt.executeUpdate(insertStr);
					
				flag = true;
				System.out.println("회원가입 성공");
			} catch(Exception e) {
				flag = false;
				System.out.println("회원가입 실패 > " + e.toString());
			}
				
			return flag;
		
	}
	
	}
