while 1:
    list = input()
    arr = []
    if list == '.':
        break
    
    for i in list:
        if i == '(' or i == '[':
            arr.append(i)
        elif i == ')':
            if len(arr) != 0 and arr[-1] == '(':
                arr.pop()
            else:
                arr.append(i)
                break
        elif i == ']':
            if len(arr) != 0 and arr[-1] == '[':
                arr.pop()
            else:
                arr.append(i)
                break
            

    if(len(arr) != 0):
        print('no')
    else:
        print('yes')