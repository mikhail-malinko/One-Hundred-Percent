package ru.netology.percent.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxWhenInTheMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 15, 8, 6, 11, 11, 12};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxWhenAtTheEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 15, 8, 6, 11, 11, 17};
        long expected = 17;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxOfNegativeReturns() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-12, -5, -8, -4, -5, -15, -8, -6, -11, -11, -17};
        long expected = -4;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}