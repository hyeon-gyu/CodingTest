def recursion(s,l,r,k):
    k+=1
    if l >= r:
        return 1,k 
    elif s[l] != s[r]:
        return 0,k
    else:
        return recursion(s,l+1,r-1,k)

    

def isPalindrome(s):
    a,b = recursion(s,0,len(s)-1,0)
    return a,b
N = int(input())

for i in range(N):
    ans = input()
    a, b = isPalindrome(ans)
    print(a,b)