public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        ///Task4 ();
        ///Task5 ();
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
        float pr1st = totalPaper / totalStudents;
        System.out.println(pr1st);
    }
}
