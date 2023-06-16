list = []
sum = 0
for i in range(5):
    k = int(input())
    list.append(k)
    sum+= k
    
print(int(sum/5))
list.sort()
print(list[2])

    
