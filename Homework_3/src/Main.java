public class Main {
    public static void main(String[] args)
    {
        for (int x = 10; x < 38; x = x + 3)
            System.out.print(x + " ");
        System.out.println();

        for (int y = 998; y > 899; y = y - 2)
            System.out.print(y + " ");
        System.out.println();

        for (int z = 1; z <= 20; z = z + 1)
        {
            int val;
            if (z % 2 == 0)
                val = -1;
            else
                val = 1;
            System.out.print(val + ", ");
        }
        System.out.println();

        for (int w = 1; w <= 60; w = w + 1)
        {
            int value;
            if (w % 3 == 0)
                value = 9;
            else
                value = 7;
            System.out.print(value + " ");
        }
    }
}