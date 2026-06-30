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
		assertEquals(tlpoint.getX(), rect.getPoint(0)?.getX());
		assertEquals(tlpoint.getY(), rect.getPoint(0)?.getY());
		assertEquals(brpoint.getX(), rect.getPoint(1)?.getX());
		assertEquals(brpoint.getY(), rect.getPoint(1)?.getY());
		assertEquals(null, rect.getPoint(2));
		assertEquals(null, rect.getPoint(-1));

		/* test point get */
		assertEquals(tlpoint.getX(), rect.getTopLeftPoint().getX());
		assertEquals(tlpoint.getY(), rect.getTopLeftPoint().getY());
		assertEquals(brpoint.getX(), rect.getBottomRightPoint().getX());
		assertEquals(brpoint.getY(), rect.getBottomRightPoint().getY());

		/* test area */
		assertEquals(7.0 * 4.0, rect.getArea());

		/* test move */
		rect.move(-12.0, 0.0);
		assertEquals(-12.0, rect.getTopLeftPoint().getX());
		assertEquals(0.0, rect.getTopLeftPoint().getY());
		assertEquals(-5.0, rect.getBottomRightPoint().getX());
		assertEquals(4.0, rect.getBottomRightPoint().getY());
    }
}
