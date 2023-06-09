import random

from OpenGL.GL import *
from OpenGL.GLUT import *

x = random.randint(0,5000)
def drawPoints():
    glPointSize(5)
    glBegin(GL_POINTS)
    glVertex2f(10, 10)
    glVertex2f(80,220)
    glEnd()

def draw50pixel():
    glPointSize(3)
    glBegin(GL_POINTS)
    random.seed(x)
    for i in range(50):
        glVertex2f(random.randint(0,390),random.randint(0,390))
    glEnd()
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
    glColor3f(0.5, 1.0, 0.5)

    #call the draw methods here
    draw50pixel()
    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(400, 400)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()