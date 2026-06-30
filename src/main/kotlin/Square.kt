
class Square(topLeft : Point, bottomRight : Point) : Rect(topLeft, bottomRight)
{
	init
	{
		require((bottomRight.getX() - topLeft.getX()) == (bottomRight.getY() - topLeft.getY()))
			{ "Square can not have unequal sides." }
	}
}

