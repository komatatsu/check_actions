package com.komasec.actions

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until
import org.hamcrest.Matcher
import org.hamcrest.Matchers.containsString
import org.hamcrest.core.StringContains
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainTest {

    val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun diceRoll() {
        activityTestRule.launchActivity(Intent())
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.wait(Until.findObject(By.res("com.komasec.actions:id/roll")), 3000)
        onView(withId(R.id.roll)).perform(click())
        onView(withId(R.id.result)).check(matches(withText(containsString(", "))))
    }

}