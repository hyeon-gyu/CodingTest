import sys
input = sys.stdin.readline

def split(n):
    if n == 1:
        print('-', end='')
        return
    else:
        split(n//3)
        print(' '*(n//3),end='')
        split(n//3)


while 1:
    try:
        N = int(input())
        split(3**N)
        print()
    except:
        break