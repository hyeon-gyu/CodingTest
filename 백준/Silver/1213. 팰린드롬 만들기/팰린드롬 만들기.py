import sys
input = sys.stdin.readline

dic = dict()
ans = input().rstrip()

for i in ans:
    if dic.get(i) == None:
        dic[i] = 1
    else:
        dic[i] += 1
count = 0
res = ''
center = ''
flag = 0
for k,v in dic.items():
    if v % 2 == 1:
        count += 1
        center = k
        
        if count >= 2:
            print("I'm Sorry Hansoo")
            flag = 1
            break
for k,v in sorted(dic.items()):
    res += (k * (v// 2))
if flag == 0:
    print(res+center+res[::-1])