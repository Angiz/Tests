package pl.net.focus;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassToTestTest {

    @Test
    public void sum() {
        ClassToTest classToTest = new ClassToTest();
        assertEquals(4, classToTest.sum(2, 2));
        assertEquals(-4, classToTest.sum(-2, -2));
        assertEquals(-2, classToTest.sum(0, -2));
        assertEquals(4, classToTest.sum(2, -(-2)));
        assertEquals(22, classToTest.sum(2, 4*5));
        assertEquals(7, classToTest.sum(Integer.parseInt(""+'\u0035'), 2));
    }

    @Test
    public void returnObject() {
        returnObject();
    }
}