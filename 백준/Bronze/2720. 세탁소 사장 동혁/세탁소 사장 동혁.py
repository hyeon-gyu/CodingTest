t = int(input())
for i in range(t):
    money = int(input())
    q = (int)(money / 25)
    money -= 25*q
    d = (int)(money / 10)
    money -= 10*d
    n = (int)(money / 5)
    money -= 5 * n
    p = (int)(money / 1)
    print(q,d,n,p)