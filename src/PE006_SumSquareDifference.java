public class PE006_SumSquareDifference
{
    public static void main(String[] args)
    {
        int n = 10;

        long result = (long) Math.pow(n * (n + 1) / 2, 2);

        for(int i = 1; i <= n; i++) result -= i * i;

        System.out.println(result);
    }
}

// SOLVED //