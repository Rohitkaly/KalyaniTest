package com.example.holdings.app.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.holdings.app.R
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class ExpandCollapseEspressoTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Test
    fun expandCollapse_and_recycler_contents() {
        hiltRule.inject()
        ActivityScenario.launch(MainActivity::class.java)

        // Collapsed shows current value text view
        onView(withId(R.id.tvCurrentValue)).check(matches(isDisplayed()))

        // Click to expand
        onView(withId(R.id.collapsed_root)).perform(click())

        // Now expanded header should be visible
        onView(withId(R.id.tvTotalInvestment)).check(matches(isDisplayed()))
    }
}
