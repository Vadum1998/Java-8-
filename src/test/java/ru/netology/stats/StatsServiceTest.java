package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calScum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.CalScum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void сalcAverSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        double actual = service.сalcAverSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calcMaxMont() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        double actual = service.calcMaxMont(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calcMinMont() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        double actual = service.calcMinMont(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calcCountUnAver() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        double actual = service.calcCountUnAver(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calcCountUpAver() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        double actual = service.calcCountUpAver(sales);

        assertEquals(expected, actual);
    }
}
