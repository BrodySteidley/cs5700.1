
import kotlin.math.abs
import kotlin.math.sqrt
import kotlin.math.pow

class Line (
	private var endpointA : Point,
	private var endpointB : Point
)
{
	init
	{
		require(!(endpointA.getX() == endpointB.getX() && endpointA.getY() == endpointB.getY()))
		{ "Line must not have a length of 0." }
		endpointA = endpointA.clone();
		endpointB = endpointB.clone()
	}

	fun getEndpointA() : Point
	{
		return endpointA.clone();
	}
	
	fun getEndpointB() : Point
	{
		return endpointB.clone();
	}

	fun getSlope() : Double
	{
		if (endpointB.getX() == endpointA.getX())
			return Double.NaN;
		/* rise over run; (y2 - y1) / (x2 - x1) */
		return abs(endpointB.getY() - endpointA.getY()) / (endpointB.getX() - endpointA.getX());
	}

	fun getLength() : Double
	{
		/* sqrt((x2 - x1)^2 + (y2 - y2)^2) */
		return sqrt(
			(endpointB.getX() - endpointA.getX()).pow(2) +
			(endpointB.getY() - endpointA.getY()).pow(2)
			);
	}
	
	fun move(deltaX : Double, deltaY : Double)
	{
		endpointA.move(deltaX, deltaY);
		endpointB.move(deltaX, deltaY);
	}
}

