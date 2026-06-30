import kotlin.test.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class SquareTest {
    @Test
    fun testSquare() {
        /* test square throws illegal argument on uneven side lengths */
        assertThrows<IllegalArgumentException> {
            val square : Square = Square(Point(0.0, 0.0), Point(5.0, 7.0))
        };

        /* test square throws illegal argument on invalid area */
        assertThrows<IllegalArgumentException> {
            val square : Square = Square(Point(5.0, 7.0), Point(5.0, 7.0))
        };

        val tlpoint = Point(0.0, 0.0);
        val brpoint = Point(7.0, 7.0);

        val rect : Square = Square(tlpoint, brpoint);

        /* test shape points */
        assertEquals(2, rect.getPointCount());
        assertEquals(tlpoint, rect.getPoint(0));
        assertEquals(brpoint, rect.getPoint(1));
        assertEquals(null, rect.getPoint(2));
        assertEquals(null, rect.getPoint(-1));

        /* test point get */
        assertEquals(tlpoint, rect.getTopLeftPoint());
        assertEquals(brpoint, rect.getBottomRightPoint());

        /* test area */
        assertEquals(7.0 * 7.0, rect.getArea());

        /* test move */
        rect.move(-12.0, 0.0);
        assertEquals(-12.0, tlpoint.getX());
        assertEquals(0.0, tlpoint.getY());
        assertEquals(-5.0, brpoint.getX());
        assertEquals(7.0, brpoint.getY());
    }
}
