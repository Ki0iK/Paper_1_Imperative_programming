public class Main {
    public static void main(String[] args)
    {
        int mark = 92, grade;
        if (mark >= 90) // if mark is 90 or more the grade will be 10
            grade = 10;
        else if (mark >= 70) // if mark 70 or more but less than 90 -> grade 9
            grade = 9;
        else // if mark under 70 -> grade 8
            grade = 8;

        System.out.println(grade);
    }
}