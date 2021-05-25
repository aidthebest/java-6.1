package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
   @Test
    void minMonth (){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;

        long actual = service.minSales(sales);

        assertEquals (expected, actual);

    }

    @Test
    void salesSum () {
       StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;

        long actual = service.salesSum (sales);

        assertEquals (expected, actual);
    }

    @Test
    void averageSum () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected =15;

        long actual = service.averageSum (sales);

        assertEquals (expected, actual);
    }

    @Test
    void maxMonth () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;

        long actual = service.maxMonth(sales);

        assertEquals (expected, actual);
   }

   @Test
    void aboveAvarage () {
       StatsService service = new StatsService();

       long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

       long expected = 5;

       long actual = service.aboveAvarage(sales);

       assertEquals (expected, actual);

   }

    @Test
    void bellowAvarage () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;

        long actual = service.bellowAvarage(sales);

        assertEquals (expected, actual);

    }
}
