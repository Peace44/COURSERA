import java.util.Scanner;



class LCM 
{
    static long gcd(long a, long b)
    {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static long lcm(long a, long b)
    {
        return Math.abs(a * b)/gcd(a, b);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(lcm(a, b));
    }
}
