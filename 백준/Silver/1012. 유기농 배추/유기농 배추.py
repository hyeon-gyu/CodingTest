from collections import deque

import sys
input = sys.stdin.readline

dx = [-1,1,0,0] # 상하좌우
dy = [0,0,-1,1]

def bfs(graph, x,y): # 그래프와 현재위치(x,y)가 인자로 = graph[y][x] 와 동일
    q = deque()
    q.append((x,y))
    graph[y][x] = 0

    while q:
        cx,cy = q.popleft()
        for i in range(4):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if nx < 0 or nx >= m or ny < 0 or ny >= n:
                continue
            if graph[ny][nx] == 1:
                graph[ny][nx] = 0
                q.append((nx,ny))
                 
t = int(input().strip())

for i in range(t):
    m,n,k = map(int, input().strip().split())
    graph = [ [0] * m for _ in range(n)]
    
    count = 0
    
    for j in range(k):
        x,y = map(int, input().strip().split())
        graph[y][x] = 1 # 1 0 으로 입력받으면 graph[0][1] 에 1이 채워져야한다!
        
    for a in range(n):
        for b in range(m):
            if graph[a][b] == 1:
                bfs(graph, b,a)
                count += 1
    print(count)