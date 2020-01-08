import java.util.Scanner;

public class PE008_LargestProductInSeries
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();

            System.out.println(getLargestProduct(n, k, num));
        }

        in.close();
    }

    private static long getLargestProduct(int n, int k, String num)
    {
        long max = 0;

        for(int i = 0; i <= n - k; i++)
        {
            String sub = num.substring(i, i + k);
            if(sub.contains("0")) continue;

            long product = 1;
            for(int j = 0; j < sub.length(); j++)
            {
                product *= Integer.parseInt(Character.toString(sub.charAt(j)));
            }

            max = Math.max(max, product);
        }

        return max;
    }
}

// SOLVED //