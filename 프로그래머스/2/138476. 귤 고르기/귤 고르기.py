def solution(k, tangerine):
    answer = 0
    arr = [0] * (max(tangerine)+1)
    for i in range(len(tangerine)):
        arr[tangerine[i]] += 1
    arr.sort(reverse=True)
    for i in arr:
        k -= i
        answer += 1
        if k <= 0:
            break
    return answer