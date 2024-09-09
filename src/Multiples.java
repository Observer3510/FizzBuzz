public class Multiples {
    public static void main(String[] args) {
        int three_multiple = 0;
        int five_multiple = 0;

        for (int i = 1; i < 1000; i++)
        {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3)
            {
                three_multiple++;
            }
            else if (divisibleBy5)
            {
                five_multiple++;
            }
        }
        System.out.println("3: " + three_multiple);
        System.out.println("5: " + five_multiple);
    }
}
