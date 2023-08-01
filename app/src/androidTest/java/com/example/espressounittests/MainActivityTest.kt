package com.example.espressounittests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Rule
import org.junit.Test


class MainActivityTest {


    @get: Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun testSubmitBtnExpectedCorrectValue() {

        onView(ViewMatchers.withId(R.id.titleEtvId)).perform(ViewActions.typeText("Name"))
        onView(ViewMatchers.withId(R.id.decEtvId)).perform(ViewActions.typeText("Md. Sabiruzzaman"),
            closeSoftKeyboard()
        )


        onView(ViewMatchers.withId(R.id.subBtnId)).perform(ViewActions.click())
        onView(ViewMatchers.withId(R.id.detailsTvId))
            .check(ViewAssertions.matches(ViewMatchers.withText("Title - Name | Description - Md. Sabiruzzaman")))


    }

}