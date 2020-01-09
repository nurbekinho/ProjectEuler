import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PE009_SpecialPythagoreanTriplet
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            long maxProduct = -1;
            int n = in.nextInt();

            if(n % 2 == 0)
            {
                Set<Integer> bs = new HashSet();

                for(int a = 1; a <= n / 3; a++)
                {
                    if(bs.contains(a)) break;

                    int b = (n * n - 2 * n * a)/(2 * n - 2 * a);
                    int c = n - a - b;

                    if(b > c) break;

                    if(a * a + b * b == c * c)
                    {
                        bs.add(b);

                        long product = a * b * c;
                        maxProduct = Math.max(maxProduct, product);

                        System.out.println(product);
                    }
                }
            }

            System.out.println(maxProduct);
        }

        in.close();
    }
}

// SOLVED //