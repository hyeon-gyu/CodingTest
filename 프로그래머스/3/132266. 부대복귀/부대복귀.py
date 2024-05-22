from collections import deque

def solution(n, roads, sources, destination):
    answer = []
    graph = [ [] for _ in range(n+1)]
    visited = [ -1 for _ in range(n+1)]
    visited[destination] = 0
    queue = deque([destination])
    for n1, n2 in roads:
        graph[n1].append(n2)
        graph[n2].append(n1)
    while queue:
        n = queue.popleft()
        for i in graph[n]:
            if visited[i] == -1:
                queue.append(i)
                visited[i] = visited[n] + 1
    for s in sources:
        answer.append(visited[s])
    return answer