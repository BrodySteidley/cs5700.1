class Point(
    private var x: Double,
    private var y: Double
) : Movable {
    init {
        require(x.isFinite()) { "x must be a finite value." }
        require(y.isFinite()) { "y must be a finite value." }
    }

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun clone(): Point {
        return Point(this.x, this.y)
    }

    override fun move(deltaX: Double, deltaY: Double) {
        this.x += deltaX
        this.y += deltaY
    }
}

