package 三角形;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle T1 = new Triangle(2,3,4);
    Triangle T4 = new Triangle(0,1,2);
    Triangle T7 = new Triangle(Long.MAX_VALUE,2,4);
    Triangle T10 = new Triangle(3,3,3);
    Triangle T11= new Triangle(3,4,4);

    long []borders= {0,0,0};
    @Test
    public void testisTriangle() {
        assertTrue(T1.isTriangle(T1));
        assertFalse(T4.isTriangle(T4));
        assertFalse(T7.isTriangle(T7));
        assertTrue(T10.isTriangle(T10));
        assertTrue(T11.isTriangle(T11));
    }

    @Test
    public void testGetType() {
        assertSame("Illegal", T4.getType(T4));
        assertSame("Regular", T10.getType(T10));
        assertSame("Isosceles", T11.getType(T11));
        assertSame("Scalene", T1.getType(T1));
    }

    @Test
    public void testDiffOfBorders() {
        assertEquals(1, T1.diffOfBorders(T1.lborderA, T1.lborderB));
    }

    @Test
    public void testGetBorders() {
        borders=T1.getBorders();
        assertEquals(T1.lborderA, borders[0]);
        assertEquals(T1.lborderB,borders[1]);
        assertEquals(T1.lborderC,borders[2]);
    }
}