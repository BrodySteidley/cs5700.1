import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.assertThrows
import kotlin.math.PI

class CircleTest {
    @Test
    fun testCircle() {
        val midpoint: Point = Point(5.0, 10.0)

        /* test circle throws error on invalid area */
        assertThrows<IllegalArgumentException> {
            val circle2: Circle = Circle(midpoint, 0.0)
        }
        assertThrows<IllegalArgumentException> {
            val circle3: Circle = Circle(midpoint, -2.0)
        }

        val circle: Circle = Circle(midpoint, 2.0)

        /* test get radii and midpoint */
        assertEquals(2.0, circle.getHorizontalRadius())
        assertEquals(2.0, circle.getVerticalRadius())
        assertEquals(midpoint.getX(), circle.getMidpoint().getX())
        assertEquals(midpoint.getY(), circle.getMidpoint().getY())

        /* test getArea */
        assertEquals(PI * 4.0, circle.getArea())

        /* test shape points */
        assertEquals(1, circle.getPointCount())
        assertEquals(midpoint.getX(), circle.getPoint(0)?.getX())
        assertEquals(midpoint.getY(), circle.getPoint(0)?.getY())
        assertEquals(null, circle.getPoint(1))
        assertEquals(null, circle.getPoint(-1))

        /* test move */
        circle.move(5.0, 5.0)
        assertEquals(10.0, circle.getMidpoint().getX())
        assertEquals(15.0, circle.getMidpoint().getY())
    }
}
