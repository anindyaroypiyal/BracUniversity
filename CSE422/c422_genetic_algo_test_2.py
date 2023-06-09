import random

def modelSelected():
    return [random.randint ( 0, 1 ) for _ in range ( players )]


# def Fitness(players):
#     sum = 0
#     for i in range ( players ) :
#         if a[i] == 1 :
#             # print ( x[i] )
#             sum += int ( x[i][1] )
#     return sum

def population(num):
    population = []
    for i in range(num):
        population.append(modelSelected())
    return population

def fitness(population):
    maxFitness = 0

    best = []
    for i in population:
        sum = 0
        c = 0
        print(i)
        for j in range ( players ) :
            if population[j][c] == 1 :
                sum += int ( x[c][1] )
                if sum > runs:
                    if sum > maxFitness:
                        maxFitness = sum
                        best = i
            c += 1
    print(maxFitness)
    return best


with open('L2input1.txt') as file_object:
    lines = file_object.readlines()
# print(lines)
info = lines[0].split()

players = int(info[0])
runs = int(info[1])

x = []
p = []
for line in lines[1:]:
    x.append(line.split())
# print(x,'\n')
for i in range(players):
    p.append(x[i][0])

population = population(15)
# print(population)
print(fitness(population))

# flag = 0
# for i in range(2000):
#     a = modelSelected ()
#     b = Fitness( players )
#     if b == runs:
#         print(p)
#         for i in a:
#             print(i,end='')
#         flag = 1
#         break

# if flag == 0:
#     print ( p )
#     print(-1)