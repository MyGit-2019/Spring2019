package Day19;

public class Task2Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc2";
		char letter='a';
		while (letter<='z') {
			if (str.charAt(0)==letter) {
				System.out.println("You started with letter");
			break;
			}
				else 
					System.out.println("You started with something other than letter");
		letter+=1;
		}

	}

}
