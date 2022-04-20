import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService cS = new ContactService();
		ArrayList<Contact> c1 = new ArrayList<>();
		String id = "0123456789"; //id number
		Contact contact = new Contact(id); //contact with id
		ArrayList<Contact> c2 = new ArrayList<>(); 
		c2.add(contact); //add contact to ArrayList
		c1 = cS.addContact(c1, id); //use method to add contact 
		assertTrue(c1.size() == c2.size()); //check that the value was add to the ArrayList
	}
	
	@Test
	void testDeleteContact() {
		ContactService cS = new ContactService();
		ArrayList<Contact> c1 = new ArrayList<>();
		ArrayList<Contact> c2 = new ArrayList<>();
		
		String id = "0123456789"; //id number
		Contact contact = new Contact(id); //contact with id number
		
		c2.add(contact); //add contact to ArrayList
		c2 = cS.deleteContact(c2, contact); //delete contact with method
		assertTrue(c1.size() == c2.size());
	}
	
	@Test
	void testUpdateContact() {
		ContactService cS = new ContactService();
		ArrayList<Contact> c1 = new ArrayList<>();
		ArrayList<Contact> c2 = new ArrayList<>();
		
		String id = "0123456789"; //id number
		Contact contact1 = new Contact(id, "Cody", "Poley", "1234567890", "123 abc street"); //contact with all information
		c2.add(contact1); //add contact to array
		c1 = cS.updateContact(c1, id, "Cody", "Poley", "1234567890", "123 abc street");
		assertTrue(c1.size() == c2.size());
	}

}
