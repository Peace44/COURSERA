#include <iostream>
#include <vector>



long long MaxPairwiseProduct(const std::vector<int>& numbers)
{
    long long result;

    int max1_index = 0;
    for (int i = max1_index + 1; i < numbers.size(); i++) 
      if (numbers[i] > numbers[max1_index]) 
        max1_index = i; 
    result = (long long) numbers[max1_index];

    int max2_index = max1_index == 0 ? 1 : 0;
    for (int i = max2_index + 1; i < numbers.size(); i++) 
      if (i != max1_index && numbers[i] > numbers[max2_index]) 
        max2_index = i;
    result *= (long long) numbers[max2_index];

    return result;
}



int main()
{
    int n;
    std::cin >> n;

    std::vector<int> numbers(n);
    for (int i = 0; i < n; i++) std::cin >> numbers[i];
    
    std::cout << MaxPairwiseProduct(numbers) << std::endl;
}
