
import kotlin.math.abs

class Triangle(pointA : Point, pointB : Point, pointC : Point) : Shape()
{
	override var points : Array<Point> = arrayOf<Point>(pointA.clone(), pointB.clone(), pointC.clone());
	
	init
	{
		require(getArea() != 0.0) { "Triangle must have non-zero area." }
	}

	override fun getArea() : Double
	{
		return 0.5 * abs(
			points[0].getX() * (points[1].getY() - points[2].getY()) +
			points[1].getX() * (points[2].getY() - points[0].getY()) +
			points[2].getX() * (points[0].getY() - points[1].getY())
		);
	}
}

