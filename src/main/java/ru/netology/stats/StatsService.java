package ru.netology.stats;

import java.util.function.LongPredicate;
import java.util.stream.LongStream;

public class StatsService {
    long sumSales(long[] sales) {
        return LongStream.of(sales).sum();
    }

    double averageSales(long[] sales) {
        return LongStream.of(sales).average().getAsDouble();
    }

    /**
     * @return - number (not index) of last month with max sale
     */
    long numberOfLastMonthWithMaxSale(long[] sales) {
        long maxValue = sales[0];
        long indexMax = 0;
        for (int i = 0; i < sales.length; ++i) {
            if (maxValue <= sales[i]){
                maxValue = sales[i];
                indexMax = i;
            }
        }
        return indexMax + 1;
    }

    /**
     * @return - number (not index) of last month with min sale
     */
    long numberOfLastMonthWithMinSale(long[] sales) {
        long minValue = sales[0];
        long indexMin = 0;
        for (int i = 0; i < sales.length; ++i) {
            if (minValue >= sales[i]){
                minValue = sales[i];
                indexMin = i;
            }
        }
        return indexMin + 1;
    }

    long countMonthsWithSaleUnderAverage(long[] sales) {
        double average = averageSales(sales);
        //0.001 - comparison accuracy
        return LongStream.of(sales).filter(sale -> sale < average - 0.001).count();
    }

    long countMonthsWithSaleOverAverage(long[] sales) {
        double average = averageSales(sales);
        //0.001 - comparison accuracy
        return LongStream.of(sales).filter(sale -> sale > average + 0.001).count();
    }
}
