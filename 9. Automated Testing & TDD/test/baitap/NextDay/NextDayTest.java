package baitap.NextDay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {
    @Test
    @DisplayName("Testing 1/1/2018")
    void findNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        String expected = "2/1/2018";
        assertEquals(expected, NextDay.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("Testing 31/1/2018")
    void findNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;

        String expected = "1/2/2018";
        assertEquals(expected, NextDay.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("Testing 30/4/2018")
    void findNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;

        String expected = "1/5/2018";
        assertEquals(expected, NextDay.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("Testing 28/2/2018")
    void findNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;

        String expected = "1/3/2018";
        assertEquals(expected, NextDay.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("Testing 29/2/2020")
    void findNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;

        String expected = "1/3/2020";
        assertEquals(expected, NextDay.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("Testing 31/12/2018")
    void findNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;

        String expected = "1/1/2019";
        assertEquals(expected, NextDay.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("Testing 30/2/2018")
    void findNextDay7() {
        int day = 30;
        int month = 2;
        int year = 2018;

        String expected = "Don't have this day !!!";
        assertEquals(expected, NextDay.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("Testing 31/4/2018")
    void findNextDay8() {
        int day = 31;
        int month = 4;
        int year = 2018;

        String expected = "Out of range !!!";
        assertEquals(expected, NextDay.findNextDay(day, month, year));
    }
}