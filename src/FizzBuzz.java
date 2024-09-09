/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) { // like the main part of python, or just a regular python file

        for (int i = 1; i < 100; i++) { // i++ is similar to i += 1 in Python

            doFizzBuzz(i);
        }

        int i = 1;
        while (i < 100)
        {
            i++;
            // Find out which numbers divide i.
            doFizzBuzz(i);
        }
    }

    private static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { // && is equivalent to AND, if structure is the same

            System.out.println("Fizz Buzz");
            // System.out.println("Fizz Buzz"); is equivalent to print(a + '\n') for some string, a in Python

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
