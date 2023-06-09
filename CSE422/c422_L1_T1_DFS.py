with open('input t2.txt') as file_object:
    lines = file_object.readlines()
print(lines)
x = []
for line in lines:
    x.append(line.split())
print(x)
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

print('Output:', maxRegion(x))
