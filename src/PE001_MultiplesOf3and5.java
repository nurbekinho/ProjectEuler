import java.util.Scanner;

public class PE001_MultiplesOf3and5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();

            long a = (n - 1) / 3;
            long b = (n - 1) / 5;
            long d = (n - 1) / 15;

            System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * d * (d + 1) / 2);
        }

        in.close();
    }
}

// SOLVED //