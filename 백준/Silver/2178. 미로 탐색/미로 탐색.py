import sys
input = sys.stdin.readline

from collections import deque

dx = [-1,1,0,0] # 상, 하, 좌, 우
dy = [0,0,-1,1]

graph = []
N,M = map(int,input().split())
for i in range(N):
    graph.append(list(map(int, input().strip())))
    
   
def find_path(x,y):
    q = deque([(x,y)])
    while q:
        cx,cy = q.popleft()
        for i in range(4):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if 0 <= nx < N and 0 <= ny < M and graph[nx][ny] == 1: 
                q.append((nx,ny))
                graph[nx][ny] = graph[cx][cy] + 1 
    return graph[N-1][M-1]

print(find_path(0,0))            