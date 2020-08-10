public class HW_1 {
    public static void main(String[] args) {
        byte a = 100;
        short b = 1000;
        int c = 10000;
        long d = 100000;
        float e = 2.5f;
        double f = 3.56765;
        char g = '\u1234';
        boolean h = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        System.out.println(calc(2.5f, 3.5f, 4.5f, 5.5f));
        System.out.println(summ(7,2));
        plusMinus(-2);
        System.out.println(plusMinus2(2));
        name("Oleg");
        visokosniyYear(2020);

    }

    public static float calc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    public static boolean summ(int a, int b)
    {
        return a + b >= 10 && a + b <= 20;
    }
    public static void plusMinus(int a)
    {
        if (a>=0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }
    public static boolean plusMinus2(int a)
    {
        return a < 0;
    }
    public static void name(String a)
    {
        System.out.println("Привет, " + a + "!");
    }
    public static void visokosniyYear(int a)
    {

        if (a % 4 == 0 && a % 100 !=0 || a % 400 == 0)
        {
            System.out.println("Год високосный");
        }
        else
        {
            System.out.println("Год не високосный");
        }

    }
}