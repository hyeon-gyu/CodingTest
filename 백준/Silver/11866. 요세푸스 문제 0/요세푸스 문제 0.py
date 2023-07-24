from collections import deque

N,K = map(int,input().split(' '))
dq = deque()
list = []
for i in range(1,N+1):
    dq.append(i)

while len(dq) != 0:
    dq.rotate(-K+1)
    list.append(dq.popleft())

print("<",end='')
for i in range(len(list)):
    if i == len(list)-1:
        print("%d>" %list[i])
    else:
        print("%d, " %list[i],end = '')