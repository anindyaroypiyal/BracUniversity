##Task 01####

with open('input t2.txt') as file_object:
    lines = file_object.readlines()
x = []
for line in lines:
    x.append(line.split())

rows = len ( x )
cols = len ( x[0] )

def maxRegion(x):
    maxInfect = 0
    for row in range(rows):
        for col in range(cols):
            if x[row][col] == 'Y':
                region_count = infect_tracker(x,row,col)
                maxInfect=max(maxInfect,region_count)
    return maxInfect

def infect_tracker(x,row,col):

    if any ([row<0,row>=rows,col<0,col>=cols]):
        return 0

    if x[row][col] == 'N':
        return 0

    inf_counter = 1
    x[row][col] = 'N' #mark visited

    for r in range(row-1,row+2):
        for c in range(col-1,col+2):
            if ([r!=row , c!=col]):
                inf_counter += infect_tracker(x,r,c)
    return inf_counter

print('Output (Task 01):', maxRegion(x))




###Task 02###

import collections

with open('Question2 input2.txt') as file_object:
    lines = file_object.readlines()[2:]
x = []
for line in lines:
    x.append(line.split())

rows = len ( x )
cols = len ( x[0] )
attackZone = [[1, 0], [-1, 0], [0, 1], [0, -1]]

visit = set ()
time = 0
h_count = 0

def attack(x):
    que = collections.deque ()
    for r in range ( rows ) :
        for c in range ( cols ) :
            if x[r][c] == 'A':
                que.append((r,c))
                x[r][c] = 'V'
    q_len = len(que)
    if q_len == 0:
        return 0
    for i in range(q_len):
        v = que.popleft()
        visit.add((v))
        for a, b in attackZone:
            if not ((v[0]+a < 0) or (v[0]+a >= rows) or (v[1]+b < 0) or (v[1]+b >= cols)):
                if x[v[0]+a][v[1]+b] == 'H':
                    if (v[0]+a, v[1]+b) not in que:
                        que.append((v[0]+a, v[1]+b))
                        x[v[0] + a][v[1] + b] = 'A'
    return 1


for r in range ( rows ) :
    for c in range ( cols ) :
        t = attack(x)
        if t == 0:
            break
        time += t

for r in range ( rows ) :
    for c in range ( cols ) :
        if x[r][c] == 'H' :
            h_count += 1

print('\nOutput (Task 02):')
print("Time:", time-1, "minutes")
print(h_count, 'survived')
