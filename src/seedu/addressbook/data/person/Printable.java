package seedu.addressbook.data.person;

public interface Printable {
	
	/**
	  * Returns a concatenated version of the printable strings of each object.
	  */
	default String getPrintableString(String... printables){
		String printableString = "";
		
		for(int i=1; i<printables.length; i++) {
			String className = printables[i].getClass().getName();
			printableString.concat(className + ": " + printables[i]);
			
			if(i != printables.length - 1) {
				printableString.concat(" ");
			}
		}
		
		return printableString;
	}
}