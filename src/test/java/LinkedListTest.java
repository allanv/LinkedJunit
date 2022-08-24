import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void isEmpty() {
        LinkedList<Integer> s = new LinkedList<>();
        assertTrue(s.isEmpty(),"new list is empty");
    }

    @org.junit.jupiter.api.Test
    void addEnd() {
        LinkedList<Integer> s = new LinkedList<>();
        s.addEnd(1);
        s.addEnd(2);
        s.addEnd(3);
        s.addEnd(4);
        assertEquals("1 2 3 4 ",s.toString());

    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void removeFirst() {
        LinkedList<Integer> s = new LinkedList<>();
        s.addEnd(1);
        s.addEnd(2);
        s.addEnd(3);
        s.addEnd(4);
        Integer r= s.removeFirst();
        assertEquals(1,r);
        assertEquals("2 3 4 ",s.toString());
        s.removeFirst();
        s.removeFirst();
        s.removeFirst();
        s.addEnd(5);
        s.addEnd(6);

        assertEquals("5 6 ",s.toString());
    }
}