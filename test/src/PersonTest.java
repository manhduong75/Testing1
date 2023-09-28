import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testcase1() {
        Person p = new Person(-7, "VIP");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase2() {
        Person p = new Person(10, "VIP");
        assertEquals(4000000, p.account(p));
    }

    @Test
    void testcase3() {
        Person p = new Person(30, "VIP");
        assertEquals(5000000, p.account(p));
    }

    @Test
    void testcase4() {
        Person p = new Person(-5, "BUSINESS");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase5() {
        Person p = new Person(3, "BUSINESS");
        assertEquals(3000000, p.account(p));
    }

    @Test
    void testcase6() {
        Person p = new Person(25, "BUSINESS");
        assertEquals(4200000, p.account(p));
    }

    @Test
    void testcase7() {
        Person p = new Person(-8, "NORMAL");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase8() {
        Person p = new Person(8, "NORMAL");
        assertEquals(2000000, p.account(p));
    }

    @Test
    void testcase9() {
        Person p = new Person(30, "NORMAL");
        assertEquals(3200000, p.account(p));
    }
}