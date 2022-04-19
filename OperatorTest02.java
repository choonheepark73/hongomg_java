package operator;

public class OperatorTest02 {

	public static void main(String[] args) {
		// 조건연산자(삼항연산자)  조건 ? :
		int score = 99;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println(grade);
		
		if(score > 90) {
			grade ='A';
		}else {
			grade = 'B'
		}
		
		
		

	}

}
