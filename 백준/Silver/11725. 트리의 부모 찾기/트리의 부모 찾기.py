import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**9)


N = int(input())

tree = [ [] for i in range(N+1)]

for i in range(N-1):
    a, b = map(int,input().split())
    tree[a].append(b)
    tree[b].append(a)

visited = [0] * (N+1)

def dfs(k):
    for i in tree[k]:
        if visited[i] == 0:
            visited[i] = k
            dfs(i)

dfs(1)

for i in range(2,N+1):
    print(visited[i])