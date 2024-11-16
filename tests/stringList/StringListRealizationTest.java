package stringList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringListRealizationTest {

    private StringListRealization stringList;

    @BeforeEach
    public void setUp() {
        stringList = new StringListRealization();
    }

    @Test
    public void testAdd() {
        stringList.add("Hello");
        assertEquals(1, stringList.size());
        assertEquals("Hello", stringList.get(0));
    }

    @Test
    public void testAddAtIndex() {
        stringList.add("Hello");
        stringList.add("World");
        stringList.add(1, "Java");
        assertEquals(3, stringList.size());
        assertEquals("Hello", stringList.get(0));
        assertEquals("Java", stringList.get(1));
        assertEquals("World", stringList.get(2));
    }

    @Test
    public void testSet() {
        stringList.add("Hello");
        stringList.add("World");
        stringList.set(1, "Java");
        assertEquals("Java", stringList.get(1));
    }

    @Test
    public void testRemoveByValue() {
        stringList.add("Hello");
        stringList.add("World");
        assertTrue(stringList.contains("World"));
        stringList.remove("World");
        assertFalse(stringList.contains("World"));
        assertEquals(1, stringList.size());
    }

    @Test
    public void testRemoveByIndex() {
        stringList.add("Hello");
        stringList.add("World");
        stringList.remove(0);
        assertEquals(1, stringList.size());
        assertEquals("World", stringList.get(0));
    }

    @Test
    public void testContains() {
        stringList.add("Hello");
        assertTrue(stringList.contains("Hello"));
        assertFalse(stringList.contains("World"));
    }

    @Test
    public void testIndexOf() {
        stringList.add("Hello");
        stringList.add("World");
        assertEquals(0, stringList.indexOf("Hello"));
        assertEquals(1, stringList.indexOf("World"));
        assertEquals(-1, stringList.indexOf("Java"));
    }

    @Test
    public void testLastIndexOf() {
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Hello");
        assertEquals(2, stringList.lastIndexOf("Hello"));
        assertEquals(-1, stringList.lastIndexOf("Java"));
    }

    @Test
    public void testGet() {
        stringList.add("Hello");
        assertEquals("Hello", stringList.get(0));
    }

    @Test
    public void testSize() {
        assertEquals(0, stringList.size());
        stringList.add("Hello");
        assertEquals(1, stringList.size());
        stringList.add("World");
        assertEquals(2, stringList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stringList.isEmpty());
        stringList.add("Hello");
        assertFalse(stringList.isEmpty());
    }

    @Test
    public void testClear() {
        stringList.add("Hello");
        stringList.clear();
        assertEquals(0, stringList.size());
        assertTrue(stringList.isEmpty());
    }

    @Test
    public void testToArray() {
        stringList.add("Hello");
        stringList.add("World");
        String[] array = stringList.toArray();
        assertArrayEquals(new String[]{"Hello", "World"}, array);
    }

    @Test
    public void testExceptionOnInvalidIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            stringList.get(0);
        });

        stringList.add("Hello");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            stringList.remove(1);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            stringList.set(1, "World");
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            stringList.add(-1, "World");
        });
    }

    @Test
    public void testRemoveNonExistentElement() {
        stringList.add("Hello");
        assertThrows(NoSuchElementException.class, () -> {
            stringList.remove("World");
        });
    }
}
