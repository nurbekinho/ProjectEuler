public class PE004_LargestPalindromeProduct
{
    public static void main(String[] args)
    {
        //int n = 101110;
        int n = 800000;

        for(int i = n / 1000; i >= 100; i--)
        {
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            int p = Integer.parseInt(Integer.toString(i) + sb.reverse());

            if(isProductOf3Digits(p) && p < n)
            {
                System.out.println(p);
                break;
            }
        }
    }

    private static boolean isProductOf3Digits(int p)
    {
        for(int i = 100; i <= 999; i++)
        {
            if(p % i == 0 && p / i >= 100 && p / i <= 999)
            {
                //System.out.println(i + " * " + p / i + " = " + p);
                return true;
            }
        }

        return false;
    }
}

// SOLVED //