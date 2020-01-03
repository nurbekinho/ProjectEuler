public class PE003_LargestPrimeFactor
{
    public static void main(String[] args)
    {
        int n = 17;

        long largest = 1;

        if(n % 2 == 0)
        {
            largest = 2;
            while(n % 2 == 0) n /= 2;
        }

        for(int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if(n % i == 0)
            {
                largest = i;
                n /= i;

                i -= 2;
            }
        }

        System.out.println(n > 1 ? n : largest);
    }
}

// SOLVED //