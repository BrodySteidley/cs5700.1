import kotlin.math.abs
import kotlin.math.sqrt
import kotlin.math.pow

class Line(endpointA: Point, endpointB: Point) : PointCollection() {
	
    override val points: Array<Point> = arrayOf<Point>(endpointA.clone(), endpointB.clone())

    init {
        require(!(endpointA.getX() == endpointB.getX() && endpointA.getY() == endpointB.getY()))
        { "Line must not have a length of 0." }
    }

    fun getEndpointA(): Point {
        return points[0].clone()
    }

    fun getEndpointB(): Point {
        return points[1].clone()
    }

    fun getSlope(): Double {
        if (points[1].getX() == points[0].getX())
            return Double.NaN
        /* rise over run; (y2 - y1) / (x2 - x1) */
        return (points[1].getY() - points[0].getY()) / (points[1].getX() - points[0].getX())
    }

    fun getLength(): Double {
        /* sqrt((x2 - x1)^2 + (y2 - y2)^2) */
        return sqrt(
            (points[1].getX() - points[0].getX()).pow(2) +
                    (points[1].getY() - points[0].getY()).pow(2)
        )
    }
}

