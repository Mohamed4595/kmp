package org.mhmd.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform