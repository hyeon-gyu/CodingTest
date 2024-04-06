import sys
read = sys.stdin.readline
sys.setrecursionlimit(10000)

dx = [-1, 1, 0, 0, -1, -1, 1, 1]
dy = [0, 0, -1, 1, -1, 1, -1, 1]


def dfs(cx, cy):
    graph[cx][cy] = 0 # 방문했으니 바다로 처리
    for i in range(8):
        tx = cx + dx[i]
        ty = cy + dy[i]
        if 0 <= tx < h and 0 <= ty < w and graph[tx][ty] == 1:
            dfs(tx, ty)
while (1):
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break
    graph = []
    for i in range(h):
        graph.append(list(map(int, input().split())))
    count = 0
    for i in range(h):
        for j in range(w):
            if graph[i][j] == 1:
                dfs(i,j)
                count += 1
            
    print(count)