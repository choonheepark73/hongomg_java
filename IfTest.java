package iftest;

public class IfTest {

	public static void main(String[] args) {
		int score = 75;
		
		if(score >=90) {
			System.out.println("점수가 90점보다 큽니다");
			System.out.println("등급이 A입니다");
		}

		if(score < 90)
			System.out.println("점수가 90점보다 작습니다");
		System.out.println("등급이 B입니다");


	}

}
