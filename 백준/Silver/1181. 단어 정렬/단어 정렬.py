N = int(input())

arr = []

for i in range(N):
    res = input()
    if(res not in arr):
        arr.append(res)
    
arr.sort(key = lambda x:(len(x),x))


for i in range(len(arr)):
    print(arr[i])