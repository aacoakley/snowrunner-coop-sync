package util

import kotlinx.datetime.Clock

object Time {
    private val now = Clock.System.now()
    fun instant(): Long { return now.toEpochMilliseconds()}
}