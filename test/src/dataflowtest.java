import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dataflowtest {
    @Test
    void testcase1() {
        Person p = new Person(5, "NORMAL");
        assertEquals(2000000, p.account(p));
    }

    @Test
    void testcase2() {
        Person p = new Person(3, "NORMAL");
        assertEquals(2000000, p.account(p));
    }

    @Test
    void testcase3() {
        Person p = new Person(4, "VIP");
        assertEquals(4000000, p.account(p));
    }

    @Test
    void testcase4() {
        Person p = new Person(30, "VIP");
        assertEquals(5000000, p.account(p));
    }

    @Test
    void testcase5() {
        Person p = new Person(25, "NORMAL");
        assertEquals(3200000, p.account(p));
    }

    @Test
    void testcase6() {
        Person p = new Person(1, "NORMAL");
        assertEquals(2000000, p.account(p));
    }

    @Test
    void testcase7() {
        Person p = new Person(4, "VIP");
        assertEquals(4000000, p.account(p));
    }

    @Test
    void testcase8() {
        Person p = new Person(16, "VIP");
        assertEquals(5000000, p.account(p));
    }

    @Test
    void testcase9() {
        Person p = new Person(19, "NORMAL");
        assertEquals(3200000, p.account(p));
    }

    @Test
    void testcase10() {
        Person p = new Person(-4, "NORMAL");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase11() {
        Person p = new Person(2, "NORMAL");
        assertEquals(2000000, p.account(p));
    }

    @Test
    void testcase12() {
        Person p = new Person(1, "NORMAL");
        assertEquals(2000000, p.account(p));
    }

    @Test
    void testcase13() {
        Person p = new Person(40, "VIP");
        assertEquals(5000000, p.account(p));
    }
}