N = int(input())

arr = []

for i in range(N):
    res = input()
    if(res not in arr):
        arr.append(res)
    
arr.sort(key = lambda x:(len(x),x))


for i in range(len(arr)):
    print(arr[i])



### 중복제거할때 not in 말고 set로 바꿨다가 list로 바꾸자.. 이거 연습하자..
