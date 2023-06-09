import random

from OpenGL.GL import *
from OpenGL.GLUT import *

x = random.randint(0,5000)
def drawPoints():
    glPointSize(5)
    glBegin(GL_POINTS)
    glColor3f(1, 0.5, 0)
    glVertex2f(219,85)
    glEnd()

def drawPoints(x,y):
    glPointSize(4)
    glBegin(GL_POINTS)
    glColor3f(1, 0.5, 1)
    glVertex2f(x,y)
    glEnd()

def draw50pixel():
    glPointSize(4)
    glBegin(GL_POINTS)
    random.seed(x)
    for i in range(50):
        glVertex2f(random.randint(0,390),random.randint(0,390))
    glEnd()

def drawTri():
    glPointSize(2)
    glBegin(GL_TRIANGLES)
    glColor3f(0,0.6,1)
    glVertex2f(200, 350)
    glColor3f(0.99, 0, 0)
    glVertex2f(110,240)
    glColor3f(0,0.0,1)
    glVertex2f(290,240)
    glEnd()

def drawQuad():
    glBegin(GL_QUADS)
    glColor3f(0.99, 0, 0)
    glVertex2f(110,240)
    glColor3f(0, 0.2, 0.7)
    glVertex2f(110,50)
    glColor3f(1.0, 0.3, 0.5)
    glVertex2f(290,50)
    glColor3f(0.4, 0, 1)
    glVertex2f(290, 240)
    glEnd()

def drawWndw():
    glBegin(GL_QUADS)
    glColor3f(0.02, 0, 0.02)
    glVertex2f(120,220)
    glColor3f(0.02, 0, 0.02)
    glVertex2f(120,170)
    glColor3f(1,1,1)
    glVertex2f(170,170)
    glColor3f(1,1,1)
    glVertex2f(170, 220)

    glColor3f(1, 1, 1)
    glVertex2f(230,220)
    glColor3f(1, 1, 1)
    glVertex2f(230,170)
    glColor3f(0.02, 0, 0.02)
    glVertex2f(280,170)
    glColor3f(0.02, 0, 0.02)
    glVertex2f(280, 220)
    glEnd()

def drawDoor():
    glBegin(GL_QUADS)
    glColor3f(1, 1, 1)
    glVertex2f(175, 51)
    glVertex2f(225, 51)
    glColor3f(1, 1, 1)
    glVertex2f(225, 135)
    glColor3f(1, 1, 1)
    glVertex2f(175, 135)
    glEnd()


def DDA(x1, y1, x2, y2):
    dy = abs(y2 - y1)
    dx = abs(x2 - x1)
    glPointSize(2)
    glBegin(GL_POINTS)
    glVertex2f(x1, y1)
    c = 0
    if dx == 0:
        while y1 < y2:
            y1 += 5
            glVertex2f(x1, y1)


    elif dy == 0:
        while x1 < x2:
            x1 += 1
            glVertex2f(x1, y1)

    elif dx != 0 and dy != 0:
        m = dy / dx
        if dy >= dx:
                while y1 <= y2:
                    x1 += (1/m)
                    y1 += 1
                    glVertex2f(round(x1), y1)

        else:
                while x1 <= x2:
                    x1 += 1
                    y1 += m
                    glVertex2f(x1, round(y1))


    glEnd()

def toss(id):
    if id % 2 == 0:
        DDA(150, 400, 450, 400)
        DDA(300, 100, 300, 400)

    else:

        DDA(200, 100, 200, 500)
        DDA(200, 300, 400, 300)
        DDA(400, 100, 400, 500)

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
    glColor3f(0.0, 1.0, 1.0)

    #call the draw methods here
    id = input("Enter last 2 digits of id: ")
    toss(int(id))


    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(600, 600)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()