import java.util.Scanner;

public class MovieManager {

	private static MovieManager movieManager = new MovieManager();
	public static MovieManager getInstance() {
		return movieManager;
	}
	private Movie[] movies;
	int size;
	
	private MovieManager() {
		this.movies= new Movie[100];
		this.size=0;
	}
	
	public void add(Movie movies) {
		this.movies[size++]=movies;
	}
	
	public void search(String title) {
		for (int i = 0; i < size; i++) {
			if(title.equals(movies[i].getTitle())) {
				System.out.println(movies[i].getTitle()+"의 평점은 "+movies[i].getGrade()+"입니다");
			}
		}
	}
	
	public Movie[] getList() {
		 Movie[]  tmp = new Movie[size];
		for(int i = 0; i < size; i++) {
			tmp[i] =  movies[i];
			System.out.print("아이디 : "+movies[i].getId()+"  |  ");
			System.out.print("제목 : "+movies[i].getTitle()+"  |  ");
			System.out.print("평점 : "+movies[i].getGrade()+"  |  ");
			System.out.print("리뷰 : "+movies[i].getReview()+"  |  ");
			System.out.println("감독 : "+movies[i].getDirector()+"  |  ");
			System.out.println("----------------------------------------");
		}
		
		return tmp;
	}
	
	public void reviewFix(String id,String title) {
		int found=0;
		for (int i = 0; i < size; i++) {
			if(title.equals(movies[i].getTitle())&&id.equals(movies[i].getId())) {
				System.out.println(movies[i].getReview());
				System.out.println("새로운 리뷰 입력");
				Scanner sc = new Scanner(System.in);
				String newReview = sc.nextLine();
				movies[i].setReview(newReview);
				found=1;
			}
		}
		if (found==0) {
			System.out.println("입력하신 영화의 리뷰가 없습니다.");
		} else {
			System.out.println("새로운 리뷰 등록");
		}

		
	}
}
