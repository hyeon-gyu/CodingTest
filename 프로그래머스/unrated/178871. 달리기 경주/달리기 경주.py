def solution(players, callings):
    dict = {}
    for i,k in enumerate(players):
        dict[k]=i
        
    for name in callings:
        prev,curr = dict[name]-1,dict[name]
        dict[players[prev]],dict[players[curr]] = curr, prev
        players[prev],players[curr] = players[curr],players[prev]
    
    
    return players