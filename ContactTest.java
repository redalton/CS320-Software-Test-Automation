package tests;

import org.junit.jupiter.api.Test;
import contactService.Contact;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

//Tests to see if the five requirements have been met for the Contact.java Class.
class ContactTest {

	Contact contactTest;
	
	Contact instance = new Contact("1234", "bob", "builder", "0123456789", "Description");

	@BeforeEach
	public void setup() {
		contactTest = new Contact("Onetwothre", "firstName", "Lastname", "0123456789",
				"012345678901234567890123456789");
	}

//Testing group for Null fields.
	
	@Test
	@DisplayName("Null Contact ID.")
	void contactIDNullTest() {

		assertNotNull(contactTest.getContactID(), "Contact ID is not null.");
	}

	@Test
	@DisplayName("Null First Name.")
	void firstNameNullTest() {

		assertNotNull(contactTest.getFirstName(), "First Name is not null.");
	}

	@Test
	@DisplayName("Null Last Name.")
	void lastNameNullTest() {

		assertNotNull(contactTest.getLastName(), "Last Name is not null.");
	}

	@Test
	@DisplayName("Null Phone Number.")
	void phoneNullTest() {

		assertNotNull(contactTest.getPhone(), "Phone number is not null.");
	}

	@Test
	@DisplayName("Null Address.")
	void addressNullTest() {

		assertNotNull(contactTest.getAddress(), "Address is not null.");
	}
	
//Testing Setters
	@Test
	@DisplayName("Null SetContact ID.")
	void setContactIDNullTestNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(null, "FirstName", "LastName", "0123456789", "Address"));
	}
	
	@Test
	@DisplayName("Contact ID greater than 10.")
	void setContactIDNullTestGreater10() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact("01234567890", "FirstName", "LastName", "0123456789", "Address"));
	}
	
	@Test
	@DisplayName("Valid Contact ID")
	void setValidContactID() {
		String validID = "0123456789";
		Contact testContact = new Contact(validID, "FirstName", "LastName", "0123456789", "Address");
		Assertions.assertEquals(testContact.getContactID(), validID );
	}
	
	@Test
	@DisplayName("Null setFirstName.")
	void setfirstNameNullTest() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.setFirstName(null));
	}
	
	@Test
	@DisplayName("setFirstName greater than 10.")
	void setfirstNameGreater10Test() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.setFirstName("0123456789+"));
	}
	
	@Test
	@DisplayName("Valid FirstName")
	void setValidFirstName() {
		String validName = "FirstName";
		Contact testContact = new Contact("0123456789", validName, "LastName", "0123456789", "Address");
		Assertions.assertEquals(testContact.getFirstName(), validName );
	}
	
	@Test
	@DisplayName("Null setLastName.")
	void setLastNameNullTest() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.setLastName(null));
	}
	
	@Test
	@DisplayName("setLastName greater than 10.")
	void setLastNameGreater10Test() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.setLastName("01234567890000"));
	}
	
	@Test
	@DisplayName("Valid LastName")
	void setValidLastName() {
		String validName = "LastName";
		Contact testContact = new Contact("0123456789", "FirstName", validName, "0123456789", "Address");
		Assertions.assertEquals(testContact.getLastName(), validName );
	}
	
	@Test
	@DisplayName("Null setPhone.")
	void setPhoneNullTest() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.setPhone(null));
	}
	
	@Test
	@DisplayName("setPhone less than 10.")
	void setPhoneLess10NullTest() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.setPhone("1"));
	}
	
	@Test
	@DisplayName("setPhone greater than 10.")
	void setPhoneGreater10NullTest() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.setPhone("12345678901"));
	}
	
	@Test
	@DisplayName("Valid PhoneNumber")
	void setValidPhoneNumber() {
		String validPhone = "0123456789";
		Contact testContact = new Contact("0123456789", "FirstName", "LastName", validPhone, "Address");
		Assertions.assertEquals(testContact.getPhone(), validPhone );
	}
	
	@Test
	@DisplayName("Null setAddress.")
	void setAddressNullTest() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.setAddress(null));
	}
	
	@Test
	@DisplayName("Address greater than 30.")
	void setContactIDNullTest() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.setAddress("0123456789012345678901234567890"));
	}

	@Test
	@DisplayName("Valid Address")
	void setValidAddress() {
		String validAddress = "01234567890123456789012345678";
		Contact testContact = new Contact("0123456789", "FirstName", "LastName", "0123456789", validAddress);
		Assertions.assertEquals(testContact.getAddress(), validAddress );
	}
	
	
//Testing group for character limits.
	@Test
	@DisplayName("Contact ID has more than 10 characters.")
	void contactIDTenCharacterTest() {

		assert contactTest.contactID.length() <= 10 : "Contact ID is more than 10 characters.";
	}

	@Test
	@DisplayName("First name has more than 10 characters.")
	void firstNameTenCharacterTest() {
		assert contactTest.firstName.length() <= 10 : "first name is more than 10 characters.";
	}

	@Test
	@DisplayName("Last name has more than 10 characters.")
	void lastNameTenCharacterTest() {

		assert contactTest.lastName.length() <= 10 : "Last name is more than 10 characters.";

	}

	@Test // Phone must be 10 characters long.
	@DisplayName("Phone Number does not contain 10 characters.")
	void phoneTenCharacterTest() {

		assert contactTest.phone.length() == 10 : "Phone number is not 10 characters.";
	}

	@Test 
	@DisplayName("Address not 30 characters or less.")
	void addressThirtyCharacterTest() {

		assert contactTest.address.length() <= 30 : "Address is longer than 30 characters.";
	}

}
