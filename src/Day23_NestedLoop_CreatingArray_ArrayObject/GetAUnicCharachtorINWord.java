package Day23_NestedLoop_CreatingArray_ArrayObject;

public class GetAUnicCharachtorINWord {

	public static void main(String[] args) {
		
		String str="aabcdeeefgg";
		String uniqueStr="";
		
		for (int i = 0; i < str.length(); i++) {
			
			String eachChar=str.substring(i, i+1);
			
			if(!uniqueStr.contains(eachChar)) {
				uniqueStr+=eachChar;
				System.out.println(eachChar);
				
			}
			
			System.out.println(uniqueStr);
		}
		
		   
		
		
		
		
		
	}

}
