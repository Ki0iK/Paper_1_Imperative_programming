public class Main {
    public static void main(String[] args)
    {
        int n = 4;
        int fact = 1; // the end result, the factorial
        int i = 1; // current number being multiplied in

        while (i <= n) { // making a block
            fact = fact * i; // update the factorial, multiply i into factorial and store into the factorial
            i = i + 1; // (i++) increase the value of i by one
        }
        System.out.println(fact);
    }
}