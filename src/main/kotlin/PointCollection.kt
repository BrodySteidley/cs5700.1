abstract class PointCollection : Movable {
    abstract val points: Array<Point>

    fun getPointCount(): Int {
        return points.size
    }

    fun getPoint(index: Int): Point? {
        if (index < 0 || index >= points.size)
            return null
        return points[index].clone()
    }

    override fun move(deltaX: Double, deltaY: Double) {
        for (point: Point in points)
            point.move(deltaX, deltaY)
    }
}

