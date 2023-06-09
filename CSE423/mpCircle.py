import random

from OpenGL.GL import *
from OpenGL.GLUT import *


def draw8way(x, y, p1, p2, c):
    glPointSize( 6 )
    glBegin(GL_POINTS)
    if c == 'b':
        glColor3f(0, 0, 1)
    elif c == 'g':
        glColor3f ( 0, 1, 0 )
    elif c == 'r':
        glColor3f ( 1, 0, 0 )
    elif c == 'y' :
        glColor3f ( 1, 0.8, 0.2 )
    elif c == 'bl' :
        glColor3f ( 0, 0, 0 )

    glVertex2f( x + p1, y + p2)
    glVertex2f( y + p1, x + p2)
    glVertex2f( y + p1, -x + p2)
    glVertex2f( -x + p1, y + p2)
    glVertex2f( -x + p1, -y + p2)
    glVertex2f( -y + p1, -x + p2)
    glVertex2f( -y + p1, x + p2 )
    glVertex2f( x + p1, -y + p2 )

    glEnd()

def mpCircle(r, p1, p2, c):

    x = int(r)
    y = 0

    D = 1 - r
    draw8way(x, y, p1, p2, c)
    while(x > y):
        if (D > 0):
            D = D + 2*y - 2*x + 5;  """dNW = 2*y - 2*x + 5"""
            x = x - 1
            y = y + 1
        else:
            D = D + 2*y + 3;  """dN = 2*y + 3"""
            y = y + 1
        draw8way(x, y, p1, p2, c)


def draw():
    mpCircle ( 75, 260, 290, 'bl' )
    mpCircle ( 75, 180, 230, 'y' )
    mpCircle ( 75, 100, 290, 'b' )
    mpCircle ( 75, 340, 230, 'g' )
    mpCircle ( 75, 420, 290, 'r' )


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
glutInitWindowSize(525, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"Olympic er logo dekhao")
glClearColor(1, 1, 1, 0)
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()