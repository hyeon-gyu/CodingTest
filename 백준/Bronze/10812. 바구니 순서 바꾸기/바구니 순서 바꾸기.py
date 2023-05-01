n,m = map(int,input().split())
arr = [i for i in range(1,n+1)]

for t in range(m):
    i,j,k = map(int,input().split())
    res = arr[:i-1]+arr[k-1:j]+arr[i-1:k-1]+arr[j:]
    arr = res
    
    
arr = ' '.join(map(str,arr)) 
print(arr)