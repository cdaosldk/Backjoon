def solution(id_pw, db):
    for id in db:
        if id_pw[0] in id:
            if id_pw[1] == id[1]:
                return 'login'
            else:
                return 'wrong pw'
    
    return 'fail'
    