arr = [['*']* 15 for _ in range(5)]
res = ''
for i in range(5):
    ex = list(input())
    len_ex = len(ex)
    
    for j in range(len_ex):
        arr[i][j] = ex[j]

for i in range(15):
    for j in range(5):
        if arr[j][i] == '*':
            continue
        res += arr[j][i]
print(res)