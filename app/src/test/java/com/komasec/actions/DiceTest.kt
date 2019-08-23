package com.komasec.actions

import com.komasec.actions.logic.Dice
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class DiceTest {

    @Test
    fun roll() {
        assertTrue(Dice.roll(1).matches(Regex("[1-6]")))
        assertTrue(Dice.roll(2).matches(Regex("[1-6], [1-6]")))
        assertTrue(Dice.roll(3).matches(Regex("[1-6], [1-6], [1-6]")))

        assertTrue(Dice.roll(1, 7).matches(Regex("[1-7]")))
        assertTrue(Dice.roll(2, 7).matches(Regex("[1-7], [1-7]")))
        assertTrue(Dice.roll(3, 7).matches(Regex("[1-7], [1-7], [1-7]")))
    }
}