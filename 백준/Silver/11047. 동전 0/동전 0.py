N,K = map(int,input().split())
list = []
for i in range(N):
    list.append(int(input()))

cnt = 0
list.sort(reverse=True)

for i in list:
    cnt += K // i
    K = K % i
print(cnt)
    