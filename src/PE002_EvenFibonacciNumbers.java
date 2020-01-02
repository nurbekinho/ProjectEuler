public class PE002_EvenFibonacciNumbers
{
    public static void main(String[] args)
    {
        int n = 10;

        long a = 1;
        long b = 2;
        long c = a + b;

        long total = 2;

        while(c < n)
        {
            if(c % 2 == 0) total += c;

            a = b;
            b = c;
            c = a + b;
        }

        System.out.println(total);
    }
}

// SOLVED //