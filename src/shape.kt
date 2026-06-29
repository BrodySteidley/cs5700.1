
abstract class Shape
{
	abstract var points : Array<Point>

	fun getPointCount() : Int
	{
		return points.size
	}

	fun getPoint(index : Int) : Point?
	{
		if (index >= points.size)
			return null
		return points[index]
	}

	fun move(deltaX : Double, deltaY : Double)
	{
		for (point : Point in points)
			point.move(deltaX, deltaY)
	}
	
	abstract fun getArea() : Double
}

