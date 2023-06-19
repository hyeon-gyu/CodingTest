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



#두번째 방법(y,x 좌표를 바꿔서 생각하고 정렬하기)
N = int(input())
arr = []
for i in range(N):
    [x,y] = map(int,input().split())
    arr.append([y,x])
    
arr.sort()
for i in range(N):
    print(arr[i][1], arr[i][0])
    
