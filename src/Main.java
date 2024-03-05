public class Main {
    public static void main(String[] args) {
        //Задача 1
        int i = 128;
        System.out.println("Значение переменной i с типом int равно " + i);
        byte b = 5;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 15000;
        System.out.println("Значение переменной s с типом short равно " + s);
        long l = 23456789L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 5.9f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 3.1419342234234234234234234;
        System.out.println("Значение переменной d с типом double равно " + d);

        //Задача 2

        float ff = 27.12f;
        long ll = 987678965549L;
        float ff2 = 2.786f;
        short ss = 569;
        short ss2 = -159;
        int ii = 27897;
        byte bb = 67;

        //Задача 3

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short sheetsOfPaper = 480;
        int result = sheetsOfPaper / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

        //Задача 4

        byte performance = 16 / 2;
        int perfTwentyMinutes = performance * 20;
        int perfDay = performance * 60 * 24;
        int threePerfDay = 3 * perfDay;
        int perfMonth = 30 * perfDay;
        System.out.println("За 20 минут машина произвела " + perfTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + perfDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threePerfDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + perfMonth + " штук бутылок");

        //Задача 5

        byte whiteJar = 2;
        byte brownJar = 4;
        int rooms = 120 / (whiteJar + brownJar);
        int whiteJars = whiteJar * rooms;
        int brownJars = brownJar * rooms;
        System.out.println("В школе, где " + rooms + " классов, нужно " + whiteJars +
                " банок белой краски и " + brownJars + " банок коричневой краски");

        //Задача 6

        byte bCount = 5;
        byte mCount = 2;
        byte iCount = 2;
        byte eCount = 4;
        int bananaWeightGram = bCount * 80;
        int milkWeightGram = mCount * 105;
        int iceCreamWeightGram = iCount * 100;
        int eggsWeightGram = eCount * 70;
        int weightGram = bananaWeightGram + milkWeightGram +
                iceCreamWeightGram + eggsWeightGram;
        float weightKilogram = weightGram / 1000f;
        System.out.println("Вес спортзавтрака в граммах равно " + weightGram);
        System.out.println("Вес спортзавтрака в килограммах равно " + weightKilogram);

        //Задача 7

        short weightLoss = 7 * 1000;
        int minLoss = weightLoss / 250;
        int maxLoss = weightLoss / 500;
        int middleLoss = (minLoss + maxLoss) / 2;
        System.out.println("Спортсмен похудеет за " + minLoss + " дней, если будет худеть на 250 грамм в день");
        System.out.println("Или");
        System.out.println("Спортсмен похудеет за " + maxLoss + " дней, если будет худеть на 500 грамм в день");
        System.out.println("В среднем oн похудеет за " + middleLoss + " дней");

        //Задача 8

        long mashaSalary = 67670L;
        long denisSalary = 83690L;
        long kristinaSalary = 76230L;
        float increaseMasha = mashaSalary * 0.1f;
        float increaseDenis = denisSalary * 0.1f;
        float increaseKristina = kristinaSalary * 0.1f;

        long annualIncomeMasha = 12 * mashaSalary;
        long annualIncomeDenis = 12 * denisSalary;
        long annualIncomeKristina = 12 * kristinaSalary;

        mashaSalary += increaseMasha;
        denisSalary += increaseDenis;
        kristinaSalary += increaseKristina;

        long annualIncomeMashaNew = 12 * mashaSalary;
        long annualIncomeDenisNew = 12 * denisSalary;
        long annualIncomeKristinaNew = 12 * kristinaSalary;

        long diffPerMasha = annualIncomeMashaNew - annualIncomeMasha;
        long diffPerDenis = annualIncomeDenisNew - annualIncomeDenis;
        long diffPerKristina = annualIncomeKristinaNew - annualIncomeKristina;

        System.out.println("Маша теперь получает " + mashaSalary + " рублей." +
                " Годовой доход вырос на " + diffPerMasha + " рублей");
        System.out.println("Денис теперь получает " + denisSalary + " рублей." +
                " Годовой доход вырос на " + diffPerDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalary + " рублей." +
                " Годовой доход вырос на " + diffPerKristina + " рублей");

    }
}