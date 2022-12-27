public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5();
        ///Task6 ();
        ///Task7 ();
        ///Task8 ();
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
        System.out.println(howClasR);
        byte Color = (byte) (onePlaceWhite * howClasR);
        byte Color2 = (byte) (onePlaceBrown * howClasR);
        System.out.println(" В школе, где " + howClasR + " классов нужно " + Color + " Банок белой краски и " + Color2 + " Банок коричневой краски");
    }
}
