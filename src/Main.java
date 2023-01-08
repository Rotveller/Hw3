public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1 () {
        int one = 1;
        System.out.println(" Значение переменной one " + " с типом int " + "равно " + one);
        byte two = 2;
        System.out.println(" Значение переменной two " + " с типом byte " + "равно " + two);
        short three = 3;
        System.out.println(" Значение переменной three " + " с типом short " + "равно " + three);
        long four = 41559250L;
        System.out.println(" Значение переменной four " + " с типом long " + "равно " + four);
        float five = 3.75f;
        System.out.println(" Значение переменной five " + " с типом float " + "равно " + five);
        double six = 3.75343435;
        System.out.println(" Значение переменной six " + " с типом double " + "равно " + six);
    }
    public static void task2 () {
        short one = 27897;
        short two = -159;
        short three = 569;
        long four = 987678965549L;
        float five = 27.12f;
        float six = 2.786f;
    }
    public static void task3 () {
        byte oneClass = 23;
        byte twoClass = 27;
        byte threeClass = 30;
        short totalPaper = 480;
        byte totalStudents = (byte) (oneClass + twoClass + threeClass);
        byte pr1st = (byte) (totalPaper / totalStudents);
        System.out.println(" На каждого ученика рассчитано " + pr1st + " листов бумаги ");
    }
    public static void task4 () {
        byte mB = 16;
        short twentyMin = (short) (mB * 20/2);
        System.out.println(" За 20 минут машина произвела " + twentyMin + " штук бутылок ");
        short oneDay = 24 * 60 / 2 * 16;
        System.out.println(" За сутки машина произвела " + oneDay + " штук бутылок ");
        int threeDays = oneDay * 3;
        System.out.println(" За 3 дня машина произвела " + oneDay + " штук бутылок ");
        int thirtyDays = threeDays * 10;
        System.out.println(" За месяц машина произвела " + threeDays + " штук бутылок ");
    }
    public static void task5 () {
        byte fullSc = 120;
        byte onePlaceWhite = 2;
        byte onePlaceBrown = 4;
        byte howClasR = (byte) (fullSc / (onePlaceWhite+onePlaceBrown));
        System.out.println(" В школе " + howClasR + " классов ");
        byte Color = (byte) (onePlaceWhite * howClasR);
        byte Color2 = (byte) (onePlaceBrown * howClasR);
        System.out.println(" В школе, где " + howClasR + " классов нужно " + Color + " Банок белой краски и " + Color2 + " Банок коричневой краски");
    }
    public static void task6 () {
        byte banansgr = 80;
        byte milksgr = 105;
        byte  icecreamgr = 100;
        byte  egsgr = 70;
        short  breakfast = (short) (banansgr*5 + milksgr*2 + icecreamgr*2 + egsgr *4);
        float breakfastkg = (breakfast/1000f);
        System.out.println(" Столько киллограм продуктов съест спортсмен за утро = "+ breakfastkg + " кг! ");
    }
    public static void task7 () {
        byte totalWeightKg  = 7;
        short totalWeightGr = (short) (totalWeightKg * 1000);
        short firstWay = 250;
        short secondWay = 500;
        byte totalDayF = (byte) (totalWeightGr / firstWay);
        System.out.println("Столько дней понадобится спортсмену при первом способе похудения = " + totalDayF + " дней");
        byte totalDayS = (byte) (totalWeightGr / secondWay);
        System.out.println("Столько дней понадобится спортсмену при втором способе похудения = " + totalDayS + " дней");
        byte averageDays = (byte) ((totalDayS+totalDayF)/2);
        System.out.println("Столько дней в среднем понадобится спортсмену при обоих способах похудения = " + averageDays + " день");
    }
    public static void task8 () {
        int wageMashi  = 67760;
        int totalYearWageMF = wageMashi * 12;
        Float wageIncreaseM = wageMashi * 1.1f;
        int totalYearWageMDop = (int) (wageIncreaseM * 12);
        int differenceWageOfYearM = totalYearWageMDop - totalYearWageMF;
        System.out.println(" Маша теперь получает = " +
                wageIncreaseM + " рублей. " + " Годовой доход вырос на " + differenceWageOfYearM + " рублей! ");
        int wageDenis  = 83690;
        int totalYearWageDF = wageDenis * 12;
        Float wageIncreaseD = wageDenis * 1.1f;
        int totalYearWageDDop = (int) (wageIncreaseD * 12);
        int differenceWageOfYearD = totalYearWageDDop - totalYearWageDF;
        System.out.println(" Денис теперь получает = " +
                wageIncreaseD + " рублей. " + " Годовой доход вырос на " + differenceWageOfYearD + " рублей! ");
        int wageKristina  = 76230;
        int totalYearWageKF = wageKristina * 12;
        Float wageIncreaseK = wageKristina * 1.1f;
        int totalYearWageKDop = (int) (wageIncreaseK * 12);
        int differenceWageOfYearK = totalYearWageKDop - totalYearWageKF;
        System.out.println(" Кристина теперь получает = " +
                wageIncreaseK + " рублей. " + " Годовой доход вырос на " + differenceWageOfYearK + " рублей! ");
    }
}

