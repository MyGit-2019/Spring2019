package Day8;

public class ReviewPostPreincrementDecrement {

	public static void main(String[] args) {
		
		
		
		//System.out.println("score++ " + score++);
		//System.out.println("score "+score);
		//System.out.println("++score "+ ++score);
		//System.out.println("score "+score--);
		//System.out.println("score "+score);
		int score=10;
		int result=score++;
		System.out.println("result is " + result);
		// current value at this moment 11, 13
		score=score++ + ++score;
		System.out.println(score);
		
		
	}

}
