import random

from OpenGL.GL import *
from OpenGL.GLUT import *

zone = 0
x = 0
y = 0

def FindZone(x1, y1, x2, y2):
    dx = (x2 - x1)
    dy = (y2 - y1)

    if dx == 0 or dy == 0:
        zone = 0

    elif (abs(dx) > abs(dy)):
        if (dx > 0 and dy > 0):
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

    glPointSize ( 3 )
    glBegin ( GL_POINTS )

    dx = x2 - x1
    dy = y2 - y1
    D = (2*dy) - dx
    NE = 2*(dy - dx)
    E = 2*dy

    if dx == 0 :
        while y1 < y2 :
            y1 += 1
            glVertex2f ( x1, y1 )

    elif dy == 0 :
        while x1 < x2 :
            x1 += 1
            glVertex2f ( x1, y1 )

    else:
        while (x1 <= x2):
            o = OriginalZone(x1, y1, zone)
            glVertex2f ( o[0], o[1] )
            x1 = x1 + 1
            if (D > 0):
                y1 = y1 +1
                D = D + NE
            else:
                D = D + E
    glEnd()

def draw():
    z1 = FindZone ( 150, 100, 350, 100 )
    if z1 != 0:
        t3 = cvt2zone0(150, 100, z1)
        t4 = cvt2zone0(350, 100, z1)
        MidPoint ( t3[0], t3[1], t4[0], t4[1], z1 )
    else:
        MidPoint(150, 100, 350, 100, z1)

    z2 = FindZone ( 100, 170, 400, 170 )
    if z2 != 0 :
        t3 = cvt2zone0 ( 100, 170, z2 )
        t4 = cvt2zone0 ( 400, 170, z2 )
        MidPoint ( t3[0], t3[1], t4[0], t4[1], z2)
    else :
        MidPoint ( 100, 170, 400, 170, z2 )

    z3 = FindZone(150,100,100,170)
    t5 = cvt2zone0(150,100, z3)
    t6 = cvt2zone0(100,170, z3)
    MidPoint(t6[0], t6[1], t5[0], t5[1], z3)

    z4 = FindZone(350, 100, 400, 170)
    t7 = cvt2zone0(350, 100, z4)
    t8 = cvt2zone0(400, 170, z4)
    MidPoint(t7[0], t7[1], t8[0], t8[1], z4)

    z5 = FindZone(165, 170, 250, 270)
    t9 = cvt2zone0(165, 170, z5)
    t10 = cvt2zone0(250, 270, z5)
    MidPoint(t9[0], t9[1], t10[0], t10[1], z5)

    z6 = FindZone ( 250, 170, 250, 350 )
    if z6 != 0 :
        t11 = cvt2zone0 ( 250, 170, z6 )
        t12 = cvt2zone0 ( 250, 350, z6 )
        MidPoint ( t11[0], t11[1], t12[0], t12[1], z6)
    else :
        MidPoint ( 250, 170, 250, 350, z6 )

    z7 = FindZone(330,170,250,350)
    t13 = cvt2zone0(330,170, z7)
    t14 = cvt2zone0(250,350, z7)
    MidPoint(t14[0], t14[1], t13[0], t13[1], z7)


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
    glColor3f(1.0, 0.35, 0.0)

    #call the draw methods here

    draw()

    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()