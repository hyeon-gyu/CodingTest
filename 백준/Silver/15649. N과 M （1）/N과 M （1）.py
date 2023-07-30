N,M = map(int,input().split())
list = []

def dfs():
    if len(list) == M:
        print(' '.join(map(str,list)))
        return
    
    for i in range(1,N+1):
        if i not in list:
            list.append(i)
            dfs()
            list.pop()
            
dfs()

