public class Main {
    public static void main(String[] args)
    {
        int A = 111, B = 50;
        if (A >= 100 && B <= 50)
            System.out.println(1);
        else
            System.out.println(0);

        int C = 50, D = 99;
        if (C >= 100 && D <= 50 || D >= 100 && C <= 50)
            System.out.println(1);
        else
            System.out.println(0);
    }
}