package contactService;

//The purpose of this class is to receive inputs; string ContactID, string firstName, string lastName, string phone, string address. 
public class Contact {

	// Data to be input by jUnit testing.

	public String contactID; // Client Requirement: object shall have a required unique contact ID string
						// that cannot be longer than 10 characters. The contact ID shall not be null
						// and shall not be updatable.
	public String firstName; // Client Requirement: object shall have a required firstName String field that
						// cannot be longer than 10 characters. The firstName field shall not be null.
	public String lastName; // Client Requirement: object shall have a required lastName String field that
						// cannot be longer than 10 characters. The lastName field shall not be null.
	public String phone; // Client Requirement: object shall have a required phone String field that must
					// be exactly 10 digits. The phone field shall not be null.
	public String address; // Client Requirement: object shall have a required address field that must be
					// no longer than 30 characters. The address field shall not be null.

	// Creates an instance of the class Contact by setting local variables to
	// inputed parameters.
	public Contact(String inputContactID, String inputFirstName, String inputLastName, String inputPhone,
			String inputAddress) {

		setContactID(inputContactID);
		setFirstName(inputFirstName);
		setLastName(inputLastName);
		setPhone(inputPhone);
		setAddress(inputAddress);

	}

	// Getters and setters for the local variables.
	public String getContactID() {
		return contactID;
	}

	private void setContactID(String inputContactID) {
		
		//if statement to check if the data input is null or the correct length.
		if (inputContactID == null) {
			throw new IllegalArgumentException("Nonexistant contact ID");
		}

		else if (inputContactID.length() > 10) {
			throw new IllegalArgumentException("Contact ID too long.");
		}
		else {
			contactID = inputContactID;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String inputFirstName) {
		
		//if statement to check if the data input is null or the correct length.
		if (inputFirstName == null) {
			throw new IllegalArgumentException("Nonexistant First Name.");
		}

		else if (inputFirstName.length() > 10) {
			throw new IllegalArgumentException("First Name is too long.");
		}
		else {
			firstName = inputFirstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String inputLastName) {
		
		//if statement to check if the data input is null or the correct length.
		if (inputLastName == null) {
			throw new IllegalArgumentException("Nonexistant Last Name.");
		}

		else if (inputLastName.length() > 10) {
			throw new IllegalArgumentException("First Name is too long.");
		}
		else {
			lastName = inputLastName;
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String inputPhone) {
		
		//if statement to check if the data input is null or the correct length.
		if (inputPhone == null) {
			throw new IllegalArgumentException("Nonexistant Phone Number.");
		}

		else if (inputPhone.length() != 10) {
			throw new IllegalArgumentException("Phone number must be 10 digits in length.");
		}
		else {
			phone = inputPhone;
		}
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String inputAddress) {
		
		//if statement to check if the data input is null or the correct length.
		if (inputAddress == null) {
			throw new IllegalArgumentException("Nonexistant Address.");
		}

		else if (inputAddress.length() >30) {
			throw new IllegalArgumentException("Address field must contain 30 characters or less.");
		}
		else {
			address = inputAddress;
		}
	}


}
