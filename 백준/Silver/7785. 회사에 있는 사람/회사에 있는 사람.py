import sys
input = sys.stdin.readline

n = int(input())
dic = {}
for i in range(n):
    name, status = map(str,input().split())
    if status == 'enter':
        dic[name] = 1
    else:
        dic.pop(name)

arr = [i for i in dic]
arr.sort(reverse=True)
for i in arr:
    print(i)