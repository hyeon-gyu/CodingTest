def solution(str_list, ex):
    answer = ''
    list = []
    for val in str_list:
        if(ex not in val):
            list.append(val)
            
    for s in list:
        answer += s
    
        
    return answer