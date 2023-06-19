import sys
input = sys.stdin.readline

N = int(input())
arr = []
for i in range(N):
    x,y = list(map(int,input().split()))
    arr.append([x,y])

arr.sort(key = lambda x:(x[1], x[0]))
for i in range(N):
    print(arr[i][0], arr[i][1])