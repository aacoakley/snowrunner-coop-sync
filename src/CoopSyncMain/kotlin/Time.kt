import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

object Time {
    private val now = Clock.System.now()
    fun instant(): Long { return now.epochSeconds}
}