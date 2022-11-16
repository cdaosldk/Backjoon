def solution(order):
    array = str(order) 
    answer = 0
    for n in array:
        if n in ["3", "6", "9"]:
            answer += 1
    return answer