
def inspec(n):
    cnt = 0
    for i in ans:
        if i == '(':
            cnt += 1
        else:
            cnt -= 1
            if cnt == -1:
                return 0
    if cnt == 0:
        return 1

T = int(input())


for i in range(T):
    ans = list(map(str,input()))
    res = inspec(ans)
    if(res == 1):
        print('YES')
    else:
        print('NO')