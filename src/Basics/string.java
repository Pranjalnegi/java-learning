package Basics;

public class string {

	public static void main(String[] args) {
		// USING CONTAINS
		String book="The Lord of the Rings";
		String choice="Rings";
		
		if(book.contains(choice)) {
			System.out.println("CHOICENFOUND");
		}
//USING EQUALS
		String browser= "Chrome";
		if(browser.equalsIgnoreCase("ChRome")) {
			System.out.println("THE BEOWSER IS CHROME");
		}
//TO TAKE AND PRINT FIRST INTIALS OF FIRST AND LASTNAME AND LAST 4 DIGITS OF PHONE NO
		String firstname="PRANJAL";
		String lastname="NEGI";
		String phone="7895218575";
		System.out.print(firstname.substring(0,1));
		System.out.print(lastname.substring(0,1));
		System.out.print(phone.substring(6));
		
	}

}
