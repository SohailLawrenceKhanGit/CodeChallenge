package com.location.codechallenge

import androidx.lifecycle.MediatorLiveData
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//@RunWith(AndroidJUnit4ClassRunner::class)
//class MapsActivityTest {
//
//    @get:Rule
//    val activityRule = ActivityScenarioRule(MapsActivity::class.java)
//
//
//    @Test
//    fun test_mainActivityIsDisplayed() {
//
//        Espresso.onView(withId(R.id.map)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
//    }
//}