
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameThisClass {
    public void run() {
        for (int e = 1; e <= 100; e++)
        {
            if (e/3.0 == e/3) {
                System.out.println("Fizz");
            } else if (e/5.0 == e/5) {
                System.out.println("Buzz");
            } else if (e/3.0 == e/3 && e/5.0 == e/5) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args)
    {
        RenameThisClass hw = new RenameThisClass();
        hw.run();
    }
}
