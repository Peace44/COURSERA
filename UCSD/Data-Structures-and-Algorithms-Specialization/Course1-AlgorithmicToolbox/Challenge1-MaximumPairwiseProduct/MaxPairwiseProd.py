def max_pairwise_product(numbers):
    max1_index = 0
    for i in range(max1_index + 1, len(numbers)):
        if numbers[i] > numbers[max1_index]:
            max1_index = i
    result = numbers[max1_index]

    max2_index = 1 if max1_index == 0 else 0
    for i in range(max2_index + 1, len(numbers)):
        if i != max1_index and numbers[i] > numbers[max2_index]:
            max2_index = i
    result *= numbers[max2_index]

    return result



if __name__ == "__main__":
    n = int(input())
    numbers = list(map(int, input().split()))
    print(max_pairwise_product(numbers))
