import sys
input = sys.stdin.readline
from collections import deque

dx = [0,0,1,-1]
dy = [1,-1,0,0]


def bfs(a, b):
    global graph
    # 시작점 좌표 큐에 넣기
    queue = deque()
    queue.append((a,b))

    graph[a][b] = 0 # 한번 방문한 곳은 0으로 만들어버리기
    house_cnt = 1    

    while queue:
        x,y = queue.popleft()
        for i in range(4): # 상하좌우 둘러보기
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= N or ny < 0 or ny >= N:
                continue
            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                queue.append((nx,ny))
                house_cnt += 1
    return house_cnt            
    

N = int(input())
graph = []
# 그래프 생성
for i in range(N):
    graph.append(list(map(int,input().strip())))    

# 단지 수 카운트 리스트 (sort() 함수로 정렬 예정) 
count = []   

for i in range(N):
    for j in range(N):
        if graph[i][j] == 1:
            count.append(bfs(i, j))

            
count.sort()
print(len(count))
for i in range(len(count)):
    print(count[i])
