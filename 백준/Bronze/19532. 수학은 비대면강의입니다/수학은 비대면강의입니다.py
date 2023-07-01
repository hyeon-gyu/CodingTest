a,b,c,d,e,f = map(int,input().split())

res_x, res_y = 0,0
for x in range(-999,1000,1):
    for y in range(-999,1000,1):
        if a*x + b * y == c :
            if d*x + e*y == f :
                res_x,res_y = x,y
                break
        
print(res_x, res_y)