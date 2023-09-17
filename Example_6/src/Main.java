public class Main {
    public static void main(String[] args)
    {
        int largest = 0, smallest = 0;

        for (int n = 1; n<=50; n = n + 1)
        {
            int val = n * (n - 30) * (n - 50);
            if (val > largest)
                largest = val;
            if (val < smallest)
                smallest = val;
        }
        System.out.println("smallest: " + smallest + ", largest: " + largest);
    }
}