package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class UtilsTest {
	
	// testing Utils::isAnyNull
	
	@Test
    public void isAnyNull_noNullObjectPassed() {
        final Object[] inputs = { "CS2103", "Want a good grade", "Yo[]oY" };
        assertFalse(Utils.isAnyNull(inputs));
    }
	
	@Test
    public void isAnyNull_nullPassed() {
        final Object[] nullInputs = { "CS2103", null, null };
        assertTrue(Utils.isAnyNull(nullInputs));
    }
	
	@Test
    public void isAnyNull_nullObjectPassed() {
		Object totallyNotNull = new Object();
		totallyNotNull = null;
        final Object[] nullInputs = { "CS2103", totallyNotNull, "Yo[]oY" };
        assertTrue(Utils.isAnyNull(nullInputs));
    }
	
	// testing Utils::elementsAreUnique()
	
	@Test
    public void elementsAreUnique_uniqueElementsofSetPassed() {
		Set<String> inputs = new HashSet<String>();
        inputs.add("Fry");
        inputs.add("Zoidberg");
        inputs.add("Bender");
        
        assertTrue(Utils.elementsAreUnique(inputs));
    }
	
	@Test
    public void elementsAreUnique_sameElementsofSetPassed() {
		Set<String> inputs = new HashSet<String>();
        inputs.add("Fry");
        inputs.add("Zoidberg");
        inputs.add("Bender");
        inputs.add("Boop");
        inputs.add("Boop");
        
        assertFalse(Utils.elementsAreUnique(inputs));
    }
	
	@Test
    public void elementsAreUnique_uniqueElementsofListPassed() {
		Collection<String> inputs = (Collection<String>) new List();
        inputs.add("Fry");
        inputs.add("Zoidberg");
        inputs.add("Bender");
        inputs.add("Boop");
        inputs.add("Boop");
        
        assertFalse(Utils.elementsAreUnique(inputs));
    }
}