def solution(n,a,b):
    ''' 1번2번은 1번
        3번4번은 2번
        5번6번은 3번
        7번8번은 4번
        홀수는 +1해서 나누기2
        짝수는 나누기2
    '''
    
    answer = 0
    while a != b:
        a = (a+1)//2
        b = (b+1)//2
        answer = answer+1
    return answer