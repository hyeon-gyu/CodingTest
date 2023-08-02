import sys
input = sys.stdin.readline
N = int(input())
init = 666
while 1:
    if '666' in str(init):
        N -= 1
        if N == 0:
            print(init)
            break
    init += 1    
    