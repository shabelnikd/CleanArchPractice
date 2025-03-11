package com.shabelnikd.cleanarchpractice

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform