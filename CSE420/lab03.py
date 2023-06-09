import re

rex = []
count = input()
for c in range(int(count)):
    testCase = input()
    rex.append(testCase)

ex = []
ct = input()
for c in range(int(ct)):
    strng = input()
    ex.append(strng)

for y in ex:
    nc = 0
    for x in rex:
        regex = x
        pattern = re.compile(f'{regex}')
        match = pattern.match(y)
        if match == None:
            nc += 1
        else:
            print("YES,", rex.index(x)+1)
            break
        if nc == int(count):
            print("NO, 0")


