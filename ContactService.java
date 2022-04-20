import java.util.ArrayList;

public class ContactService {
	//Add Contact
	public ArrayList<Contact> addContact(ArrayList<Contact> c1, String id) {		
		Contact contact = new Contact(id);
		c1.add(contact); //Add Contact to ArrayList
		return c1; //return ArrayList
	}
	//Delete Contact
	public ArrayList<Contact> deleteContact(ArrayList<Contact> c1, Contact contact) {
		c1.remove(contact); //delete Contact from ArrayList
		return c1; //return ArrayList with removed Contact
	}
	//Update Contact
	public ArrayList<Contact> updateContact(ArrayList<Contact> c1, String id, String first, String last, String phone, String address) {
		Contact contact2 = new Contact(id); 
		Contact contact = new Contact(id, first, last, phone, address);
		c1.remove(contact2); //remove old Contact 
		c1.add(contact); // add updated Contact
		return c1; //return updated ArrayList
	}
}
