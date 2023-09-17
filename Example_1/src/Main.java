public class Main {
    public static void main(String[] args)
    {
        int a = 13, b = 21;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("the divison is: " + (a - b));
        System.out.println(a / b); // the result will be zero b/c 21 fits into 13 zero times
        System.out.println((3*a) % (2*b)); // parentheses to be sure of the laskujärjestys

        boolean what = a < b; // is it true or false
        System.out.println(what);
    }
}