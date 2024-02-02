import sys
input = sys.stdin.readline
from collections import deque

N,M,R = map(int, input().strip().split())

# 초기 graph 만들기 
graph = [ [] for _ in range(N+1)] 
visited = [0] * (N+1)

for _ in range(M):
    a,b = map(int, input().strip().split())
    graph[a].append(b)
    graph[b].append(a)
    
count = 1
   
def bfs(R):
    global count 
    queue = deque([R])
    visited[R] = 1
    while queue:
        p = queue.popleft()
        graph[p].sort()  
        for g in graph[p]:
            if visited[g] == 0:
                count += 1
                visited[g] = count
                queue.append(g)

bfs(R)
    
for v in visited[1:]:
    print(v)
     