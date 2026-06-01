# 거스름돈
# 가장 큰 단위의 화폐부터 차례대로 거슬러 주면 된다.
# 화폐 단위는 500, 100, 50, 10원

n = 1260
count = 0

coin_types = [500,100,50,10]

for coin in coin_types:
    count += n // coin
    n %= coin

print(count)