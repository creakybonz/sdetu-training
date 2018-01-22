package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word '" + wordChoice + "'");
		}
		
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome.");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "123456789";
		
		//Print the initial plus last 4 digits of SSN
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,3));
		System.out.println(SSN.substring(SSN.length() - 4, SSN.length()));


	}

}
