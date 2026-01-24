package com.junit.listmanagertesting;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ListManagerTest {

    ListManager manager;
    List<Integer> list;

    @Before
    public void setup() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    public void testRemoveElement() {
        list.add(10);
        list.add(20);

        manager.removeElement(list, 10);

        assertFalse(list.contains(10));
        assertEquals(1, manager.getSize(list));
    }

    @Test
    public void testGetSize() {
        manager.addElement(list, 5);
        manager.addElement(list, 15);

        assertEquals(2, manager.getSize(list));
    }
}
