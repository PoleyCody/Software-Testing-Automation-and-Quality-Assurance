import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ContactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("0123456789"); //contact with string length of 10
		assertTrue(contact.getId().equals("0123456789")); //check that id number is in contact
		assertFalse(contact.getId().equals("1234567890")); //check that fake id is not in contact
		
		contact = new Contact("1234567890", "Cody", "Poley", "1234567890", "123 abc street"); //add contact with first name, last name, phone number, and address
		assertTrue(contact.getId().equals("1234567890")); //check new contact id
		assertTrue(contact.getFirstName().equals("Cody")); //check new contact first name
		assertTrue(contact.getLastName().equals("Poley")); //check new contact last name
		assertTrue(contact.getPhoneNumber().equals("1234567890")); //check new contact phone number
		assertTrue(contact.getAddress().equals("123 abc street")); //check new contact address
		
	}
	
	@Test
	void testIdConditions() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null); //throws illegalArgumentException if id is null
			});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901"); //throws illegalArgumentException if id is greater than 10 in length
			});
		
	}
	
	@Test
	void testFirstNameConditions() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", null, "Poley", "1234567890", "123 abc street"); //throws illegalArgumentException if first name is null
			});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "qazwsxedcrf", "Poley", "1234567890", "123 abc street"); //throws illegalArgumentException if first name is greater than 10 in length
			});
		
	}

	@Test
	void testLastNameConditions() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Cody", null, "1234567890", "123 abc street"); //throws illegalArgumentException if last name is null
			});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Cody", "qazwsxedcrf", "1234567890", "123 abc street"); //throws illegalArgumentException if first name is greater than 10 in length
			});
		
	}
	
	@Test
	void testPhoneNumberConditions() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Cody", "Poley", null, "123 abc street"); //throws illegalArgumentException if phone number is null
			});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "qazwsxedcrf", "Poley", "12345678901", "123 abc street"); //throws illegalArgumentException if phone number is greater than 10 in length
			});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "qazwsxedcrf", "Poley", "123456789", "123 abc street"); //throws illegalArgumentException if phone number is less than 10 in length
			});
	}
	
	@Test
	void testAddressConditions() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Cody", "Poley", "1234567890", null); //throws illegalArgumentException if address is null
			});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Cody", "Poley", "1234567890", "qazwsxedcrfvtgbyhnujmikolpqazws"); //throws illegalArgumentException if address is greater than 30 in length
			});
		
	}
}
