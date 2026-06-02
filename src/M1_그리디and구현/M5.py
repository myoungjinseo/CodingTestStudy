# 상하좌우
# 1,1에서 상하좌우를 받아 해당 좌표를 구하는 문제
# 입력 예시
# 5
# R R R U D D
# 출력 예시 
# 3 4

n = int(input())

plans = input().split()

x,y = 1,1

plan_type = ['R','L','D','U']
dx = [1,-1,0,0]
dy = [0,0,1,-1]

for plan in plans:
    for i in range(len(plan_type)):
        if plan == plan_type[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    if nx < 1 or nx > n or ny < 1 or ny > n:
        continue
    x,y = nx,ny

print(x,y)