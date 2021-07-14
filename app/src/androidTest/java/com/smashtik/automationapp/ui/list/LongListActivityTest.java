package com.smashtik.automationapp.ui.list;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.smashtik.automationapp.ui.dataadapter.LongListActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class LongListActivityTest {
    private static final String itemText = "item: 30";
    private static final String selectedItemText = "30";
    private static final String lastItemID = "item: 99";

    @Rule
    public ActivityScenarioRule<LongListActivity> rule =
            new ActivityScenarioRule<>(LongListActivity.class);

    @Test
    public void lastItemNotDisplayed() {
        onView(withText(lastItemID))
                .check(doesNotExist());
    }

}
