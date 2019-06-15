package Day30;

public class MethodString {

	public static void main(String[] args) {
		reportName("Shapkat","Amin");
		reportName("Azimat","Amin");

	}
	public static void reportName(String firstName, String lastName) {
		int lengthOfFirstNAme=firstName.length();
		int lengthOfLaststNAme=lastName.length();
		System.out.println(firstName+" "+lastName);
		System.out.println("The length of the first name: "+ lengthOfFirstNAme);
		System.out.println("The length of the last name: "+lengthOfLaststNAme );
		System.out.println(" First initial of fist and last name: "+ firstName.charAt(0)+lastName.charAt(0));
	}

}
