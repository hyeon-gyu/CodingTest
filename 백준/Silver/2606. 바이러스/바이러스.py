import sys
input = sys.stdin.readline

n = int(input())
m = int(input())
graph = [ [] for _ in range(n+1)]
count = 0 
visited = [ False for _ in range(n+1)  ]

for i in range(m):
    s, e = map(int, input().split())
    graph[s].append(e) 
    graph[e].append(s)

def dfs(graph, v, visited):
    visited[v] = True
    global count
    count += 1
    for i in graph[v]:
        if not visited[i] :
            dfs(graph, i, visited)      
    
dfs(graph, 1, visited)    
print(count-1)