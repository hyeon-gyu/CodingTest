import sys
input = sys.stdin.readline
list = [0] * 10001

N = int(input())
for i in range(N):
    k = int(input())
    list[k] += 1

for i in range(len(list)):
    for j in range(list[i]):
        print(i)
