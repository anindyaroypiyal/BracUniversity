import random

def modelSelected():
    return [random.randint ( 0, 1 ) for _ in range ( players )]


def fitness(players):
    sum = 0
    for i in range ( players ) :
        if a[i] == 1 :
             sum += int ( x[i][1] )
    return sum

def crossover(plr):
    offsprings = []
    for i in range(plr):
        probab = random.random()

        if probab < 0.47:
            offsprings.append(i)

        else:
            offsprings.append(i+1)

    return offsprings

def mutation(players, newgen):
    prob = random.random()
    if prob <= .6:
        change_index = random.choices([0,players])
        if newgen[change_index] == '0':
            newgen[change_index] = '1'
        else:
            newgen[change_index] = '0'

    return newgen

with open('L2input1.txt') as file_object:
    lines = file_object.readlines()

info = lines[0].split()

players = int(info[0])
runs = int(info[1])

x = []
p = []
for line in lines[1:]:
    x.append(line.split())

for i in range(players):
    p.append(x[i][0])

flag = 0
for i in range(2000):
    a = modelSelected()
    b = fitness(players)
    if b == runs:
        print(p)
        for i in a:
            print(i, end='')
        flag = 1
        break

if flag == 0:
    print ( p )
    print(-1)