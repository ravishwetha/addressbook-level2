package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's phone number in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPhone(String)}
 */
public class Phone extends Contact{

    public Phone(String phone, boolean isPrivate) throws IllegalValueException {
    	
    	EXAMPLE = "123456789";
    	MESSAGE_CONSTRAINTS = "Person phone numbers should only contain numbers";
    	VALIDATION_REGEX = "\\d+";
    	
        this.isPrivate = isPrivate;
        phone = phone.trim();
        if (!isValidContact(phone)) {
            throw new IllegalValueException(MESSAGE_CONSTRAINTS);
        }
        this.value = phone;
    }
}
