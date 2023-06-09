import collections

with open('Question2 input2.txt') as file_object:
    lines = file_object.readlines()[2:]
x = []
for line in lines:
    x.append(line.split())
rows = len ( x )
cols = len ( x[0] )
attackZone = [[1, 0], [-1, 0], [0, 1], [0, -1]]

# print(rows)
# print(cols)
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
    print("q_len", q_len)
    for i in range(q_len):
        v = que.popleft()
        # print('v1',v)
        visit.add((v))
        for a, b in attackZone:
            if not ((v[0]+a < 0) or (v[0]+a >= rows) or (v[1]+b < 0) or (v[1]+b >= cols)):
                if x[v[0]+a][v[1]+b] == 'H':
                    if (v[0]+a, v[1]+b) not in que:
                        # print('v[0] and v[1]', v[0], v[1])
                        # print ( '[v[0]+a],[v[1]+b] ', [v[0] + a], [v[1] + b] )
                        # print('vvvvvisisit', visit)
                        que.append((v[0]+a, v[1]+b))
                        # converted += 1
                        x[v[0] + a][v[1] + b] = 'A'
                        # print ( 'converted', converted )
                        print('qqqq', que)
                        print(x)
    return 1


for r in range ( rows ) :
    for c in range ( cols ) :
        t = attack(x)
        # print(t)
        # print("ttt", time)
        if t == 0:
            break
        time += t

for r in range ( rows ) :
    for c in range ( cols ) :
        if x[r][c] == 'H' :
            h_count += 1

print("Time:", time-1, "minutes")
print(h_count, 'survived')

# print(que)
# print(time)

# def tes(graph_2) :
#     vistList = set ()
#     levels = 1  # Level 1
#
#     def bfs(r, c, visitList) :
#         q = collections.deque ()
#         vistList.add ( (r, c) )
#         q.append ( (r, c) )
#         while q :
#             rows, cols = q.popleft ()
#             neighborTraversal = [[1, 0], [-1, 0], [0, 1], [0, -1]]
#             for dr, dc in neighborTraversal :
#                 r = rows + dr
#                 c = cols + dc
#                 if (
#                         (r) in range ( rows ) and
#                         (c) in range ( cols ) and
#                         graph_2[r][c] == 'H' and
#                         (r, c) not in vistList
#                 ) :
#                     q.append ( (r, c) )
#                     vistList.add ( (r, c) )
#                     graph_2[r][c] = 'A'
#
#     for r in range ( rows ) :
#         for c in range ( cols ) :
#             if graph_2[r][c] == 'A' and (r, c) not in vistList :
#                 levels += 1
#                 bfs ( r, c, vistList )
#     print(vistList)
#     return levels
#
#
# value = tes( graph_2 )
# print ( "\nQuestion 2 Output" )
# print(graph_2)
# print ( "Time : ", value )