package ru.netology.stats;

public class StatsService {
    long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    double averageSales(long[] sales) {
        return (double)sumSales(sales) / sales.length;
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
        long count = 0;
        for (long sale : sales)
            if (sale < average - 0.001)
                ++count;
        return count;
    }

    long countMonthsWithSaleOverAverage(long[] sales) {
        double average = averageSales(sales);
        //0.001 - comparison accuracy
        long count = 0;
        for (long sale : sales)
            if (sale > average + 0.001)
                ++count;
        return count;
    }
}
