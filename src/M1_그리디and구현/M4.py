# 1이 될 떄까지
# n - 1을 빼고 n을 k로 나눌 때 최소 횟수
# 입력 예시
# 25 5
# 출력 예시 
# 2

n,k = map(int,input().split())

result = 0
while True:
    target = (n // k) * k
    result += (n - target)
    n = target
    if n < k:
        break
    result += 1
    n //= k

result += (n - 1)

print(result)