
import kotlin.math.PI
import kotlin.arrayOf

open class Ellipse(
	origin : Point,
	private var horizontalRadius : Double,
	private var verticalRadius : Double
	) : Shape()
{
	override var points : Array<Point> = arrayOf<Point>(origin)	

	fun getHorizontalRadius() : Double
	{
		return horizontalRadius
	}

	fun getVerticalRadius() : Double
	{
		return verticalRadius
	}

	init
	{
		require(horizontalRadius > 0 && verticalRadius > 0)
			{ "Radii must be positive." }
	}

	fun getOrigin() : Point
	{
		return points[0]
	}

	override fun getArea() : Double
	{
		return PI * horizontalRadius * verticalRadius;
	}
}

