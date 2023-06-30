C = int(input())


for i in range(C):
    cnt,avg,res  = 0,0,0
    arr = list(map(int,input().split()))
    for j in range(1,len(arr)):
        cnt += arr[j]
    avg = cnt / arr[0]
    cnt = 0
    for k in range(1,len(arr)):
        if arr[k] > avg:
           cnt += 1 
    res = (cnt / arr[0])* 100
    print("%.3f" %res+"%")
        