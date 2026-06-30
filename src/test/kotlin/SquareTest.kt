import kotlin.test.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class SquareTest {
    @Test
    fun testSquare() {
        /* test square throws illegal argument on uneven side lengths */
        /* test square throws illegal argument on invalid area */
        assertThrows<IllegalArgumentException> {
            val square : Square = Square(Point(5.0, 7.0), 0.0)
        };

        val tlpoint = Point(0.0, 0.0);

        val rect : Square = Square(tlpoint, 7.0);

        /* test shape points */
        assertEquals(2, rect.getPointCount());
        assertEquals(tlpoint, rect.getPoint(0));
        assertEquals(null, rect.getPoint(2));
        assertEquals(null, rect.getPoint(-1));

        /* test point get */
        assertEquals(tlpoint, rect.getTopLeftPoint());

        /* test area */
        assertEquals(7.0 * 7.0, rect.getArea());

        /* test move */
        rect.move(-12.0, 0.0);
        assertEquals(-12.0, tlpoint.getX());
        assertEquals(0.0, tlpoint.getY());
    }
}
