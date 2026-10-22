package com.example.myapplication

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith
import org.junit.Test



@RunWith(AndroidJUnit4::class)
class FormulaZeroTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    @Test
    fun navigate_to_races_add_race_and_return_home() {
        composeTestRule
            .onNodeWithTag("raceButton")
            .performClick()

        composeTestRule
            .onNodeWithText("Upcoming Races")
            .assertExists()

        composeTestRule
            .onNodeWithTag("locationInput")
            .performTextInput("Canada")

        composeTestRule
            .onNodeWithTag("addRaceButton")
            .performClick()

        composeTestRule
            .onNodeWithText("Canada")
            .assertExists()

        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()

        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertExists()

        composeTestRule
            .onNodeWithTag("driversButton")
            .performClick()

        composeTestRule
            .onNodeWithText("FormulaZero Drivers")
            .assertExists()

        composeTestRule
            .onNodeWithTag("driverInput")
            .performTextInput("Michael Jackson")

        composeTestRule
            .onNodeWithTag("addDriverButton")
            .performClick()

        composeTestRule
            .onNodeWithText("Michael Jackson")
            .assertExists()

        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()

        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertExists()

    }
}