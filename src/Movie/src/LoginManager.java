import java.util.Scanner;


public class LoginManager {

	private static LoginManager loginManager=new LoginManager();
	public static  LoginManager getInstance() {
		return loginManager;
	}
	private Login[] login;
	int size;	
	
	private LoginManager() {
		this.login= new Login[100];
		this.size=0;
	}
	
	public int signUp(String id, String password) {
		int login2=0;
		Login tmp = new Login();
			
			for (int i = 0; i < size; i++) {
				if(id.equals(login[i].getId())) {
					login2=1;
					break;
				}
			}
			if (login2==1) {

				System.out.println("아이디 중복");
				return 0;
			}else {
				tmp.setId(id);
				tmp.setPassword(password);
				login[size++]=tmp;
				System.out.println("회원가입 성공");				
				return 1;
			}
							
	}
	
	
	public int login(String id, String password) {
		Login tmp = new Login();
		for(int i = 0; i < size; i++) {
			if(login[i].getId().equals(id)&&login[i].getPassword().equals(password)) {
				tmp =  login[i];
			}
		}
		if (tmp.getId()==null) {
			System.out.println("아이디나 비밀번호가 틀렸습니다.");
			return 0;
		}else {
			System.out.println("로그인성공");
			return 1;
		}

	}
	
}
