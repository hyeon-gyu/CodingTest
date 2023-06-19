N = int(input())
arr = []
for i in range(N):
    ans = list(map(int, input().split()))
    arr.append(ans)

arr.sort()
for i in range(N):
    print(arr[i][0], arr[i][1])

    