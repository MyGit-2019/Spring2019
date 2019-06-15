package ReplAssignments;

public class Ra_168 {

	public static void main(String[] args) {
		
		System.out.println(count("one two three my yourd tond"));

	}
	public static int count(String sentence){
//		if(sentence == null || sentence.isEmpty()){
//			return 0; 
//			} 
//		String[] words = sentence.split("\\s+"); 
//			return words.length;
		
		String words[]=sentence.split(" ");
		   int count=words.length;
		   return count;
	}

	
}
