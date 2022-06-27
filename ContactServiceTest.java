package tests;

import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

//Tests to see if the three requirements for the ContactService.java class is met.
class ContactServiceTest {

	ContactService instance = new ContactService();

	//most common element tester for array list.
	Contact testElement = new Contact("Onetwothre", "firstName", "Lastname", "0123456789",
			"012345678901234567890123456789");
	//element tester for adding extra element to list.
	Contact testElement1 = new Contact("0123", "Bonnie", "nClyde", "8128675309", "Bienville Parish");
	//element tester for adding extra element to list.
	Contact testElement2 = new Contact("Onetwothre", "firstName", "Lastname", "0123456789",
			"012345678901234567890123456789");
	/*
	 * *****************************************************************************
	 * ************************************************************************** I
	 * ran out of time to get the @before each or @beforeall setup and functioning.
	 * I realized for my ContactTest.java file if I changed the ContactID in
	 * the @before each, then it would throw all errors for each test. I think that
	 * was because of my logic error where I have most of my tests verifying the ID
	 * first, but I'm not sure if there's another error. I tried to do the same
	 * setup in this test class but each test wouldn't fill the array list with the
	 * elements and each solution I tried created a plethora of different errors.
	 * I'd love your input on why this failed for me and what I am missing.
	 * *****************************************************************************
	 * **************************************************************************
	 * 
	 * @BeforeEach public void setup() { testElement = new Contact("Onetwothre",
	 * "firstName", "Lastname", "0123456789", "012345678901234567890123456789");
	 * //test2 = new Contact("0123", "Bonnie", "nClyde", "8128675309",
	 * "Bienville Parish");
	 * 
	 * }
	 */

//Series of AddContact Tests

	@Test // testing adding one set of elements to the array list.
	public void testAddContact() {
		int previousSize = instance.getArraySize();
		instance.addContact(testElement);
		assertEquals(instance.getArraySize(), previousSize + 1);

	}

	@Test // testing adding a second element to the array list.
	public void testAddSecondContact() {
		instance.addContact(testElement);
		int previousSize = instance.getArraySize();
		instance.addContact(testElement1);
		assertEquals(instance.getArraySize(), previousSize + 1);

	}

	@Test // testing a duplicate entry does not add to the array list.
	public void testAddDuplicateContact() {
		instance.addContact(testElement);
		int previousSize = instance.getArraySize();
		instance.addContact(testElement2);
		assertEquals(instance.getArraySize(), previousSize);

	}

//Series of DeleteContact Tests

	@Test // testing one Contact entry is deleted by the ContactID.
	public void testDeleteContact() {
		instance.addContact(testElement);
		assertTrue(instance.deleteContact("Onetwothre"));

	}

	@Test // testing if an exeption will be thrown if contact isn't in list to be deleted.
	public void testDeleteNonExistContact() {
		instance.addContact(testElement);
		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.deleteContact("0123"));

	}

//Series of Updating Contact Data

	@Test // testing the first name is updated by contact ID.
	public void testUpdateFirstName() {
		instance.addContact(testElement);
		assertTrue(instance.updateFirstNameContact("Onetwothre", "Billy"));

	}

	@Test // testing throw if contact ID isn't listed.
	public void testUpdateFirstNameThrow() {
		instance.addContact(testElement);
		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.updateFirstNameContact("0123", "Billy"));

	}

	@Test // testing the last name is updated by contact ID.
	public void testUpdateLastName() {
		instance.addContact(testElement);
		assertTrue(instance.updateLastNameContact("Onetwothre", "Bob"));

	}

	@Test // testing throw if contact ID isn't listed.
	public void testUpdateLastNameThrow() {
		instance.addContact(testElement);
		Assertions.assertThrows(IllegalArgumentException.class, () -> instance.updateLastNameContact("0123", "Bob"));

	}

	@Test // testing if phone number is updated by contact ID.
	public void testUpdatePhone() {
		instance.addContact(testElement);
		assertTrue(instance.updateContactPhone("Onetwothre", "9876543210"));

	}

	@Test // Testing throw if contact ID isn't listed.
	public void testUpdatePhoneThrow() {
		instance.addContact(testElement);
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> instance.updateContactPhone("0123", "0123456789"));

	}

	@Test // testing if address is updated by contact ID.
	public void testUpdateAddress() {
		instance.addContact(testElement);
		assertTrue(instance.updateContactAddress("Onetwothre", "123 Thorton Street"));

	}

	@Test // Testing throw if contact ID isn't listed.
	public void testUpdateAddressThrow() {
		instance.addContact(testElement);
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> instance.updateContactAddress("0123", "70 Groovy Street"));

	}
}
