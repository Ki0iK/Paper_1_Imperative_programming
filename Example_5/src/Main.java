public class Main {
    public static void main(String[] args)
    {
        for (int x = 9; x < 66; x = x + 4)
            System.out.print(x + " "); // take ln away to have all on the same line

        System.out.println(); // empty sout to print an empty line between codes
        int n = 1; // what is the order of number printed now
        for (int y = 3; n <= 13;y = y * 2)
        {
            System.out.print(y + " ");
            n = n + 1;
        }

        System.out.println();
        for (int z = 1; z <= 40; z = z + 1)
        {
            int val;
            if (z % 4 == 0)
                val = -1;
            else
                val = z;
            System.out.print(val + " ");
        }
    }
}