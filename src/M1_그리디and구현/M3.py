# 숫자 카드 게임
# 행에 가장 큰 쇠소값 구하는 문제
# 입력 예시 
# 3 3
# 3 1 2 
# 4 1 4 
# 2 2 2
# 출력 예시
# 2

n,m = map(int, input().split())

result = 0
for i in range(n):
    data = list(map(int, input().split()))
    min_value = min(data)
    result = max(result, min_value)

print(result)