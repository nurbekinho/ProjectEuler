public class PE005_SmallestMultiple
{
    public static void main(String[] args)
    {
        int n = 10;

        int m = 1;

        for(int i = 2; i <= n; i++)
        {
            m = LCM(m, i);
        }

        System.out.println(m);
    }

    static int GCD(int a, int b)
    {
        return b == 0 ? a : GCD(b, a % b);
    }

    static int LCM(int a, int b)
    {
        return a * (b / GCD(a, b));
    }
}

// SOLVED //