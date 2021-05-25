package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long salesSum(long[] sales) {

        long salesSum = 0;

        for (long sale : sales) {

            salesSum += sale;

        }

        return salesSum;
    }

    public long averageSum(long[] sales) {

        long averageSum = 0;

        for (long sale : sales) {

            averageSum += sale ;

        }
        averageSum = averageSum / (sales.length);

        return averageSum;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long aboveAvarage (long[] sales) {
//        long aboveAvarageMonth = 0;
//        long month = 0;
        long averageSum = 0;

        for (long sale : sales) {

            averageSum += sale ;

        }
        averageSum = averageSum / (sales.length);

        long months = 0;
        for (long sale : sales) {
            if (sale > averageSum)
                months = months + 1;
        }
        return months;
    }


    public long bellowAvarage (long[] sales) {
//
        long averageSum = 0;

        for (long sale : sales) {

            averageSum += sale ;

        }
        averageSum = averageSum / (sales.length);

        long months = 0;
        for (long sale : sales) {
            if (sale < averageSum)
                months = months + 1;
        }
        return months;
    }
}
