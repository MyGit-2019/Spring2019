package Day34;

public class VarArgsString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String words=wordBuilder("I", "leran","Java");
				System.out.println(words);
	}
		public static String wordBuilder(String...words) {
			String sentense="";
			for (int i = 0; i < words.length; i++) {
				sentense+=words[i]+" ";
				
			}
			return sentense;
//			String sentense1="";
//			for(String str:words)
//				sentense1+=str+" ";
//			return sentense1;
		}
}
