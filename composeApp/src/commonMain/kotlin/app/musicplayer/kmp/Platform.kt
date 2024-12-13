package app.musicplayer.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform