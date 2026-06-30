import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.assertThrows
import kotlin.math.PI

class EllipseTest {
    @Test
    fun testEllipse() {
		val midpoint : Point = Point(5.0, 10.0);

		/* test ellipse throws error on invalid area */
		assertThrows<IllegalArgumentException> {
			val ellipse2 : Ellipse = Ellipse(midpoint, 4.0, 0.0)
		};
		assertThrows<IllegalArgumentException> {
			val ellipse3 : Ellipse = Ellipse(midpoint, -2.0, 17.0)
		};

		val ellipse : Ellipse = Ellipse(midpoint, 2.0, 6.0)

		/* test get radii and midpoint */
		assertEquals(2.0, ellipse.getHorizontalRadius());
		assertEquals(6.0, ellipse.getVerticalRadius());
		assertEquals(midpoint.getX(), ellipse.getMidpoint().getX());
			assertEquals(midpoint.getY(), ellipse.getMidpoint().getY());

		/* test getArea */
		assertEquals(PI * 12.0, ellipse.getArea());

		/* test shape points */
		assertEquals(1, ellipse.getPointCount());
		assertEquals(midpoint.getX(), ellipse.getPoint(0)?.getX());
		assertEquals(midpoint.getY(), ellipse.getPoint(0)?.getY());
		assertEquals(null, ellipse.getPoint(1));
		assertEquals(null, ellipse.getPoint(-1));

		/* test move */
		ellipse.move(5.0, 5.0)
		assertEquals(10.0, ellipse.getMidpoint().getX());
		assertEquals(15.0, ellipse.getMidpoint().getY());
    }
}
