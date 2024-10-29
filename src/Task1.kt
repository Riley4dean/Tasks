data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int,
)

fun main() {
    Event("Study Kotlin", "Commit to studying Kotlin for at least 15 minutes per day", "Evening", 15)
}
