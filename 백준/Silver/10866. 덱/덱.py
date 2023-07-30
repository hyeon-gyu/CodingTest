from collections import deque
import sys
input = sys.stdin.readline


myque = deque([])

for i in range(int(input())):
    cmd = list(map(str, input().split()))
    if cmd[0] == 'push_back':
        myque.append(cmd[1])
    elif cmd[0] == 'push_front':
        myque.appendleft(cmd[1])
    elif cmd[0] == 'pop_front':
        if len(myque) == 0:
            print(-1)
        else:
            tmp = myque.popleft()
            print(tmp)
    elif cmd[0] == 'pop_back':
        if len(myque) == 0:
            print(-1)
        else:
            tmp = myque.pop()
            print(tmp)     
    elif cmd[0] == 'size':
        print(len(myque))
    elif cmd[0] == 'empty':
        if len(myque) == 0:
            print(1)
        else:
            print(0)
    elif cmd[0] == 'front':
        if len(myque) == 0:
            print(-1)
        else:
            print(myque[0])   
    elif cmd[0] == 'back':
        if len(myque) == 0:
            print(-1)
        else:
            print(myque[-1])
    
    
            