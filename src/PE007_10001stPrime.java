public class PE007_10001stPrime
{
    public static void main(String[] args)
    {
        boolean[] primes = sieveOfEratosthenes(10000);

        int index = 10;
        int primeCount = 0;
        int primeN = 0;
        int i = 2;
        while(primeCount < index)
        {
            if(primes[i] == true)
            {
                primeN = i;
                primeCount++;
            }

            i++;
        }

        System.out.println(primeN);
    }

    private static boolean[] sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean primes[] = new boolean[n + 1];
        for(int i = 0; i < n; i++) primes[i] = true;

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

    private static boolean isPrime(int n)
    {
        if(n == 1 || n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if(n % i == 0) return false;
        }

        return true;
    }
}

// SOLVED //