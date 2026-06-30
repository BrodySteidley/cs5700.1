
import kotlin.math.PI
import kotlin.arrayOf

open class Ellipse(
	midpoint : Point,
	private var horizontalRadius : Double,
	private var verticalRadius : Double
	) : Shape()
{
	override var points : Array<Point> = arrayOf<Point>(midpoint.clone());

	init
	{
		require(horizontalRadius > 0 && verticalRadius > 0)
			{ "Radii must be positive." }
	}

	fun getHorizontalRadius() : Double
	{
		return horizontalRadius;
	}

	fun getVerticalRadius() : Double
	{
		return verticalRadius;
	}

	fun getMidpoint() : Point
	{
		return points[0].clone();
	}

	override fun getArea() : Double
	{
		return PI * horizontalRadius * verticalRadius;
	}
}

