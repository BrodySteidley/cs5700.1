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
        assertEquals(tlpoint.getX(), rect.getPoint(0)?.getX());
        assertEquals(tlpoint.getY(), rect.getPoint(0)?.getY());
        assertEquals(null, rect.getPoint(2));
        assertEquals(null, rect.getPoint(-1));

        /* test point get */
        assertEquals(tlpoint.getX(), rect.getTopLeftPoint().getX());
        assertEquals(tlpoint.getY(), rect.getTopLeftPoint().getY());

        /* test area */
        assertEquals(7.0 * 7.0, rect.getArea());

        /* test move */
        rect.move(-12.0, 0.0);
        assertEquals(-12.0, rect.getTopLeftPoint().getX());
        assertEquals(0.0, rect.getTopLeftPoint().getY());
    }
}
