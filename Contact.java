
public class Contact {
	private String idNumber;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String id) {
		if(id == null || id.length() > 10) { //check that id is not null or longer than 10
			throw new IllegalArgumentException("Invalid ID Number");
		}
			this.idNumber = id;
	}
	
	public Contact(String id, String first, String last, String phone, String location) {
		if(id == null || id.length() > 10) { //check that id is not null or longer than 10
			throw new IllegalArgumentException("Invalid ID Number");
		} else {
			this.idNumber = id;
		}
		if(first == null || first.length() > 10) { //check that first name is not null or longer than 10
			throw new IllegalArgumentException("Invalid first name");
		} else {
			this.firstName = first;
		}
		if(last == null || last.length() > 10) { //check that last name is not null or longer than 10
			throw new IllegalArgumentException("Invalid last name");
		} else {
			this.lastName = last;
		}
		if(phone == null || phone.length() != 10) { //check that phone number is not null and is equal to 10
			throw new IllegalArgumentException("Invalid phone number");
		} else {
			this.phoneNumber = phone;
		}
		if(location == null || location.length() > 30) { //check that address is not null or longer than 30
			throw new IllegalArgumentException("Invalid ID Number");
		} else {
			this.address = location;
		}
	}
	
	public String getId() { //return id number
		return this.idNumber;
	}
	
	public String getFirstName() { //return first name
		return this.firstName;
	}
	
	public String getLastName() { //return last name
		return this.lastName;
	}
	
	public String getPhoneNumber() { // return phone number
		return this.phoneNumber;
	}
	
	public String getAddress() { // return address 
		return this.address;
	}
	
	public void setFirstName(String name) {
		if(name == null || name.length() > 10) { // check that first name is not null or longer than 10
			throw new IllegalArgumentException("Invalid ID Number");
		} else {
			this.firstName = name;
		}
	}
	
	public void setLastName(String name) {
		if(name == null || name.length() > 10) { // check that last name is not null or longer than 10
			throw new IllegalArgumentException("Invalid ID Number");
		} else {
			this.lastName = name;
		}
	}
	
	public void setPhoneNumber(String number) {
		if(number == null || number.length() != 10) { // check that phone number is not null and is equal to 10 in length
			throw new IllegalArgumentException("Invalid ID Number");
		} else {
			this.phoneNumber = number;
		}
	}
	
	public void setAddress(String location) {
		if(location == null || location.length() > 30) { // check that address is not null or longer than 30
			throw new IllegalArgumentException("Invalid ID Number");
		} else {
			this.address = location;
		}
	}
	
}
