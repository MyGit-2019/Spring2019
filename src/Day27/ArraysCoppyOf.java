package Day27;

import java.sql.Array;
import java.util.Arrays;

public class ArraysCoppyOf {

	public static void main(String[] args) {
		
		String[] heros= {"Superman", "Batma", "Aquaman", "Wonderwomen", "TheFlash", "GreenLantern"};  
		
		String[] copyNames=new String[heros.length];
		for (int i = 0; i < copyNames.length; i++) {
			copyNames[i]=heros[i];
			
		}
		
		
		System.out.println(Arrays.deepToString(heros));
		Arrays.sort(heros);
		
		for(String names:heros) {
		//System.out.print(names+"_");
		
}
			

	}

}
