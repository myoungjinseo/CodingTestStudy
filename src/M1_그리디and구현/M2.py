# 큰 수의 법칙
# 배열로 만들 수 있는 가장 큰 수 구하기
# 입력 예시 5 8 3 \n 2 4 5 4 6
# 출력 예시 46

# n,m,k = map(int, input().split())
# data = list(map(int, input().split()))

# data.sort()
# first = data[n - 1]
# second = data[n - 2]

# result = 0

# while True:
#     for i in range(k):
#         if m == 0:
#             break
#         result += first
#         m -= 1
#     if m == 0:
#         break
#     result += second
#     m -= 1

# print(result)

# 시간 복잡도를 고려한 풀이 과정(수식)

n, m, k = map(int, input().split())
data = list(map(int, input().split()))

data.sort()
first = data[n - 1]
second = data[n - 2]

result = 0

x = int(m / (k + 1)) * k
x += m % (k + 1)
result += x * first
result += (m-x) * second

print(result)