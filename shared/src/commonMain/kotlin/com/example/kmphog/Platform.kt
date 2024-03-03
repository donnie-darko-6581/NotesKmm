package com.example.kmphog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform