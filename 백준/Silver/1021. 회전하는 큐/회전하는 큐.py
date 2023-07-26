from collections import deque
N,M = map(int,input().split())
arr = list(map(int,input().split()))

myque = deque([i for i in range(1,N+1)])

cnt = 0

for i in arr:
    while 1:
        if myque[0] == i:
            myque.popleft()
            break
        else:
            if myque.index(i) < len(myque)/2:
                while myque[0] != i:
                    myque.append(myque.popleft())
                    cnt+=1
            else:
                while myque[0] != i:
                    myque.appendleft(myque.pop())
                    cnt+=1

print(cnt)
    
    