package Day25;

public class Task3 {

	public static void main(String[] args) {
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ;
	
	for (int i = 0; i < courseId.length; i++) {
		System.out.println(courses[i] + " is: " +courseId[i] );
		
	}


	}

}
