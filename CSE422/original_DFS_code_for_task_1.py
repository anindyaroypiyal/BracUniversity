########        DFS          ########
import collections
#declaring a Matrix Grid
graph_matrix=[]
#reading text file and inputting in the matrix
with open("input.txt",'r') as f:
    lines = f.readlines()
for line in lines:
    graph_matrix.append(line.split())
#converting alphabets to 0 and 1
def check(graph_matrix):
    for row in range(len(graph_matrix)):
        for col in range(len(graph_matrix[row])):
            if (graph_matrix[row][col] =='N'):
                graph_matrix[row][col] = 0
            elif(graph_matrix[row][col] =='Y'):
                graph_matrix[row][col] = 1
check(graph_matrix)
# Maximum area infected. Calculated by traversing the grid.
def maxiumInfected(graph_matrix):
    #keeping a record of the biggest area affected
    maximumAreaCalculator = 0
    for row in range(len(graph_matrix)):
        for col in range(len(graph_matrix[0])):
            if graph_matrix[row][col]==1:
                #if any cell is found with value 1, we count the adjacent cells that have 1 and
                #store it in infected_box_counter
                infected_box_counter= count_infected_box(graph_matrix,row,col)
                #taking the maximum value and recording it by using max function
                maximumAreaCalculator=max(maximumAreaCalculator,infected_box_counter)
    return maximumAreaCalculator
def count_infected_box(graph_matrix,row,col):
    #discarding cells outside the bound of the grid
    if any([row<0,col<0,row>=len(graph_matrix),col>=len(graph_matrix[0])]):
        return 0
    #discarding cells that have value set to 0
    if graph_matrix[row][col] == 0:
        return 0
    box_counter = 1 #else
    graph_matrix[row][col] = 0 #marking the current box as visited
    #checking the peripheral boxes for new infected
    #dx - displacement along x axis can be done using a for loop - for i in range(row-1,row+2)
    #dy - displacement along y axos can be done using a for loop - for j in range(col-1,col+2)
    for r in range(row-1,row+2): #row-1 = previous row, row+2 = next row
        for c in range(col-1,col+2): #col-1 = previous col, col+2 = next col
            if any([r!=row , c!=col]): # preventing the box from iterating itself
                box_counter += count_infected_box(graph_matrix,r,c) #manipulating the counter
    return box_counter
pass
print("\nQuestion 1 Output")
print(maxiumInfected(graph_matrix))

#####################################################################################################################

########        BFS          ########

# ====== ====== ====== QUESTION 2 ====== ======  ======
graph_2 = []
with open ( "Question2 input1.txt", 'r' ) as f :
    lines = f.readlines ()[2 :]
for line in lines :
    graph_2.append ( line.split () )
rows = len ( graph_2 )
cols = len ( graph_2[0] )


def tester(graph_2) :
    vistList = set ()
    levels = 1  # Level 1

    def bfs(r, c, visitList) :
        q = collections.deque ()
        vistList.add ( (r, c) )
        q.append ( (r, c) )
        while q :
            rows, cols = q.popleft ()
            neighborTraversal = [[1, 0], [-1, 0], [0, 1], [0, -1]]
            for dr, dc in neighborTraversal :
                r = rows + dr
                c = cols + dc
                if (
                        (r) in range ( rows ) and
                        (c) in range ( cols ) and
                        graph_2[r][c] == 'H' and
                        (r, c) not in vistList
                ) :
                    q.append ( (r, c) )
                    vistList.add ( (r, c) )
                    graph_2[r][c] = 'A'

    for r in range ( rows ) :
        for c in range ( cols ) :
            if graph_2[r][c] == 'A' and (r, c) not in vistList :
                levels += 1
                bfs ( r, c, vistList )
    return levels


value = tester ( graph_2 )
print ( "\nQuestion 2 Output" )
print ( "Time : ", value )

#######################################################################################################################