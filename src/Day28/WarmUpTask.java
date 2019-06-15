package Day28;

public class WarmUpTask {

	public static void main(String[] args) {
		
		String str="Sunday Pefect Day to start coding:";
		
		String[] words = str.split(" "); 
		String reversedSentence = "";
		for (int i = 0; i < words.length; i++) {
			String newWord=words[i];
			char[] newChars=newWord.toCharArray();
			int lastIndex=newChars.length-1;
			
			for (int j = 0; j < newChars.length; j++) {
				char temp=newChars[j];
				newChars[j]=newChars[lastIndex-1];
				newChars[lastIndex-1]=temp;
				
				
			}
			
		}
		
		

	}

}
