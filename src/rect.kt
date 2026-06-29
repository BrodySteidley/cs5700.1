
import kotlin.math.abs
import kotlin.arrayOf

open class Rect(topLeft : Point, bottomRight : Point) : Shape()
{
	override var points : Array<Point> = arrayOf<Point>(topLeft, bottomRight)	

	init
	{
		require(!(topLeft.getX() == bottomRight.getX() && topLeft.getY() == bottomRight.getY()))
			{ "Rect can not have an area of zero." }
	}

	override fun getArea() : Double
	{
		return abs((points[1].getX() - points[0].getX()) * (points[1].getY() - points[0].getY()))
	}
}

