import java.util.Scanner;



class MaxPairwiseProd
{
    static long getMaxPairwiseProd(int[] numbers)
    {
        long result;

        int max1_index = 0;
        for (int i = max1_index + 1; i < numbers.length; i++)
            if (numbers[i] > numbers[max1_index])
                max1_index = i;
        result = (long) numbers[max1_index];

        int max2_index = max1_index == 0 ? 1 : 0;
        for (int i = max2_index + 1; i < numbers.length; i++)
            if (i != max1_index && numbers[i] > numbers[max2_index])
                max2_index = i;
        result *= (long) numbers[max2_index];

        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextInt();
        
        System.out.println(getMaxPairwiseProd(numbers));
    }
}
