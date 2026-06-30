import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.assertThrows

class TriangleTest {
    @Test
    fun testTriangle() {
		/* test triangle throws error on invalid area */
		assertThrows<IllegalArgumentException> {
			var triangle2 : Triangle = Triangle(Point(0.0, 0.0), Point(1.0, 0.0), Point(2.0, 0.0));
		};

		val pointA = Point(10.0, 0.0);
		val pointB = Point(0.0, 0.0);
		val pointC = Point(0.0, 10.0);
		val triangle : Triangle = Triangle(pointA, pointB, pointC);

		/* test getArea */
		assertEquals(50.0, triangle.getArea())

		/* test shape points */
		assertEquals(3, triangle.getPointCount());
		assertEquals(pointA, triangle.getPoint(0));
		assertEquals(pointB, triangle.getPoint(1));
		assertEquals(pointC, triangle.getPoint(2));
		assertEquals(null, triangle.getPoint(3));
		assertEquals(null, triangle.getPoint(-1));

		/* test move */
		triangle.move(5.0, -5.0)
		assertEquals(15.0, pointA.getX());
		assertEquals(-5.0, pointA.getY());
		assertEquals(5.0, pointB.getX());
		assertEquals(-5.0, pointB.getY());
		assertEquals(5.0, pointC.getX());
		assertEquals(5.0, pointC.getY());
    }
}
