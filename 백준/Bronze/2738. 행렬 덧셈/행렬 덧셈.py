arr1, arr2 = [],[]

N, M = map(int, input().split())
for i in range(N):
    arr1.append(list(map(int,input().split())))
for i in range(N):
    arr2.append(list(map(int,input().split())))

for i in range(N):
    for j in range(M):
        print(arr1[i][j] + arr2[i][j], end = ' ')
    print() 