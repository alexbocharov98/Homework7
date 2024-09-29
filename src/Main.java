public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");

        int money = 15000;
        int total = 0;
        int month = 0;
        double percent = 10 / 100;
        while (total < 2459000) {
            total = total + total / 100;
            total = total + money;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        //task2
        System.out.println("task2");

        int score = 0;
        while (score < 10) {
            score = score + 1;
            System.out.print(score + " ");
        }
        System.out.println();

        for (score = 10; score > 0; score = score - 1) {
            System.out.print(score + " ");
        }
        //task3
        System.out.println("task3");

        int population = 12_000_000;
        int year = 0;
        int birthRate = population / 1000 * 17;
        int mortality = population / 1000 * 8;
        while (year < 10) {
            population = population + birthRate - mortality;
            year = year + 1;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //task4
        System.out.println("task4");

        int capital = 15000;
        int month1 = 0;
        while (capital < 12_000_000) {
            capital = capital + (capital * 7) / 100;
            month1 = month1 + 1;
            System.out.println("Месяц " + month1 + " сумма накоплений равна " + capital);
        }
        //task5
        System.out.println("task5");

        int capital1 = 15000;
        int month11 = 0;
        while (capital1 < 12_000_000) {
            capital1 += (capital1 * 7) / 100;
            month11 += 1;
            if (month11 % 6 == 0) {
                System.out.println("Месяц " + month11 + " сумма накоплений равна " + capital1);
            }
        }

        //task6
        System.out.println("task6");

        int capital2 = 15000;
        int month3 = 0;
        while (month3 < 108) {
            capital2 += (capital2 * 7) / 100;
            month3 = month3 + 1;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + capital2);
            }
        }

        //task7
        System.out.println("task7");

        int firstFriday = 6;
        for (int j = firstFriday; j <= 31; j += 7) ;
        {
            System.out.println("Сегодня пятница, " + j + "-е число. Необходимо подготовить отчет");
        }

        //task8
        System.out.println("task8");

        int period = 79;
        int yearSeeing = 0;
        int start = 2024 - 200;
        int end = 2024 + 100;
        for (int year2 = yearSeeing; year2 < end; year2 += period) {
            if (year2 > start) {
                System.out.println(year2);
            }
        }
    }
}



