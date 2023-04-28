arr = [[int(x) for x in input().split()] for y in range(9)]
max = 0
a= 0
b = 0
for i in range(9):
    for j in range(9):
        if(max <= arr[i][j]):
            max = arr[i][j]
            a = i+1
            b = j+1
            
print(max)
print(a, b)