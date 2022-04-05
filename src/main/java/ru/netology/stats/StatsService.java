package ru.netology.stats;

public class StatsService {

    public int CalScum(int[] sales) { //Сумма всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public double сalcAverSum(int[] month) { //Средняя сумма продаж в месяц
        double sum = CalScum(month);
        double averSum = sum / month.length;
        return averSum;
    }

    public int calcMaxMont(int[] month) { // Месяц пик продаж
        int maxMont = 0;
        for (int i = 1; i < month.length; i++) {
            if (month[maxMont] <= month[i]) {
                maxMont = i;
            }
        }
        maxMont = maxMont + 1;
        return maxMont;
    }

    public int calcMinMont(int[] month) { // Месяц мин продаж
        int minMont = 0;
        for (int i = 1; i < month.length; i++) {
            if (month[minMont] >= month[i]) {
                minMont = i;
            }
        }
        minMont = minMont + 1;
        return minMont;
    }

    public int calcCountUnAver(int[] month) { //Количество месяцев продажи ниже среднего
        int count = 0;
        double averSum = сalcAverSum(month);
        for (int months : month) {
            if (months < averSum) {
                count = count + 1;

            }
        }
        return count;
    }

    public int calcCountUpAver(int[] month) { // Месяцы выше среднего
        int count = 0;
        double averSum = сalcAverSum(month);
        for (int months : month) {
            if (months > averSum) {
                count = count + 1;

            }
        }
        return count;
    }
}











