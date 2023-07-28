from collections import deque

k = int(input())
for i in range(k):
    N,M = map(int,input().split())
    arr = deque(list(map(int,input().split())))
    cnt = 0
    
    while arr:
        tmp = max(arr)
        first = arr.popleft()
        M -= 1
        if tmp == first:
            cnt += 1
            if M == -1:
                print(cnt)
                break
        else:
            arr.append(first)
            if M == -1:
                M = len(arr)-1
        
        