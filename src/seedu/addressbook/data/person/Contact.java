package seedu.addressbook.data.person;

public class Contact {
	
    public static String EXAMPLE;
    public static String MESSAGE_CONSTRAINTS;
    public static String VALIDATION_REGEX;
    
    /**
     * Validates given contact.
     *
     * @throws IllegalValueException if given contact string is invalid.
     */

    public String value;
    protected boolean isPrivate;
	
	/**
     * Checks if a given string is a valid person contact.
     */
    public static boolean isValidContact(String test) {
        return test.matches(VALIDATION_REGEX);
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instance of handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
}