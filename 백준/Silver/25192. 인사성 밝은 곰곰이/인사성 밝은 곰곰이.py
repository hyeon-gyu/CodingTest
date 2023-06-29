N = int(input())

cnt = 0
dict = {}

for i in range(N):
    name = input()
    
    if name == 'ENTER':
        cnt += len(dict)
        dict = {}
        continue
    dict[name] = 1

cnt += len(dict)
print(cnt)