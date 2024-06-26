import java.util.Scanner;



class MaxPairwiseProd
{
    static long getMaxPairwiseProd(int[] numbers)
    {
        int max1, max2;

        max1 = max2 = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max1) {
                max2 = max1;
                max1 = numbers[i];
            }
            else if (numbers[i] > max2) max2 = numbers[i];
        }

        return (long) max1 * max2;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = scanner.nextInt();
        
        System.out.println(getMaxPairwiseProd(numbers));
    }
}
