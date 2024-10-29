data class EVent(
    val title: String,
    val description: String? = null,
    val daypart: daypart,
    val durationInMinutes: Int,
)

enum class daypart{
    MORNING,
    AFTERNOON,
    EVENING
}

