N = int(input())

dict = {}
arr = list(map(int,input().split()))
for x in arr:
    dict[x] = 1
    
M = int(input())

arr2 = list(map(int,input().split()))

for x in arr2:
    if(dict.get(x) == 1):
        print(1, end= ' ')
    else:
        print(0, end = ' ')
