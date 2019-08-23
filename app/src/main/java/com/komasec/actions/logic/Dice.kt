package com.komasec.actions.logic

import java.lang.StringBuilder
import kotlin.random.Random

object Dice {
    const val DELIMITER = ", "

    fun roll(dices: Int = 1, faces: Int = 6): String {
        val builder = StringBuilder()
        repeat(dices) {
            if (it != 0) builder.append(DELIMITER)
            builder.append(Random.nextInt(faces) + 1)
        }
        return builder.toString()
    }
}