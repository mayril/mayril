
public class Movie {
	String id;
	String password;
	
	public Movie(String id, String password, String title, int grade, String review, String director) {
		super();
		this.id = id;
		this.password = password;
		this.title = title;
		this.grade = grade;
		this.review = review;
		this.director = director;
	}
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	String title;
	int grade;
	String review;
	String director;

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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	

	

}
