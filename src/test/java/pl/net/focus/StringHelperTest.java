package pl.net.focus;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void testTruncateAInFirst2Positions() {
        StringHelper stringHelper = new StringHelper();
        assertEquals("ANETA", stringHelper.truncateAInFirst2Positions("AAANETA"));
        String sTest = ""+'\u0041' + '\u0041' +"NETA";
        System.out.println(sTest);
        assertEquals("NETA", stringHelper.truncateAInFirst2Positions(sTest));
        assertEquals("NETA", stringHelper.truncateAInFirst2Positions("ANETA"));
        assertEquals("NETA", stringHelper.truncateAInFirst2Positions("NETA"));
        assertEquals("", stringHelper.truncateAInFirst2Positions("A"));
        assertEquals("", stringHelper.truncateAInFirst2Positions("AA"));
        assertEquals("aa", stringHelper.truncateAInFirst2Positions("aa"));
//        assertEquals(stringHelper.truncateAInFirst2Positions(null), null);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame() {
        StringHelper stringHelper = new StringHelper();
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("aanetaa"));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame(""));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame(null));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("a"));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("abc"));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ab987"));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("dgdfgdfgdf"));
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("costamdgdfgdgdgdgdgtamco"));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("AAnetaa"));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("Abba"));
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ąąbbąą"));
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("\u0105\u0105bb\u0105\u0105"));
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("\u0105\u0105bb\u0105\u0105"));
    }

    @Test
    public void testAreStringTheSameBetweenDelimiter() {
        StringHelper stringHelper = new StringHelper();
        assertTrue(stringHelper.areStringTheSameBetweenDelimiter("12/12"));
        assertFalse(stringHelper.areStringTheSameBetweenDelimiter("12/12a"));
        assertTrue(stringHelper.areStringTheSameBetweenDelimiter("aaa/aaa"));
    }
}