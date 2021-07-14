package com.smashtik.automationapp.ui.login;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.smashtik.automationapp.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest2 {
    @Rule public ActivityTestRule<LoginActivity> activityTestRule
            = new ActivityTestRule<>(LoginActivity.class);
    @Test
    public void loginVerifyErrors(){
        onView(withId(R.id.username)).perform(typeText("Test"));
        closeSoftKeyboard();
        onView(withId(R.id.password)).perform(typeText("Test"));
        onView(withId(R.id.login)).perform(click());

    }

}
