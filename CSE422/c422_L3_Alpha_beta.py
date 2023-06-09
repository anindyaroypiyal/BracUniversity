import random
import math


def randomPoints(mini, maxi) :
    return [random.randint ( mini, maxi ) for _ in range ( 8 )]


def a_b_pruning(dpth, indx, optimus, point, A, B) :
    if dpth == 3 :
        return point[indx]

    if optimus :
        pick = minimum
        for i in range ( 2 ) :
            res = a_b_pruning ( dpth + 1, indx * 2 + i, False, point, A, B )
            pick = max ( pick, res )
            A = max ( A, pick )
            if B <= A :
                break
        return pick

    else :
        pick = maximum
        for i in range ( 2 ) :
            res = a_b_pruning ( dpth + 1, indx * 2 + i, True, point, A, B )
            pick = min ( pick, res )
            B = min ( B, pick )
            if B <= A :
                break
        return pick


id = input ( "Enter your student ID:  " )

minimum = int ( id[4] )

pointsToWin = int ( id[:5 :-1] )

maximum = math.ceil ( pointsToWin * 1.5 )

shuffle = int ( id[3] )

points_list = randomPoints ( minimum, maximum )

optimal_value_list = []
depth, indx = 0, 0
count = 0

result = int ( a_b_pruning ( depth, indx, True, points_list, minimum, maximum ) )

# Task01

print ( "Generated 8 random points between the minimum and maximum point limits: ", points_list )
print ( "Total points to win: ", pointsToWin )
print ( "Achieved point by applying alpha-beta pruning = ", result )

if result >= pointsToWin :
    print ( "The winner is Optimus Prime\n" )
else :
    print ( "The Winner is Megatron\n" )

# Task02

for _ in range ( shuffle ) :
    random.shuffle ( points_list )
    o = int ( a_b_pruning ( depth, indx, True, points_list, minimum, maximum ) )
    optimal_value_list.append ( o )
max_val = max ( optimal_value_list )

for i in optimal_value_list :
    if i >= pointsToWin :
        count += 1

print ( "After the shuffle:" )
print ( "List of all points values from each shuffle: ", optimal_value_list )
print ( "The maximum value of all shuffles: ", max_val )
print ( "Won ", count, " times out of ", shuffle, " number of shuffles" )
