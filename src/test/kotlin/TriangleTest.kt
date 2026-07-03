import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.assertThrows

class TriangleTest {
    @Test
    fun testTriangle() {
        /* test triangle throws error on invalid area */
        assertThrows<IllegalArgumentException> {
            val triangle2: Triangle = Triangle(Point(0.0, 0.0), Point(1.0, 0.0), Point(2.0, 0.0))
        }

        val pointA = Point(10.0, 0.0)
        val pointB = Point(0.0, 0.0)
        val pointC = Point(0.0, 10.0)
        val triangle: Triangle = Triangle(pointA, pointB, pointC)

        /* test getArea */
        assertEquals(50.0, triangle.getArea())

        /* test shape points */
        assertEquals(3, triangle.getPointCount())
        assertEquals(pointA.getX(), triangle.getPoint(0)?.getX())
        assertEquals(pointA.getY(), triangle.getPoint(0)?.getY())
        assertEquals(pointB.getX(), triangle.getPoint(1)?.getX())
        assertEquals(pointB.getY(), triangle.getPoint(1)?.getY())
        assertEquals(pointC.getX(), triangle.getPoint(2)?.getX())
        assertEquals(pointC.getY(), triangle.getPoint(2)?.getY())
        assertEquals(null, triangle.getPoint(3))
        assertEquals(null, triangle.getPoint(-1))

        /* test move */
        triangle.move(5.0, -5.0)
        assertEquals(15.0, triangle.getPoint(0)?.getX())
        assertEquals(-5.0, triangle.getPoint(0)?.getY())
        assertEquals(5.0, triangle.getPoint(1)?.getX())
        assertEquals(-5.0, triangle.getPoint(1)?.getY())
        assertEquals(5.0, triangle.getPoint(2)?.getX())
        assertEquals(5.0, triangle.getPoint(2)?.getY())
    }
}
