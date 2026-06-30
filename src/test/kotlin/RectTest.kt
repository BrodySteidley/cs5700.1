import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.assertThrows

class RectTest {
    @Test
    fun testRect() {
		assertThrows<IllegalArgumentException>{
			val rect = Rect(Point(1.0, 1.0), Point(1.0, 1.0))
		};

		val tlpoint = Point(0.0, 0.0);
		val brpoint = Point(7.0, 4.0);

		val rect : Rect = Rect(tlpoint, brpoint);

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
		assertEquals(7.0 * 4.0, rect.getArea());

		/* test move */
		rect.move(-12.0, 0.0);
		assertEquals(-12.0, tlpoint.getX());
		assertEquals(0.0, tlpoint.getY());
		assertEquals(-5.0, brpoint.getX());
		assertEquals(4.0, brpoint.getY());
    }
}
