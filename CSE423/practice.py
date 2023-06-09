def getSum(n):
    sum = 0
    for digit in str(n):
        sum += int(digit)
    return sum


tests = int(input())
res = {}

for count in range(tests):
    id = input()
    x = getSum ( id )
    res[id] = x
print()

for x in res.values():
    if x >= 5 and x <= 10 :
        print ( "Ciao" )
    elif x >= 11 and x <= 15 :
        print ( "Hello" )
    elif x >= 20 and x <= 25 :
        print ( "Hola" )
    elif x >= 30 and x <= 35 :
        print ( "Salut" )
    else :
        print ( "ByeBye" )
