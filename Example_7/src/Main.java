public class Main {
    public static void main(String[] args)
    {
        final int S = 10000;
        int n = 1; // smallest starting value
        boolean found = false; // typical boolean name for this kind of code

        while (found == false)
        {
            if (n * (n + 1) / 2 > S)
                found = true;
            else
                n = n + 1;
        }
        System.out.println(n);
    }
}