def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    return gcd(b, a % b)



def lcm(a,b):
    return abs(a * b)//gcd(a, b)



if __name__ == "__main__":
    a, b = map(int, input().split())
    print(lcm(a,b))