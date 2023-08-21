import sys
input = sys.stdin.readline
import heapq


arr = []
N = int(input())
for i in range(N):
    ans = int(input())
    if ans == 0:
        if len(arr) == 0:
            print(0)
        else: 
            res = -heapq.heappop(arr)
            print(res)
    else:
        heapq.heappush(arr,-ans)
        

