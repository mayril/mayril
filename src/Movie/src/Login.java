
public class Login {
	String id;
	String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public Login() {
		// TODO Auto-generated constructor stub
	}
}
