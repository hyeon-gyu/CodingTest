import sys
input = sys.stdin.readline

K = int(input())

stack = []
cnt = 0
for i in range(K):
    ans = int(input())
    if ans == 0:
        cnt -= stack[-1]
        stack.pop()
        continue
    stack.append(ans)
    cnt += stack[-1]
    
print(cnt)