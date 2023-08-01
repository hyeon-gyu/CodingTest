list = input().split('-')
res = 0
for i in list[0].split('+'):
    res += int(i)
    
for i in list[1:]:
    for j in i.split('+'):
        res -= int(j)
        
print(res)