N = int(input())
arr = []
for i in range(N):
    [y,x] = (map(int, input().split()))
    arr.append([x,y])
    
arr.sort()
for i in range(N):
    print(arr[i][1], arr[i][0])
    