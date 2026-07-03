import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.assertThrows

class PointTest {
    @Test
    fun testPoint() {
        val point: Point = Point(5.0, 10.0)
        assertEquals(5.0, point.getX())
        assertEquals(10.0, point.getY())

        val point2: Point = point.clone()
        assertEquals(point.getX(), point2.getX())
        assertEquals(point.getY(), point2.getY())

        point.move(5.0, 5.0)
        assertEquals(point2.getX() + 5.0, point.getX())
        assertEquals(point2.getY() + 5.0, point.getY())


        assertThrows<IllegalArgumentException> {
            val point3 = Point(Double.POSITIVE_INFINITY, 0.0)
        }
        assertThrows<IllegalArgumentException> {
            val point4 = Point(0.0, Double.NaN)
        }
    }
}
