import java.util.Arrays;

public class PE010_SummationOfPrimes
{
    public static void main(String[] args)
    {
        boolean[] sieve = sieveOfEratosthenes(1000000);
        long[] summationOfPrimes = new long[1000000];

        long sum = 0;
        for(int i = 2; i < summationOfPrimes.length; i++)
        {
            if(sieve[i]) sum += i;
            summationOfPrimes[i] = sum;
        }

        int n = 5;
        System.out.println(summationOfPrimes[n]);
    }

    private static boolean[] sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean primes[] = new boolean[n + 1];
        for(int i = 0; i <= n; i++) primes[i] = true;

        for(int p = 2; p * p <= n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(primes[p] == true)
            {
                // Update all multiples of p
                for(int i = p * 2; i <= n; i += p) primes[i] = false;
            }
        }

        return primes;
    }
}

// SOLVED //