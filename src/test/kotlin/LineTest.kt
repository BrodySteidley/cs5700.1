import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.assertThrows

class LineTest {
    @Test
    fun testLine() {
		/* test line must not have 0 length */
		assertThrows<IllegalArgumentException> {
			val line : Line = Line(Point(3.0, 3.0), Point(3.0, 3.0))
		};

		val point1 = Point(0.0, 0.0);
		val point2 = Point(3.0, 0.0);
		val line : Line = Line(point1, point2);

		/* test getting endpoints */
		assertEquals(point1, line.getEndpointA());
		assertEquals(point2, line.getEndpointB());

		/* test length */
		assertEquals(3.0, line.getLength());

		/* test move */;
		line.move(4.0, -17.0);
		assertEquals(4.0, point1.getX());
		assertEquals(-17.0, point1.getY());
		assertEquals(7.0, point2.getX());
		assertEquals(-17.0, point2.getY());

		/* test getSlope */
		assertEquals(0.0, line.getSlope());
		point2.move(0.0, 3.0);
		assertEquals(1.0, line.getSlope());
    }

	@Test
    fun testVerticalLineSlopeNaN()
    {
        val line : Line = Line(Point(0.0, 0.0), Point(0.0, 3.0));

		assertEquals(Double.NaN, line.getSlope());
    }
}

