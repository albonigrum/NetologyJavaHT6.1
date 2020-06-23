package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    final long[] TEST_ARRAY = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumSales() {
        StatsService statsService = new StatsService();
        assertEquals(180, statsService.sumSales(TEST_ARRAY));
    }

    @Test
    void averageSales() {
        StatsService statsService = new StatsService();
        assertEquals(15D, statsService.averageSales(TEST_ARRAY));
    }

    @Test
    void numberOfLastMonthWithMaxSale() {
        StatsService statsService = new StatsService();
        assertEquals(8, statsService.numberOfLastMonthWithMaxSale(TEST_ARRAY));
    }

    @Test
    void numberOfLastMonthWithMinSale() {
        StatsService statsService = new StatsService();
        assertEquals(9, statsService.numberOfLastMonthWithMinSale(TEST_ARRAY));
    }

    @Test
    void countMonthsWithSaleUnderAverage() {
        StatsService statsService = new StatsService();
        assertEquals(5, statsService.countMonthsWithSaleUnderAverage(TEST_ARRAY));
    }

    @Test
    void countMonthsWithSaleOverAverage() {
        StatsService statsService = new StatsService();
        assertEquals(5, statsService.countMonthsWithSaleOverAverage(TEST_ARRAY));
    }
}