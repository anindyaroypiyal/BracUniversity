import random

from OpenGL.GL import *
from OpenGL.GLUT import *

def drawPoints():
    glPointSize(5)
    glBegin(GL_POINTS)
    glVertex2f(10, 10)
    glVertex2f(80,220)
    glEnd()

def mpCircle(r):

    x = int(r)
    y = 0

    D = 5 - (4*int(r))
    dNW = 4*(2*y - 2*x + 5)
    dN = 4*(2*y + 3)

    drawPoints()
    while(x > y):
        if (D > 0):
            D = D + dNW
            x = x - 1
            y = y + 1
        else:
            D = D + dN
            y = y + 1
        drawPoints()


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

    mpCircle(3)

    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()