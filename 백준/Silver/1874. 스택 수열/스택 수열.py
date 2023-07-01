stack = []
res = []
cnt = 1
n = int(input())

for i in range(n):
    x = int(input())
    
    while cnt <= x:
        stack.append(cnt)
        res.append('+')
        cnt += 1
    if stack[-1] == x:
        stack.pop()
        res.append('-')
    else:
        cnt = 0
        break
if cnt != 0:
    for x in res:
        print(x)
else:
    print('NO')
