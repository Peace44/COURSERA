def max_pairwise_product(numbers):
    max1 = max2 = 0
    for i in range(len(numbers)):
        if numbers[i] > max1:
            max2 = max1
            max1 = numbers[i]
        elif numbers[i] > max2: 
            max2 = numbers[i]

    return max1 * max2



if __name__ == "__main__":
    n = int(input())
    numbers = list(map(int, input().split()))
    print(max_pairwise_product(numbers))
