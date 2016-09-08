package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address extends Contact{
    
    public Address(String address, boolean isPrivate) throws IllegalValueException {
    	
    	EXAMPLE = "123, some street";
    	MESSAGE_CONSTRAINTS = "Person addresses can be in any format";
    	VALIDATION_REGEX = ".+";
    	
        this.isPrivate = isPrivate;
        if (!isValidContact(address)) {
            throw new IllegalValueException(MESSAGE_CONSTRAINTS);
        }
        this.value = address;
    }
}