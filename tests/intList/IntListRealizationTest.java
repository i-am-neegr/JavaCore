package intList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class IntListRealizationTest {
    private IntList list;

    @BeforeEach
    public void setUp() {
        list = new IntListRealization();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void testAdd() {
        list.add(4);
        assertEquals(4, list.size());
        assertEquals(1, list.get(0));
    }

    @Test
    public void testAddByIndex() {
        list.add(1, 22);
        assertEquals(4, list.size());
        assertEquals(22, list.get(1));
        assertEquals(2, list.get(2));
    }

    @Test
    public void testRemove() {
        int cnt = list.size();
        list.remove(2);
        assertEquals(cnt - 1, list.size());
    }

    @Test
    public void testSet() {
        list.set(1, 22);
        assertEquals(22, list.get(1));
    }

    @Test
    public void testGet() {
        assertEquals(list.get(1), 2);
    }

    @Test
    public void testSize() {
        assertEquals(list.size(), 3);
    }

    @Test
    public void testIsEmpty() {
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testContains() {
        assertTrue(list.contains(1));
    }
}
