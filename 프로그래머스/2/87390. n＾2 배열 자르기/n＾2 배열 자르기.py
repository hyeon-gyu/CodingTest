def solution(n, left, right):

    # 2차원 배열의 좌표값을 1차원으로 변환시킬 때, i//n, i%n을 활용하자
    answer = []
    for i in range(left, right+1):
        answer.append(max(i//n , i % n)+1)
    return answer
