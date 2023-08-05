import sys
input = sys.stdin.readline

N,M = map(int,input().split())

dict = {}
for i in range(1,N+1):
    req = input().rstrip()
    dict[i] = req
    dict[req] = i

for j in range(M):
    req = input().rstrip()
    if req.isdigit():
        print(dict[int(req)])
    else:
        print(dict[req])
        

    