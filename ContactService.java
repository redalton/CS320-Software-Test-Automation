package contactService;

import java.util.ArrayList;

//The purpose of this class is to add, update, and delete data from the Contact class.
public class ContactService {

	// Array to store all the contact data into.
	private ArrayList<Contact> contactsList;

	// default constructor to create new array list for contacts.
	public ContactService() {
		contactsList = new ArrayList<Contact>(0);
	}

	// Add contacts with a unique ID
	public boolean addContact(Contact inputContact) {
		Boolean uniqueID = true;
		
		//instance if the array list is empty, will just add contact data.
		if(contactsList.size() == 0) {
			contactsList.add(inputContact);
			return uniqueID;
		}

		//looping through arraylist comparing contactid in list to input contact ID. 
				//If Id is true, add contact data. else throw exception.
		for (int i = 0; i < contactsList.size(); i++) {
			if (contactsList.get(i).getContactID() == inputContact.getContactID()) {
				uniqueID = false;
				break;
			}
			if (uniqueID) {
				contactsList.add(inputContact);
			}
		}

		return uniqueID;

	}

	// Delete Contacts per contact ID
	public boolean deleteContact(String inputContactID) {
		Boolean idFound = false;

		//looping through arraylist comparing contactid in list to input contact ID. 
				//If Id is true, delete contact data. else throw exception.
		for (int i = 0; i < contactsList.size(); i++) {
			if (contactsList.get(i).getContactID() == inputContactID) {
				idFound = true;
				contactsList.remove(i);
				break;
			}

		}
		if(!idFound) {
			throw new IllegalArgumentException("Contact not in list.");
		}


		return idFound;

	}

	// Update firstName Contact field per contact ID.
	public boolean updateFirstNameContact(String inputContactID, String inputFirstName) {
		Boolean idFound = false;

		//looping through arraylist comparing contactid in list to input contact ID. 
		//If Id is true, set first name. else throw exception.
		for (int i = 0; i < contactsList.size(); i++) {
			if (contactsList.get(i).getContactID() == inputContactID) {
				idFound = true;
				contactsList.get(i).setFirstName(inputFirstName);
				break;
			
			}

		}
		if(!idFound) {
			throw new IllegalArgumentException("Contact not in list.");
		}

		return idFound;

	}
	
	// Update lasttName Contact field per contact ID.
	public boolean updateLastNameContact(String inputContactID, String inputLastName) {
		Boolean idFound = false;

		//looping through arraylist comparing contactid in list to input contact ID. 
				//If Id is true, set last name. else throw exception.
		for (int i = 0; i < contactsList.size(); i++) {
			if (contactsList.get(i).getContactID() == inputContactID) {
				idFound = true;				
				contactsList.get(i).setLastName(inputLastName);
				break;

			}

		}
		if(!idFound) {
			throw new IllegalArgumentException("Contact not in list.");
		}

		return idFound;

	}
	
	// Update contact fields per contact ID (firstName, lastName, phone, address)
	public boolean updateContactPhone(String inputContactID, String inputPhone) {
		Boolean idFound = false;

		//looping through arraylist comparing contactid in list to input contact ID. 
				//If Id is true, set phone number. else throw exception.
		for (int i = 0; i < contactsList.size(); i++) {
			if (contactsList.get(i).getContactID() == inputContactID) {
				idFound = true;
				contactsList.get(i).setPhone(inputPhone);
				break;
			}

		}
		if(!idFound) {
			throw new IllegalArgumentException("Contact not in list.");
		}

		return idFound;

	}
	
	// Update contact fields per contact ID (firstName, lastName, phone, address)
	public boolean updateContactAddress(String inputContactID, String inputAddress) {
		Boolean idFound = false;

		//looping through arraylist comparing contactid in list to input contact ID. 
				//If Id is true, set address. else throw exception.
		for (int i = 0; i < contactsList.size(); i++) {
			if (contactsList.get(i).getContactID() == inputContactID) {
				idFound = true;
				contactsList.get(i).setAddress(inputAddress);
				break;
				
			}

		}
		if(!idFound) {
			throw new IllegalArgumentException("Contact not in list.");
		}

		return idFound;

	}
	
	public int getArraySize() {
		return contactsList.size();
	}

}
