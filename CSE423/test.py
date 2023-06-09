import random

from OpenGL.GL import *
from OpenGL.GLUT import *

zone = 0
x = 0
y = 0

def FindZone(x1, y1, x2, y2):
    dx = (x2 - x1)
    dy = (y2 - y1)

    if (abs(dx) > abs(dy)):
        if (dx > 0 and dy > 0) or (dx == 0 or dy == 0):
            zone = 0
        elif (dx < 0 and dy > 0):
            zone = 3
        elif (dx < 0 and dy < 0):
            zone = 4
        elif (dx > 0 and dy < 0):
            zone = 7
    else:
        if (dx > 0 and dy > 0):
            zone = 1
        elif (dx < 0 and dy > 0):
            zone = 2
        elif (dx < 0 and dy < 0):
            zone = 5
        elif (dx > 0 and dy < 0):
            zone = 6
    return zone


def cvt2zone0(X, Y, zone):
    if (zone == 0):
        x = X
        y = Y
    elif (zone == 1):
        x = Y
        y = X
    elif (zone == 2):
        x = -Y
        y = X
    elif (zone == 3):
        x = -X
        y = Y
    elif (zone == 4):
        x = -X
        y = -Y
    elif (zone == 5):
        x = -Y
        y = -X
    elif (zone == 6):
        x = Y
        y = -X
    elif (zone == 7):
        x = X
        y = -Y
    return (x, y)

def OriginalZone(X, Y, zone) :
    if (zone == 0) :
        x = X
        y = Y
    elif (zone == 1) :
        x = Y
        y = X
    elif (zone == 2) :
        x = Y
        y = -X
    elif (zone == 3) :
        x = -X
        y = Y
    elif (zone == 4) :
        x = -X
        y = -Y
    elif (zone == 5) :
        x = -Y
        y = -X
    elif (zone == 6) :
        x = -Y
        y = X
    elif (zone == 7) :
        x = X
        y = -Y

    return (x, y)

def MidPoint(x1, y1, x2, y2, zone):
    print(x1, y1, x2, y2, zone)
    glPointSize ( 4 )
    glBegin ( GL_POINTS )

    dx = x2 - x1
    # print(dx)
    dy = y2 - y1
    # print(dy)
    D = (2*dy) - dx
    NE = 2*(dy - dx)
    SE = 2*(dy + dx)
    E = 2*dy

    if dx == 0 :
        while y1 < y2 :
            y1 += 2
            glVertex2f ( x1, y1 )

    elif dy == 0 :
        while x1 < x2 :
            x1 += 2
            glVertex2f ( x1, y1 )

    elif (x1 < x2):
        # print("else")
        print("x1", x1)
        print("x2", x2)
        while (x1 <= x2):
            o = OriginalZone(x1, y1, zone)
            print("x==", x1)
            print("y==", y1)
            print("origgg",o[0], o[1])
            glVertex2f ( o[0], o[1] )
            x1 = x1 + 1
            if (D > 0):
                y1 = y1 +1
                D = D + NE
            else:
                D = D + E
    elif (x1 > x2):
        # print("else")
        # print("x1",x1)
        # print("x2", x2)
        while (x1 >= x2):
            o = OriginalZone(x1, y1, zone)
            print("ori",o[0], o[1])
            glVertex2f ( abs(o[0]), abs(o[1]) )
            x1 = x1 - 1
            y1 = y1 - 1
            print("D==" ,D)
            if (D > 0):

                D = D + SE
            else:
                D = D + E
    glEnd()

def draw():
    # z3 = FindZone(100,170,150,100)
    # t5 = cvt2zone0(100,170, z3)
    # t6 = cvt2zone0(150,100, z3)
    # print("t",t5[0], t5[1], t6[0], t6[1])
    # MidPoint(t5[0], t5[1], t6[0], t6[1], z3)

    z3 = FindZone(150,100,100,170)
    t5 = cvt2zone0(150,100, z3)
    t6 = cvt2zone0(70,170, z3)
    # print("t",t5[0], t5[1], t6[0], t6[1])

    print("t",t6[0], t6[1], t5[0], t5[1])
    MidPoint(t6[0], t6[1], t5[0], t5[1], z3)
    #
    # z3 = FindZone(300,100,330,200)
    # t5 = cvt2zone0(300,100, z3)
    # t6 = cvt2zone0(330,200, z3)
    # # print("t",t5[0], t5[1], t6[0], t6[1])
    # MidPoint(t5[0], t5[1], t6[0], t6[1], z3)

    # z1 = FindZone(200,300,100,100)
    # t1 = cvt2zone0(200,300, z1)
    # t2 = cvt2zone0(100,100, z1)
    # MidPoint(t1[0], t1[1], t2[0], t2[1], z1)
    #
    # z2 = FindZone ( 80, 300, 200, 300 )
    # if z2 != 0:
    #     t3 = cvt2zone0(80, 200, z2)
    #     t4 = cvt2zone0(150, 200, z2)
    #     MidPoint ( t3[0], t3[1], t4[0], t4[1], z2 )
    # else:
    #     MidPoint(80, 300, 200, 300, z2)
    #
    # z3 = FindZone ( 230, 300, 350, 300 )
    # if z3 != 0:
    #     t5 = cvt2zone0(150, 200, z3)
    #     t6 = cvt2zone0(250, 200, z3)
    #     MidPoint ( t5[0], t5[1], t6[0], t6[1], z3 )
    # else:
    #     MidPoint(230, 300, 350, 300, z2)
    #
    # z4 = FindZone(350,300,250,100)
    # t7 = cvt2zone0(350,300, z4)
    # t8 = cvt2zone0(250,100, z4)
    # MidPoint(t7[0], t7[1], t8[0], t8[1], z4)


def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
    glMatrixMode (GL_MODELVIEW)
    glLoadIdentity()

def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(1.0, 1.0, 1.0)

    #call the draw methods here

    draw()

    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(450, 450)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()