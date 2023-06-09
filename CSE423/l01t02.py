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

def draw50pixel():
    glPointSize(4)
    glBegin(GL_POINTS)
    random.seed(x)
    for i in range(50):
        glVertex2f(random.randint(0,390),random.randint(0,390))
    glEnd()

def drawLine():
    glLineWidth(2)
    glBegin(GL_LINES)
    glColor3f(0,0.6,1)
    glVertex2f(175, 51)
    glColor3f(0.99, 0, 0)
    glVertex2f(225, 135)
    glVertex2f(225, 51)
    glVertex2f(175, 135)

    glEnd()

def drawTri():
    glLineWidth(5)
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

def drawHouse():
    drawTri()
    drawQuad()
    drawWndw()
    drawDoor()
    drawPoints()
    drawLine()

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
    drawHouse()

    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(400, 400)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"Task 2")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()