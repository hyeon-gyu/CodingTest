import sys
input = sys.stdin.readline
from collections import deque

def bfs(graph, visited, node):
    count = 0
    queue = deque([node])
    visited[node] = True
    while queue:
        v = queue.popleft() 
        #print(v, end = ' ')
        for i in range(1,N+1):
            if not visited[i] and graph[v][i]:
                queue.append(i)
                count += 1
                visited[i] = True
    return count            
        
N = int(input()) # N : 컴퓨터 수
M = int(input()) # M : 연결되어있는 컴퓨터 쌍 수

graph = [ [False] * (N + 1) for _ in range(N + 1)] # 그래프 초기화 0번부터 7번까지 (8행 8열)

for _ in range(M):
    a, b = map(int, input().split())
    graph[a][b] = True
    graph[b][a] = True
    
    
visited = [False] * (N+1) # 방문해야하는 컴퓨터 수
node = 1 # 시작 번호

print(bfs(graph,visited,node))
